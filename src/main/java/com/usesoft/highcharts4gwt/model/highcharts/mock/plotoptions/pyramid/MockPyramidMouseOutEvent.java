
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pyramid;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidMouseOutEvent;

public class MockPyramidMouseOutEvent
    implements PyramidMouseOutEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPyramidMouseOutEvent series(Series series) {
        this.series = series;
        return this;
    }

}
