
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.treemap.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.point.UnselectEvent;
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
