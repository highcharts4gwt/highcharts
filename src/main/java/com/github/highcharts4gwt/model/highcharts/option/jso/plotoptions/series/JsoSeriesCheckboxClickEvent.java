
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesCheckboxClickEvent
    extends NativeEvent
    implements SeriesCheckboxClickEvent
{


    protected JsoSeriesCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
