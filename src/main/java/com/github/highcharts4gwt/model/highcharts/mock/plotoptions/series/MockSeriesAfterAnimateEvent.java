
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesAfterAnimateEvent;

public class MockSeriesAfterAnimateEvent
    implements SeriesAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSeriesAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}