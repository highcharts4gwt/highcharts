
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.AddSeriesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.AfterPrintHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.BeforePrintHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.DrilldownHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.DrillupHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.LoadHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.Options3d;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.RedrawHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ResetZoomButton;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.SelectionHandler;


/**
 * Options regarding the chart area and plot area as well as general chart options.
 * 
 */
public class MockChart
    implements Chart
{

    private boolean alignTicks;
    private boolean animationAsBoolean;
    private String animationAsJsonString;
    private String backgroundColor;
    private String borderColor;
    private double borderRadius;
    private double borderWidth;
    private String className;
    private String defaultSeriesType;
    private double height;
    private boolean ignoreHiddenSeries;
    private boolean inverted;
    private ArrayNumber margin;
    private double marginBottom;
    private double marginLeft;
    private double marginRight;
    private double marginTop;
    private Options3d options3d;
    private String panKey;
    private boolean panning;
    private String pinchType;
    private String plotBackgroundColor;
    private String plotBackgroundImage;
    private String plotBorderColor;
    private double plotBorderWidth;
    private boolean plotShadowAsBoolean;
    private String plotShadowAsJsonString;
    private boolean polar;
    private boolean reflow;
    private String renderToAsString;
    private String renderToAsJsonString;
    private ResetZoomButton resetZoomButton;
    private String selectionMarkerFill;
    private boolean shadowAsBoolean;
    private String shadowAsJsonString;
    private boolean showAxes;
    private ArrayNumber spacing;
    private double spacingBottom;
    private double spacingLeft;
    private double spacingRight;
    private double spacingTop;
    private String style;
    private String type;
    private double width;
    private String zoomType;
    private String genericField;
    private String functionAsString;

    public boolean alignTicks() {
        return alignTicks;
    }

    public MockChart alignTicks(boolean alignTicks) {
        this.alignTicks = alignTicks;
        return this;
    }

    public boolean animationAsBoolean() {
        return animationAsBoolean;
    }

    public MockChart animationAsBoolean(boolean animationAsBoolean) {
        this.animationAsBoolean = animationAsBoolean;
        return this;
    }

    public String animationAsJsonString() {
        return animationAsJsonString;
    }

    public MockChart animationAsJsonString(String animationAsJsonString) {
        this.animationAsJsonString = animationAsJsonString;
        return this;
    }

    public String backgroundColor() {
        return backgroundColor;
    }

    public MockChart backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockChart borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderRadius() {
        return borderRadius;
    }

    public MockChart borderRadius(double borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockChart borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String className() {
        return className;
    }

    public MockChart className(String className) {
        this.className = className;
        return this;
    }

    public String defaultSeriesType() {
        return defaultSeriesType;
    }

    public MockChart defaultSeriesType(String defaultSeriesType) {
        this.defaultSeriesType = defaultSeriesType;
        return this;
    }

    public void addAddSeriesHandler(AddSeriesHandler handler) {
    }

    public void addAfterPrintHandler(AfterPrintHandler handler) {
    }

    public void addBeforePrintHandler(BeforePrintHandler handler) {
    }

    public void addClickHandler(ClickHandler handler) {
    }

    public void addDrilldownHandler(DrilldownHandler handler) {
    }

    public void addDrillupHandler(DrillupHandler handler) {
    }

    public void addLoadHandler(LoadHandler handler) {
    }

    public void addRedrawHandler(RedrawHandler handler) {
    }

    public void addSelectionHandler(SelectionHandler handler) {
    }

    public double height() {
        return height;
    }

    public MockChart height(double height) {
        this.height = height;
        return this;
    }

    public boolean ignoreHiddenSeries() {
        return ignoreHiddenSeries;
    }

    public MockChart ignoreHiddenSeries(boolean ignoreHiddenSeries) {
        this.ignoreHiddenSeries = ignoreHiddenSeries;
        return this;
    }

    public boolean inverted() {
        return inverted;
    }

    public MockChart inverted(boolean inverted) {
        this.inverted = inverted;
        return this;
    }

    public ArrayNumber margin() {
        return margin;
    }

    public MockChart margin(ArrayNumber margin) {
        this.margin = margin;
        return this;
    }

    public double marginBottom() {
        return marginBottom;
    }

    public MockChart marginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
        return this;
    }

    public double marginLeft() {
        return marginLeft;
    }

    public MockChart marginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
        return this;
    }

    public double marginRight() {
        return marginRight;
    }

    public MockChart marginRight(double marginRight) {
        this.marginRight = marginRight;
        return this;
    }

    public double marginTop() {
        return marginTop;
    }

    public MockChart marginTop(double marginTop) {
        this.marginTop = marginTop;
        return this;
    }

    public Options3d options3d() {
        return options3d;
    }

    public MockChart options3d(Options3d options3d) {
        this.options3d = options3d;
        return this;
    }

    public String panKey() {
        return panKey;
    }

    public MockChart panKey(String panKey) {
        this.panKey = panKey;
        return this;
    }

    public boolean panning() {
        return panning;
    }

    public MockChart panning(boolean panning) {
        this.panning = panning;
        return this;
    }

    public String pinchType() {
        return pinchType;
    }

    public MockChart pinchType(String pinchType) {
        this.pinchType = pinchType;
        return this;
    }

    public String plotBackgroundColor() {
        return plotBackgroundColor;
    }

    public MockChart plotBackgroundColor(String plotBackgroundColor) {
        this.plotBackgroundColor = plotBackgroundColor;
        return this;
    }

    public String plotBackgroundImage() {
        return plotBackgroundImage;
    }

    public MockChart plotBackgroundImage(String plotBackgroundImage) {
        this.plotBackgroundImage = plotBackgroundImage;
        return this;
    }

    public String plotBorderColor() {
        return plotBorderColor;
    }

    public MockChart plotBorderColor(String plotBorderColor) {
        this.plotBorderColor = plotBorderColor;
        return this;
    }

    public double plotBorderWidth() {
        return plotBorderWidth;
    }

    public MockChart plotBorderWidth(double plotBorderWidth) {
        this.plotBorderWidth = plotBorderWidth;
        return this;
    }

    public boolean plotShadowAsBoolean() {
        return plotShadowAsBoolean;
    }

    public MockChart plotShadowAsBoolean(boolean plotShadowAsBoolean) {
        this.plotShadowAsBoolean = plotShadowAsBoolean;
        return this;
    }

    public String plotShadowAsJsonString() {
        return plotShadowAsJsonString;
    }

    public MockChart plotShadowAsJsonString(String plotShadowAsJsonString) {
        this.plotShadowAsJsonString = plotShadowAsJsonString;
        return this;
    }

    public boolean polar() {
        return polar;
    }

    public MockChart polar(boolean polar) {
        this.polar = polar;
        return this;
    }

    public boolean reflow() {
        return reflow;
    }

    public MockChart reflow(boolean reflow) {
        this.reflow = reflow;
        return this;
    }

    public String renderToAsString() {
        return renderToAsString;
    }

    public MockChart renderToAsString(String renderToAsString) {
        this.renderToAsString = renderToAsString;
        return this;
    }

    public String renderToAsJsonString() {
        return renderToAsJsonString;
    }

    public MockChart renderToAsJsonString(String renderToAsJsonString) {
        this.renderToAsJsonString = renderToAsJsonString;
        return this;
    }

    public ResetZoomButton resetZoomButton() {
        return resetZoomButton;
    }

    public MockChart resetZoomButton(ResetZoomButton resetZoomButton) {
        this.resetZoomButton = resetZoomButton;
        return this;
    }

    public String selectionMarkerFill() {
        return selectionMarkerFill;
    }

    public MockChart selectionMarkerFill(String selectionMarkerFill) {
        this.selectionMarkerFill = selectionMarkerFill;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockChart shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockChart shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public boolean showAxes() {
        return showAxes;
    }

    public MockChart showAxes(boolean showAxes) {
        this.showAxes = showAxes;
        return this;
    }

    public ArrayNumber spacing() {
        return spacing;
    }

    public MockChart spacing(ArrayNumber spacing) {
        this.spacing = spacing;
        return this;
    }

    public double spacingBottom() {
        return spacingBottom;
    }

    public MockChart spacingBottom(double spacingBottom) {
        this.spacingBottom = spacingBottom;
        return this;
    }

    public double spacingLeft() {
        return spacingLeft;
    }

    public MockChart spacingLeft(double spacingLeft) {
        this.spacingLeft = spacingLeft;
        return this;
    }

    public double spacingRight() {
        return spacingRight;
    }

    public MockChart spacingRight(double spacingRight) {
        this.spacingRight = spacingRight;
        return this;
    }

    public double spacingTop() {
        return spacingTop;
    }

    public MockChart spacingTop(double spacingTop) {
        this.spacingTop = spacingTop;
        return this;
    }

    public String style() {
        return style;
    }

    public MockChart style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String type() {
        return type;
    }

    public MockChart type(String type) {
        this.type = type;
        return this;
    }

    public double width() {
        return width;
    }

    public MockChart width(double width) {
        this.width = width;
        return this;
    }

    public String zoomType() {
        return zoomType;
    }

    public MockChart zoomType(String zoomType) {
        this.zoomType = zoomType;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockChart setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockChart setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
