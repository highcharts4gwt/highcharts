
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoScatterLegendItemClickEvent
    extends NativeEvent
    implements ScatterLegendItemClickEvent
{


    protected JsoScatterLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}