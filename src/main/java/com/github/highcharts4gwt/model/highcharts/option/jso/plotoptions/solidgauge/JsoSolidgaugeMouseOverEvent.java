
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.solidgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSolidgaugeMouseOverEvent
    extends NativeEvent
    implements SolidgaugeMouseOverEvent
{


    protected JsoSolidgaugeMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}