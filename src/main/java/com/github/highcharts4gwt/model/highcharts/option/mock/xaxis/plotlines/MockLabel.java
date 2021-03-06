
package com.github.highcharts4gwt.model.highcharts.option.mock.xaxis.plotlines;

import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.plotlines.Label;


/**
 * Text labels for the plot bands
 * 
 */
public class MockLabel
    implements Label
{

    private String align;
    private double rotation;
    private String style;
    private String text;
    private String textAlign;
    private boolean useHTML;
    private String verticalAlign;
    private double x;
    private double y;
    private String genericField;
    private String functionAsString;

    public String align() {
        return align;
    }

    public MockLabel align(String align) {
        this.align = align;
        return this;
    }

    public double rotation() {
        return rotation;
    }

    public MockLabel rotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    public String style() {
        return style;
    }

    public MockLabel style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String text() {
        return text;
    }

    public MockLabel text(String text) {
        this.text = text;
        return this;
    }

    public String textAlign() {
        return textAlign;
    }

    public MockLabel textAlign(String textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public boolean useHTML() {
        return useHTML;
    }

    public MockLabel useHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public String verticalAlign() {
        return verticalAlign;
    }

    public MockLabel verticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public double x() {
        return x;
    }

    public MockLabel x(double x) {
        this.x = x;
        return this;
    }

    public double y() {
        return y;
    }

    public MockLabel y(double y) {
        this.y = y;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockLabel setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockLabel setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
