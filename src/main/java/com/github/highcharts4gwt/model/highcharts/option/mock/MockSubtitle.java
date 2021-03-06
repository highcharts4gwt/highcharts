
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.Subtitle;


/**
 * The chart's subtitle
 * 
 */
public class MockSubtitle
    implements Subtitle
{

    private String align;
    private boolean floating;
    private String style;
    private String text;
    private boolean useHTML;
    private String verticalAlign;
    private double x;
    private double y;
    private String genericField;
    private String functionAsString;

    public String align() {
        return align;
    }

    public MockSubtitle align(String align) {
        this.align = align;
        return this;
    }

    public boolean floating() {
        return floating;
    }

    public MockSubtitle floating(boolean floating) {
        this.floating = floating;
        return this;
    }

    public String style() {
        return style;
    }

    public MockSubtitle style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String text() {
        return text;
    }

    public MockSubtitle text(String text) {
        this.text = text;
        return this;
    }

    public boolean useHTML() {
        return useHTML;
    }

    public MockSubtitle useHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public String verticalAlign() {
        return verticalAlign;
    }

    public MockSubtitle verticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public double x() {
        return x;
    }

    public MockSubtitle x(double x) {
        this.x = x;
        return this;
    }

    public double y() {
        return y;
    }

    public MockSubtitle y(double y) {
        this.y = y;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSubtitle setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSubtitle setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
