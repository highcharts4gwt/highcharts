
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnrangeCheckboxClickEvent
    extends NativeEvent
    implements ColumnrangeCheckboxClickEvent
{


    protected JsoColumnrangeCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}