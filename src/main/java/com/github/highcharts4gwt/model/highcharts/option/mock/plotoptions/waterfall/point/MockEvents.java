
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.waterfall.point;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.point.Events;


/**
 * Events for each single point
 * 
 */
public class MockEvents
    implements Events
{

    private String genericField;

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockEvents setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
