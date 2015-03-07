
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.SeriesHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesHideEvent
    extends NativeEvent
    implements SeriesHideEvent
{


    protected JsoSeriesHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}