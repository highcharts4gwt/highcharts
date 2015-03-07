
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartDrillupEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoChartDrillupEvent
    extends NativeEvent
    implements ChartDrillupEvent
{


    protected JsoChartDrillupEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}