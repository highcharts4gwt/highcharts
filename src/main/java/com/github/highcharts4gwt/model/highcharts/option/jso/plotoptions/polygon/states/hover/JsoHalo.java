
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.polygon.states.hover;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.states.hover.Halo;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoHalo
    extends JavaScriptObject
    implements Halo
{


    protected JsoHalo() {
    }

    public final native String attributes()
        throws RuntimeException /*-{
        this["attributes"] = (this["attributes"] || JSON.parse(''));
        return JSON.stringify(this["attributes"]);
    }-*/
    ;

    public final native JsoHalo attributes(String attributesAsJsonString)
        throws RuntimeException /*-{
        this["attributes"] = JSON.parse(attributesAsJsonString);
        return this;
    }-*/
    ;

    public final native double opacity()
        throws RuntimeException /*-{
        return this["opacity"] = (this["opacity"] || 0.25);
    }-*/
    ;

    public final native JsoHalo opacity(double opacity)
        throws RuntimeException /*-{
        this["opacity"] = opacity;
        return this;
    }-*/
    ;

    public final native double size()
        throws RuntimeException /*-{
        return this["size"] = (this["size"] || 10.0);
    }-*/
    ;

    public final native JsoHalo size(double size)
        throws RuntimeException /*-{
        this["size"] = size;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoHalo setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}