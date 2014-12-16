
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.series;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesClickEvent;

public class MockSeriesClickEvent
    implements SeriesClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSeriesClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
