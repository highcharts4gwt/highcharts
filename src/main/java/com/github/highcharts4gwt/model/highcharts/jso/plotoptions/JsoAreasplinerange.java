
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Areasplinerange;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeShowHandler;
import com.github.highcharts4gwt.model.highcharts.jso.plotoptions.JsoArearange;

public class JsoAreasplinerange
    extends JsoArearange
    implements Areasplinerange
{


    protected JsoAreasplinerange() {
    }

    public final native void addAreasplinerangeAfterAnimateHandler(AreasplinerangeAfterAnimateHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    afterAnimate: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeAfterAnimateHandler::onAreasplinerangeAfterAnimate(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/areasplinerange/AreasplinerangeAfterAnimateEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeCheckboxClickHandler(AreasplinerangeCheckboxClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    checkboxClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeCheckboxClickHandler::onAreasplinerangeCheckboxClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/areasplinerange/AreasplinerangeCheckboxClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeClickHandler(AreasplinerangeClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    click: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeClickHandler::onAreasplinerangeClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/areasplinerange/AreasplinerangeClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeHideHandler(AreasplinerangeHideHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    hide: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeHideHandler::onAreasplinerangeHide(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/areasplinerange/AreasplinerangeHideEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeLegendItemClickHandler(AreasplinerangeLegendItemClickHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    legendItemClick: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeLegendItemClickHandler::onAreasplinerangeLegendItemClick(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/areasplinerange/AreasplinerangeLegendItemClickEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeMouseOutHandler(AreasplinerangeMouseOutHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOut: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeMouseOutHandler::onAreasplinerangeMouseOut(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/areasplinerange/AreasplinerangeMouseOutEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeMouseOverHandler(AreasplinerangeMouseOverHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    mouseOver: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeMouseOverHandler::onAreasplinerangeMouseOver(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/areasplinerange/AreasplinerangeMouseOverEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

    public final native void addAreasplinerangeShowHandler(AreasplinerangeShowHandler handler)
        throws RuntimeException 
        /*-{
            return $wnd.jQuery.extend(true, this, 
            {
                events: {
                    show: function(event) {
                        handler.@com.github.highcharts4gwt.model.highcharts.api.plotoptions.areasplinerange.AreasplinerangeShowHandler::onAreasplinerangeShow(Lcom/github/highcharts4gwt/model/highcharts/api/plotoptions/areasplinerange/AreasplinerangeShowEvent;)(
                            $wnd.jQuery.extend(true, event, {source:this})
                         );
                     }
                 }
             });
        }-*/;
    ;

}