/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jt400;

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
public class Jt400EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Jt400Endpoint target = (Jt400Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "ccsid": target.getConfiguration().setCcsid(property(camelContext, int.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "format": target.getConfiguration().setFormat(property(camelContext, org.apache.camel.component.jt400.Jt400Configuration.Format.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "guiavailable":
        case "guiAvailable": target.getConfiguration().setGuiAvailable(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "keyed": target.getConfiguration().setKeyed(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "outputfieldsidxarray":
        case "outputFieldsIdxArray": target.getConfiguration().setOutputFieldsIdxArray(property(camelContext, java.lang.Integer[].class, value)); return true;
        case "outputfieldslengtharray":
        case "outputFieldsLengthArray": target.getConfiguration().setOutputFieldsLengthArray(property(camelContext, java.lang.Integer[].class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "procedurename":
        case "procedureName": target.getConfiguration().setProcedureName(property(camelContext, java.lang.String.class, value)); return true;
        case "readtimeout":
        case "readTimeout": target.getConfiguration().setReadTimeout(property(camelContext, int.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "searchkey":
        case "searchKey": target.getConfiguration().setSearchKey(property(camelContext, java.lang.String.class, value)); return true;
        case "searchtype":
        case "searchType": target.getConfiguration().setSearchType(property(camelContext, org.apache.camel.component.jt400.Jt400Configuration.SearchType.class, value)); return true;
        case "secured": target.getConfiguration().setSecured(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("backoffErrorThreshold", int.class);
        answer.put("backoffIdleThreshold", int.class);
        answer.put("backoffMultiplier", int.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("ccsid", int.class);
        answer.put("delay", long.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("format", org.apache.camel.component.jt400.Jt400Configuration.Format.class);
        answer.put("greedy", boolean.class);
        answer.put("guiAvailable", boolean.class);
        answer.put("initialDelay", long.class);
        answer.put("keyed", boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("outputFieldsIdxArray", java.lang.Integer[].class);
        answer.put("outputFieldsLengthArray", java.lang.Integer[].class);
        answer.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        answer.put("procedureName", java.lang.String.class);
        answer.put("readTimeout", int.class);
        answer.put("repeatCount", long.class);
        answer.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        answer.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        answer.put("scheduler", java.lang.String.class);
        answer.put("schedulerProperties", java.util.Map.class);
        answer.put("searchKey", java.lang.String.class);
        answer.put("searchType", org.apache.camel.component.jt400.Jt400Configuration.SearchType.class);
        answer.put("secured", boolean.class);
        answer.put("sendEmptyMessageWhenIdle", boolean.class);
        answer.put("startScheduler", boolean.class);
        answer.put("synchronous", boolean.class);
        answer.put("timeUnit", java.util.concurrent.TimeUnit.class);
        answer.put("useFixedDelay", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Jt400Endpoint target = (Jt400Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "ccsid": return target.getConfiguration().getCcsid();
        case "delay": return target.getDelay();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "format": return target.getConfiguration().getFormat();
        case "greedy": return target.isGreedy();
        case "guiavailable":
        case "guiAvailable": return target.getConfiguration().isGuiAvailable();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "keyed": return target.getConfiguration().isKeyed();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "outputfieldsidxarray":
        case "outputFieldsIdxArray": return target.getConfiguration().getOutputFieldsIdxArray();
        case "outputfieldslengtharray":
        case "outputFieldsLengthArray": return target.getConfiguration().getOutputFieldsLengthArray();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "procedurename":
        case "procedureName": return target.getConfiguration().getProcedureName();
        case "readtimeout":
        case "readTimeout": return target.getConfiguration().getReadTimeout();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "searchkey":
        case "searchKey": return target.getConfiguration().getSearchKey();
        case "searchtype":
        case "searchType": return target.getConfiguration().getSearchType();
        case "secured": return target.getConfiguration().isSecured();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "synchronous": return target.isSynchronous();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        default: return null;
        }
    }
}

