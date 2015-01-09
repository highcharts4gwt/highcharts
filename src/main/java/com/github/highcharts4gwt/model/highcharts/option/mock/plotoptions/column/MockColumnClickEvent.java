
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnClickEvent;

public class MockColumnClickEvent
    implements ColumnClickEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series getSeries() {
        return Series;
    }

    public MockColumnClickEvent Series(com.github.highcharts4gwt.model.highcharts.object.api.Series Series) {
        this.Series = Series;
        return this;
    }

}
