// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/ad_type_infos.proto

package com.google.ads.googleads.v1.common;

public interface LegacyResponsiveDisplayAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.LegacyResponsiveDisplayAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The short version of the ad's headline.
   * </pre>
   *
   * <code>.google.protobuf.StringValue short_headline = 1;</code>
   */
  boolean hasShortHeadline();
  /**
   * <pre>
   * The short version of the ad's headline.
   * </pre>
   *
   * <code>.google.protobuf.StringValue short_headline = 1;</code>
   */
  com.google.protobuf.StringValue getShortHeadline();
  /**
   * <pre>
   * The short version of the ad's headline.
   * </pre>
   *
   * <code>.google.protobuf.StringValue short_headline = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getShortHeadlineOrBuilder();

  /**
   * <pre>
   * The long version of the ad's headline.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_headline = 2;</code>
   */
  boolean hasLongHeadline();
  /**
   * <pre>
   * The long version of the ad's headline.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_headline = 2;</code>
   */
  com.google.protobuf.StringValue getLongHeadline();
  /**
   * <pre>
   * The long version of the ad's headline.
   * </pre>
   *
   * <code>.google.protobuf.StringValue long_headline = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLongHeadlineOrBuilder();

  /**
   * <pre>
   * The description of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 3;</code>
   */
  boolean hasDescription();
  /**
   * <pre>
   * The description of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 3;</code>
   */
  com.google.protobuf.StringValue getDescription();
  /**
   * <pre>
   * The description of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDescriptionOrBuilder();

  /**
   * <pre>
   * The business name in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue business_name = 4;</code>
   */
  boolean hasBusinessName();
  /**
   * <pre>
   * The business name in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue business_name = 4;</code>
   */
  com.google.protobuf.StringValue getBusinessName();
  /**
   * <pre>
   * The business name in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue business_name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getBusinessNameOrBuilder();

  /**
   * <pre>
   * Advertiser's consent to allow flexible color. When true, the ad may be
   * served with different color if necessary. When false, the ad will be served
   * with the specified colors or a neutral color.
   * The default value is true.
   * Must be true if main_color and accent_color are not set.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue allow_flexible_color = 5;</code>
   */
  boolean hasAllowFlexibleColor();
  /**
   * <pre>
   * Advertiser's consent to allow flexible color. When true, the ad may be
   * served with different color if necessary. When false, the ad will be served
   * with the specified colors or a neutral color.
   * The default value is true.
   * Must be true if main_color and accent_color are not set.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue allow_flexible_color = 5;</code>
   */
  com.google.protobuf.BoolValue getAllowFlexibleColor();
  /**
   * <pre>
   * Advertiser's consent to allow flexible color. When true, the ad may be
   * served with different color if necessary. When false, the ad will be served
   * with the specified colors or a neutral color.
   * The default value is true.
   * Must be true if main_color and accent_color are not set.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue allow_flexible_color = 5;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAllowFlexibleColorOrBuilder();

  /**
   * <pre>
   * The accent color of the ad in hexadecimal, e.g. #ffffff for white.
   * If one of main_color and accent_color is set, the other is required as
   * well.
   * </pre>
   *
   * <code>.google.protobuf.StringValue accent_color = 6;</code>
   */
  boolean hasAccentColor();
  /**
   * <pre>
   * The accent color of the ad in hexadecimal, e.g. #ffffff for white.
   * If one of main_color and accent_color is set, the other is required as
   * well.
   * </pre>
   *
   * <code>.google.protobuf.StringValue accent_color = 6;</code>
   */
  com.google.protobuf.StringValue getAccentColor();
  /**
   * <pre>
   * The accent color of the ad in hexadecimal, e.g. #ffffff for white.
   * If one of main_color and accent_color is set, the other is required as
   * well.
   * </pre>
   *
   * <code>.google.protobuf.StringValue accent_color = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAccentColorOrBuilder();

  /**
   * <pre>
   * The main color of the ad in hexadecimal, e.g. #ffffff for white.
   * If one of main_color and accent_color is set, the other is required as
   * well.
   * </pre>
   *
   * <code>.google.protobuf.StringValue main_color = 7;</code>
   */
  boolean hasMainColor();
  /**
   * <pre>
   * The main color of the ad in hexadecimal, e.g. #ffffff for white.
   * If one of main_color and accent_color is set, the other is required as
   * well.
   * </pre>
   *
   * <code>.google.protobuf.StringValue main_color = 7;</code>
   */
  com.google.protobuf.StringValue getMainColor();
  /**
   * <pre>
   * The main color of the ad in hexadecimal, e.g. #ffffff for white.
   * If one of main_color and accent_color is set, the other is required as
   * well.
   * </pre>
   *
   * <code>.google.protobuf.StringValue main_color = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMainColorOrBuilder();

  /**
   * <pre>
   * The call-to-action text for the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue call_to_action_text = 8;</code>
   */
  boolean hasCallToActionText();
  /**
   * <pre>
   * The call-to-action text for the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue call_to_action_text = 8;</code>
   */
  com.google.protobuf.StringValue getCallToActionText();
  /**
   * <pre>
   * The call-to-action text for the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue call_to_action_text = 8;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCallToActionTextOrBuilder();

  /**
   * <pre>
   * The MediaFile resource name of the logo image used in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue logo_image = 9;</code>
   */
  boolean hasLogoImage();
  /**
   * <pre>
   * The MediaFile resource name of the logo image used in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue logo_image = 9;</code>
   */
  com.google.protobuf.StringValue getLogoImage();
  /**
   * <pre>
   * The MediaFile resource name of the logo image used in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue logo_image = 9;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLogoImageOrBuilder();

  /**
   * <pre>
   * The MediaFile resource name of the square logo image used in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue square_logo_image = 10;</code>
   */
  boolean hasSquareLogoImage();
  /**
   * <pre>
   * The MediaFile resource name of the square logo image used in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue square_logo_image = 10;</code>
   */
  com.google.protobuf.StringValue getSquareLogoImage();
  /**
   * <pre>
   * The MediaFile resource name of the square logo image used in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue square_logo_image = 10;</code>
   */
  com.google.protobuf.StringValueOrBuilder getSquareLogoImageOrBuilder();

  /**
   * <pre>
   * The MediaFile resource name of the marketing image used in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue marketing_image = 11;</code>
   */
  boolean hasMarketingImage();
  /**
   * <pre>
   * The MediaFile resource name of the marketing image used in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue marketing_image = 11;</code>
   */
  com.google.protobuf.StringValue getMarketingImage();
  /**
   * <pre>
   * The MediaFile resource name of the marketing image used in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue marketing_image = 11;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMarketingImageOrBuilder();

  /**
   * <pre>
   * The MediaFile resource name of the square marketing image used in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue square_marketing_image = 12;</code>
   */
  boolean hasSquareMarketingImage();
  /**
   * <pre>
   * The MediaFile resource name of the square marketing image used in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue square_marketing_image = 12;</code>
   */
  com.google.protobuf.StringValue getSquareMarketingImage();
  /**
   * <pre>
   * The MediaFile resource name of the square marketing image used in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue square_marketing_image = 12;</code>
   */
  com.google.protobuf.StringValueOrBuilder getSquareMarketingImageOrBuilder();

  /**
   * <pre>
   * Specifies which format the ad will be served in. Default is ALL_FORMATS.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.DisplayAdFormatSettingEnum.DisplayAdFormatSetting format_setting = 13;</code>
   */
  int getFormatSettingValue();
  /**
   * <pre>
   * Specifies which format the ad will be served in. Default is ALL_FORMATS.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.DisplayAdFormatSettingEnum.DisplayAdFormatSetting format_setting = 13;</code>
   */
  com.google.ads.googleads.v1.enums.DisplayAdFormatSettingEnum.DisplayAdFormatSetting getFormatSetting();

  /**
   * <pre>
   * Prefix before price. E.g. 'as low as'.
   * </pre>
   *
   * <code>.google.protobuf.StringValue price_prefix = 14;</code>
   */
  boolean hasPricePrefix();
  /**
   * <pre>
   * Prefix before price. E.g. 'as low as'.
   * </pre>
   *
   * <code>.google.protobuf.StringValue price_prefix = 14;</code>
   */
  com.google.protobuf.StringValue getPricePrefix();
  /**
   * <pre>
   * Prefix before price. E.g. 'as low as'.
   * </pre>
   *
   * <code>.google.protobuf.StringValue price_prefix = 14;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPricePrefixOrBuilder();

  /**
   * <pre>
   * Promotion text used for dyanmic formats of responsive ads. For example
   * 'Free two-day shipping'.
   * </pre>
   *
   * <code>.google.protobuf.StringValue promo_text = 15;</code>
   */
  boolean hasPromoText();
  /**
   * <pre>
   * Promotion text used for dyanmic formats of responsive ads. For example
   * 'Free two-day shipping'.
   * </pre>
   *
   * <code>.google.protobuf.StringValue promo_text = 15;</code>
   */
  com.google.protobuf.StringValue getPromoText();
  /**
   * <pre>
   * Promotion text used for dyanmic formats of responsive ads. For example
   * 'Free two-day shipping'.
   * </pre>
   *
   * <code>.google.protobuf.StringValue promo_text = 15;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPromoTextOrBuilder();
}
