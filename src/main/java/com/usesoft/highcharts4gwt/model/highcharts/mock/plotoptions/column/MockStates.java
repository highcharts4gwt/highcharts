
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.column;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.States;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.column.states.Hover;

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
