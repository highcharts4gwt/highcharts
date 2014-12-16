
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.scatter;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterCheckboxClickEvent;

public class MockScatterCheckboxClickEvent
    implements ScatterCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockScatterCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
