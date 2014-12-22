
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.point.PointClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.point.PointMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.point.PointMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.point.PointRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.point.PointSelectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.point.PointUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.point.PointUpdateHandler;

public interface Point {


    void addPointClickHandler(PointClickHandler pointClickHandler);

    void addPointMouseOutHandler(PointMouseOutHandler pointMouseOutHandler);

    void addPointMouseOverHandler(PointMouseOverHandler pointMouseOverHandler);

    void addPointRemoveHandler(PointRemoveHandler pointRemoveHandler);

    void addPointSelectHandler(PointSelectHandler pointSelectHandler);

    void addPointUnselectHandler(PointUnselectHandler pointUnselectHandler);

    void addPointUpdateHandler(PointUpdateHandler pointUpdateHandler);

}