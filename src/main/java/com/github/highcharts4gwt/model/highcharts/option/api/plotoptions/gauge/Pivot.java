
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge;


public interface Pivot {


    String backgroundColor();

    Pivot backgroundColor(String backgroundColor);

    String borderColor();

    Pivot borderColor(String borderColor);

    double borderWidth();

    Pivot borderWidth(double borderWidth);

    double radius();

    Pivot radius(double radius);

    String getFieldAsJsonObject(String fieldName);

    Pivot setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
