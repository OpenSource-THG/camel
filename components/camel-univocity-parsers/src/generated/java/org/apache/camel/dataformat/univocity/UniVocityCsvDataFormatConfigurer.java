/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.dataformat.univocity;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class UniVocityCsvDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        UniVocityCsvDataFormat dataformat = (UniVocityCsvDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "quoteallfields":
        case "quoteAllFields": dataformat.setQuoteAllFields(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "quote": dataformat.setQuote(property(camelContext, java.lang.Character.class, value)); return true;
        case "quoteescape":
        case "quoteEscape": dataformat.setQuoteEscape(property(camelContext, java.lang.Character.class, value)); return true;
        case "delimiter": dataformat.setDelimiter(property(camelContext, java.lang.Character.class, value)); return true;
        default: return false;
        }
    }

}

