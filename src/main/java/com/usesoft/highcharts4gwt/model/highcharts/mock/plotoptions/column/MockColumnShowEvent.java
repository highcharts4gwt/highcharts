
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.column;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnShowEvent;

public class MockColumnShowEvent
    implements ColumnShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
