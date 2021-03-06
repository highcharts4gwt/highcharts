
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.Pane;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Applies only to polar charts and angular gauges. This configuration object holds general options for the combined X and Y axes set. Each xAxis or yAxis can reference the pane by index.
 * 
 */
public class JsoPane
    extends JavaScriptObject
    implements Pane
{


    protected JsoPane() {
    }

    public final native String background()
        throws RuntimeException /*-{
        this["background"] = (this["background"] || []);
        return JSON.stringify(this["background"]);
    }-*/
    ;

    public final native JsoPane background(String backgroundAsJsonStringArray)
        throws RuntimeException /*-{
        this["background"] = JSON.parse(backgroundAsJsonStringArray);
        return this;
    }-*/
    ;

    public final native ArrayString centerAsArrayString()
        throws RuntimeException /*-{
        return this["center"] = (this["center"] || ["50%", "50%"]);
    }-*/
    ;

    public final native JsoPane centerAsArrayString(ArrayString centerAsArrayString)
        throws RuntimeException /*-{
        this["center"] = centerAsArrayString;
        return this;
    }-*/
    ;

    public final native ArrayNumber centerAsArrayNumber()
        throws RuntimeException /*-{
        return this["center"] = (this["center"] || ["50%", "50%"]);
    }-*/
    ;

    public final native JsoPane centerAsArrayNumber(ArrayNumber centerAsArrayNumber)
        throws RuntimeException /*-{
        this["center"] = centerAsArrayNumber;
        return this;
    }-*/
    ;

    public final native double endAngle()
        throws RuntimeException /*-{
        return this["endAngle"] = (this["endAngle"] || null);
    }-*/
    ;

    public final native JsoPane endAngle(double endAngle)
        throws RuntimeException /*-{
        this["endAngle"] = endAngle;
        return this;
    }-*/
    ;

    public final native double sizeAsNumber()
        throws RuntimeException /*-{
        return this["size"] = (this["size"] || null);
    }-*/
    ;

    public final native JsoPane sizeAsNumber(double sizeAsNumber)
        throws RuntimeException /*-{
        this["size"] = sizeAsNumber;
        return this;
    }-*/
    ;

    public final native String sizeAsString()
        throws RuntimeException /*-{
        return this["size"] = (this["size"] || "85%");
    }-*/
    ;

    public final native JsoPane sizeAsString(String sizeAsString)
        throws RuntimeException /*-{
        this["size"] = sizeAsString;
        return this;
    }-*/
    ;

    public final native double startAngle()
        throws RuntimeException /*-{
        return this["startAngle"] = (this["startAngle"] || null);
    }-*/
    ;

    public final native JsoPane startAngle(double startAngle)
        throws RuntimeException /*-{
        this["startAngle"] = startAngle;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoPane setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoPane setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
