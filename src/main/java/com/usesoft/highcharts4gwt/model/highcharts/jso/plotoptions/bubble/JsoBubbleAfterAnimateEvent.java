
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.bubble;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleAfterAnimateEvent;

public class JsoBubbleAfterAnimateEvent
    extends NativeEvent
    implements BubbleAfterAnimateEvent
{


    protected JsoBubbleAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}