
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.funnel.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.point.RemoveEvent;
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
