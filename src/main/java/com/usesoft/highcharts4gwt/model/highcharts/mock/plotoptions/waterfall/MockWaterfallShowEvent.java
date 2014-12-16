
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.waterfall;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallShowEvent;

public class MockWaterfallShowEvent
    implements WaterfallShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockWaterfallShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
