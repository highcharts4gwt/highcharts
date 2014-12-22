
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeLegendItemClickEvent;

public class MockArearangeLegendItemClickEvent
    implements ArearangeLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockArearangeLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}