
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.area.point;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.point.SelectEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSelectEvent
    extends NativeEvent
    implements SelectEvent
{


    protected JsoSelectEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
