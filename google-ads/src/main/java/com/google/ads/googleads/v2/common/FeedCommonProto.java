// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/feed_common.proto

package com.google.ads.googleads.v2.common;

public final class FeedCommonProto {
  private FeedCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_common_Money_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_common_Money_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v2/common/feed_co" +
      "mmon.proto\022\036google.ads.googleads.v2.comm" +
      "on\032\036google/protobuf/wrappers.proto\032\034goog" +
      "le/api/annotations.proto\"p\n\005Money\0223\n\rcur" +
      "rency_code\030\001 \001(\0132\034.google.protobuf.Strin" +
      "gValue\0222\n\ramount_micros\030\002 \001(\0132\033.google.p" +
      "rotobuf.Int64ValueB\352\001\n\"com.google.ads.go" +
      "ogleads.v2.commonB\017FeedCommonProtoP\001ZDgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v2/common;common\242\002\003GAA\252\002\036Googl" +
      "e.Ads.GoogleAds.V2.Common\312\002\036Google\\Ads\\G" +
      "oogleAds\\V2\\Common\352\002\"Google::Ads::Google" +
      "Ads::V2::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_common_Money_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_common_Money_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_common_Money_descriptor,
        new java.lang.String[] { "CurrencyCode", "AmountMicros", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
