package org.apache.camel.component.pulsar;

import org.apache.camel.Consumer;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.component.pulsar.configuration.PulsarEndpointConfiguration;
import org.apache.camel.impl.DefaultEndpoint;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@UriEndpoint(scheme = "pulsar", title = "Apache Pulsar", syntax = "pulsar:tenant/namespace/topic", label = "messaging")
public class PulsarEndpoint extends DefaultEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(PulsarEndpoint.class);

    @UriParam
    private final PulsarEndpointConfiguration pulsarEndpointConfiguration;
    @UriParam
    private final PulsarClient pulsarClient;

    private PulsarEndpoint(PulsarEndpointConfiguration pulsarEndpointConfiguration, PulsarComponent component) throws PulsarClientException {
        super(pulsarEndpointConfiguration.getTopic(), component);
        this.pulsarEndpointConfiguration = pulsarEndpointConfiguration;
        this.pulsarClient = pulsarEndpointConfiguration.getPulsarClient();
    }

    public static PulsarEndpoint create(PulsarEndpointConfiguration pulsarEndpointConfiguration, PulsarComponent component) throws PulsarClientException {
        if (pulsarEndpointConfiguration == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Pulsar client and Pulsar Endpoint Configuration cannot be null");
            LOGGER.error("An exception occurred while creating Pulsar Endpoint :: {}", illegalArgumentException);
            throw illegalArgumentException;
        }
        return new PulsarEndpoint(pulsarEndpointConfiguration, component);
    }

    @Override
    public Producer createProducer() {
        return PulsarProducer.create(this);
    }

    @Override
    public Consumer createConsumer(Processor processor) throws Exception {
        PulsarConsumer consumer = PulsarConsumer.create(this, processor);
        configureConsumer(consumer);
        return consumer;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public Exchange createExchange() {
        return super.createExchange();
    }

    public PulsarClient getPulsarClient() {
        return pulsarClient;
    }

    public PulsarEndpointConfiguration getConfiguration() {
        return pulsarEndpointConfiguration;
    }
}
