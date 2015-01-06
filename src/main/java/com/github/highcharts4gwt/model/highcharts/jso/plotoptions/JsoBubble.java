
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Bubble;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleShowHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.DataLabels;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.Marker;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.Point;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.States;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoBubble
    extends JavaScriptObject
    implements Bubble
{


    protected JsoBubble() {
    }

    public final native boolean allowPointSelect()
        throws RuntimeException /*-{
        return this["allowPointSelect"] = (this["allowPointSelect"] || false);
    }-*/
    ;

    public final native JsoBubble allowPointSelect(boolean allowPointSelect)
        throws RuntimeException /*-{
        this["allowPointSelect"] = allowPointSelect;
        return this;
    }-*/
    ;

    public final native boolean animation()
        throws RuntimeException /*-{
        return this["animation"] = (this["animation"] || true);
    }-*/
    ;

    public final native JsoBubble animation(boolean animation)
        throws RuntimeException /*-{
        this["animation"] = animation;
        return this;
    }-*/
    ;

    public final native String color()
        throws RuntimeException /*-{
        return this["color"] = (this["color"] || "null");
    }-*/
    ;

    public final native JsoBubble color(String color)
        throws RuntimeException /*-{
        this["color"] = color;
        return this;
    }-*/
    ;

    public final native double cropThreshold()
        throws RuntimeException /*-{
        return this["cropThreshold"] = (this["cropThreshold"] || 300.0);
    }-*/
    ;

    public final native JsoBubble cropThreshold(double cropThreshold)
        throws RuntimeException /*-{
        this["cropThreshold"] = cropThreshold;
        return this;
    }-*/
    ;

    public final native String cursor()
        throws RuntimeException /*-{
        return this["cursor"] = (this["cursor"] || "null");
    }-*/
    ;

    public final native JsoBubble cursor(String cursor)
        throws RuntimeException /*-{
        this["cursor"] = cursor;
        return this;
    }-*/
    ;

    public final native String dashStyle()
        throws RuntimeException /*-{
        return this["dashStyle"] = (this["dashStyle"] || "Solid");
    }-*/
    ;

    public final native JsoBubble dashStyle(String dashStyle)
        throws RuntimeException /*-{
        this["dashStyle"] = dashStyle;
        return this;
    }-*/
    ;

    public final native DataLabels dataLabels()
        throws RuntimeException /*-{
        return this["dataLabels"] = (this["dataLabels"] || {});
    }-*/
    ;

    public final native JsoBubble dataLabels(DataLabels dataLabels)
        throws RuntimeException /*-{
        this["dataLabels"] = dataLabels;
        return this;
    }-*/
    ;

    public final native boolean displayNegative()
        throws RuntimeException /*-{
        return this["displayNegative"] = (this["displayNegative"] || true);
    }-*/
    ;

    public final native JsoBubble displayNegative(boolean displayNegative)
        throws RuntimeException /*-{
        this["displayNegative"] = displayNegative;
        return this;
    }-*/
    ;

    public final native boolean enableMouseTracking()
        throws RuntimeException /*-{
        return this["enableMouseTracking"] = (this["enableMouseTracking"] || true);
    }-*/
    ;

    public final native JsoBubble enableMouseTracking(boolean enableMouseTracking)
        throws RuntimeException /*-{
        this["enableMouseTracking"] = enableMouseTracking;
        return this;
    }-*/
    ;

    public final native void addBubbleAfterAnimateHandler(BubbleAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleAfterAnimateHandler::onBubbleAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleCheckboxClickHandler(BubbleCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleCheckboxClickHandler::onBubbleCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleClickHandler(BubbleClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleClickHandler::onBubbleClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleHideHandler(BubbleHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleHideHandler::onBubbleHide(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleLegendItemClickHandler(BubbleLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleLegendItemClickHandler::onBubbleLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleMouseOutHandler(BubbleMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOutHandler::onBubbleMouseOut(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleMouseOverHandler(BubbleMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleMouseOverHandler::onBubbleMouseOver(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addBubbleShowHandler(BubbleShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.bubble.BubbleShowHandler::onBubbleShow(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/bubble/BubbleShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native double lineWidth()
        throws RuntimeException /*-{
        return this["lineWidth"] = (this["lineWidth"] || 0.0);
    }-*/
    ;

    public final native JsoBubble lineWidth(double lineWidth)
        throws RuntimeException /*-{
        this["lineWidth"] = lineWidth;
        return this;
    }-*/
    ;

    public final native String linkedTo()
        throws RuntimeException /*-{
        return this["linkedTo"] = (this["linkedTo"] || "");
    }-*/
    ;

    public final native JsoBubble linkedTo(String linkedTo)
        throws RuntimeException /*-{
        this["linkedTo"] = linkedTo;
        return this;
    }-*/
    ;

    public final native Marker marker()
        throws RuntimeException /*-{
        return this["marker"] = (this["marker"] || {});
    }-*/
    ;

    public final native JsoBubble marker(Marker marker)
        throws RuntimeException /*-{
        this["marker"] = marker;
        return this;
    }-*/
    ;

    public final native String maxSize()
        throws RuntimeException /*-{
        return this["maxSize"] = (this["maxSize"] || "20%");
    }-*/
    ;

    public final native JsoBubble maxSize(String maxSize)
        throws RuntimeException /*-{
        this["maxSize"] = maxSize;
        return this;
    }-*/
    ;

    public final native String minSize()
        throws RuntimeException /*-{
        return this["minSize"] = (this["minSize"] || "8");
    }-*/
    ;

    public final native JsoBubble minSize(String minSize)
        throws RuntimeException /*-{
        this["minSize"] = minSize;
        return this;
    }-*/
    ;

    public final native String negativeColor()
        throws RuntimeException /*-{
        return this["negativeColor"] = (this["negativeColor"] || "null");
    }-*/
    ;

    public final native JsoBubble negativeColor(String negativeColor)
        throws RuntimeException /*-{
        this["negativeColor"] = negativeColor;
        return this;
    }-*/
    ;

    public final native Point point()
        throws RuntimeException /*-{
        return this["point"] = (this["point"] || {});
    }-*/
    ;

    public final native JsoBubble point(Point point)
        throws RuntimeException /*-{
        this["point"] = point;
        return this;
    }-*/
    ;

    public final native double pointInterval()
        throws RuntimeException /*-{
        return this["pointInterval"] = (this["pointInterval"] || 1.0);
    }-*/
    ;

    public final native JsoBubble pointInterval(double pointInterval)
        throws RuntimeException /*-{
        this["pointInterval"] = pointInterval;
        return this;
    }-*/
    ;

    public final native double pointStart()
        throws RuntimeException /*-{
        return this["pointStart"] = (this["pointStart"] || 0.0);
    }-*/
    ;

    public final native JsoBubble pointStart(double pointStart)
        throws RuntimeException /*-{
        this["pointStart"] = pointStart;
        return this;
    }-*/
    ;

    public final native boolean selected()
        throws RuntimeException /*-{
        return this["selected"] = (this["selected"] || false);
    }-*/
    ;

    public final native JsoBubble selected(boolean selected)
        throws RuntimeException /*-{
        this["selected"] = selected;
        return this;
    }-*/
    ;

    public final native boolean shadowAsBoolean()
        throws RuntimeException /*-{
        return this["shadow"] = (this["shadow"] || false);
    }-*/
    ;

    public final native JsoBubble shadowAsBoolean(boolean shadowAsBoolean)
        throws RuntimeException /*-{
        this["shadow"] = shadowAsBoolean;
        return this;
    }-*/
    ;

    public final native String shadowAsJsonString()
        throws RuntimeException /*-{
        this["shadow"] = (this["shadow"] || JSON.parse('false'));
        return JSON.stringify(this["shadow"]);
    }-*/
    ;

    public final native JsoBubble shadowAsJsonString(String shadowAsJsonString)
        throws RuntimeException /*-{
        this["shadow"] = JSON.parse(shadowAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean showCheckbox()
        throws RuntimeException /*-{
        return this["showCheckbox"] = (this["showCheckbox"] || false);
    }-*/
    ;

    public final native JsoBubble showCheckbox(boolean showCheckbox)
        throws RuntimeException /*-{
        this["showCheckbox"] = showCheckbox;
        return this;
    }-*/
    ;

    public final native boolean showInLegend()
        throws RuntimeException /*-{
        return this["showInLegend"] = (this["showInLegend"] || true);
    }-*/
    ;

    public final native JsoBubble showInLegend(boolean showInLegend)
        throws RuntimeException /*-{
        this["showInLegend"] = showInLegend;
        return this;
    }-*/
    ;

    public final native String sizeBy()
        throws RuntimeException /*-{
        return this["sizeBy"] = (this["sizeBy"] || "area");
    }-*/
    ;

    public final native JsoBubble sizeBy(String sizeBy)
        throws RuntimeException /*-{
        this["sizeBy"] = sizeBy;
        return this;
    }-*/
    ;

    public final native States states()
        throws RuntimeException /*-{
        return this["states"] = (this["states"] || {});
    }-*/
    ;

    public final native JsoBubble states(States states)
        throws RuntimeException /*-{
        this["states"] = states;
        return this;
    }-*/
    ;

    public final native boolean stickyTracking()
        throws RuntimeException /*-{
        return this["stickyTracking"] = (this["stickyTracking"] || false);
    }-*/
    ;

    public final native JsoBubble stickyTracking(boolean stickyTracking)
        throws RuntimeException /*-{
        this["stickyTracking"] = stickyTracking;
        return this;
    }-*/
    ;

    public final native double threshold()
        throws RuntimeException /*-{
        return this["threshold"] = (this["threshold"] || 0.0);
    }-*/
    ;

    public final native JsoBubble threshold(double threshold)
        throws RuntimeException /*-{
        this["threshold"] = threshold;
        return this;
    }-*/
    ;

    public final native Tooltip tooltip()
        throws RuntimeException /*-{
        return this["tooltip"] = (this["tooltip"] || {});
    }-*/
    ;

    public final native JsoBubble tooltip(Tooltip tooltip)
        throws RuntimeException /*-{
        this["tooltip"] = tooltip;
        return this;
    }-*/
    ;

    public final native boolean visible()
        throws RuntimeException /*-{
        return this["visible"] = (this["visible"] || true);
    }-*/
    ;

    public final native JsoBubble visible(boolean visible)
        throws RuntimeException /*-{
        this["visible"] = visible;
        return this;
    }-*/
    ;

    public final native double zMax()
        throws RuntimeException /*-{
        return this["zMax"] = (this["zMax"] || null);
    }-*/
    ;

    public final native JsoBubble zMax(double zMax)
        throws RuntimeException /*-{
        this["zMax"] = zMax;
        return this;
    }-*/
    ;

    public final native double zMin()
        throws RuntimeException /*-{
        return this["zMin"] = (this["zMin"] || null);
    }-*/
    ;

    public final native JsoBubble zMin(double zMin)
        throws RuntimeException /*-{
        this["zMin"] = zMin;
        return this;
    }-*/
    ;

    public final native double zThreshold()
        throws RuntimeException /*-{
        return this["zThreshold"] = (this["zThreshold"] || 0.0);
    }-*/
    ;

    public final native JsoBubble zThreshold(double zThreshold)
        throws RuntimeException /*-{
        this["zThreshold"] = zThreshold;
        return this;
    }-*/
    ;

}
