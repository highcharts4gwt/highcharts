
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesheatmap;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.HideEvent;

public class MockHideEvent
    implements HideEvent
{

    private com.github.highcharts4gwt.model.highcharts.object.api.Series Series;

    public com.github.highcharts4gwt.model.highcharts.object.api.Series series() {
        return Series;
    }

}
