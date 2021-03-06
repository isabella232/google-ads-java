// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/keyword_plan_common.proto

package com.google.ads.googleads.v4.common;

public interface KeywordPlanHistoricalMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.common.KeywordPlanHistoricalMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Approximate number of monthly searches on this query averaged
   * for the past 12 months.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
   * @return Whether the avgMonthlySearches field is set.
   */
  boolean hasAvgMonthlySearches();
  /**
   * <pre>
   * Approximate number of monthly searches on this query averaged
   * for the past 12 months.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
   * @return The avgMonthlySearches.
   */
  com.google.protobuf.Int64Value getAvgMonthlySearches();
  /**
   * <pre>
   * Approximate number of monthly searches on this query averaged
   * for the past 12 months.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value avg_monthly_searches = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getAvgMonthlySearchesOrBuilder();

  /**
   * <pre>
   * Approximate number of searches on this query for the past twelve months.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.common.MonthlySearchVolume monthly_search_volumes = 6;</code>
   */
  java.util.List<com.google.ads.googleads.v4.common.MonthlySearchVolume> 
      getMonthlySearchVolumesList();
  /**
   * <pre>
   * Approximate number of searches on this query for the past twelve months.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.common.MonthlySearchVolume monthly_search_volumes = 6;</code>
   */
  com.google.ads.googleads.v4.common.MonthlySearchVolume getMonthlySearchVolumes(int index);
  /**
   * <pre>
   * Approximate number of searches on this query for the past twelve months.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.common.MonthlySearchVolume monthly_search_volumes = 6;</code>
   */
  int getMonthlySearchVolumesCount();
  /**
   * <pre>
   * Approximate number of searches on this query for the past twelve months.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.common.MonthlySearchVolume monthly_search_volumes = 6;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v4.common.MonthlySearchVolumeOrBuilder> 
      getMonthlySearchVolumesOrBuilderList();
  /**
   * <pre>
   * Approximate number of searches on this query for the past twelve months.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v4.common.MonthlySearchVolume monthly_search_volumes = 6;</code>
   */
  com.google.ads.googleads.v4.common.MonthlySearchVolumeOrBuilder getMonthlySearchVolumesOrBuilder(
      int index);

  /**
   * <pre>
   * The competition level for the query.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel competition = 2;</code>
   * @return The enum numeric value on the wire for competition.
   */
  int getCompetitionValue();
  /**
   * <pre>
   * The competition level for the query.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel competition = 2;</code>
   * @return The competition.
   */
  com.google.ads.googleads.v4.enums.KeywordPlanCompetitionLevelEnum.KeywordPlanCompetitionLevel getCompetition();

  /**
   * <pre>
   * The competition index for the query in the range [0, 100].
   * Shows how competitive ad placement is for a keyword.
   * The level of competition from 0-100 is determined by the number of ad slots
   * filled divided by the total number of ad slots available. If not enough
   * data is available, null is returned.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value competition_index = 3;</code>
   * @return Whether the competitionIndex field is set.
   */
  boolean hasCompetitionIndex();
  /**
   * <pre>
   * The competition index for the query in the range [0, 100].
   * Shows how competitive ad placement is for a keyword.
   * The level of competition from 0-100 is determined by the number of ad slots
   * filled divided by the total number of ad slots available. If not enough
   * data is available, null is returned.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value competition_index = 3;</code>
   * @return The competitionIndex.
   */
  com.google.protobuf.Int64Value getCompetitionIndex();
  /**
   * <pre>
   * The competition index for the query in the range [0, 100].
   * Shows how competitive ad placement is for a keyword.
   * The level of competition from 0-100 is determined by the number of ad slots
   * filled divided by the total number of ad slots available. If not enough
   * data is available, null is returned.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value competition_index = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCompetitionIndexOrBuilder();

  /**
   * <pre>
   * Top of page bid low range (20th percentile) in micros for the keyword.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value low_top_of_page_bid_micros = 4;</code>
   * @return Whether the lowTopOfPageBidMicros field is set.
   */
  boolean hasLowTopOfPageBidMicros();
  /**
   * <pre>
   * Top of page bid low range (20th percentile) in micros for the keyword.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value low_top_of_page_bid_micros = 4;</code>
   * @return The lowTopOfPageBidMicros.
   */
  com.google.protobuf.Int64Value getLowTopOfPageBidMicros();
  /**
   * <pre>
   * Top of page bid low range (20th percentile) in micros for the keyword.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value low_top_of_page_bid_micros = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getLowTopOfPageBidMicrosOrBuilder();

  /**
   * <pre>
   * Top of page bid high range (80th percentile) in micros for the keyword.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value high_top_of_page_bid_micros = 5;</code>
   * @return Whether the highTopOfPageBidMicros field is set.
   */
  boolean hasHighTopOfPageBidMicros();
  /**
   * <pre>
   * Top of page bid high range (80th percentile) in micros for the keyword.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value high_top_of_page_bid_micros = 5;</code>
   * @return The highTopOfPageBidMicros.
   */
  com.google.protobuf.Int64Value getHighTopOfPageBidMicros();
  /**
   * <pre>
   * Top of page bid high range (80th percentile) in micros for the keyword.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value high_top_of_page_bid_micros = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getHighTopOfPageBidMicrosOrBuilder();
}
