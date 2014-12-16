
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.columnrange;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.columnrange.ColumnrangeLegendItemClickEvent;

public class MockColumnrangeLegendItemClickEvent
    implements ColumnrangeLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockColumnrangeLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
