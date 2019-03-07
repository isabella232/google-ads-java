// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/keyword_plan.proto

package com.google.ads.googleads.v1.resources;

public interface KeywordPlanForecastPeriodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.KeywordPlanForecastPeriod)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A future date range relative to the current date used for forecasting.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval date_interval = 1;</code>
   */
  int getDateIntervalValue();
  /**
   * <pre>
   * A future date range relative to the current date used for forecasting.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval date_interval = 1;</code>
   */
  com.google.ads.googleads.v1.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval getDateInterval();

  /**
   * <pre>
   * The custom date range used for forecasting.
   * The start and end dates must be in the future. Otherwise, an error will
   * be returned when the forecasting action is performed.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.DateRange date_range = 2;</code>
   */
  boolean hasDateRange();
  /**
   * <pre>
   * The custom date range used for forecasting.
   * The start and end dates must be in the future. Otherwise, an error will
   * be returned when the forecasting action is performed.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.DateRange date_range = 2;</code>
   */
  com.google.ads.googleads.v1.common.DateRange getDateRange();
  /**
   * <pre>
   * The custom date range used for forecasting.
   * The start and end dates must be in the future. Otherwise, an error will
   * be returned when the forecasting action is performed.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.DateRange date_range = 2;</code>
   */
  com.google.ads.googleads.v1.common.DateRangeOrBuilder getDateRangeOrBuilder();

  public com.google.ads.googleads.v1.resources.KeywordPlanForecastPeriod.IntervalCase getIntervalCase();
}
