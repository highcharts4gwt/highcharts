
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.errorbar.point;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.errorbar.point.PointUpdateEvent;

public class MockPointUpdateEvent
    implements PointUpdateEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Point Point;

    public com.github.highcharts4gwt.model.highcharts.object.api.Point point() {
        return Point;
    }

}