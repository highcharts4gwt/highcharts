
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.spline;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.SplineShowEvent;

public class MockSplineShowEvent
    implements SplineShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSplineShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
