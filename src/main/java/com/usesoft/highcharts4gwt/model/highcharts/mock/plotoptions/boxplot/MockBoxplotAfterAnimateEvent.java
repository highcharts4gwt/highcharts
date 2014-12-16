
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.boxplot;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotAfterAnimateEvent;

public class MockBoxplotAfterAnimateEvent
    implements BoxplotAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBoxplotAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
