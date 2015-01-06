
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeHideEvent;

public class MockAreasplinerangeHideEvent
    implements AreasplinerangeHideEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplinerangeHideEvent series(Series series) {
        this.series = series;
        return this;
    }

}
