
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.states.Hover;

public class MockStates
    implements States
{

    private Hover hover;

    public Hover hover() {
        return hover;
    }

    public MockStates hover(Hover hover) {
        this.hover = hover;
        return this;
    }

}
