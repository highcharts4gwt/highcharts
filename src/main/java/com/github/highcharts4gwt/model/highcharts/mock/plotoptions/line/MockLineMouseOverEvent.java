
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.LineMouseOverEvent;

public class MockLineMouseOverEvent
    implements LineMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockLineMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}