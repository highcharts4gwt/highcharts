
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.AddSeriesEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAddSeriesEvent
    extends NativeEvent
    implements AddSeriesEvent
{


    protected JsoAddSeriesEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
