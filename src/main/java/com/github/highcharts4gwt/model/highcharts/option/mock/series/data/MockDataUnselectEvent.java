
package com.github.highcharts4gwt.model.highcharts.option.mock.series.data;

import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataUnselectEvent;

public class MockDataUnselectEvent
    implements DataUnselectEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Point Point;

    public com.github.highcharts4gwt.model.highcharts.object.api.Point point() {
        return Point;
    }

}