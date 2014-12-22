
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeAfterAnimateEvent;

public class MockSolidgaugeAfterAnimateEvent
    implements SolidgaugeAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSolidgaugeAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}