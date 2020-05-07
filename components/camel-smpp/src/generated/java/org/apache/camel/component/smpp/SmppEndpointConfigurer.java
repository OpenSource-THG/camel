/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.smpp;

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
public class SmppEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SmppEndpoint target = (SmppEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addressrange":
        case "addressRange": target.getConfiguration().setAddressRange(property(camelContext, java.lang.String.class, value)); return true;
        case "alphabet": target.getConfiguration().setAlphabet(property(camelContext, byte.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "datacoding":
        case "dataCoding": target.getConfiguration().setDataCoding(property(camelContext, byte.class, value)); return true;
        case "destaddr":
        case "destAddr": target.getConfiguration().setDestAddr(property(camelContext, java.lang.String.class, value)); return true;
        case "destaddrnpi":
        case "destAddrNpi": target.getConfiguration().setDestAddrNpi(property(camelContext, byte.class, value)); return true;
        case "destaddrton":
        case "destAddrTon": target.getConfiguration().setDestAddrTon(property(camelContext, byte.class, value)); return true;
        case "encoding": target.getConfiguration().setEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "enquirelinktimer":
        case "enquireLinkTimer": target.getConfiguration().setEnquireLinkTimer(property(camelContext, java.lang.Integer.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "httpproxyhost":
        case "httpProxyHost": target.getConfiguration().setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxypassword":
        case "httpProxyPassword": target.getConfiguration().setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyport":
        case "httpProxyPort": target.getConfiguration().setHttpProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpproxyusername":
        case "httpProxyUsername": target.getConfiguration().setHttpProxyUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "initialreconnectdelay":
        case "initialReconnectDelay": target.getConfiguration().setInitialReconnectDelay(property(camelContext, long.class, value)); return true;
        case "lazysessioncreation":
        case "lazySessionCreation": target.getConfiguration().setLazySessionCreation(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxreconnect":
        case "maxReconnect": target.getConfiguration().setMaxReconnect(property(camelContext, int.class, value)); return true;
        case "numberingplanindicator":
        case "numberingPlanIndicator": target.getConfiguration().setNumberingPlanIndicator(property(camelContext, byte.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "priorityflag":
        case "priorityFlag": target.getConfiguration().setPriorityFlag(property(camelContext, byte.class, value)); return true;
        case "protocolid":
        case "protocolId": target.getConfiguration().setProtocolId(property(camelContext, byte.class, value)); return true;
        case "proxyheaders":
        case "proxyHeaders": target.getConfiguration().setProxyHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "reconnectdelay":
        case "reconnectDelay": target.getConfiguration().setReconnectDelay(property(camelContext, long.class, value)); return true;
        case "registereddelivery":
        case "registeredDelivery": target.getConfiguration().setRegisteredDelivery(property(camelContext, byte.class, value)); return true;
        case "replaceifpresentflag":
        case "replaceIfPresentFlag": target.getConfiguration().setReplaceIfPresentFlag(property(camelContext, byte.class, value)); return true;
        case "servicetype":
        case "serviceType": target.getConfiguration().setServiceType(property(camelContext, java.lang.String.class, value)); return true;
        case "sessionstatelistener":
        case "sessionStateListener": target.getConfiguration().setSessionStateListener(property(camelContext, org.jsmpp.session.SessionStateListener.class, value)); return true;
        case "sourceaddr":
        case "sourceAddr": target.getConfiguration().setSourceAddr(property(camelContext, java.lang.String.class, value)); return true;
        case "sourceaddrnpi":
        case "sourceAddrNpi": target.getConfiguration().setSourceAddrNpi(property(camelContext, byte.class, value)); return true;
        case "sourceaddrton":
        case "sourceAddrTon": target.getConfiguration().setSourceAddrTon(property(camelContext, byte.class, value)); return true;
        case "splittingpolicy":
        case "splittingPolicy": target.getConfiguration().setSplittingPolicy(property(camelContext, org.apache.camel.component.smpp.SmppSplittingPolicy.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "systemid":
        case "systemId": target.getConfiguration().setSystemId(property(camelContext, java.lang.String.class, value)); return true;
        case "systemtype":
        case "systemType": target.getConfiguration().setSystemType(property(camelContext, java.lang.String.class, value)); return true;
        case "transactiontimer":
        case "transactionTimer": target.getConfiguration().setTransactionTimer(property(camelContext, java.lang.Integer.class, value)); return true;
        case "typeofnumber":
        case "typeOfNumber": target.getConfiguration().setTypeOfNumber(property(camelContext, byte.class, value)); return true;
        case "usingssl":
        case "usingSSL": target.getConfiguration().setUsingSSL(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("addressRange", java.lang.String.class);
        answer.put("alphabet", byte.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("dataCoding", byte.class);
        answer.put("destAddr", java.lang.String.class);
        answer.put("destAddrNpi", byte.class);
        answer.put("destAddrTon", byte.class);
        answer.put("encoding", java.lang.String.class);
        answer.put("enquireLinkTimer", java.lang.Integer.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("httpProxyHost", java.lang.String.class);
        answer.put("httpProxyPassword", java.lang.String.class);
        answer.put("httpProxyPort", java.lang.Integer.class);
        answer.put("httpProxyUsername", java.lang.String.class);
        answer.put("initialReconnectDelay", long.class);
        answer.put("lazySessionCreation", boolean.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxReconnect", int.class);
        answer.put("numberingPlanIndicator", byte.class);
        answer.put("password", java.lang.String.class);
        answer.put("priorityFlag", byte.class);
        answer.put("protocolId", byte.class);
        answer.put("proxyHeaders", java.util.Map.class);
        answer.put("reconnectDelay", long.class);
        answer.put("registeredDelivery", byte.class);
        answer.put("replaceIfPresentFlag", byte.class);
        answer.put("serviceType", java.lang.String.class);
        answer.put("sessionStateListener", org.jsmpp.session.SessionStateListener.class);
        answer.put("sourceAddr", java.lang.String.class);
        answer.put("sourceAddrNpi", byte.class);
        answer.put("sourceAddrTon", byte.class);
        answer.put("splittingPolicy", org.apache.camel.component.smpp.SmppSplittingPolicy.class);
        answer.put("synchronous", boolean.class);
        answer.put("systemId", java.lang.String.class);
        answer.put("systemType", java.lang.String.class);
        answer.put("transactionTimer", java.lang.Integer.class);
        answer.put("typeOfNumber", byte.class);
        answer.put("usingSSL", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SmppEndpoint target = (SmppEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addressrange":
        case "addressRange": return target.getConfiguration().getAddressRange();
        case "alphabet": return target.getConfiguration().getAlphabet();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "datacoding":
        case "dataCoding": return target.getConfiguration().getDataCoding();
        case "destaddr":
        case "destAddr": return target.getConfiguration().getDestAddr();
        case "destaddrnpi":
        case "destAddrNpi": return target.getConfiguration().getDestAddrNpi();
        case "destaddrton":
        case "destAddrTon": return target.getConfiguration().getDestAddrTon();
        case "encoding": return target.getConfiguration().getEncoding();
        case "enquirelinktimer":
        case "enquireLinkTimer": return target.getConfiguration().getEnquireLinkTimer();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "httpproxyhost":
        case "httpProxyHost": return target.getConfiguration().getHttpProxyHost();
        case "httpproxypassword":
        case "httpProxyPassword": return target.getConfiguration().getHttpProxyPassword();
        case "httpproxyport":
        case "httpProxyPort": return target.getConfiguration().getHttpProxyPort();
        case "httpproxyusername":
        case "httpProxyUsername": return target.getConfiguration().getHttpProxyUsername();
        case "initialreconnectdelay":
        case "initialReconnectDelay": return target.getConfiguration().getInitialReconnectDelay();
        case "lazysessioncreation":
        case "lazySessionCreation": return target.getConfiguration().isLazySessionCreation();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxreconnect":
        case "maxReconnect": return target.getConfiguration().getMaxReconnect();
        case "numberingplanindicator":
        case "numberingPlanIndicator": return target.getConfiguration().getNumberingPlanIndicator();
        case "password": return target.getConfiguration().getPassword();
        case "priorityflag":
        case "priorityFlag": return target.getConfiguration().getPriorityFlag();
        case "protocolid":
        case "protocolId": return target.getConfiguration().getProtocolId();
        case "proxyheaders":
        case "proxyHeaders": return target.getConfiguration().getProxyHeaders();
        case "reconnectdelay":
        case "reconnectDelay": return target.getConfiguration().getReconnectDelay();
        case "registereddelivery":
        case "registeredDelivery": return target.getConfiguration().getRegisteredDelivery();
        case "replaceifpresentflag":
        case "replaceIfPresentFlag": return target.getConfiguration().getReplaceIfPresentFlag();
        case "servicetype":
        case "serviceType": return target.getConfiguration().getServiceType();
        case "sessionstatelistener":
        case "sessionStateListener": return target.getConfiguration().getSessionStateListener();
        case "sourceaddr":
        case "sourceAddr": return target.getConfiguration().getSourceAddr();
        case "sourceaddrnpi":
        case "sourceAddrNpi": return target.getConfiguration().getSourceAddrNpi();
        case "sourceaddrton":
        case "sourceAddrTon": return target.getConfiguration().getSourceAddrTon();
        case "splittingpolicy":
        case "splittingPolicy": return target.getConfiguration().getSplittingPolicy();
        case "synchronous": return target.isSynchronous();
        case "systemid":
        case "systemId": return target.getConfiguration().getSystemId();
        case "systemtype":
        case "systemType": return target.getConfiguration().getSystemType();
        case "transactiontimer":
        case "transactionTimer": return target.getConfiguration().getTransactionTimer();
        case "typeofnumber":
        case "typeOfNumber": return target.getConfiguration().getTypeOfNumber();
        case "usingssl":
        case "usingSSL": return target.getConfiguration().isUsingSSL();
        default: return null;
        }
    }
}

