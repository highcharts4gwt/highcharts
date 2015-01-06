
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnrangeShowEvent
    extends NativeEvent
    implements ColumnrangeShowEvent
{


    protected JsoColumnrangeShowEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
