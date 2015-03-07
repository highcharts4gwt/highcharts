
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPieHideEvent
    extends NativeEvent
    implements PieHideEvent
{


    protected JsoPieHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}