
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoFunnelMouseOverEvent
    extends NativeEvent
    implements FunnelMouseOverEvent
{


    protected JsoFunnelMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}