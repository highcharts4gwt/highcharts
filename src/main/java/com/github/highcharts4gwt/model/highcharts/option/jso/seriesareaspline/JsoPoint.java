
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareaspline;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.RemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.SelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.UnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.UpdateHandler;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Properties for each single point
 * 
 */
public class JsoPoint
    extends JavaScriptObject
    implements Point
{


    protected JsoPoint() {
    }

    public final native void addClickHandler(ClickHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.ClickHandler::onClick(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareaspline/point/ClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addMouseOutHandler(MouseOutHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.MouseOutHandler::onMouseOut(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareaspline/point/MouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addMouseOverHandler(MouseOverHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.MouseOverHandler::onMouseOver(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareaspline/point/MouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addRemoveHandler(RemoveHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    remove: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.RemoveHandler::onRemove(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareaspline/point/RemoveEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addSelectHandler(SelectHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    select: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.SelectHandler::onSelect(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareaspline/point/SelectEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addUnselectHandler(UnselectHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    unselect: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.UnselectHandler::onUnselect(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareaspline/point/UnselectEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addUpdateHandler(UpdateHandler handler)
        throws RuntimeException 
        /*-{
            $wnd.jQuery.extend(true, this, 
            {
                events: {
                    update: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.point.UpdateHandler::onUpdate(Lcom/github/highcharts4gwt/model/highcharts/option/api/seriesareaspline/point/UpdateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoPoint setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
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

    public final native JsoPoint setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
