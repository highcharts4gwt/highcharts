
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterClickEvent;

public class MockScatterClickEvent
    implements ScatterClickEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series getSeries() {
        return Series;
    }

    public MockScatterClickEvent Series(com.github.highcharts4gwt.model.highcharts.object.api.Series Series) {
        this.Series = Series;
        return this;
    }

}
