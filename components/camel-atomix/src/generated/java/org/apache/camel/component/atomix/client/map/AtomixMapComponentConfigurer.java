/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atomix.client.map;

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
public class AtomixMapComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.atomix.client.map.AtomixMapConfiguration getOrCreateConfiguration(AtomixMapComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.atomix.client.map.AtomixMapConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        AtomixMapComponent target = (AtomixMapComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "atomix": getOrCreateConfiguration(target).setAtomix(property(camelContext, io.atomix.Atomix.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.atomix.client.map.AtomixMapConfiguration.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "defaultaction":
        case "defaultAction": getOrCreateConfiguration(target).setDefaultAction(property(camelContext, org.apache.camel.component.atomix.client.map.AtomixMap.Action.class, value)); return true;
        case "defaultresourceconfig":
        case "defaultResourceConfig": getOrCreateConfiguration(target).setDefaultResourceConfig(property(camelContext, java.util.Properties.class, value)); return true;
        case "defaultresourceoptions":
        case "defaultResourceOptions": getOrCreateConfiguration(target).setDefaultResourceOptions(property(camelContext, java.util.Properties.class, value)); return true;
        case "ephemeral": getOrCreateConfiguration(target).setEphemeral(property(camelContext, boolean.class, value)); return true;
        case "key": getOrCreateConfiguration(target).setKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "nodes": target.setNodes(property(camelContext, java.util.List.class, value)); return true;
        case "readconsistency":
        case "readConsistency": getOrCreateConfiguration(target).setReadConsistency(property(camelContext, io.atomix.resource.ReadConsistency.class, value)); return true;
        case "resourceconfigs":
        case "resourceConfigs": getOrCreateConfiguration(target).setResourceConfigs(property(camelContext, java.util.Map.class, value)); return true;
        case "resourceoptions":
        case "resourceOptions": getOrCreateConfiguration(target).setResourceOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "resultheader":
        case "resultHeader": getOrCreateConfiguration(target).setResultHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "transportclassname":
        case "transportClassName": getOrCreateConfiguration(target).setTransportClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "ttl": getOrCreateConfiguration(target).setTtl(property(camelContext, long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("atomix", io.atomix.Atomix.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("configuration", org.apache.camel.component.atomix.client.map.AtomixMapConfiguration.class);
        answer.put("configurationUri", java.lang.String.class);
        answer.put("defaultAction", org.apache.camel.component.atomix.client.map.AtomixMap.Action.class);
        answer.put("defaultResourceConfig", java.util.Properties.class);
        answer.put("defaultResourceOptions", java.util.Properties.class);
        answer.put("ephemeral", boolean.class);
        answer.put("key", java.lang.Object.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("nodes", java.util.List.class);
        answer.put("readConsistency", io.atomix.resource.ReadConsistency.class);
        answer.put("resourceConfigs", java.util.Map.class);
        answer.put("resourceOptions", java.util.Map.class);
        answer.put("resultHeader", java.lang.String.class);
        answer.put("transportClassName", java.lang.String.class);
        answer.put("ttl", long.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        AtomixMapComponent target = (AtomixMapComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "atomix": return getOrCreateConfiguration(target).getAtomix();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "configurationuri":
        case "configurationUri": return target.getConfigurationUri();
        case "defaultaction":
        case "defaultAction": return getOrCreateConfiguration(target).getDefaultAction();
        case "defaultresourceconfig":
        case "defaultResourceConfig": return getOrCreateConfiguration(target).getDefaultResourceConfig();
        case "defaultresourceoptions":
        case "defaultResourceOptions": return getOrCreateConfiguration(target).getDefaultResourceOptions();
        case "ephemeral": return getOrCreateConfiguration(target).isEphemeral();
        case "key": return getOrCreateConfiguration(target).getKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "nodes": return target.getNodes();
        case "readconsistency":
        case "readConsistency": return getOrCreateConfiguration(target).getReadConsistency();
        case "resourceconfigs":
        case "resourceConfigs": return getOrCreateConfiguration(target).getResourceConfigs();
        case "resourceoptions":
        case "resourceOptions": return getOrCreateConfiguration(target).getResourceOptions();
        case "resultheader":
        case "resultHeader": return getOrCreateConfiguration(target).getResultHeader();
        case "transportclassname":
        case "transportClassName": return getOrCreateConfiguration(target).getTransportClassName();
        case "ttl": return getOrCreateConfiguration(target).getTtl();
        default: return null;
        }
    }
}

