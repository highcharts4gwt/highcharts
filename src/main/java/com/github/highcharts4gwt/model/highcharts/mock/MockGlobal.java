
package com.github.highcharts4gwt.model.highcharts.mock;

import com.github.highcharts4gwt.model.highcharts.api.Global;

public class MockGlobal
    implements Global
{

    private String Date;
    private String VMLRadialGradientURL;
    private String canvasToolsURL;
    private double timezoneOffset;
    private boolean useUTC;

    public String Date() {
        return Date;
    }

    public MockGlobal Date(String DateAsJsonString) {
        this.Date = DateAsJsonString;
        return this;
    }

    public String VMLRadialGradientURL() {
        return VMLRadialGradientURL;
    }

    public MockGlobal VMLRadialGradientURL(String VMLRadialGradientURL) {
        this.VMLRadialGradientURL = VMLRadialGradientURL;
        return this;
    }

    public String canvasToolsURL() {
        return canvasToolsURL;
    }

    public MockGlobal canvasToolsURL(String canvasToolsURL) {
        this.canvasToolsURL = canvasToolsURL;
        return this;
    }

    public double timezoneOffset() {
        return timezoneOffset;
    }

    public MockGlobal timezoneOffset(double timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

    public boolean useUTC() {
        return useUTC;
    }

    public MockGlobal useUTC(boolean useUTC) {
        this.useUTC = useUTC;
        return this;
    }

}