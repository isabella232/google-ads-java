// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/media_file_error.proto

package com.google.ads.googleads.v1.errors;

public final class MediaFileErrorProto {
  private MediaFileErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_errors_MediaFileErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_errors_MediaFileErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v1/errors/media_f" +
      "ile_error.proto\022\036google.ads.googleads.v1" +
      ".errors\032\034google/api/annotations.proto\"\227\006" +
      "\n\022MediaFileErrorEnum\"\200\006\n\016MediaFileError\022" +
      "\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\037\n\033CANNOT_" +
      "CREATE_STANDARD_ICON\020\002\0220\n,CANNOT_SELECT_" +
      "STANDARD_ICON_WITH_OTHER_TYPES\020\003\022)\n%CANN" +
      "OT_SPECIFY_MEDIA_FILE_ID_AND_DATA\020\004\022\023\n\017D" +
      "UPLICATE_MEDIA\020\005\022\017\n\013EMPTY_FIELD\020\006\022\'\n#RES" +
      "OURCE_REFERENCED_IN_MULTIPLE_OPS\020\007\022*\n&FI" +
      "ELD_NOT_SUPPORTED_FOR_MEDIA_SUB_TYPE\020\010\022\031" +
      "\n\025INVALID_MEDIA_FILE_ID\020\t\022\032\n\026INVALID_MED" +
      "IA_SUB_TYPE\020\n\022\033\n\027INVALID_MEDIA_FILE_TYPE" +
      "\020\013\022\025\n\021INVALID_MIME_TYPE\020\014\022\030\n\024INVALID_REF" +
      "ERENCE_ID\020\r\022\027\n\023INVALID_YOU_TUBE_ID\020\016\022!\n\035" +
      "MEDIA_FILE_FAILED_TRANSCODING\020\017\022\030\n\024MEDIA" +
      "_NOT_TRANSCODED\020\020\022-\n)MEDIA_TYPE_DOES_NOT" +
      "_MATCH_MEDIA_FILE_TYPE\020\021\022\027\n\023NO_FIELDS_SP" +
      "ECIFIED\020\022\022\"\n\036NULL_REFERENCE_ID_AND_MEDIA" +
      "_ID\020\023\022\014\n\010TOO_LONG\020\024\022\024\n\020UNSUPPORTED_TYPE\020" +
      "\025\022 \n\034YOU_TUBE_SERVICE_UNAVAILABLE\020\026\022,\n(Y" +
      "OU_TUBE_VIDEO_HAS_NON_POSITIVE_DURATION\020" +
      "\027\022\034\n\030YOU_TUBE_VIDEO_NOT_FOUND\020\030B\356\001\n\"com." +
      "google.ads.googleads.v1.errorsB\023MediaFil" +
      "eErrorProtoP\001ZDgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v1/errors;err" +
      "ors\242\002\003GAA\252\002\036Google.Ads.GoogleAds.V1.Erro" +
      "rs\312\002\036Google\\Ads\\GoogleAds\\V1\\Errors\352\002\"Go" +
      "ogle::Ads::GoogleAds::V1::Errorsb\006proto3"
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
    internal_static_google_ads_googleads_v1_errors_MediaFileErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_errors_MediaFileErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_errors_MediaFileErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
