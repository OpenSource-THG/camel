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
package org.apache.camel.component.pulsar.configuration;

import org.apache.camel.component.pulsar.utils.consumers.SubscriptionType;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;
import org.apache.pulsar.client.api.CompressionType;

import java.util.concurrent.TimeUnit;

import static org.apache.camel.component.pulsar.utils.consumers.SubscriptionType.EXCLUSIVE;

@UriParams
public class PulsarEndpointConfiguration {

    @UriParam(label = "consumer", description = "Name of the subscription to use", defaultValue = "subs")
    private String subscriptionName = "subs";
    @UriParam(label = "consumer", description = "Type of the subscription", enums = "EXCLUSIVE, SHARED, FAILOVER", defaultValue = "EXCLUSIVE")
    private SubscriptionType subscriptionType = EXCLUSIVE;
    @UriParam(label = "consumer", description = "Number of consumers", defaultValue = "1")
    private int numberOfConsumers = 1;
    @UriParam(label = "consumer", description = "Size of the consumer queue", defaultValue = "10")
    private int consumerQueueSize = 10;
    @UriParam(label = "consumer", description = "Name of the consumer when subscription is EXCLUSIVE", defaultValue = "sole-consumer")
    private String consumerName = "sole-consumer";
    @UriParam(label = "producer", description = "Name of the producer", defaultValue = "default-producer")
    private String producerName = "default-producer";
    @UriParam(label = "consumer", description = "Prefix to add to consumer names when a SHARED or FAILOVER subscription is used", defaultValue = "cons")
    private String consumerNamePrefix = "cons";

    @UriParam(label = "producer", description = "Send timeout in milliseconds", defaultValue = "30000")
    private int sendTimeoutMs = 30000;
    @UriParam(label = "producer", description = "Whether to block the producing thread if pending messages queue is full or to throw a ProducerQueueIsFullError", defaultValue = "false")
    private boolean blockIfQueueFull = false;
    @UriParam(label = "producer", description = "Size of the pending massages queue. When the queue is full, by default, any further sends will fail unless blockIfQueueFull=true", defaultValue = "1000")
    private int maxPendingMessages = 1000;
    @UriParam(label = "producer", description = "The maximum number of pending messages for partitioned topics. The maxPendingMessages value will be reduced if (number of partitions * maxPendingMessages) exceeds this value. Partitioned topics have a pending message queue for each partition.", defaultValue = "50000")
    private int maxPendingMessagesAcrossPartitions = 50000;
    @UriParam(label = "producer", description = "The maximum time period within which the messages sent will be batched if batchingEnabled is true.", defaultValue = "1000")
    private long batchingMaxPublishDelayMicros = TimeUnit.MILLISECONDS.toMicros(1);
    @UriParam(label = "producer", description = "The maximum size to batch messages.", defaultValue = "1000")
    private int batchingMaxMessages = 1000;
    @UriParam(label = "producer", description = "Control whether automatic batching of messages is enabled for the producer.", defaultValue = "true")
    private boolean batchingEnabled;
    @UriParam(label = "producer", description = "The first message published will have a sequence Id of initialSequenceId + 1.", defaultValue = "-1")
    private long initialSequenceId = -1;
    @UriParam(label = "producer", description = "Compression type to use, defaults to NONE from [NONE, LZ4, ZLIB]", defaultValue = "NONE")
    private CompressionType compressionType = CompressionType.NONE;

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public int getNumberOfConsumers() {
        return numberOfConsumers;
    }

    public void setNumberOfConsumers(int numberOfConsumers) {
        this.numberOfConsumers = numberOfConsumers;
    }

    public int getConsumerQueueSize() {
        return consumerQueueSize;
    }

    public void setConsumerQueueSize(int consumerQueueSize) {
        this.consumerQueueSize = consumerQueueSize;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getConsumerNamePrefix() {
        return consumerNamePrefix;
    }

    public void setConsumerNamePrefix(String consumerNamePrefix) {
        this.consumerNamePrefix = consumerNamePrefix;
    }

    public int getSendTimeoutMs() {
        return sendTimeoutMs;
    }

    public void setSendTimeoutMs(int sendTimeoutMs) {
        this.sendTimeoutMs = sendTimeoutMs;
    }

    public boolean isBlockIfQueueFull() {
        return blockIfQueueFull;
    }

    public void setBlockIfQueueFull(boolean blockIfQueueFull) {
        this.blockIfQueueFull = blockIfQueueFull;
    }

    public int getMaxPendingMessages() {
        return maxPendingMessages;
    }

    public void setMaxPendingMessages(int maxPendingMessages) {
        this.maxPendingMessages = maxPendingMessages;
    }

    public int getMaxPendingMessagesAcrossPartitions() {
        return maxPendingMessagesAcrossPartitions;
    }

    public void setMaxPendingMessagesAcrossPartitions(int maxPendingMessagesAcrossPartitions) {
        this.maxPendingMessagesAcrossPartitions = maxPendingMessagesAcrossPartitions;
    }

    public long getBatchingMaxPublishDelayMicros() {
        return batchingMaxPublishDelayMicros;
    }

    public void setBatchingMaxPublishDelayMicros(long batchingMaxPublishDelayMicros) {
        this.batchingMaxPublishDelayMicros = batchingMaxPublishDelayMicros;
    }

    public int getBatchingMaxMessages() {
        return batchingMaxMessages;
    }

    public void setBatchingMaxMessages(int batchingMaxMessages) {
        this.batchingMaxMessages = batchingMaxMessages;
    }

    public boolean isBatchingEnabled() {
        return batchingEnabled;
    }

    public void setBatchingEnabled(boolean batchingEnabled) {
        this.batchingEnabled = batchingEnabled;
    }

    public long getInitialSequenceId() {
        return initialSequenceId;
    }

    public void setInitialSequenceId(long initialSequenceId) {
        this.initialSequenceId = initialSequenceId;
    }

    public CompressionType getCompressionType() {
        return compressionType;
    }

    public void setCompressionType(String compressionType) {
        this.compressionType = CompressionType.valueOf(compressionType.toUpperCase());
    }
}
