
package com.github.highcharts4gwt.model.highcharts.option.api;


public interface Title {


    String align();

    Title align(String align);

    boolean floating();

    Title floating(boolean floating);

    double margin();

    Title margin(double margin);

    String style();

    Title style(String styleAsJsonString);

    String text();

    Title text(String text);

    boolean useHTML();

    Title useHTML(boolean useHTML);

    String verticalAlign();

    Title verticalAlign(String verticalAlign);

    double x();

    Title x(double x);

    double y();

    Title y(double y);

    String getFieldAsJsonObject(String fieldName);

    Title setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}