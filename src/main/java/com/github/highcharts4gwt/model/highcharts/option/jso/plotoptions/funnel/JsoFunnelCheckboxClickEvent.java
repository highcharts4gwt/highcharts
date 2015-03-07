
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoFunnelCheckboxClickEvent
    extends NativeEvent
    implements FunnelCheckboxClickEvent
{


    protected JsoFunnelCheckboxClickEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}