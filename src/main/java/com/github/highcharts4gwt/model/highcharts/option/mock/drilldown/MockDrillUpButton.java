
package com.github.highcharts4gwt.model.highcharts.option.mock.drilldown;

import com.github.highcharts4gwt.model.highcharts.option.api.drilldown.DrillUpButton;

public class MockDrillUpButton
    implements DrillUpButton
{

    private String position;
    private String relativeTo;
    private String theme;
    private String genericField;

    public String position() {
        return position;
    }

    public MockDrillUpButton position(String positionAsJsonString) {
        this.position = positionAsJsonString;
        return this;
    }

    public String relativeTo() {
        return relativeTo;
    }

    public MockDrillUpButton relativeTo(String relativeTo) {
        this.relativeTo = relativeTo;
        return this;
    }

    public String theme() {
        return theme;
    }

    public MockDrillUpButton theme(String themeAsJsonString) {
        this.theme = themeAsJsonString;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockDrillUpButton setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
