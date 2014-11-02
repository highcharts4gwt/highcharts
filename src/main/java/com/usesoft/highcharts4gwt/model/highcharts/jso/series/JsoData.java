
package com.usesoft.highcharts4gwt.model.highcharts.jso.series;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.series.Data;
import com.usesoft.highcharts4gwt.model.highcharts.api.series.data.Events;
import com.usesoft.highcharts4gwt.model.highcharts.api.series.data.Marker;

public class JsoData
    extends JavaScriptObject
    implements Data
{


    protected JsoData() {
    }

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "undefined");
    }-*/
    ;

    public final native JsoData color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native String dataLabels()
        throws RuntimeException /*-{
        this["dataLabels"] = (this["dataLabels"] || {});
        return JSON.stringify(this["dataLabels"]);
    }-*/
    ;

    public final native JsoData dataLabels(String dataLabelsAsJsonString)
        throws RuntimeException /*-{
        this["dataLabels"] = JSON.parse(dataLabelsAsJsonString);
        return this;
    }-*/
    ;

    public final native String drilldown()
        throws RuntimeException /*-{
        return this["drilldown"] = (this["drilldown"] || "");
    }-*/
    ;

    public final native JsoData drilldown(String drilldown)
        throws RuntimeException /*-{
        this["drilldown"] = drilldown;
        return this;
    }-*/
    ;

    public final native Events events()
        throws RuntimeException /*-{
        return this["events"] = (this["events"] || {});
    }-*/
    ;

    public final native JsoData events(Events events)
        throws RuntimeException /*-{
        this["events"] = events;
        return this;
    }-*/
    ;

    public final native String id()
        throws RuntimeException /*-{
        return this["id"] = (this["id"] || "null");
    }-*/
    ;

    public final native JsoData id(String id)
        throws RuntimeException /*-{
        this["id"] = id;
        return this;
    }-*/
    ;

    public final native boolean isIntermediateSum()
        throws RuntimeException /*-{
        return this["isIntermediateSum"] = (this["isIntermediateSum"] || false);
    }-*/
    ;

    public final native JsoData isIntermediateSum(boolean isIntermediateSum)
        throws RuntimeException /*-{
        this["isIntermediateSum"] = isIntermediateSum;
        return this;
    }-*/
    ;

    public final native boolean isSum()
        throws RuntimeException /*-{
        return this["isSum"] = (this["isSum"] || false);
    }-*/
    ;

    public final native JsoData isSum(boolean isSum)
        throws RuntimeException /*-{
        this["isSum"] = isSum;
        return this;
    }-*/
    ;

    public final native Number legendIndex()
        throws RuntimeException /*-{
        return this["legendIndex"] = (this["legendIndex"] || null);
    }-*/
    ;

    public final native JsoData legendIndex(Number legendIndex)
        throws RuntimeException /*-{
        this["legendIndex"] = legendIndex;
        return this;
    }-*/
    ;

    public final native Marker marker()
        throws RuntimeException /*-{
        return this["marker"] = (this["marker"] || {});
    }-*/
    ;

    public final native JsoData marker(Marker marker)
        throws RuntimeException /*-{
        this["marker"] = marker;
        return this;
    }-*/
    ;

    public final native String name()
        throws RuntimeException /*-{
        return this["name"] = (this["name"] || "null");
    }-*/
    ;

    public final native JsoData name(String name)
        throws RuntimeException /*-{
        this["name"] = name;
        return this;
    }-*/
    ;

    public final native boolean sliced()
        throws RuntimeException /*-{
        return this["sliced"] = (this["sliced"] || false);
    }-*/
    ;

    public final native JsoData sliced(boolean sliced)
        throws RuntimeException /*-{
        this["sliced"] = sliced;
        return this;
    }-*/
    ;

    public final native Number x()
        throws RuntimeException /*-{
        return this["x"] = (this["x"] || null);
    }-*/
    ;

    public final native JsoData x(Number x)
        throws RuntimeException /*-{
        this["x"] = x;
        return this;
    }-*/
    ;

    public final native Number y()
        throws RuntimeException /*-{
        return this["y"] = (this["y"] || null);
    }-*/
    ;

    public final native JsoData y(Number y)
        throws RuntimeException /*-{
        this["y"] = y;
        return this;
    }-*/
    ;

}
