
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.arearange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoArearangeMouseOverEvent
    extends NativeEvent
    implements ArearangeMouseOverEvent
{


    protected JsoArearangeMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
