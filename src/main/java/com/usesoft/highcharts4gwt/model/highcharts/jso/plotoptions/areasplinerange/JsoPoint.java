
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.areasplinerange;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.Point;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.point.Events;

public class JsoPoint
    extends JavaScriptObject
    implements Point
{


    protected JsoPoint() {
    }

    public final native Events events()
        throws RuntimeException /*-{
        return this["events"] = (this["events"] || {});
    }-*/
    ;

    public final native JsoPoint events(Events events)
        throws RuntimeException /*-{
        this["events"] = events;
        return this;
    }-*/
    ;

}
