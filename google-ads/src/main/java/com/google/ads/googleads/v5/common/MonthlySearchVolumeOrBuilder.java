// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/keyword_plan_common.proto

package com.google.ads.googleads.v5.common;

public interface MonthlySearchVolumeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.common.MonthlySearchVolume)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The year of the search volume (e.g. 2020).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value year = 1;</code>
   * @return Whether the year field is set.
   */
  boolean hasYear();
  /**
   * <pre>
   * The year of the search volume (e.g. 2020).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value year = 1;</code>
   * @return The year.
   */
  com.google.protobuf.Int64Value getYear();
  /**
   * <pre>
   * The year of the search volume (e.g. 2020).
   * </pre>
   *
   * <code>.google.protobuf.Int64Value year = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getYearOrBuilder();

  /**
   * <pre>
   * The month of the search volume.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
   * @return The enum numeric value on the wire for month.
   */
  int getMonthValue();
  /**
   * <pre>
   * The month of the search volume.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.MonthOfYearEnum.MonthOfYear month = 2;</code>
   * @return The month.
   */
  com.google.ads.googleads.v5.enums.MonthOfYearEnum.MonthOfYear getMonth();

  /**
   * <pre>
   * Approximate number of searches for the month.
   * A null value indicates the search volume is unavailable for
   * that month.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value monthly_searches = 3;</code>
   * @return Whether the monthlySearches field is set.
   */
  boolean hasMonthlySearches();
  /**
   * <pre>
   * Approximate number of searches for the month.
   * A null value indicates the search volume is unavailable for
   * that month.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value monthly_searches = 3;</code>
   * @return The monthlySearches.
   */
  com.google.protobuf.Int64Value getMonthlySearches();
  /**
   * <pre>
   * Approximate number of searches for the month.
   * A null value indicates the search volume is unavailable for
   * that month.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value monthly_searches = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getMonthlySearchesOrBuilder();
}
