
package com.github.highcharts4gwt.model.highcharts.option.jso.chart;

import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.DrilldownEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoDrilldownEvent
    extends NativeEvent
    implements DrilldownEvent
{


    protected JsoDrilldownEvent() {
    }

    public final native Chart chart()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
