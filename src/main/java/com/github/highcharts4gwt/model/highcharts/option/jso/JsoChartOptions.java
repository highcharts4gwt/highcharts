
package com.github.highcharts4gwt.model.highcharts.option.jso;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.ChartOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Credits;
import com.github.highcharts4gwt.model.highcharts.option.api.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.Drilldown;
import com.github.highcharts4gwt.model.highcharts.option.api.Exporting;
import com.github.highcharts4gwt.model.highcharts.option.api.Labels;
import com.github.highcharts4gwt.model.highcharts.option.api.Legend;
import com.github.highcharts4gwt.model.highcharts.option.api.Loading;
import com.github.highcharts4gwt.model.highcharts.option.api.Navigation;
import com.github.highcharts4gwt.model.highcharts.option.api.NoData;
import com.github.highcharts4gwt.model.highcharts.option.api.Pane;
import com.github.highcharts4gwt.model.highcharts.option.api.PlotOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Subtitle;
import com.github.highcharts4gwt.model.highcharts.option.api.Title;
import com.github.highcharts4gwt.model.highcharts.option.api.Tooltip;
import com.github.highcharts4gwt.model.highcharts.option.api.XAxis;
import com.github.highcharts4gwt.model.highcharts.option.api.YAxis;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * 
 */
public class JsoChartOptions
    extends JavaScriptObject
    implements ChartOptions
{


    protected JsoChartOptions() {
    }

    public final native Drilldown drilldown()
        throws RuntimeException /*-{
        return this["drilldown"] = (this["drilldown"] || {});
    }-*/
    ;

    public final native JsoChartOptions drilldown(Drilldown drilldown)
        throws RuntimeException /*-{
        this["drilldown"] = drilldown;
        return this;
    }-*/
    ;

    public final native Legend legend()
        throws RuntimeException /*-{
        return this["legend"] = (this["legend"] || {});
    }-*/
    ;

    public final native JsoChartOptions legend(Legend legend)
        throws RuntimeException /*-{
        this["legend"] = legend;
        return this;
    }-*/
    ;

    public final native Chart chart()
        throws RuntimeException /*-{
        return this["chart"] = (this["chart"] || {});
    }-*/
    ;

    public final native JsoChartOptions chart(Chart chart)
        throws RuntimeException /*-{
        this["chart"] = chart;
        return this;
    }-*/
    ;

    public final native PlotOptions plotOptions()
        throws RuntimeException /*-{
        return this["plotOptions"] = (this["plotOptions"] || {});
    }-*/
    ;

    public final native JsoChartOptions plotOptions(PlotOptions plotOptions)
        throws RuntimeException /*-{
        this["plotOptions"] = plotOptions;
        return this;
    }-*/
    ;

    public final native XAxis xAxis()
        throws RuntimeException /*-{
        return this["xAxis"] = (this["xAxis"] || {});
    }-*/
    ;

    public final native JsoChartOptions xAxis(XAxis xAxis)
        throws RuntimeException /*-{
        this["xAxis"] = xAxis;
        return this;
    }-*/
    ;

    public final native YAxis yAxis()
        throws RuntimeException /*-{
        return this["yAxis"] = (this["yAxis"] || {});
    }-*/
    ;

    public final native JsoChartOptions yAxis(YAxis yAxis)
        throws RuntimeException /*-{
        this["yAxis"] = yAxis;
        return this;
    }-*/
    ;

    public final native Exporting exporting()
        throws RuntimeException /*-{
        return this["exporting"] = (this["exporting"] || {});
    }-*/
    ;

    public final native JsoChartOptions exporting(Exporting exporting)
        throws RuntimeException /*-{
        this["exporting"] = exporting;
        return this;
    }-*/
    ;

    public final native Title title()
        throws RuntimeException /*-{
        return this["title"] = (this["title"] || {});
    }-*/
    ;

    public final native JsoChartOptions title(Title title)
        throws RuntimeException /*-{
        this["title"] = title;
        return this;
    }-*/
    ;

    public final native Navigation navigation()
        throws RuntimeException /*-{
        return this["navigation"] = (this["navigation"] || {});
    }-*/
    ;

    public final native JsoChartOptions navigation(Navigation navigation)
        throws RuntimeException /*-{
        this["navigation"] = navigation;
        return this;
    }-*/
    ;

    public final native Subtitle subtitle()
        throws RuntimeException /*-{
        return this["subtitle"] = (this["subtitle"] || {});
    }-*/
    ;

    public final native JsoChartOptions subtitle(Subtitle subtitle)
        throws RuntimeException /*-{
        this["subtitle"] = subtitle;
        return this;
    }-*/
    ;

    public final native Tooltip tooltip()
        throws RuntimeException /*-{
        return this["tooltip"] = (this["tooltip"] || {});
    }-*/
    ;

    public final native JsoChartOptions tooltip(Tooltip tooltip)
        throws RuntimeException /*-{
        this["tooltip"] = tooltip;
        return this;
    }-*/
    ;

    public final native NoData noData()
        throws RuntimeException /*-{
        return this["noData"] = (this["noData"] || {});
    }-*/
    ;

    public final native JsoChartOptions noData(NoData noData)
        throws RuntimeException /*-{
        this["noData"] = noData;
        return this;
    }-*/
    ;

    public final native Pane pane()
        throws RuntimeException /*-{
        return this["pane"] = (this["pane"] || {});
    }-*/
    ;

    public final native JsoChartOptions pane(Pane pane)
        throws RuntimeException /*-{
        this["pane"] = pane;
        return this;
    }-*/
    ;

    public final native ArrayString colors()
        throws RuntimeException /*-{
        return this["colors"] = (this["colors"] || [ "#7cb5ec" , "#434348" , "#90ed7d" , "#f7a35c" , "#8085e9" , "#f15c80" , "#e4d354" , "#2b908f" , "#f45b5b" , "#91e8e1"]);
    }-*/
    ;

    public final native JsoChartOptions colors(ArrayString colors)
        throws RuntimeException /*-{
        this["colors"] = colors;
        return this;
    }-*/
    ;

    public final native Data data()
        throws RuntimeException /*-{
        return this["data"] = (this["data"] || {});
    }-*/
    ;

    public final native JsoChartOptions data(Data data)
        throws RuntimeException /*-{
        this["data"] = data;
        return this;
    }-*/
    ;

    public final native Credits credits()
        throws RuntimeException /*-{
        return this["credits"] = (this["credits"] || {});
    }-*/
    ;

    public final native JsoChartOptions credits(Credits credits)
        throws RuntimeException /*-{
        this["credits"] = credits;
        return this;
    }-*/
    ;

    public final native Loading loading()
        throws RuntimeException /*-{
        return this["loading"] = (this["loading"] || {});
    }-*/
    ;

    public final native JsoChartOptions loading(Loading loading)
        throws RuntimeException /*-{
        this["loading"] = loading;
        return this;
    }-*/
    ;

    public final native Labels labels()
        throws RuntimeException /*-{
        return this["labels"] = (this["labels"] || {});
    }-*/
    ;

    public final native JsoChartOptions labels(Labels labels)
        throws RuntimeException /*-{
        this["labels"] = labels;
        return this;
    }-*/
    ;

    public final native Array<Object> series()
        throws RuntimeException /*-{
        return this["series"] = (this["series"] || []);
    }-*/
    ;

    public final native JsoChartOptions series(Array<Object> series)
        throws RuntimeException /*-{
        this["series"] = series;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoChartOptions setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

    public final native String getFunctionAsString(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoChartOptions setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
