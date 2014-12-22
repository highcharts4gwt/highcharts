
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesMouseOverEvent;

public class MockSeriesMouseOverEvent
    implements SeriesMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSeriesMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}