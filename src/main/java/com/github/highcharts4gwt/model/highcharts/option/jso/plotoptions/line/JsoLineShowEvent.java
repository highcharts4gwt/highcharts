
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.line;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoLineShowEvent
    extends NativeEvent
    implements LineShowEvent
{


    protected JsoLineShowEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
