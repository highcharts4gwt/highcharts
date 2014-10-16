
package com.usesoft.highcharts4gwt.model.highcharts.mock.chart;

import com.usesoft.highcharts4gwt.model.highcharts.api.chart.ResetZoomButton;

public class MockResetZoomButton
    implements ResetZoomButton
{

    private String position;
    private String relativeTo;
    private String theme;

    public String position() {
        return position;
    }

    public MockResetZoomButton position(String positionAsJsonString) {
        this.position = positionAsJsonString;
        return this;
    }

    public String relativeTo() {
        return relativeTo;
    }

    public MockResetZoomButton relativeTo(String relativeTo) {
        this.relativeTo = relativeTo;
        return this;
    }

    public String theme() {
        return theme;
    }

    public MockResetZoomButton theme(String themeAsJsonString) {
        this.theme = themeAsJsonString;
        return this;
    }

}
