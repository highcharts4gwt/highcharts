
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesLegendItemClickEvent;

public class MockSeriesLegendItemClickEvent
    implements SeriesLegendItemClickEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series getSeries() {
        return Series;
    }

    public MockSeriesLegendItemClickEvent Series(com.github.highcharts4gwt.model.highcharts.object.api.Series Series) {
        this.Series = Series;
        return this;
    }

}
