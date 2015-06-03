
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.areasplinerange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.CheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoCheckboxClickEvent
    extends NativeEvent
    implements CheckboxClickEvent
{


    protected JsoCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
