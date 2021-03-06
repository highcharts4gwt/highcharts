
package com.github.highcharts4gwt.model.highcharts.option.mock.chart.options3d.frame;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Side;


/**
 * The side for the frame around a 3D chart.
 * 
 */
public class MockSide
    implements Side
{

    private String color;
    private double size;
    private String genericField;
    private String functionAsString;

    public String color() {
        return color;
    }

    public MockSide color(String color) {
        this.color = color;
        return this;
    }

    public double size() {
        return size;
    }

    public MockSide size(double size) {
        this.size = size;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSide setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSide setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
