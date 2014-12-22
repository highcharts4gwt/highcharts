
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarAfterAnimateEvent;

public class MockBarAfterAnimateEvent
    implements BarAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBarAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}