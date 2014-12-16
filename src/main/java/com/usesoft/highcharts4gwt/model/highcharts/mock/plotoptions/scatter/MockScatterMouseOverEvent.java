
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.scatter;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterMouseOverEvent;

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
