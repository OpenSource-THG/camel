/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.metrics;

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
public class MetricsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MetricsEndpoint target = (MetricsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": target.setAction(property(camelContext, org.apache.camel.component.metrics.MetricsTimerAction.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "decrement": target.setDecrement(property(camelContext, java.lang.Long.class, value)); return true;
        case "increment": target.setIncrement(property(camelContext, java.lang.Long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mark": target.setMark(property(camelContext, java.lang.Long.class, value)); return true;
        case "subject": target.setSubject(property(camelContext, java.lang.Object.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "value": target.setValue(property(camelContext, java.lang.Long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("action", org.apache.camel.component.metrics.MetricsTimerAction.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("decrement", java.lang.Long.class);
        answer.put("increment", java.lang.Long.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("mark", java.lang.Long.class);
        answer.put("subject", java.lang.Object.class);
        answer.put("synchronous", boolean.class);
        answer.put("value", java.lang.Long.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MetricsEndpoint target = (MetricsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": return target.getAction();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "decrement": return target.getDecrement();
        case "increment": return target.getIncrement();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mark": return target.getMark();
        case "subject": return target.getSubject();
        case "synchronous": return target.isSynchronous();
        case "value": return target.getValue();
        default: return null;
        }
    }
}

