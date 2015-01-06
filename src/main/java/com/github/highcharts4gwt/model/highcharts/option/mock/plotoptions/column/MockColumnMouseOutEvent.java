
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnMouseOutEvent;

public class MockColumnMouseOutEvent
    implements ColumnMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
