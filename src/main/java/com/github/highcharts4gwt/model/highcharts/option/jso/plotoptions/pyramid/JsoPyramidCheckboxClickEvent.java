
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.PyramidCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoPyramidCheckboxClickEvent
    extends NativeEvent
    implements PyramidCheckboxClickEvent
{


    protected JsoPyramidCheckboxClickEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}