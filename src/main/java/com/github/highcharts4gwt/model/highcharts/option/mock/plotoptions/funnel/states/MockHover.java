
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.funnel.states;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.states.Hover;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.states.hover.Halo;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.states.hover.Marker;

public class MockHover
    implements Hover
{

    private boolean enabled;
    private Halo halo;
    private double lineWidth;
    private double lineWidthPlus;
    private Marker marker;
    private String genericField;

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

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockHover setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}