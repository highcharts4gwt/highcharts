
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.pie;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pie.PieCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPieCheckboxClickEvent
    extends NativeEvent
    implements PieCheckboxClickEvent
{


    protected JsoPieCheckboxClickEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}