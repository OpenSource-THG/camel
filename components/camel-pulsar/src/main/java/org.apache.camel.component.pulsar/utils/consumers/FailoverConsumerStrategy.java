/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.pulsar.utils.consumers;

import java.util.Collection;
import java.util.LinkedList;
import org.apache.camel.component.pulsar.PulsarConsumer;
import org.apache.camel.component.pulsar.PulsarEndpoint;
import org.apache.camel.component.pulsar.configuration.PulsarEndpointConfiguration;
import org.apache.camel.component.pulsar.utils.retry.PulsarClientRetryPolicy;
import org.apache.pulsar.client.api.Consumer;
import org.apache.pulsar.client.api.ConsumerBuilder;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.api.SubscriptionType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FailoverConsumerStrategy implements ConsumerCreationStrategy {
    private static final Logger LOGGER = LoggerFactory.getLogger(FailoverConsumerStrategy.class);

    private final PulsarConsumer pulsarConsumer;
    private final PulsarClientRetryPolicy retryPolicy;

    FailoverConsumerStrategy(PulsarConsumer pulsarConsumer, PulsarClientRetryPolicy retryPolicy) {
        this.pulsarConsumer = pulsarConsumer;
        this.retryPolicy = retryPolicy;
    }

    @Override
    public Collection<Consumer<byte[]>> create(final PulsarEndpoint pulsarEndpoint) {
        return createMultipleConsumers(pulsarEndpoint);
    }

    private Collection<Consumer<byte[]>> createMultipleConsumers(final PulsarEndpoint pulsarEndpoint) {
        final Collection<Consumer<byte[]>> consumers = new LinkedList<>();
        final PulsarEndpointConfiguration configuration = pulsarEndpoint.getConfiguration();

        for (int i = 0; i < configuration.getNumberOfConsumers(); i++) {
            try {
                String consumerName = configuration.getConsumerNamePrefix() + i;

                ConsumerBuilder<byte[]> builder = CommonCreationStrategyUtils
                    .create(consumerName, pulsarEndpoint, pulsarConsumer);

                consumers.add(builder.subscriptionType(SubscriptionType.Failover).subscribe());
            } catch (PulsarClientException exception) {
                retryPolicy.retry();

                LOGGER.error("A PulsarClientException occurred {}", exception);
            }
        }
        return consumers;
    }
}
