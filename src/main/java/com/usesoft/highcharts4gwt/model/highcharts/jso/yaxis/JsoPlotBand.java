
package com.usesoft.highcharts4gwt.model.highcharts.jso.yaxis;

import com.usesoft.highcharts4gwt.model.highcharts.api.yaxis.PlotBand;

public class JsoPlotBand
    extends com.usesoft.highcharts4gwt.model.highcharts.jso.xaxis.JsoPlotBand
    implements PlotBand
{


    protected JsoPlotBand() {
    }

    public final native Number innerRadiusAsNumber()
        throws RuntimeException /*-{
        return this["innerRadius"] = (this["innerRadius"] || null);
    }-*/
    ;

    public final native JsoPlotBand innerRadiusAsNumber(Number innerRadiusAsNumber)
        throws RuntimeException /*-{
        this["innerRadius"] = innerRadiusAsNumber;
        return this;
    }-*/
    ;

    public final native String innerRadiusAsString()
        throws RuntimeException /*-{
        return this["innerRadius"] = (this["innerRadius"] || "null");
    }-*/
    ;

    public final native JsoPlotBand innerRadiusAsString(String innerRadiusAsString)
        throws RuntimeException /*-{
        this["innerRadius"] = innerRadiusAsString;
        return this;
    }-*/
    ;

    public final native Number outerRadiusAsNumber()
        throws RuntimeException /*-{
        return this["outerRadius"] = (this["outerRadius"] || null);
    }-*/
    ;

    public final native JsoPlotBand outerRadiusAsNumber(Number outerRadiusAsNumber)
        throws RuntimeException /*-{
        this["outerRadius"] = outerRadiusAsNumber;
        return this;
    }-*/
    ;

    public final native String outerRadiusAsString()
        throws RuntimeException /*-{
        return this["outerRadius"] = (this["outerRadius"] || "100%");
    }-*/
    ;

    public final native JsoPlotBand outerRadiusAsString(String outerRadiusAsString)
        throws RuntimeException /*-{
        this["outerRadius"] = outerRadiusAsString;
        return this;
    }-*/
    ;

    public final native Number thicknessAsNumber()
        throws RuntimeException /*-{
        return this["thickness"] = (this["thickness"] || 10.0);
    }-*/
    ;

    public final native JsoPlotBand thicknessAsNumber(Number thicknessAsNumber)
        throws RuntimeException /*-{
        this["thickness"] = thicknessAsNumber;
        return this;
    }-*/
    ;

    public final native String thicknessAsString()
        throws RuntimeException /*-{
        return this["thickness"] = (this["thickness"] || "10");
    }-*/
    ;

    public final native JsoPlotBand thicknessAsString(String thicknessAsString)
        throws RuntimeException /*-{
        this["thickness"] = thicknessAsString;
        return this;
    }-*/
    ;

}
