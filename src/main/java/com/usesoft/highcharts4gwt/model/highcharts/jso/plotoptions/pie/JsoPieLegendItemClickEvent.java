
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.pie;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieLegendItemClickEvent;

public class JsoPieLegendItemClickEvent
    extends NativeEvent
    implements PieLegendItemClickEvent
{


    protected JsoPieLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}