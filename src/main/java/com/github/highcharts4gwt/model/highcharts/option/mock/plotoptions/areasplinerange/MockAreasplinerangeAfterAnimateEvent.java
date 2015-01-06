
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeAfterAnimateEvent;

public class MockAreasplinerangeAfterAnimateEvent
    implements AreasplinerangeAfterAnimateEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockAreasplinerangeAfterAnimateEvent series(Series series) {
        this.series = series;
        return this;
    }

}
