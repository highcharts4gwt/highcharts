
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesgauge.point;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.point.RemoveEvent;

public class MockRemoveEvent
    implements RemoveEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Point Point;

    public com.github.highcharts4gwt.model.highcharts.object.api.Point point() {
        return Point;
    }

}