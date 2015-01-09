
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoScatterShowEvent
    extends NativeEvent
    implements ScatterShowEvent
{


    protected JsoScatterShowEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
