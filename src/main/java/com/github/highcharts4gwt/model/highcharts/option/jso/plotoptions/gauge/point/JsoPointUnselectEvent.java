
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.gauge.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.point.PointUnselectEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPointUnselectEvent
    extends NativeEvent
    implements PointUnselectEvent
{


    protected JsoPointUnselectEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}