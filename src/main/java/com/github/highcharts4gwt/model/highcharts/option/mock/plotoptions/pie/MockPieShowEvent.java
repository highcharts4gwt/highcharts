
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieShowEvent;

public class MockPieShowEvent
    implements PieShowEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series getSeries() {
        return Series;
    }

    public MockPieShowEvent Series(com.github.highcharts4gwt.model.highcharts.object.api.Series Series) {
        this.Series = Series;
        return this;
    }

}
