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
package org.apache.camel.model.dataformat;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.model.DataFormatDefinition;
import org.apache.camel.spi.Metadata;

/**
 * The CSV data format is used for handling CSV payloads.
 */
@Metadata(firstVersion = "1.3.0", label = "dataformat,transformation,csv", title = "CSV")
@XmlRootElement(name = "csv")
@XmlAccessorType(XmlAccessType.FIELD)
public class CsvDataFormat extends DataFormatDefinition {
    // Format options
    @XmlAttribute @Metadata(label = "advanced")
    private String formatRef;
    @XmlAttribute @Metadata(enums = "DEFAULT,EXCEL,INFORMIX_UNLOAD,INFORMIX_UNLOAD_CSV,MYSQL,RFC4180")
    private String formatName;
    @XmlAttribute
    private Boolean commentMarkerDisabled;
    @XmlAttribute
    private String commentMarker;
    @XmlAttribute
    private String delimiter;
    @XmlAttribute
    private Boolean escapeDisabled;
    @XmlAttribute
    private String escape;
    @XmlAttribute
    private Boolean headerDisabled;
    @XmlElement
    private List<String> header;
    @XmlAttribute
    private Boolean allowMissingColumnNames;
    @XmlAttribute
    private Boolean ignoreEmptyLines;
    @XmlAttribute
    private Boolean ignoreSurroundingSpaces;
    @XmlAttribute
    private Boolean nullStringDisabled;
    @XmlAttribute
    private String nullString;
    @XmlAttribute
    private Boolean quoteDisabled;
    @XmlAttribute
    private String quote;
    @XmlAttribute
    private String recordSeparatorDisabled;
    @XmlAttribute
    private String recordSeparator;
    @XmlAttribute
    private Boolean skipHeaderRecord;
    @XmlAttribute
    private String quoteMode;
    @XmlAttribute
    private Boolean ignoreHeaderCase;
    @XmlAttribute
    private Boolean trim;
    @XmlAttribute
    private Boolean trailingDelimiter;
    @XmlAttribute @Metadata(label = "advanced")
    private String marshallerFactoryRef;

    // Unmarshall options
    @XmlAttribute
    private Boolean lazyLoad;
    @XmlAttribute
    private Boolean useMaps;
    @XmlAttribute
    private Boolean useOrderedMaps;
    @XmlAttribute
    private String recordConverterRef;

    public CsvDataFormat() {
        super("csv");
    }

    public CsvDataFormat(String delimiter) {
        this();
        setDelimiter(delimiter);
    }

    public CsvDataFormat(boolean lazyLoad) {
        this();
        setLazyLoad(lazyLoad);
    }

    /**
     * Sets the implementation of the CsvMarshallerFactory interface which is able to customize marshalling/unmarshalling 
     * behavior by extending CsvMarshaller or creating it from scratch.
     *
     * @param marshallerFactoryRef the <code>CsvMarshallerFactory</code> reference.
     */
    public void setMarshallerFactoryRef(String marshallerFactoryRef) {
        this.marshallerFactoryRef = marshallerFactoryRef;
    }

    /**
     * Returns the <code>CsvMarshallerFactory</code> reference.
     *
     * @return the <code>CsvMarshallerFactory</code> or <code>null</code> if none has been specified.
     */
    public String getMarshallerFactoryRef() {
        return marshallerFactoryRef;
    }

    public String getFormatRef() {
        return formatRef;
    }

    /**
     * The reference format to use, it will be updated with the other format options, the default value is CSVFormat.DEFAULT
     */
    public void setFormatRef(String formatRef) {
        this.formatRef = formatRef;
    }

    public String getFormatName() {
        return formatName;
    }

    /**
     * The name of the format to use, the default value is CSVFormat.DEFAULT
     */
    public void setFormatName(String formatName) {
        this.formatName = formatName;
    }

    public Boolean getCommentMarkerDisabled() {
        return commentMarkerDisabled;
    }

    /**
     * Disables the comment marker of the reference format.
     */
    public void setCommentMarkerDisabled(Boolean commentMarkerDisabled) {
        this.commentMarkerDisabled = commentMarkerDisabled;
    }

    public String getCommentMarker() {
        return commentMarker;
    }

    /**
     * Sets the comment marker of the reference format.
     */
    public void setCommentMarker(String commentMarker) {
        this.commentMarker = commentMarker;
    }

    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the delimiter to use.
     * <p/>
     * The default value is , (comma)
     */
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public Boolean getEscapeDisabled() {
        return escapeDisabled;
    }

    /**
     * Use for disabling using escape character
     */
    public void setEscapeDisabled(Boolean escapeDisabled) {
        this.escapeDisabled = escapeDisabled;
    }

    public String getEscape() {
        return escape;
    }

    /**
     * Sets the escape character to use
     */
    public void setEscape(String escape) {
        this.escape = escape;
    }

    /**
     * Use for disabling headers
     */
    public Boolean getHeaderDisabled() {
        return headerDisabled;
    }

    public void setHeaderDisabled(Boolean headerDisabled) {
        this.headerDisabled = headerDisabled;
    }

    public List<String> getHeader() {
        return header;
    }

    /**
     * To configure the CSV headers
     */
    public void setHeader(List<String> header) {
        this.header = header;
    }

    public Boolean getAllowMissingColumnNames() {
        return allowMissingColumnNames;
    }

    /**
     * Whether to allow missing column names.
     */
    public void setAllowMissingColumnNames(Boolean allowMissingColumnNames) {
        this.allowMissingColumnNames = allowMissingColumnNames;
    }

    public Boolean getIgnoreEmptyLines() {
        return ignoreEmptyLines;
    }

    /**
     * Whether to ignore empty lines.
     */
    public void setIgnoreEmptyLines(Boolean ignoreEmptyLines) {
        this.ignoreEmptyLines = ignoreEmptyLines;
    }

    public Boolean getIgnoreSurroundingSpaces() {
        return ignoreSurroundingSpaces;
    }

    /**
     * Whether to ignore surrounding spaces
     */
    public void setIgnoreSurroundingSpaces(Boolean ignoreSurroundingSpaces) {
        this.ignoreSurroundingSpaces = ignoreSurroundingSpaces;
    }

    public Boolean getNullStringDisabled() {
        return nullStringDisabled;
    }

    /**
     * Used to disable null strings
     */
    public void setNullStringDisabled(Boolean nullStringDisabled) {
        this.nullStringDisabled = nullStringDisabled;
    }

    public String getNullString() {
        return nullString;
    }

    /**
     * Sets the null string
     */
    public void setNullString(String nullString) {
        this.nullString = nullString;
    }

    public Boolean getQuoteDisabled() {
        return quoteDisabled;
    }

    /**
     * Used to disable quotes
     */
    public void setQuoteDisabled(Boolean quoteDisabled) {
        this.quoteDisabled = quoteDisabled;
    }

    public String getQuote() {
        return quote;
    }

    /**
     * Sets the quote which by default is "
     */
    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getRecordSeparatorDisabled() {
        return recordSeparatorDisabled;
    }

    /**
     * Used for disabling record separator
     */
    public void setRecordSeparatorDisabled(String recordSeparatorDisabled) {
        this.recordSeparatorDisabled = recordSeparatorDisabled;
    }

    public String getRecordSeparator() {
        return recordSeparator;
    }

    /**
     * Sets the record separator (aka new line) which by default is new line characters (CRLF)
     */
    public void setRecordSeparator(String recordSeparator) {
        this.recordSeparator = recordSeparator;
    }

    public Boolean getSkipHeaderRecord() {
        return skipHeaderRecord;
    }

    /**
     * Whether to skip the header record in the output
     */
    public void setSkipHeaderRecord(Boolean skipHeaderRecord) {
        this.skipHeaderRecord = skipHeaderRecord;
    }

    public String getQuoteMode() {
        return quoteMode;
    }

    /**
     * Sets the quote mode
     */
    public void setQuoteMode(String quoteMode) {
        this.quoteMode = quoteMode;
    }

    public Boolean getLazyLoad() {
        return lazyLoad;
    }

    /**
     * Whether the unmarshalling should produce an iterator that reads the lines on the fly or if all the lines must be read at one.
     */
    public void setLazyLoad(Boolean lazyLoad) {
        this.lazyLoad = lazyLoad;
    }

    public Boolean getUseMaps() {
        return useMaps;
    }

    /**
     * Whether the unmarshalling should produce maps (HashMap)for the lines values instead of lists. It requires to have header (either defined or collected).
     */
    public void setUseMaps(Boolean useMaps) {
        this.useMaps = useMaps;
    }

    public Boolean getUseOrderedMaps() {
        return useOrderedMaps;
    }

    /**
     * Whether the unmarshalling should produce ordered maps (LinkedHashMap) for the lines values instead of lists. It requires to have header (either defined or collected).
     */
    public void setUseOrderedMaps(Boolean useOrderedMaps) {
        this.useOrderedMaps = useOrderedMaps;
    }

    public String getRecordConverterRef() {
        return recordConverterRef;
    }

    /**
     * Refers to a custom <tt>CsvRecordConverter</tt> to lookup from the registry to use.
     */
    public void setRecordConverterRef(String recordConverterRef) {
        this.recordConverterRef = recordConverterRef;
    }

    /**
     * Sets whether or not to trim leading and trailing blanks.
     */
    public void setTrim(Boolean trim) {
        this.trim = trim;
    }

    public Boolean getTrim() {
        return trim;
    }
    
    /**
     * Sets whether or not to ignore case when accessing header names.
     */
    public void setIgnoreHeaderCase(Boolean ignoreHeaderCase) {
        this.ignoreHeaderCase = ignoreHeaderCase;
    }
    
    public Boolean getIgnoreHeaderCase() {
        return ignoreHeaderCase;
    }
    
    /**
     * Sets whether or not to add a trailing delimiter.
     */
    public void setTrailingDelimiter(Boolean trailingDelimiter) {
        this.trailingDelimiter = trailingDelimiter;
    }
    
    public Boolean getTrailingDelimiter() {
        return trailingDelimiter;
    }

}
