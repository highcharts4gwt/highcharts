
package com.usesoft.highcharts4gwt.model.highcharts.mock;

import com.usesoft.highcharts4gwt.model.array.api.Array;
import com.usesoft.highcharts4gwt.model.highcharts.api.Labels;
import com.usesoft.highcharts4gwt.model.highcharts.api.labels.Item;

public class MockLabels
    implements Labels
{

    private Array<Item> items;
    private String style;

    public Array<Item> items() {
        return items;
    }

    public MockLabels items(Array<Item> items) {
        this.items = items;
        return this;
    }

    public String style() {
        return style;
    }

    public MockLabels style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

}
