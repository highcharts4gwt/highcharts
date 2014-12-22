
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeShowEvent;

public class MockAreasplinerangeShowEvent
    implements AreasplinerangeShowEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplinerangeShowEvent series(Series series) {
        this.series = series;
        return this;
    }

}