
package com.github.highcharts4gwt.model.highcharts.option.mock.series.data;

import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataUpdateEvent;

public class MockDataUpdateEvent
    implements DataUpdateEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Point Point;

    public com.github.highcharts4gwt.model.highcharts.object.api.Point point() {
        return Point;
    }

}