
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.bar.states;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.states.Hover;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.states.hover.Halo;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.states.hover.Marker;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoHover
    extends JavaScriptObject
    implements Hover
{


    protected JsoHover() {
    }

    public final native boolean enabled()
        throws RuntimeException /*-{
        return this["enabled"] = (this["enabled"] || true);
    }-*/
    ;

    public final native JsoHover enabled(boolean enabled)
        throws RuntimeException /*-{
        this["enabled"] = enabled;
        return this;
    }-*/
    ;

    public final native Halo halo()
        throws RuntimeException /*-{
        return this["halo"] = (this["halo"] || {});
    }-*/
    ;

    public final native JsoHover halo(Halo halo)
        throws RuntimeException /*-{
        this["halo"] = halo;
        return this;
    }-*/
    ;

    public final native double lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 2.0);
    }-*/
    ;

    public final native JsoHover lineWidth(double lineWidth)
        throws RuntimeException /*-{
        this["lineWidth"] = lineWidth;
        return this;
    }-*/
    ;

    public final native double lineWidthPlus()
        throws RuntimeException /*-{
        return this["lineWidthPlus"] = (this["lineWidthPlus"] || 1.0);
    }-*/
    ;

    public final native JsoHover lineWidthPlus(double lineWidthPlus)
        throws RuntimeException /*-{
        this["lineWidthPlus"] = lineWidthPlus;
        return this;
    }-*/
    ;

    public final native Marker marker()
        throws RuntimeException /*-{
        return this["marker"] = (this["marker"] || {});
    }-*/
    ;

    public final native JsoHover marker(Marker marker)
        throws RuntimeException /*-{
        this["marker"] = marker;
        return this;
    }-*/
    ;

}