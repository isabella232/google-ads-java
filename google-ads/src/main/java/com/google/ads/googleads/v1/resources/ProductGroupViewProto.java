// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/product_group_view.proto

package com.google.ads.googleads.v1.resources;

public final class ProductGroupViewProto {
  private ProductGroupViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_ProductGroupView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_ProductGroupView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v1/resources/prod" +
      "uct_group_view.proto\022!google.ads.googlea" +
      "ds.v1.resources\032\034google/api/annotations." +
      "proto\")\n\020ProductGroupView\022\025\n\rresource_na" +
      "me\030\001 \001(\tB\202\002\n%com.google.ads.googleads.v1" +
      ".resourcesB\025ProductGroupViewProtoP\001ZJgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v1/resources;resources\242\002\003GAA\252\002!" +
      "Google.Ads.GoogleAds.V1.Resources\312\002!Goog" +
      "le\\Ads\\GoogleAds\\V1\\Resources\352\002%Google::" +
      "Ads::GoogleAds::V1::Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_ProductGroupView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_ProductGroupView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_ProductGroupView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
