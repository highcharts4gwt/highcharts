
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelLegendItemClickEvent;

public class MockFunnelLegendItemClickEvent
    implements FunnelLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockFunnelLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}