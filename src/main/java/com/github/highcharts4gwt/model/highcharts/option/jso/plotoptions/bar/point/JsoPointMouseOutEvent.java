
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.bar.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.point.PointMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPointMouseOutEvent
    extends NativeEvent
    implements PointMouseOutEvent
{


    protected JsoPointMouseOutEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}