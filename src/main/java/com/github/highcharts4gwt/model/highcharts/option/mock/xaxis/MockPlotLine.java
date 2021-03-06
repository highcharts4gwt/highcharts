
package com.github.highcharts4gwt.model.highcharts.option.mock.xaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PlotLine;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.plotlines.Label;


/**
 * An array of lines stretching across the plot area, marking a specific value on one of the axes.
 * 
 */
public class MockPlotLine
    implements PlotLine
{

    private String color;
    private String dashStyle;
    private String id;
    private Label label;
    private double value;
    private double width;
    private double zIndex;
    private String genericField;
    private String functionAsString;

    public String color() {
        return color;
    }

    public MockPlotLine color(String color) {
        this.color = color;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockPlotLine dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public String id() {
        return id;
    }

    public MockPlotLine id(String id) {
        this.id = id;
        return this;
    }

    public Label label() {
        return label;
    }

    public MockPlotLine label(Label label) {
        this.label = label;
        return this;
    }

    public double value() {
        return value;
    }

    public MockPlotLine value(double value) {
        this.value = value;
        return this;
    }

    public double width() {
        return width;
    }

    public MockPlotLine width(double width) {
        this.width = width;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockPlotLine zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockPlotLine setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockPlotLine setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
