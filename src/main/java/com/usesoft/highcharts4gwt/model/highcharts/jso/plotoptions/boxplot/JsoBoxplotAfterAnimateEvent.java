
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.boxplot;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotAfterAnimateEvent;

public class JsoBoxplotAfterAnimateEvent
    extends NativeEvent
    implements BoxplotAfterAnimateEvent
{


    protected JsoBoxplotAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}