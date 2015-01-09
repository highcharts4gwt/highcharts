
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelMouseOutEvent;

public class MockFunnelMouseOutEvent
    implements FunnelMouseOutEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series getSeries() {
        return Series;
    }

    public MockFunnelMouseOutEvent Series(com.github.highcharts4gwt.model.highcharts.object.api.Series Series) {
        this.Series = Series;
        return this;
    }

}
