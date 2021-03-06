
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.Title;


/**
 * The chart's main title.
 * 
 */
public class MockTitle
    implements Title
{

    private String align;
    private boolean floating;
    private double margin;
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

    public MockTitle align(String align) {
        this.align = align;
        return this;
    }

    public boolean floating() {
        return floating;
    }

    public MockTitle floating(boolean floating) {
        this.floating = floating;
        return this;
    }

    public double margin() {
        return margin;
    }

    public MockTitle margin(double margin) {
        this.margin = margin;
        return this;
    }

    public String style() {
        return style;
    }

    public MockTitle style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String text() {
        return text;
    }

    public MockTitle text(String text) {
        this.text = text;
        return this;
    }

    public boolean useHTML() {
        return useHTML;
    }

    public MockTitle useHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public String verticalAlign() {
        return verticalAlign;
    }

    public MockTitle verticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public double x() {
        return x;
    }

    public MockTitle x(double x) {
        this.x = x;
        return this;
    }

    public double y() {
        return y;
    }

    public MockTitle y(double y) {
        this.y = y;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockTitle setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockTitle setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
