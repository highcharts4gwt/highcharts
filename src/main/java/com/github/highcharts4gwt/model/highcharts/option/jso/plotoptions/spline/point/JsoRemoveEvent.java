
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.spline.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.point.RemoveEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoRemoveEvent
    extends NativeEvent
    implements RemoveEvent
{


    protected JsoRemoveEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
