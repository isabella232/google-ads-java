// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/ad.proto

package com.google.ads.googleads.v1.resources;

public interface AdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.Ad)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the ad.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the ad.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the ad.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getFinalUrlsList();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  com.google.protobuf.StringValue getFinalUrls(int index);
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getFinalUrlsOrBuilderList();
  /**
   * <pre>
   * The list of possible final URLs after all cross-domain redirects for the
   * ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_urls = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getFinalMobileUrlsList();
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  com.google.protobuf.StringValue getFinalMobileUrls(int index);
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getFinalMobileUrlsOrBuilderList();
  /**
   * <pre>
   * The list of possible final mobile URLs after all cross-domain redirects
   * for the ad.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue final_mobile_urls = 16;</code>
   */
  com.google.protobuf.StringValueOrBuilder getFinalMobileUrlsOrBuilder(
      int index);

  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 12;</code>
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 12;</code>
   */
  com.google.protobuf.StringValue getTrackingUrlTemplate();
  /**
   * <pre>
   * The URL template for constructing a tracking URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue tracking_url_template = 12;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTrackingUrlTemplateOrBuilder();

  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CustomParameter url_custom_parameters = 10;</code>
   */
  java.util.List<com.google.ads.googleads.v1.common.CustomParameter> 
      getUrlCustomParametersList();
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CustomParameter url_custom_parameters = 10;</code>
   */
  com.google.ads.googleads.v1.common.CustomParameter getUrlCustomParameters(int index);
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CustomParameter url_custom_parameters = 10;</code>
   */
  int getUrlCustomParametersCount();
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CustomParameter url_custom_parameters = 10;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v1.common.CustomParameterOrBuilder> 
      getUrlCustomParametersOrBuilderList();
  /**
   * <pre>
   * The list of mappings that can be used to substitute custom parameter tags
   * in a `tracking_url_template`, `final_urls`, or `mobile_final_urls`.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.CustomParameter url_custom_parameters = 10;</code>
   */
  com.google.ads.googleads.v1.common.CustomParameterOrBuilder getUrlCustomParametersOrBuilder(
      int index);

  /**
   * <pre>
   * The URL that appears in the ad description for some ad formats.
   * </pre>
   *
   * <code>.google.protobuf.StringValue display_url = 4;</code>
   */
  boolean hasDisplayUrl();
  /**
   * <pre>
   * The URL that appears in the ad description for some ad formats.
   * </pre>
   *
   * <code>.google.protobuf.StringValue display_url = 4;</code>
   */
  com.google.protobuf.StringValue getDisplayUrl();
  /**
   * <pre>
   * The URL that appears in the ad description for some ad formats.
   * </pre>
   *
   * <code>.google.protobuf.StringValue display_url = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getDisplayUrlOrBuilder();

  /**
   * <pre>
   * The type of ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.AdTypeEnum.AdType type = 5;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.AdTypeEnum.AdType type = 5;</code>
   */
  com.google.ads.googleads.v1.enums.AdTypeEnum.AdType getType();

  /**
   * <pre>
   * Indicates if this ad was automatically added by Google Ads and not by a
   * user. For example, this could happen when ads are automatically created as
   * suggestions for new ads based on knowledge of how existing ads are
   * performing.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue added_by_google_ads = 19;</code>
   */
  boolean hasAddedByGoogleAds();
  /**
   * <pre>
   * Indicates if this ad was automatically added by Google Ads and not by a
   * user. For example, this could happen when ads are automatically created as
   * suggestions for new ads based on knowledge of how existing ads are
   * performing.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue added_by_google_ads = 19;</code>
   */
  com.google.protobuf.BoolValue getAddedByGoogleAds();
  /**
   * <pre>
   * Indicates if this ad was automatically added by Google Ads and not by a
   * user. For example, this could happen when ads are automatically created as
   * suggestions for new ads based on knowledge of how existing ads are
   * performing.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue added_by_google_ads = 19;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAddedByGoogleAdsOrBuilder();

  /**
   * <pre>
   * The device preference for the ad. You can only specify a preference for
   * mobile devices. When this preference is set the ad will be preferred over
   * other ads when being displayed on a mobile device. The ad can still be
   * displayed on other device types, e.g. if no other ads are available.
   * If unspecified (no device preference), all devices are targeted.
   * This is only supported by some ad types.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.DeviceEnum.Device device_preference = 20;</code>
   */
  int getDevicePreferenceValue();
  /**
   * <pre>
   * The device preference for the ad. You can only specify a preference for
   * mobile devices. When this preference is set the ad will be preferred over
   * other ads when being displayed on a mobile device. The ad can still be
   * displayed on other device types, e.g. if no other ads are available.
   * If unspecified (no device preference), all devices are targeted.
   * This is only supported by some ad types.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.DeviceEnum.Device device_preference = 20;</code>
   */
  com.google.ads.googleads.v1.enums.DeviceEnum.Device getDevicePreference();

  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UrlCollection url_collections = 26;</code>
   */
  java.util.List<com.google.ads.googleads.v1.common.UrlCollection> 
      getUrlCollectionsList();
  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UrlCollection url_collections = 26;</code>
   */
  com.google.ads.googleads.v1.common.UrlCollection getUrlCollections(int index);
  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UrlCollection url_collections = 26;</code>
   */
  int getUrlCollectionsCount();
  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UrlCollection url_collections = 26;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v1.common.UrlCollectionOrBuilder> 
      getUrlCollectionsOrBuilderList();
  /**
   * <pre>
   * Additional URLs for the ad that are tagged with a unique identifier that
   * can be referenced from other fields in the ad.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UrlCollection url_collections = 26;</code>
   */
  com.google.ads.googleads.v1.common.UrlCollectionOrBuilder getUrlCollectionsOrBuilder(
      int index);

  /**
   * <pre>
   * The name of the ad. This is only used to be able to identify the ad. It
   * does not need to be unique and does not affect the served ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 23;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the ad. This is only used to be able to identify the ad. It
   * does not need to be unique and does not affect the served ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 23;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the ad. This is only used to be able to identify the ad. It
   * does not need to be unique and does not affect the served ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 23;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * If this ad is system managed, then this field will indicate the source.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.SystemManagedResourceSourceEnum.SystemManagedResourceSource system_managed_resource_source = 27;</code>
   */
  int getSystemManagedResourceSourceValue();
  /**
   * <pre>
   * If this ad is system managed, then this field will indicate the source.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.SystemManagedResourceSourceEnum.SystemManagedResourceSource system_managed_resource_source = 27;</code>
   */
  com.google.ads.googleads.v1.enums.SystemManagedResourceSourceEnum.SystemManagedResourceSource getSystemManagedResourceSource();

  /**
   * <pre>
   * Details pertaining to a text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.TextAdInfo text_ad = 6;</code>
   */
  boolean hasTextAd();
  /**
   * <pre>
   * Details pertaining to a text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.TextAdInfo text_ad = 6;</code>
   */
  com.google.ads.googleads.v1.common.TextAdInfo getTextAd();
  /**
   * <pre>
   * Details pertaining to a text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.TextAdInfo text_ad = 6;</code>
   */
  com.google.ads.googleads.v1.common.TextAdInfoOrBuilder getTextAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an expanded text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ExpandedTextAdInfo expanded_text_ad = 7;</code>
   */
  boolean hasExpandedTextAd();
  /**
   * <pre>
   * Details pertaining to an expanded text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ExpandedTextAdInfo expanded_text_ad = 7;</code>
   */
  com.google.ads.googleads.v1.common.ExpandedTextAdInfo getExpandedTextAd();
  /**
   * <pre>
   * Details pertaining to an expanded text ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ExpandedTextAdInfo expanded_text_ad = 7;</code>
   */
  com.google.ads.googleads.v1.common.ExpandedTextAdInfoOrBuilder getExpandedTextAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a call-only ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.CallOnlyAdInfo call_only_ad = 13;</code>
   */
  boolean hasCallOnlyAd();
  /**
   * <pre>
   * Details pertaining to a call-only ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.CallOnlyAdInfo call_only_ad = 13;</code>
   */
  com.google.ads.googleads.v1.common.CallOnlyAdInfo getCallOnlyAd();
  /**
   * <pre>
   * Details pertaining to a call-only ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.CallOnlyAdInfo call_only_ad = 13;</code>
   */
  com.google.ads.googleads.v1.common.CallOnlyAdInfoOrBuilder getCallOnlyAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an Expanded Dynamic Search Ad.
   * This type of ad has its headline, final URLs, and display URL
   * auto-generated at serving time according to domain name specific
   * information provided by `dynamic_search_ads_setting` linked at the
   * campaign level.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ExpandedDynamicSearchAdInfo expanded_dynamic_search_ad = 14;</code>
   */
  boolean hasExpandedDynamicSearchAd();
  /**
   * <pre>
   * Details pertaining to an Expanded Dynamic Search Ad.
   * This type of ad has its headline, final URLs, and display URL
   * auto-generated at serving time according to domain name specific
   * information provided by `dynamic_search_ads_setting` linked at the
   * campaign level.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ExpandedDynamicSearchAdInfo expanded_dynamic_search_ad = 14;</code>
   */
  com.google.ads.googleads.v1.common.ExpandedDynamicSearchAdInfo getExpandedDynamicSearchAd();
  /**
   * <pre>
   * Details pertaining to an Expanded Dynamic Search Ad.
   * This type of ad has its headline, final URLs, and display URL
   * auto-generated at serving time according to domain name specific
   * information provided by `dynamic_search_ads_setting` linked at the
   * campaign level.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ExpandedDynamicSearchAdInfo expanded_dynamic_search_ad = 14;</code>
   */
  com.google.ads.googleads.v1.common.ExpandedDynamicSearchAdInfoOrBuilder getExpandedDynamicSearchAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a hotel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelAdInfo hotel_ad = 15;</code>
   */
  boolean hasHotelAd();
  /**
   * <pre>
   * Details pertaining to a hotel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelAdInfo hotel_ad = 15;</code>
   */
  com.google.ads.googleads.v1.common.HotelAdInfo getHotelAd();
  /**
   * <pre>
   * Details pertaining to a hotel ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.HotelAdInfo hotel_ad = 15;</code>
   */
  com.google.ads.googleads.v1.common.HotelAdInfoOrBuilder getHotelAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Smart Shopping ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ShoppingSmartAdInfo shopping_smart_ad = 17;</code>
   */
  boolean hasShoppingSmartAd();
  /**
   * <pre>
   * Details pertaining to a Smart Shopping ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ShoppingSmartAdInfo shopping_smart_ad = 17;</code>
   */
  com.google.ads.googleads.v1.common.ShoppingSmartAdInfo getShoppingSmartAd();
  /**
   * <pre>
   * Details pertaining to a Smart Shopping ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ShoppingSmartAdInfo shopping_smart_ad = 17;</code>
   */
  com.google.ads.googleads.v1.common.ShoppingSmartAdInfoOrBuilder getShoppingSmartAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Shopping product ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ShoppingProductAdInfo shopping_product_ad = 18;</code>
   */
  boolean hasShoppingProductAd();
  /**
   * <pre>
   * Details pertaining to a Shopping product ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ShoppingProductAdInfo shopping_product_ad = 18;</code>
   */
  com.google.ads.googleads.v1.common.ShoppingProductAdInfo getShoppingProductAd();
  /**
   * <pre>
   * Details pertaining to a Shopping product ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ShoppingProductAdInfo shopping_product_ad = 18;</code>
   */
  com.google.ads.googleads.v1.common.ShoppingProductAdInfoOrBuilder getShoppingProductAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Gmail ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.GmailAdInfo gmail_ad = 21;</code>
   */
  boolean hasGmailAd();
  /**
   * <pre>
   * Details pertaining to a Gmail ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.GmailAdInfo gmail_ad = 21;</code>
   */
  com.google.ads.googleads.v1.common.GmailAdInfo getGmailAd();
  /**
   * <pre>
   * Details pertaining to a Gmail ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.GmailAdInfo gmail_ad = 21;</code>
   */
  com.google.ads.googleads.v1.common.GmailAdInfoOrBuilder getGmailAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to an Image ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ImageAdInfo image_ad = 22;</code>
   */
  boolean hasImageAd();
  /**
   * <pre>
   * Details pertaining to an Image ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ImageAdInfo image_ad = 22;</code>
   */
  com.google.ads.googleads.v1.common.ImageAdInfo getImageAd();
  /**
   * <pre>
   * Details pertaining to an Image ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ImageAdInfo image_ad = 22;</code>
   */
  com.google.ads.googleads.v1.common.ImageAdInfoOrBuilder getImageAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a Video ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.VideoAdInfo video_ad = 24;</code>
   */
  boolean hasVideoAd();
  /**
   * <pre>
   * Details pertaining to a Video ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.VideoAdInfo video_ad = 24;</code>
   */
  com.google.ads.googleads.v1.common.VideoAdInfo getVideoAd();
  /**
   * <pre>
   * Details pertaining to a Video ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.VideoAdInfo video_ad = 24;</code>
   */
  com.google.ads.googleads.v1.common.VideoAdInfoOrBuilder getVideoAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a responsive search ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ResponsiveSearchAdInfo responsive_search_ad = 25;</code>
   */
  boolean hasResponsiveSearchAd();
  /**
   * <pre>
   * Details pertaining to a responsive search ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ResponsiveSearchAdInfo responsive_search_ad = 25;</code>
   */
  com.google.ads.googleads.v1.common.ResponsiveSearchAdInfo getResponsiveSearchAd();
  /**
   * <pre>
   * Details pertaining to a responsive search ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.ResponsiveSearchAdInfo responsive_search_ad = 25;</code>
   */
  com.google.ads.googleads.v1.common.ResponsiveSearchAdInfoOrBuilder getResponsiveSearchAdOrBuilder();

  /**
   * <pre>
   * Details pertaining to a legacy responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.LegacyResponsiveDisplayAdInfo legacy_responsive_display_ad = 28;</code>
   */
  boolean hasLegacyResponsiveDisplayAd();
  /**
   * <pre>
   * Details pertaining to a legacy responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.LegacyResponsiveDisplayAdInfo legacy_responsive_display_ad = 28;</code>
   */
  com.google.ads.googleads.v1.common.LegacyResponsiveDisplayAdInfo getLegacyResponsiveDisplayAd();
  /**
   * <pre>
   * Details pertaining to a legacy responsive display ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.LegacyResponsiveDisplayAdInfo legacy_responsive_display_ad = 28;</code>
   */
  com.google.ads.googleads.v1.common.LegacyResponsiveDisplayAdInfoOrBuilder getLegacyResponsiveDisplayAdOrBuilder();

  public com.google.ads.googleads.v1.resources.Ad.AdDataCase getAdDataCase();
}
