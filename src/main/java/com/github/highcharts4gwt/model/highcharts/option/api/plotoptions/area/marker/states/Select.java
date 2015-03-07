
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.marker.states;


public interface Select {


    boolean enabled();

    Select enabled(boolean enabled);

    String fillColor();

    Select fillColor(String fillColor);

    String lineColor();

    Select lineColor(String lineColor);

    double lineWidth();

    Select lineWidth(double lineWidth);

    double radius();

    Select radius(double radius);

    String getFieldAsJsonObject(String fieldName);

    Select setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}