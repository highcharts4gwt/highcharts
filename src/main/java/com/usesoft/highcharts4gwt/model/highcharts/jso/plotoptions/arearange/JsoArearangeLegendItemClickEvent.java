
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.arearange;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.arearange.ArearangeLegendItemClickEvent;

public class JsoArearangeLegendItemClickEvent
    extends NativeEvent
    implements ArearangeLegendItemClickEvent
{


    protected JsoArearangeLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
