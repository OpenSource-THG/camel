/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.salesforce;

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
public class SalesforceEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SalesforceEndpoint target = (SalesforceEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apexmethod":
        case "apexMethod": target.getConfiguration().setApexMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "apexqueryparams":
        case "apexQueryParams": target.getConfiguration().setApexQueryParams(property(camelContext, java.util.Map.class, value)); return true;
        case "apexurl":
        case "apexUrl": target.getConfiguration().setApexUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "apiversion":
        case "apiVersion": target.getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "backoffincrement":
        case "backoffIncrement": target.getConfiguration().setBackoffIncrement(property(camelContext, long.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "batchid":
        case "batchId": target.getConfiguration().setBatchId(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "contenttype":
        case "contentType": target.getConfiguration().setContentType(property(camelContext, org.apache.camel.component.salesforce.api.dto.bulk.ContentType.class, value)); return true;
        case "defaultreplayid":
        case "defaultReplayId": target.getConfiguration().setDefaultReplayId(property(camelContext, java.lang.Long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "format": target.getConfiguration().setFormat(property(camelContext, org.apache.camel.component.salesforce.internal.PayloadFormat.class, value)); return true;
        case "httpclient":
        case "httpClient": target.getConfiguration().setHttpClient(property(camelContext, org.apache.camel.component.salesforce.SalesforceHttpClient.class, value)); return true;
        case "includedetails":
        case "includeDetails": target.getConfiguration().setIncludeDetails(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "initialreplayidmap":
        case "initialReplayIdMap": target.getConfiguration().setInitialReplayIdMap(property(camelContext, java.util.Map.class, value)); return true;
        case "instanceid":
        case "instanceId": target.getConfiguration().setInstanceId(property(camelContext, java.lang.String.class, value)); return true;
        case "jobid":
        case "jobId": target.getConfiguration().setJobId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "limit": target.getConfiguration().setLimit(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxbackoff":
        case "maxBackoff": target.getConfiguration().setMaxBackoff(property(camelContext, long.class, value)); return true;
        case "notfoundbehaviour":
        case "notFoundBehaviour": target.getConfiguration().setNotFoundBehaviour(property(camelContext, org.apache.camel.component.salesforce.NotFoundBehaviour.class, value)); return true;
        case "notifyforfields":
        case "notifyForFields": target.getConfiguration().setNotifyForFields(property(camelContext, org.apache.camel.component.salesforce.internal.dto.NotifyForFieldsEnum.class, value)); return true;
        case "notifyforoperationcreate":
        case "notifyForOperationCreate": target.getConfiguration().setNotifyForOperationCreate(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "notifyforoperationdelete":
        case "notifyForOperationDelete": target.getConfiguration().setNotifyForOperationDelete(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "notifyforoperationundelete":
        case "notifyForOperationUndelete": target.getConfiguration().setNotifyForOperationUndelete(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "notifyforoperationupdate":
        case "notifyForOperationUpdate": target.getConfiguration().setNotifyForOperationUpdate(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "notifyforoperations":
        case "notifyForOperations": target.getConfiguration().setNotifyForOperations(property(camelContext, org.apache.camel.component.salesforce.internal.dto.NotifyForOperationsEnum.class, value)); return true;
        case "objectmapper":
        case "objectMapper": target.getConfiguration().setObjectMapper(property(camelContext, com.fasterxml.jackson.databind.ObjectMapper.class, value)); return true;
        case "rawpayload":
        case "rawPayload": target.getConfiguration().setRawPayload(property(camelContext, boolean.class, value)); return true;
        case "replayid":
        case "replayId": target.setReplayId(property(camelContext, java.lang.Long.class, value)); return true;
        case "reportid":
        case "reportId": target.getConfiguration().setReportId(property(camelContext, java.lang.String.class, value)); return true;
        case "reportmetadata":
        case "reportMetadata": target.getConfiguration().setReportMetadata(property(camelContext, org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class, value)); return true;
        case "resultid":
        case "resultId": target.getConfiguration().setResultId(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectblobfieldname":
        case "sObjectBlobFieldName": target.getConfiguration().setSObjectBlobFieldName(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectclass":
        case "sObjectClass": target.getConfiguration().setSObjectClass(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectfields":
        case "sObjectFields": target.getConfiguration().setSObjectFields(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectid":
        case "sObjectId": target.getConfiguration().setSObjectId(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectidname":
        case "sObjectIdName": target.getConfiguration().setSObjectIdName(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectidvalue":
        case "sObjectIdValue": target.getConfiguration().setSObjectIdValue(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectname":
        case "sObjectName": target.getConfiguration().setSObjectName(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectquery":
        case "sObjectQuery": target.getConfiguration().setSObjectQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "sobjectsearch":
        case "sObjectSearch": target.getConfiguration().setSObjectSearch(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "updatetopic":
        case "updateTopic": target.getConfiguration().setUpdateTopic(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("apexMethod", java.lang.String.class);
        answer.put("apexQueryParams", java.util.Map.class);
        answer.put("apexUrl", java.lang.String.class);
        answer.put("apiVersion", java.lang.String.class);
        answer.put("backoffIncrement", long.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("batchId", java.lang.String.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("contentType", org.apache.camel.component.salesforce.api.dto.bulk.ContentType.class);
        answer.put("defaultReplayId", java.lang.Long.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("format", org.apache.camel.component.salesforce.internal.PayloadFormat.class);
        answer.put("httpClient", org.apache.camel.component.salesforce.SalesforceHttpClient.class);
        answer.put("includeDetails", java.lang.Boolean.class);
        answer.put("initialReplayIdMap", java.util.Map.class);
        answer.put("instanceId", java.lang.String.class);
        answer.put("jobId", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("limit", java.lang.Integer.class);
        answer.put("maxBackoff", long.class);
        answer.put("notFoundBehaviour", org.apache.camel.component.salesforce.NotFoundBehaviour.class);
        answer.put("notifyForFields", org.apache.camel.component.salesforce.internal.dto.NotifyForFieldsEnum.class);
        answer.put("notifyForOperationCreate", java.lang.Boolean.class);
        answer.put("notifyForOperationDelete", java.lang.Boolean.class);
        answer.put("notifyForOperationUndelete", java.lang.Boolean.class);
        answer.put("notifyForOperationUpdate", java.lang.Boolean.class);
        answer.put("notifyForOperations", org.apache.camel.component.salesforce.internal.dto.NotifyForOperationsEnum.class);
        answer.put("objectMapper", com.fasterxml.jackson.databind.ObjectMapper.class);
        answer.put("rawPayload", boolean.class);
        answer.put("replayId", java.lang.Long.class);
        answer.put("reportId", java.lang.String.class);
        answer.put("reportMetadata", org.apache.camel.component.salesforce.api.dto.analytics.reports.ReportMetadata.class);
        answer.put("resultId", java.lang.String.class);
        answer.put("sObjectBlobFieldName", java.lang.String.class);
        answer.put("sObjectClass", java.lang.String.class);
        answer.put("sObjectFields", java.lang.String.class);
        answer.put("sObjectId", java.lang.String.class);
        answer.put("sObjectIdName", java.lang.String.class);
        answer.put("sObjectIdValue", java.lang.String.class);
        answer.put("sObjectName", java.lang.String.class);
        answer.put("sObjectQuery", java.lang.String.class);
        answer.put("sObjectSearch", java.lang.String.class);
        answer.put("synchronous", boolean.class);
        answer.put("updateTopic", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SalesforceEndpoint target = (SalesforceEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apexmethod":
        case "apexMethod": return target.getConfiguration().getApexMethod();
        case "apexqueryparams":
        case "apexQueryParams": return target.getConfiguration().getApexQueryParams();
        case "apexurl":
        case "apexUrl": return target.getConfiguration().getApexUrl();
        case "apiversion":
        case "apiVersion": return target.getConfiguration().getApiVersion();
        case "backoffincrement":
        case "backoffIncrement": return target.getConfiguration().getBackoffIncrement();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "batchid":
        case "batchId": return target.getConfiguration().getBatchId();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "contenttype":
        case "contentType": return target.getConfiguration().getContentType();
        case "defaultreplayid":
        case "defaultReplayId": return target.getConfiguration().getDefaultReplayId();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "format": return target.getConfiguration().getFormat();
        case "httpclient":
        case "httpClient": return target.getConfiguration().getHttpClient();
        case "includedetails":
        case "includeDetails": return target.getConfiguration().getIncludeDetails();
        case "initialreplayidmap":
        case "initialReplayIdMap": return target.getConfiguration().getInitialReplayIdMap();
        case "instanceid":
        case "instanceId": return target.getConfiguration().getInstanceId();
        case "jobid":
        case "jobId": return target.getConfiguration().getJobId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "limit": return target.getConfiguration().getLimit();
        case "maxbackoff":
        case "maxBackoff": return target.getConfiguration().getMaxBackoff();
        case "notfoundbehaviour":
        case "notFoundBehaviour": return target.getConfiguration().getNotFoundBehaviour();
        case "notifyforfields":
        case "notifyForFields": return target.getConfiguration().getNotifyForFields();
        case "notifyforoperationcreate":
        case "notifyForOperationCreate": return target.getConfiguration().getNotifyForOperationCreate();
        case "notifyforoperationdelete":
        case "notifyForOperationDelete": return target.getConfiguration().getNotifyForOperationDelete();
        case "notifyforoperationundelete":
        case "notifyForOperationUndelete": return target.getConfiguration().getNotifyForOperationUndelete();
        case "notifyforoperationupdate":
        case "notifyForOperationUpdate": return target.getConfiguration().getNotifyForOperationUpdate();
        case "notifyforoperations":
        case "notifyForOperations": return target.getConfiguration().getNotifyForOperations();
        case "objectmapper":
        case "objectMapper": return target.getConfiguration().getObjectMapper();
        case "rawpayload":
        case "rawPayload": return target.getConfiguration().isRawPayload();
        case "replayid":
        case "replayId": return target.getReplayId();
        case "reportid":
        case "reportId": return target.getConfiguration().getReportId();
        case "reportmetadata":
        case "reportMetadata": return target.getConfiguration().getReportMetadata();
        case "resultid":
        case "resultId": return target.getConfiguration().getResultId();
        case "sobjectblobfieldname":
        case "sObjectBlobFieldName": return target.getConfiguration().getSObjectBlobFieldName();
        case "sobjectclass":
        case "sObjectClass": return target.getConfiguration().getSObjectClass();
        case "sobjectfields":
        case "sObjectFields": return target.getConfiguration().getSObjectFields();
        case "sobjectid":
        case "sObjectId": return target.getConfiguration().getSObjectId();
        case "sobjectidname":
        case "sObjectIdName": return target.getConfiguration().getSObjectIdName();
        case "sobjectidvalue":
        case "sObjectIdValue": return target.getConfiguration().getSObjectIdValue();
        case "sobjectname":
        case "sObjectName": return target.getConfiguration().getSObjectName();
        case "sobjectquery":
        case "sObjectQuery": return target.getConfiguration().getSObjectQuery();
        case "sobjectsearch":
        case "sObjectSearch": return target.getConfiguration().getSObjectSearch();
        case "synchronous": return target.isSynchronous();
        case "updatetopic":
        case "updateTopic": return target.getConfiguration().isUpdateTopic();
        default: return null;
        }
    }
}

