
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.pyramid;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidClickEvent;

public class MockPyramidClickEvent
    implements PyramidClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockPyramidClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
