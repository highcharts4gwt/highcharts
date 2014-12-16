
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.solidgauge;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeLegendItemClickEvent;

public class MockSolidgaugeLegendItemClickEvent
    implements SolidgaugeLegendItemClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSolidgaugeLegendItemClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
