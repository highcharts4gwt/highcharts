
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbar.data;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbar.data.UnselectEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoUnselectEvent
    extends NativeEvent
    implements UnselectEvent
{


    protected JsoUnselectEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
