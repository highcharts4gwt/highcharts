
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.states;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.states.hover.Halo;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.states.hover.Marker;

public interface Hover {


    boolean enabled();

    Hover enabled(boolean enabled);

    Halo halo();

    Hover halo(Halo halo);

    double lineWidth();

    Hover lineWidth(double lineWidth);

    double lineWidthPlus();

    Hover lineWidthPlus(double lineWidthPlus);

    Marker marker();

    Hover marker(Marker marker);

    String getFieldAsJsonObject(String fieldName);

    Hover setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}