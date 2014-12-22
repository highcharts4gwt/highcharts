
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.areaspline;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.AreasplineLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAreasplineLegendItemClickEvent
    extends NativeEvent
    implements AreasplineLegendItemClickEvent
{


    protected JsoAreasplineLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}