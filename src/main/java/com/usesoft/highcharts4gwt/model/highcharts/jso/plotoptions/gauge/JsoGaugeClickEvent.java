
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.gauge;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeClickEvent;

public class JsoGaugeClickEvent
    extends NativeEvent
    implements GaugeClickEvent
{


    protected JsoGaugeClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}