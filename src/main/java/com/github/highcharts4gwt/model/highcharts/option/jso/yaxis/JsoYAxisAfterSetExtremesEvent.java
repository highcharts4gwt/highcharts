
package com.github.highcharts4gwt.model.highcharts.option.jso.yaxis;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisAfterSetExtremesEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoYAxisAfterSetExtremesEvent
    extends NativeEvent
    implements YAxisAfterSetExtremesEvent
{


    protected JsoYAxisAfterSetExtremesEvent() {
    }

    public final native Axis axis()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}