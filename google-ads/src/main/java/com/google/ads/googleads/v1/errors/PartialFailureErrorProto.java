// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/partial_failure_error.proto

package com.google.ads.googleads.v1.errors;

public final class PartialFailureErrorProto {
  private PartialFailureErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_errors_PartialFailureErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_errors_PartialFailureErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v1/errors/partial" +
      "_failure_error.proto\022\036google.ads.googlea" +
      "ds.v1.errors\032\034google/api/annotations.pro" +
      "to\"q\n\027PartialFailureErrorEnum\"V\n\023Partial" +
      "FailureError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN" +
      "\020\001\022!\n\035PARTIAL_FAILURE_MODE_REQUIRED\020\002B\363\001" +
      "\n\"com.google.ads.googleads.v1.errorsB\030Pa" +
      "rtialFailureErrorProtoP\001ZDgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "/errors;errors\242\002\003GAA\252\002\036Google.Ads.Google" +
      "Ads.V1.Errors\312\002\036Google\\Ads\\GoogleAds\\V1\\" +
      "Errors\352\002\"Google::Ads::GoogleAds::V1::Err" +
      "orsb\006proto3"
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
    internal_static_google_ads_googleads_v1_errors_PartialFailureErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_errors_PartialFailureErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_errors_PartialFailureErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}