
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.line.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.point.PointUpdateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPointUpdateEvent
    extends NativeEvent
    implements PointUpdateEvent
{


    protected JsoPointUpdateEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}