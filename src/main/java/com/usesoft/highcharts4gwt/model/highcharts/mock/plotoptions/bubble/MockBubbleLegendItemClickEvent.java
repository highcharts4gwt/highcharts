
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.bubble;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleLegendItemClickEvent;

public class MockBubbleLegendItemClickEvent
    implements BubbleLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBubbleLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
