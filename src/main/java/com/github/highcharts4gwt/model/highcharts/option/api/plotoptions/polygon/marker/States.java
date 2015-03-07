
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.marker;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.marker.states.Hover;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.marker.states.Select;

public interface States {


    Hover hover();

    States hover(Hover hover);

    Select select();

    States select(Select select);

    String getFieldAsJsonObject(String fieldName);

    States setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
