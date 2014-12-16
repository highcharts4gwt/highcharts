
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.bubble;

import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleCheckboxClickEvent;

public class MockBubbleCheckboxClickEvent
    implements BubbleCheckboxClickEvent
{

    private Series series;

    public Series getSeries() {
        return series;
    }

    public MockBubbleCheckboxClickEvent series(Series series) {
        this.series = series;
        return this;
    }

}
