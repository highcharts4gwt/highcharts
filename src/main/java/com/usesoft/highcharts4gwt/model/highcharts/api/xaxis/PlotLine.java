
package com.usesoft.highcharts4gwt.model.highcharts.api.xaxis;

import com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.plotlines.Label;

public interface PlotLine {


    String color();

    PlotLine color(String color);

    String dashStyle();

    PlotLine dashStyle(String dashStyle);

    String events();

    PlotLine events(String eventsAsJsonString);

    String id();

    PlotLine id(String id);

    Label label();

    PlotLine label(Label label);

    Number value();

    PlotLine value(Number value);

    Number width();

    PlotLine width(Number width);

    Number zIndex();

    PlotLine zIndex(Number zIndex);

}
