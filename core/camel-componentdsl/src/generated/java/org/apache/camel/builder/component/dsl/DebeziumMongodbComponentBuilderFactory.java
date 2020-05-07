/*
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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.debezium.DebeziumMongodbComponent;

/**
 * Capture changes from a MongoDB database.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface DebeziumMongodbComponentBuilderFactory {

    /**
     * Debezium MongoDB Connector (camel-debezium-mongodb)
     * Capture changes from a MongoDB database.
     * 
     * Category: database,nosql,mongodb
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-debezium-mongodb
     */
    static DebeziumMongodbComponentBuilder debeziumMongodb() {
        return new DebeziumMongodbComponentBuilderImpl();
    }

    /**
     * Builder for the Debezium MongoDB Connector component.
     */
    interface DebeziumMongodbComponentBuilder
            extends
                ComponentBuilder<DebeziumMongodbComponent> {
        /**
         * Additional properties for debezium components in case they can't be
         * set directly on the camel configurations (e.g: setting Kafka Connect
         * properties needed by Debezium engine, for example setting
         * KafkaOffsetBackingStore), the properties have to be prefixed with
         * additionalProperties.. E.g:
         * additionalProperties.transactional.id=12345&additionalProperties.schema.registry.url=http://localhost:8811/avro.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         * 
         * Group: common
         */
        default DebeziumMongodbComponentBuilder additionalProperties(
                java.util.Map<java.lang.String, java.lang.Object> additionalProperties) {
            doSetProperty("additionalProperties", additionalProperties);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default DebeziumMongodbComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allow pre-configured Configurations to be set.
         * 
         * The option is a:
         * <code>org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration</code> type.
         * 
         * Group: consumer
         */
        default DebeziumMongodbComponentBuilder configuration(
                org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The Converter class that should be used to serialize and deserialize
         * key data for offsets. The default is JSON converter.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: org.apache.kafka.connect.json.JsonConverter
         * Group: consumer
         */
        default DebeziumMongodbComponentBuilder internalKeyConverter(
                java.lang.String internalKeyConverter) {
            doSetProperty("internalKeyConverter", internalKeyConverter);
            return this;
        }
        /**
         * The Converter class that should be used to serialize and deserialize
         * value data for offsets. The default is JSON converter.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: org.apache.kafka.connect.json.JsonConverter
         * Group: consumer
         */
        default DebeziumMongodbComponentBuilder internalValueConverter(
                java.lang.String internalValueConverter) {
            doSetProperty("internalValueConverter", internalValueConverter);
            return this;
        }
        /**
         * The name of the Java class of the commit policy. It defines when
         * offsets commit has to be triggered based on the number of events
         * processed and the time elapsed since the last commit. This class must
         * implement the interface 'OffsetCommitPolicy'. The default is a
         * periodic commit policy based upon time intervals.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * io.debezium.embedded.spi.OffsetCommitPolicy.PeriodicCommitOffsetPolicy
         * Group: consumer
         */
        default DebeziumMongodbComponentBuilder offsetCommitPolicy(
                java.lang.String offsetCommitPolicy) {
            doSetProperty("offsetCommitPolicy", offsetCommitPolicy);
            return this;
        }
        /**
         * Maximum number of milliseconds to wait for records to flush and
         * partition offset data to be committed to offset storage before
         * cancelling the process and restoring the offset data to be committed
         * in a future attempt. The default is 5 seconds.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 5000
         * Group: consumer
         */
        default DebeziumMongodbComponentBuilder offsetCommitTimeoutMs(
                long offsetCommitTimeoutMs) {
            doSetProperty("offsetCommitTimeoutMs", offsetCommitTimeoutMs);
            return this;
        }
        /**
         * Interval at which to try committing offsets. The default is 1 minute.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 60000
         * Group: consumer
         */
        default DebeziumMongodbComponentBuilder offsetFlushIntervalMs(
                long offsetFlushIntervalMs) {
            doSetProperty("offsetFlushIntervalMs", offsetFlushIntervalMs);
            return this;
        }
        /**
         * The name of the Java class that is responsible for persistence of
         * connector offsets.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: org.apache.kafka.connect.storage.FileOffsetBackingStore
         * Group: consumer
         */
        default DebeziumMongodbComponentBuilder offsetStorage(
                java.lang.String offsetStorage) {
            doSetProperty("offsetStorage", offsetStorage);
            return this;
        }
        /**
         * Path to file where offsets are to be stored. Required when
         * offset.storage is set to the FileOffsetBackingStore.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default DebeziumMongodbComponentBuilder offsetStorageFileName(
                java.lang.String offsetStorageFileName) {
            doSetProperty("offsetStorageFileName", offsetStorageFileName);
            return this;
        }
        /**
         * The number of partitions used when creating the offset storage topic.
         * Required when offset.storage is set to the 'KafkaOffsetBackingStore'.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer
         */
        default DebeziumMongodbComponentBuilder offsetStoragePartitions(
                int offsetStoragePartitions) {
            doSetProperty("offsetStoragePartitions", offsetStoragePartitions);
            return this;
        }
        /**
         * Replication factor used when creating the offset storage topic.
         * Required when offset.storage is set to the KafkaOffsetBackingStore.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer
         */
        default DebeziumMongodbComponentBuilder offsetStorageReplicationFactor(
                int offsetStorageReplicationFactor) {
            doSetProperty("offsetStorageReplicationFactor", offsetStorageReplicationFactor);
            return this;
        }
        /**
         * The name of the Kafka topic where offsets are to be stored. Required
         * when offset.storage is set to the KafkaOffsetBackingStore.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default DebeziumMongodbComponentBuilder offsetStorageTopic(
                java.lang.String offsetStorageTopic) {
            doSetProperty("offsetStorageTopic", offsetStorageTopic);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default DebeziumMongodbComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Description is not available here, please check Debezium website for
         * corresponding key 'collection.blacklist' description.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder collectionBlacklist(
                java.lang.String collectionBlacklist) {
            doSetProperty("collectionBlacklist", collectionBlacklist);
            return this;
        }
        /**
         * The collections for which changes are to be captured.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder collectionWhitelist(
                java.lang.String collectionWhitelist) {
            doSetProperty("collectionWhitelist", collectionWhitelist);
            return this;
        }
        /**
         * The initial delay when trying to reconnect to a primary after a
         * connection cannot be made or when no primary is available. Defaults
         * to 1 second (1000 ms).
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 1000
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder connectBackoffInitialDelayMs(
                long connectBackoffInitialDelayMs) {
            doSetProperty("connectBackoffInitialDelayMs", connectBackoffInitialDelayMs);
            return this;
        }
        /**
         * The maximum delay when trying to reconnect to a primary after a
         * connection cannot be made or when no primary is available. Defaults
         * to 120 second (120,000 ms).
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 120000
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder connectBackoffMaxDelayMs(
                long connectBackoffMaxDelayMs) {
            doSetProperty("connectBackoffMaxDelayMs", connectBackoffMaxDelayMs);
            return this;
        }
        /**
         * Maximum number of failed connection attempts to a replica set primary
         * before an exception occurs and task is aborted. Defaults to 16, which
         * with the defaults for 'connect.backoff.initial.delay.ms' and
         * 'connect.backoff.max.delay.ms' results in just over 20 minutes of
         * attempts before failing.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 16
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder connectMaxAttempts(
                int connectMaxAttempts) {
            doSetProperty("connectMaxAttempts", connectMaxAttempts);
            return this;
        }
        /**
         * The databases for which changes are to be excluded.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder databaseBlacklist(
                java.lang.String databaseBlacklist) {
            doSetProperty("databaseBlacklist", databaseBlacklist);
            return this;
        }
        /**
         * The path to the file that will be used to record the database
         * history.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder databaseHistoryFileFilename(
                java.lang.String databaseHistoryFileFilename) {
            doSetProperty("databaseHistoryFileFilename", databaseHistoryFileFilename);
            return this;
        }
        /**
         * The databases for which changes are to be captured.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder databaseWhitelist(
                java.lang.String databaseWhitelist) {
            doSetProperty("databaseWhitelist", databaseWhitelist);
            return this;
        }
        /**
         * Description is not available here, please check Debezium website for
         * corresponding key 'field.blacklist' description.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder fieldBlacklist(
                java.lang.String fieldBlacklist) {
            doSetProperty("fieldBlacklist", fieldBlacklist);
            return this;
        }
        /**
         * Description is not available here, please check Debezium website for
         * corresponding key 'field.renames' description.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder fieldRenames(
                java.lang.String fieldRenames) {
            doSetProperty("fieldRenames", fieldRenames);
            return this;
        }
        /**
         * Length of an interval in milli-seconds in in which the connector
         * periodically sends heartbeat messages to a heartbeat topic. Use 0 to
         * disable heartbeat messages. Disabled by default.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 0
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder heartbeatIntervalMs(
                int heartbeatIntervalMs) {
            doSetProperty("heartbeatIntervalMs", heartbeatIntervalMs);
            return this;
        }
        /**
         * The prefix that is used to name heartbeat topics.Defaults to
         * __debezium-heartbeat.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: __debezium-heartbeat
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder heartbeatTopicsPrefix(
                java.lang.String heartbeatTopicsPrefix) {
            doSetProperty("heartbeatTopicsPrefix", heartbeatTopicsPrefix);
            return this;
        }
        /**
         * Maximum number of threads used to perform an initial sync of the
         * collections in a replica set. Defaults to 1.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder initialSyncMaxThreads(
                int initialSyncMaxThreads) {
            doSetProperty("initialSyncMaxThreads", initialSyncMaxThreads);
            return this;
        }
        /**
         * Maximum size of each batch of source records. Defaults to 2048.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 2048
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder maxBatchSize(int maxBatchSize) {
            doSetProperty("maxBatchSize", maxBatchSize);
            return this;
        }
        /**
         * Maximum size of the queue for change events read from the database
         * log but not yet recorded or forwarded. Defaults to 8192, and should
         * always be larger than the maximum batch size.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 8192
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder maxQueueSize(int maxQueueSize) {
            doSetProperty("maxQueueSize", maxQueueSize);
            return this;
        }
        /**
         * The hostname and port pairs (in the form 'host' or 'host:port') of
         * the MongoDB server(s) in the replica set.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder mongodbHosts(
                java.lang.String mongodbHosts) {
            doSetProperty("mongodbHosts", mongodbHosts);
            return this;
        }
        /**
         * Specifies whether the addresses in 'hosts' are seeds that should be
         * used to discover all members of the cluster or replica set ('true'),
         * or whether the address(es) in 'hosts' should be used as is ('false').
         * The default is 'true'.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder mongodbMembersAutoDiscover(
                boolean mongodbMembersAutoDiscover) {
            doSetProperty("mongodbMembersAutoDiscover", mongodbMembersAutoDiscover);
            return this;
        }
        /**
         * Unique name that identifies the MongoDB replica set or cluster and
         * all recorded offsets, andthat is used as a prefix for all schemas and
         * topics. Each distinct MongoDB installation should have a separate
         * namespace and monitored by at most one Debezium connector.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder mongodbName(
                java.lang.String mongodbName) {
            doSetProperty("mongodbName", mongodbName);
            return this;
        }
        /**
         * Password to be used when connecting to MongoDB, if necessary.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder mongodbPassword(
                java.lang.String mongodbPassword) {
            doSetProperty("mongodbPassword", mongodbPassword);
            return this;
        }
        /**
         * Should connector use SSL to connect to MongoDB instances.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder mongodbSslEnabled(
                boolean mongodbSslEnabled) {
            doSetProperty("mongodbSslEnabled", mongodbSslEnabled);
            return this;
        }
        /**
         * Whether invalid host names are allowed when using SSL. If true the
         * connection will not prevent man-in-the-middle attacks.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder mongodbSslInvalidHostnameAllowed(
                boolean mongodbSslInvalidHostnameAllowed) {
            doSetProperty("mongodbSslInvalidHostnameAllowed", mongodbSslInvalidHostnameAllowed);
            return this;
        }
        /**
         * Database user for connecting to MongoDB, if necessary.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder mongodbUser(
                java.lang.String mongodbUser) {
            doSetProperty("mongodbUser", mongodbUser);
            return this;
        }
        /**
         * Frequency in milliseconds to wait for new change events to appear
         * after receiving no events. Defaults to 500ms.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 500
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder pollIntervalMs(
                long pollIntervalMs) {
            doSetProperty("pollIntervalMs", pollIntervalMs);
            return this;
        }
        /**
         * The comma-separated list of operations to skip during streaming,
         * defined as: 'i' for inserts; 'u' for updates; 'd' for deletes. By
         * default, no operations will be skipped.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder skippedOperations(
                java.lang.String skippedOperations) {
            doSetProperty("skippedOperations", skippedOperations);
            return this;
        }
        /**
         * The number of milliseconds to delay before a snapshot will begin.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder snapshotDelayMs(
                long snapshotDelayMs) {
            doSetProperty("snapshotDelayMs", snapshotDelayMs);
            return this;
        }
        /**
         * The maximum number of records that should be loaded into memory while
         * performing a snapshot.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder snapshotFetchSize(
                int snapshotFetchSize) {
            doSetProperty("snapshotFetchSize", snapshotFetchSize);
            return this;
        }
        /**
         * The criteria for running a snapshot upon startup of the connector.
         * Options include: 'initial' (the default) to specify the connector
         * should always perform an initial sync when required; 'never' to
         * specify the connector should never perform an initial sync.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: initial
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder snapshotMode(
                java.lang.String snapshotMode) {
            doSetProperty("snapshotMode", snapshotMode);
            return this;
        }
        /**
         * A version of the format of the publicly visible source part in the
         * message.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: v2
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder sourceStructVersion(
                java.lang.String sourceStructVersion) {
            doSetProperty("sourceStructVersion", sourceStructVersion);
            return this;
        }
        /**
         * Whether delete operations should be represented by a delete event and
         * a subsquenttombstone event (true) or only by a delete event (false).
         * Emitting the tombstone event (the default behavior) allows Kafka to
         * completely delete all events pertaining to the given key once the
         * source record got deleted.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: mongodb
         */
        default DebeziumMongodbComponentBuilder tombstonesOnDelete(
                boolean tombstonesOnDelete) {
            doSetProperty("tombstonesOnDelete", tombstonesOnDelete);
            return this;
        }
    }

    class DebeziumMongodbComponentBuilderImpl
            extends
                AbstractComponentBuilder<DebeziumMongodbComponent>
            implements
                DebeziumMongodbComponentBuilder {
        @Override
        protected DebeziumMongodbComponent buildConcreteComponent() {
            return new DebeziumMongodbComponent();
        }
        private org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration getOrCreateConfiguration(
                org.apache.camel.component.debezium.DebeziumMongodbComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "additionalProperties": getOrCreateConfiguration((DebeziumMongodbComponent) component).setAdditionalProperties((java.util.Map) value); return true;
            case "bridgeErrorHandler": ((DebeziumMongodbComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "configuration": ((DebeziumMongodbComponent) component).setConfiguration((org.apache.camel.component.debezium.configuration.MongoDbConnectorEmbeddedDebeziumConfiguration) value); return true;
            case "internalKeyConverter": getOrCreateConfiguration((DebeziumMongodbComponent) component).setInternalKeyConverter((java.lang.String) value); return true;
            case "internalValueConverter": getOrCreateConfiguration((DebeziumMongodbComponent) component).setInternalValueConverter((java.lang.String) value); return true;
            case "offsetCommitPolicy": getOrCreateConfiguration((DebeziumMongodbComponent) component).setOffsetCommitPolicy((java.lang.String) value); return true;
            case "offsetCommitTimeoutMs": getOrCreateConfiguration((DebeziumMongodbComponent) component).setOffsetCommitTimeoutMs((long) value); return true;
            case "offsetFlushIntervalMs": getOrCreateConfiguration((DebeziumMongodbComponent) component).setOffsetFlushIntervalMs((long) value); return true;
            case "offsetStorage": getOrCreateConfiguration((DebeziumMongodbComponent) component).setOffsetStorage((java.lang.String) value); return true;
            case "offsetStorageFileName": getOrCreateConfiguration((DebeziumMongodbComponent) component).setOffsetStorageFileName((java.lang.String) value); return true;
            case "offsetStoragePartitions": getOrCreateConfiguration((DebeziumMongodbComponent) component).setOffsetStoragePartitions((int) value); return true;
            case "offsetStorageReplicationFactor": getOrCreateConfiguration((DebeziumMongodbComponent) component).setOffsetStorageReplicationFactor((int) value); return true;
            case "offsetStorageTopic": getOrCreateConfiguration((DebeziumMongodbComponent) component).setOffsetStorageTopic((java.lang.String) value); return true;
            case "basicPropertyBinding": ((DebeziumMongodbComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "collectionBlacklist": getOrCreateConfiguration((DebeziumMongodbComponent) component).setCollectionBlacklist((java.lang.String) value); return true;
            case "collectionWhitelist": getOrCreateConfiguration((DebeziumMongodbComponent) component).setCollectionWhitelist((java.lang.String) value); return true;
            case "connectBackoffInitialDelayMs": getOrCreateConfiguration((DebeziumMongodbComponent) component).setConnectBackoffInitialDelayMs((long) value); return true;
            case "connectBackoffMaxDelayMs": getOrCreateConfiguration((DebeziumMongodbComponent) component).setConnectBackoffMaxDelayMs((long) value); return true;
            case "connectMaxAttempts": getOrCreateConfiguration((DebeziumMongodbComponent) component).setConnectMaxAttempts((int) value); return true;
            case "databaseBlacklist": getOrCreateConfiguration((DebeziumMongodbComponent) component).setDatabaseBlacklist((java.lang.String) value); return true;
            case "databaseHistoryFileFilename": getOrCreateConfiguration((DebeziumMongodbComponent) component).setDatabaseHistoryFileFilename((java.lang.String) value); return true;
            case "databaseWhitelist": getOrCreateConfiguration((DebeziumMongodbComponent) component).setDatabaseWhitelist((java.lang.String) value); return true;
            case "fieldBlacklist": getOrCreateConfiguration((DebeziumMongodbComponent) component).setFieldBlacklist((java.lang.String) value); return true;
            case "fieldRenames": getOrCreateConfiguration((DebeziumMongodbComponent) component).setFieldRenames((java.lang.String) value); return true;
            case "heartbeatIntervalMs": getOrCreateConfiguration((DebeziumMongodbComponent) component).setHeartbeatIntervalMs((int) value); return true;
            case "heartbeatTopicsPrefix": getOrCreateConfiguration((DebeziumMongodbComponent) component).setHeartbeatTopicsPrefix((java.lang.String) value); return true;
            case "initialSyncMaxThreads": getOrCreateConfiguration((DebeziumMongodbComponent) component).setInitialSyncMaxThreads((int) value); return true;
            case "maxBatchSize": getOrCreateConfiguration((DebeziumMongodbComponent) component).setMaxBatchSize((int) value); return true;
            case "maxQueueSize": getOrCreateConfiguration((DebeziumMongodbComponent) component).setMaxQueueSize((int) value); return true;
            case "mongodbHosts": getOrCreateConfiguration((DebeziumMongodbComponent) component).setMongodbHosts((java.lang.String) value); return true;
            case "mongodbMembersAutoDiscover": getOrCreateConfiguration((DebeziumMongodbComponent) component).setMongodbMembersAutoDiscover((boolean) value); return true;
            case "mongodbName": getOrCreateConfiguration((DebeziumMongodbComponent) component).setMongodbName((java.lang.String) value); return true;
            case "mongodbPassword": getOrCreateConfiguration((DebeziumMongodbComponent) component).setMongodbPassword((java.lang.String) value); return true;
            case "mongodbSslEnabled": getOrCreateConfiguration((DebeziumMongodbComponent) component).setMongodbSslEnabled((boolean) value); return true;
            case "mongodbSslInvalidHostnameAllowed": getOrCreateConfiguration((DebeziumMongodbComponent) component).setMongodbSslInvalidHostnameAllowed((boolean) value); return true;
            case "mongodbUser": getOrCreateConfiguration((DebeziumMongodbComponent) component).setMongodbUser((java.lang.String) value); return true;
            case "pollIntervalMs": getOrCreateConfiguration((DebeziumMongodbComponent) component).setPollIntervalMs((long) value); return true;
            case "skippedOperations": getOrCreateConfiguration((DebeziumMongodbComponent) component).setSkippedOperations((java.lang.String) value); return true;
            case "snapshotDelayMs": getOrCreateConfiguration((DebeziumMongodbComponent) component).setSnapshotDelayMs((long) value); return true;
            case "snapshotFetchSize": getOrCreateConfiguration((DebeziumMongodbComponent) component).setSnapshotFetchSize((int) value); return true;
            case "snapshotMode": getOrCreateConfiguration((DebeziumMongodbComponent) component).setSnapshotMode((java.lang.String) value); return true;
            case "sourceStructVersion": getOrCreateConfiguration((DebeziumMongodbComponent) component).setSourceStructVersion((java.lang.String) value); return true;
            case "tombstonesOnDelete": getOrCreateConfiguration((DebeziumMongodbComponent) component).setTombstonesOnDelete((boolean) value); return true;
            default: return false;
            }
        }
    }
}