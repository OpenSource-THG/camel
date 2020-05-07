/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.avro;

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
public class AvroComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.avro.AvroConfiguration getOrCreateConfiguration(AvroComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.avro.AvroConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AvroComponent target = (AvroComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.avro.AvroConfiguration.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "protocol": getOrCreateConfiguration(target).setProtocol(property(camelContext, org.apache.avro.Protocol.class, value)); return true;
        case "protocolclassname":
        case "protocolClassName": getOrCreateConfiguration(target).setProtocolClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "protocollocation":
        case "protocolLocation": getOrCreateConfiguration(target).setProtocolLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "reflectionprotocol":
        case "reflectionProtocol": getOrCreateConfiguration(target).setReflectionProtocol(property(camelContext, boolean.class, value)); return true;
        case "singleparameter":
        case "singleParameter": getOrCreateConfiguration(target).setSingleParameter(property(camelContext, boolean.class, value)); return true;
        case "uriauthority":
        case "uriAuthority": getOrCreateConfiguration(target).setUriAuthority(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("configuration", org.apache.camel.component.avro.AvroConfiguration.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("protocol", org.apache.avro.Protocol.class);
        answer.put("protocolClassName", java.lang.String.class);
        answer.put("protocolLocation", java.lang.String.class);
        answer.put("reflectionProtocol", boolean.class);
        answer.put("singleParameter", boolean.class);
        answer.put("uriAuthority", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AvroComponent target = (AvroComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "protocol": return getOrCreateConfiguration(target).getProtocol();
        case "protocolclassname":
        case "protocolClassName": return getOrCreateConfiguration(target).getProtocolClassName();
        case "protocollocation":
        case "protocolLocation": return getOrCreateConfiguration(target).getProtocolLocation();
        case "reflectionprotocol":
        case "reflectionProtocol": return getOrCreateConfiguration(target).isReflectionProtocol();
        case "singleparameter":
        case "singleParameter": return getOrCreateConfiguration(target).isSingleParameter();
        case "uriauthority":
        case "uriAuthority": return getOrCreateConfiguration(target).getUriAuthority();
        default: return null;
        }
    }
}

