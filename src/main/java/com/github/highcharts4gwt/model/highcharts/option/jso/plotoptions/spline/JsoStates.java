
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.spline;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.states.Hover;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoStates
    extends JavaScriptObject
    implements States
{


    protected JsoStates() {
    }

    public final native Hover hover()
        throws RuntimeException /*-{
        return this["hover"] = (this["hover"] || {});
    }-*/
    ;

    public final native JsoStates hover(Hover hover)
        throws RuntimeException /*-{
        this["hover"] = hover;
        return this;
    }-*/
    ;

}
