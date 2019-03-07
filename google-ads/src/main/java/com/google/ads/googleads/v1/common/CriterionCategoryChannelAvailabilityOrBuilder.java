// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/criterion_category_availability.proto

package com.google.ads.googleads.v1.common;

public interface CriterionCategoryChannelAvailabilityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.CriterionCategoryChannelAvailability)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Format of the channel availability. Can be ALL_CHANNELS (the rest of the
   * fields will not be set), CHANNEL_TYPE (only advertising_channel_type type
   * will be set, the category is available to all sub types under it) or
   * CHANNEL_TYPE_AND_SUBTYPES (advertising_channel_type,
   * advertising_channel_sub_type, and include_default_channel_sub_type will all
   * be set).
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.CriterionCategoryChannelAvailabilityModeEnum.CriterionCategoryChannelAvailabilityMode availability_mode = 1;</code>
   */
  int getAvailabilityModeValue();
  /**
   * <pre>
   * Format of the channel availability. Can be ALL_CHANNELS (the rest of the
   * fields will not be set), CHANNEL_TYPE (only advertising_channel_type type
   * will be set, the category is available to all sub types under it) or
   * CHANNEL_TYPE_AND_SUBTYPES (advertising_channel_type,
   * advertising_channel_sub_type, and include_default_channel_sub_type will all
   * be set).
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.CriterionCategoryChannelAvailabilityModeEnum.CriterionCategoryChannelAvailabilityMode availability_mode = 1;</code>
   */
  com.google.ads.googleads.v1.enums.CriterionCategoryChannelAvailabilityModeEnum.CriterionCategoryChannelAvailabilityMode getAvailabilityMode();

  /**
   * <pre>
   * Channel type the category is available to.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_type = 2;</code>
   */
  int getAdvertisingChannelTypeValue();
  /**
   * <pre>
   * Channel type the category is available to.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType advertising_channel_type = 2;</code>
   */
  com.google.ads.googleads.v1.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType getAdvertisingChannelType();

  /**
   * <pre>
   * Channel subtypes under the channel type the category is available to.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType advertising_channel_sub_type = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v1.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType> getAdvertisingChannelSubTypeList();
  /**
   * <pre>
   * Channel subtypes under the channel type the category is available to.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType advertising_channel_sub_type = 3;</code>
   */
  int getAdvertisingChannelSubTypeCount();
  /**
   * <pre>
   * Channel subtypes under the channel type the category is available to.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType advertising_channel_sub_type = 3;</code>
   */
  com.google.ads.googleads.v1.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType getAdvertisingChannelSubType(int index);
  /**
   * <pre>
   * Channel subtypes under the channel type the category is available to.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType advertising_channel_sub_type = 3;</code>
   */
  java.util.List<java.lang.Integer>
  getAdvertisingChannelSubTypeValueList();
  /**
   * <pre>
   * Channel subtypes under the channel type the category is available to.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType advertising_channel_sub_type = 3;</code>
   */
  int getAdvertisingChannelSubTypeValue(int index);

  /**
   * <pre>
   * Whether default channel sub type is included. For example,
   * advertising_channel_type being DISPLAY and include_default_channel_sub_type
   * being false means that the default display campaign where channel sub type
   * is not set is not included in this availability configuration.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue include_default_channel_sub_type = 4;</code>
   */
  boolean hasIncludeDefaultChannelSubType();
  /**
   * <pre>
   * Whether default channel sub type is included. For example,
   * advertising_channel_type being DISPLAY and include_default_channel_sub_type
   * being false means that the default display campaign where channel sub type
   * is not set is not included in this availability configuration.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue include_default_channel_sub_type = 4;</code>
   */
  com.google.protobuf.BoolValue getIncludeDefaultChannelSubType();
  /**
   * <pre>
   * Whether default channel sub type is included. For example,
   * advertising_channel_type being DISPLAY and include_default_channel_sub_type
   * being false means that the default display campaign where channel sub type
   * is not set is not included in this availability configuration.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue include_default_channel_sub_type = 4;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getIncludeDefaultChannelSubTypeOrBuilder();
}
