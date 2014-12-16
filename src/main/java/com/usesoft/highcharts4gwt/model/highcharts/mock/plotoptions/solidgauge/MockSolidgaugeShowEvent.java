
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.solidgauge;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.SolidgaugeShowEvent;

public class MockSolidgaugeShowEvent
    implements SolidgaugeShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockSolidgaugeShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}
