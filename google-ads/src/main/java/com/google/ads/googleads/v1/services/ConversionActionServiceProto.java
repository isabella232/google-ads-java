// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/conversion_action_service.proto

package com.google.ads.googleads.v1.services;

public final class ConversionActionServiceProto {
  private ConversionActionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetConversionActionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetConversionActionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateConversionActionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateConversionActionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_ConversionActionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_ConversionActionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateConversionActionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateConversionActionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateConversionActionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateConversionActionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v1/services/conve" +
      "rsion_action_service.proto\022 google.ads.g" +
      "oogleads.v1.services\0329google/ads/googlea" +
      "ds/v1/resources/conversion_action.proto\032" +
      "\034google/api/annotations.proto\032 google/pr" +
      "otobuf/field_mask.proto\032\036google/protobuf" +
      "/wrappers.proto\032\027google/rpc/status.proto" +
      "\"3\n\032GetConversionActionRequest\022\025\n\rresour" +
      "ce_name\030\001 \001(\t\"\266\001\n\036MutateConversionAction" +
      "sRequest\022\023\n\013customer_id\030\001 \001(\t\022O\n\noperati" +
      "ons\030\002 \003(\0132;.google.ads.googleads.v1.serv" +
      "ices.ConversionActionOperation\022\027\n\017partia" +
      "l_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\371" +
      "\001\n\031ConversionActionOperation\022/\n\013update_m" +
      "ask\030\004 \001(\0132\032.google.protobuf.FieldMask\022E\n" +
      "\006create\030\001 \001(\01323.google.ads.googleads.v1." +
      "resources.ConversionActionH\000\022E\n\006update\030\002" +
      " \001(\01323.google.ads.googleads.v1.resources" +
      ".ConversionActionH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n" +
      "\toperation\"\245\001\n\037MutateConversionActionsRe" +
      "sponse\0221\n\025partial_failure_error\030\003 \001(\0132\022." +
      "google.rpc.Status\022O\n\007results\030\002 \003(\0132>.goo" +
      "gle.ads.googleads.v1.services.MutateConv" +
      "ersionActionResult\"5\n\034MutateConversionAc" +
      "tionResult\022\025\n\rresource_name\030\001 \001(\t2\305\003\n\027Co" +
      "nversionActionService\022\305\001\n\023GetConversionA" +
      "ction\022<.google.ads.googleads.v1.services" +
      ".GetConversionActionRequest\0323.google.ads" +
      ".googleads.v1.resources.ConversionAction" +
      "\";\202\323\344\223\0025\0223/v1/{resource_name=customers/*" +
      "/conversionActions/*}\022\341\001\n\027MutateConversi" +
      "onActions\022@.google.ads.googleads.v1.serv" +
      "ices.MutateConversionActionsRequest\032A.go" +
      "ogle.ads.googleads.v1.services.MutateCon" +
      "versionActionsResponse\"A\202\323\344\223\002;\"6/v1/cust" +
      "omers/{customer_id=*}/conversionActions:" +
      "mutate:\001*B\203\002\n$com.google.ads.googleads.v" +
      "1.servicesB\034ConversionActionServiceProto" +
      "P\001ZHgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v1/services;services\242\002\003G" +
      "AA\252\002 Google.Ads.GoogleAds.V1.Services\312\002 " +
      "Google\\Ads\\GoogleAds\\V1\\Services\352\002$Googl" +
      "e::Ads::GoogleAds::V1::Servicesb\006proto3"
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
          com.google.ads.googleads.v1.resources.ConversionActionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetConversionActionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetConversionActionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetConversionActionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateConversionActionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateConversionActionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateConversionActionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_ConversionActionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_ConversionActionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_ConversionActionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateConversionActionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateConversionActionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateConversionActionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateConversionActionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateConversionActionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateConversionActionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.ConversionActionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
