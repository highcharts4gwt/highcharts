
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.solidgauge.states;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.states.Hover;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.states.hover.Halo;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.states.hover.Marker;

public class MockHover
    implements Hover
{

    private boolean enabled;
    private Halo halo;
    private double lineWidth;
    private double lineWidthPlus;
    private Marker marker;

    public boolean enabled() {
        return enabled;
    }

    public MockHover enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Halo halo() {
        return halo;
    }

    public MockHover halo(Halo halo) {
        this.halo = halo;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockHover lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public double lineWidthPlus() {
        return lineWidthPlus;
    }

    public MockHover lineWidthPlus(double lineWidthPlus) {
        this.lineWidthPlus = lineWidthPlus;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockHover marker(Marker marker) {
        this.marker = marker;
        return this;
    }

}