
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.scatter;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterClickEvent;

public class MockScatterClickEvent
    implements ScatterClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockScatterClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
