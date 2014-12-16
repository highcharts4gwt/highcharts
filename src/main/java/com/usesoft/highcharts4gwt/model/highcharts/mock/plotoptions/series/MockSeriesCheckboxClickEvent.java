
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.series;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesCheckboxClickEvent;

public class MockSeriesCheckboxClickEvent
    implements SeriesCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSeriesCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
