/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.infinispan;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class InfinispanEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        InfinispanEndpoint target = (InfinispanEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cachecontainer":
        case "cacheContainer": target.getConfiguration().setCacheContainer(property(camelContext, org.infinispan.commons.api.BasicCacheContainer.class, value)); return true;
        case "cachecontainerconfiguration":
        case "cacheContainerConfiguration": target.getConfiguration().setCacheContainerConfiguration(property(camelContext, java.lang.Object.class, value)); return true;
        case "clusteredlistener":
        case "clusteredListener": target.getConfiguration().setClusteredListener(property(camelContext, boolean.class, value)); return true;
        case "command": target.getConfiguration().setCommand(property(camelContext, java.lang.String.class, value)); return true;
        case "configurationproperties":
        case "configurationProperties": target.getConfiguration().setConfigurationProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "customlistener":
        case "customListener": target.getConfiguration().setCustomListener(property(camelContext, org.apache.camel.component.infinispan.InfinispanCustomListener.class, value)); return true;
        case "eventtypes":
        case "eventTypes": target.getConfiguration().setEventTypes(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "flags": target.getConfiguration().setFlags(property(camelContext, java.lang.String.class, value)); return true;
        case "hosts": target.getConfiguration().setHosts(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.infinispan.InfinispanOperation.class, value)); return true;
        case "querybuilder":
        case "queryBuilder": target.getConfiguration().setQueryBuilder(property(camelContext, org.apache.camel.component.infinispan.InfinispanQueryBuilder.class, value)); return true;
        case "remappingfunction":
        case "remappingFunction": target.getConfiguration().setRemappingFunction(property(camelContext, java.util.function.BiFunction.class, value)); return true;
        case "resultheader":
        case "resultHeader": target.getConfiguration().setResultHeader(property(camelContext, java.lang.Object.class, value)); return true;
        case "sync": target.getConfiguration().setSync(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("cacheContainer", org.infinispan.commons.api.BasicCacheContainer.class);
        answer.put("cacheContainerConfiguration", java.lang.Object.class);
        answer.put("clusteredListener", boolean.class);
        answer.put("command", java.lang.String.class);
        answer.put("configurationProperties", java.util.Map.class);
        answer.put("configurationUri", java.lang.String.class);
        answer.put("customListener", org.apache.camel.component.infinispan.InfinispanCustomListener.class);
        answer.put("eventTypes", java.lang.String.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("flags", java.lang.String.class);
        answer.put("hosts", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("operation", org.apache.camel.component.infinispan.InfinispanOperation.class);
        answer.put("queryBuilder", org.apache.camel.component.infinispan.InfinispanQueryBuilder.class);
        answer.put("remappingFunction", java.util.function.BiFunction.class);
        answer.put("resultHeader", java.lang.Object.class);
        answer.put("sync", boolean.class);
        answer.put("synchronous", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        InfinispanEndpoint target = (InfinispanEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cachecontainer":
        case "cacheContainer": return target.getConfiguration().getCacheContainer();
        case "cachecontainerconfiguration":
        case "cacheContainerConfiguration": return target.getConfiguration().getCacheContainerConfiguration();
        case "clusteredlistener":
        case "clusteredListener": return target.getConfiguration().isClusteredListener();
        case "command": return target.getConfiguration().getCommand();
        case "configurationproperties":
        case "configurationProperties": return target.getConfiguration().getConfigurationProperties();
        case "configurationuri":
        case "configurationUri": return target.getConfiguration().getConfigurationUri();
        case "customlistener":
        case "customListener": return target.getConfiguration().getCustomListener();
        case "eventtypes":
        case "eventTypes": return target.getConfiguration().getEventTypes();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "flags": return target.getConfiguration().getFlags();
        case "hosts": return target.getConfiguration().getHosts();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getConfiguration().getOperation();
        case "querybuilder":
        case "queryBuilder": return target.getConfiguration().getQueryBuilder();
        case "remappingfunction":
        case "remappingFunction": return target.getConfiguration().getRemappingFunction();
        case "resultheader":
        case "resultHeader": return target.getConfiguration().getResultHeader();
        case "sync": return target.getConfiguration().isSync();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

