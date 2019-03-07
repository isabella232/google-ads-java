// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/google_ads_field.proto

package com.google.ads.googleads.v1.resources;

public final class GoogleAdsFieldProto {
  private GoogleAdsFieldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_GoogleAdsField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_GoogleAdsField_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v1/resources/goog" +
      "le_ads_field.proto\022!google.ads.googleads" +
      ".v1.resources\032=google/ads/googleads/v1/e" +
      "nums/google_ads_field_category.proto\032>go" +
      "ogle/ads/googleads/v1/enums/google_ads_f" +
      "ield_data_type.proto\032\036google/protobuf/wr" +
      "appers.proto\032\034google/api/annotations.pro" +
      "to\"\217\006\n\016GoogleAdsField\022\025\n\rresource_name\030\001" +
      " \001(\t\022*\n\004name\030\002 \001(\0132\034.google.protobuf.Str" +
      "ingValue\022b\n\010category\030\003 \001(\0162P.google.ads." +
      "googleads.v1.enums.GoogleAdsFieldCategor" +
      "yEnum.GoogleAdsFieldCategory\022.\n\nselectab" +
      "le\030\004 \001(\0132\032.google.protobuf.BoolValue\022.\n\n" +
      "filterable\030\005 \001(\0132\032.google.protobuf.BoolV" +
      "alue\022,\n\010sortable\030\006 \001(\0132\032.google.protobuf" +
      ".BoolValue\0225\n\017selectable_with\030\007 \003(\0132\034.go" +
      "ogle.protobuf.StringValue\0229\n\023attribute_r" +
      "esources\030\010 \003(\0132\034.google.protobuf.StringV" +
      "alue\022-\n\007metrics\030\t \003(\0132\034.google.protobuf." +
      "StringValue\022.\n\010segments\030\n \003(\0132\034.google.p" +
      "rotobuf.StringValue\0221\n\013enum_values\030\013 \003(\013" +
      "2\034.google.protobuf.StringValue\022c\n\tdata_t" +
      "ype\030\014 \001(\0162P.google.ads.googleads.v1.enum" +
      "s.GoogleAdsFieldDataTypeEnum.GoogleAdsFi" +
      "eldDataType\022.\n\010type_url\030\r \001(\0132\034.google.p" +
      "rotobuf.StringValue\022/\n\013is_repeated\030\016 \001(\013" +
      "2\032.google.protobuf.BoolValueB\200\002\n%com.goo" +
      "gle.ads.googleads.v1.resourcesB\023GoogleAd" +
      "sFieldProtoP\001ZJgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v1/resources;" +
      "resources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V" +
      "1.Resources\312\002!Google\\Ads\\GoogleAds\\V1\\Re" +
      "sources\352\002%Google::Ads::GoogleAds::V1::Re" +
      "sourcesb\006proto3"
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
          com.google.ads.googleads.v1.enums.GoogleAdsFieldCategoryProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.GoogleAdsFieldDataTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_GoogleAdsField_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_GoogleAdsField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_GoogleAdsField_descriptor,
        new java.lang.String[] { "ResourceName", "Name", "Category", "Selectable", "Filterable", "Sortable", "SelectableWith", "AttributeResources", "Metrics", "Segments", "EnumValues", "DataType", "TypeUrl", "IsRepeated", });
    com.google.ads.googleads.v1.enums.GoogleAdsFieldCategoryProto.getDescriptor();
    com.google.ads.googleads.v1.enums.GoogleAdsFieldDataTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
