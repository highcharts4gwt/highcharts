
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterMouseOverEvent;

public class MockScatterMouseOverEvent
    implements ScatterMouseOverEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockScatterMouseOverEvent series(Series series) {
        this.series = series;
        return this;
    }

}
