
package com.github.highcharts4gwt.model.highcharts.option.jso.chart.options3d;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.Frame;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Back;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Bottom;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Side;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Provides the option to draw a frame around the charts by defining a bottom, front and back panel.
 * 
 */
public class JsoFrame
    extends JavaScriptObject
    implements Frame
{


    protected JsoFrame() {
    }

    public final native Back back()
        throws RuntimeException /*-{
        return this["back"] = (this["back"] || {});
    }-*/
    ;

    public final native JsoFrame back(Back back)
        throws RuntimeException /*-{
        this["back"] = back;
        return this;
    }-*/
    ;

    public final native Bottom bottom()
        throws RuntimeException /*-{
        return this["bottom"] = (this["bottom"] || {});
    }-*/
    ;

    public final native JsoFrame bottom(Bottom bottom)
        throws RuntimeException /*-{
        this["bottom"] = bottom;
        return this;
    }-*/
    ;

    public final native Side side()
        throws RuntimeException /*-{
        return this["side"] = (this["side"] || {});
    }-*/
    ;

    public final native JsoFrame side(Side side)
        throws RuntimeException /*-{
        this["side"] = side;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoFrame setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

    public final native String getFunctionAsString(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoFrame setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
