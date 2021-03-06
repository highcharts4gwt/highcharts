
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.highcharts.option.api.Drilldown;
import com.github.highcharts4gwt.model.highcharts.option.api.drilldown.DrillUpButton;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * <p>Options for drill down, the concept of inspecting increasingly high resolution data through clicking on chart items like columns or pie slices.</p>
 * 
 * <p>The drilldown feature requires the <code>drilldown.js</code> file to be loaded, found in the <code>modules</code> directory of the download package, or online at <a href="http://code.highcharts.com/modules/drilldown.js">code.highcharts.com/modules/drilldown.js</a>.</p>
 * 
 */
public class JsoDrilldown
    extends JavaScriptObject
    implements Drilldown
{


    protected JsoDrilldown() {
    }

    public final native String activeAxisLabelStyle()
        throws RuntimeException /*-{
        this["activeAxisLabelStyle"] = (this["activeAxisLabelStyle"] || {});
        return JSON.stringify(this["activeAxisLabelStyle"]);
    }-*/
    ;

    public final native JsoDrilldown activeAxisLabelStyle(String activeAxisLabelStyleAsJsonString)
        throws RuntimeException /*-{
        this["activeAxisLabelStyle"] = JSON.parse(activeAxisLabelStyleAsJsonString);
        return this;
    }-*/
    ;

    public final native String activeDataLabelStyle()
        throws RuntimeException /*-{
        this["activeDataLabelStyle"] = (this["activeDataLabelStyle"] || {});
        return JSON.stringify(this["activeDataLabelStyle"]);
    }-*/
    ;

    public final native JsoDrilldown activeDataLabelStyle(String activeDataLabelStyleAsJsonString)
        throws RuntimeException /*-{
        this["activeDataLabelStyle"] = JSON.parse(activeDataLabelStyleAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean animationAsBoolean()
        throws RuntimeException /*-{
        return this["animation"] = (this["animation"] || false);
    }-*/
    ;

    public final native JsoDrilldown animationAsBoolean(boolean animationAsBoolean)
        throws RuntimeException /*-{
        this["animation"] = animationAsBoolean;
        return this;
    }-*/
    ;

    public final native String animationAsJsonString()
        throws RuntimeException /*-{
        this["animation"] = (this["animation"] || JSON.parse(''));
        return JSON.stringify(this["animation"]);
    }-*/
    ;

    public final native JsoDrilldown animationAsJsonString(String animationAsJsonString)
        throws RuntimeException /*-{
        this["animation"] = JSON.parse(animationAsJsonString);
        return this;
    }-*/
    ;

    public final native DrillUpButton drillUpButton()
        throws RuntimeException /*-{
        return this["drillUpButton"] = (this["drillUpButton"] || {});
    }-*/
    ;

    public final native JsoDrilldown drillUpButton(DrillUpButton drillUpButton)
        throws RuntimeException /*-{
        this["drillUpButton"] = drillUpButton;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoDrilldown setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoDrilldown setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
