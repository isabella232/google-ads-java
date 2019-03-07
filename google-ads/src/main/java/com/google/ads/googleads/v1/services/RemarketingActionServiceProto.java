// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/remarketing_action_service.proto

package com.google.ads.googleads.v1.services;

public final class RemarketingActionServiceProto {
  private RemarketingActionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetRemarketingActionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetRemarketingActionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_RemarketingActionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_RemarketingActionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateRemarketingActionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v1/services/remar" +
      "keting_action_service.proto\022 google.ads." +
      "googleads.v1.services\032:google/ads/google" +
      "ads/v1/resources/remarketing_action.prot" +
      "o\032\034google/api/annotations.proto\032 google/" +
      "protobuf/field_mask.proto\032\036google/protob" +
      "uf/wrappers.proto\032\027google/rpc/status.pro" +
      "to\"4\n\033GetRemarketingActionRequest\022\025\n\rres" +
      "ource_name\030\001 \001(\t\"\270\001\n\037MutateRemarketingAc" +
      "tionsRequest\022\023\n\013customer_id\030\001 \001(\t\022P\n\nope" +
      "rations\030\002 \003(\0132<.google.ads.googleads.v1." +
      "services.RemarketingActionOperation\022\027\n\017p" +
      "artial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 " +
      "\001(\010\"\352\001\n\032RemarketingActionOperation\022/\n\013up" +
      "date_mask\030\004 \001(\0132\032.google.protobuf.FieldM" +
      "ask\022F\n\006create\030\001 \001(\01324.google.ads.googlea" +
      "ds.v1.resources.RemarketingActionH\000\022F\n\006u" +
      "pdate\030\002 \001(\01324.google.ads.googleads.v1.re" +
      "sources.RemarketingActionH\000B\013\n\toperation" +
      "\"\247\001\n MutateRemarketingActionsResponse\0221\n" +
      "\025partial_failure_error\030\003 \001(\0132\022.google.rp" +
      "c.Status\022P\n\007results\030\002 \003(\0132?.google.ads.g" +
      "oogleads.v1.services.MutateRemarketingAc" +
      "tionResult\"6\n\035MutateRemarketingActionRes" +
      "ult\022\025\n\rresource_name\030\001 \001(\t2\316\003\n\030Remarketi" +
      "ngActionService\022\311\001\n\024GetRemarketingAction" +
      "\022=.google.ads.googleads.v1.services.GetR" +
      "emarketingActionRequest\0324.google.ads.goo" +
      "gleads.v1.resources.RemarketingAction\"<\202" +
      "\323\344\223\0026\0224/v1/{resource_name=customers/*/re" +
      "marketingActions/*}\022\345\001\n\030MutateRemarketin" +
      "gActions\022A.google.ads.googleads.v1.servi" +
      "ces.MutateRemarketingActionsRequest\032B.go" +
      "ogle.ads.googleads.v1.services.MutateRem" +
      "arketingActionsResponse\"B\202\323\344\223\002<\"7/v1/cus" +
      "tomers/{customer_id=*}/remarketingAction" +
      "s:mutate:\001*B\204\002\n$com.google.ads.googleads" +
      ".v1.servicesB\035RemarketingActionServicePr" +
      "otoP\001ZHgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v1/services;services\242" +
      "\002\003GAA\252\002 Google.Ads.GoogleAds.V1.Services" +
      "\312\002 Google\\Ads\\GoogleAds\\V1\\Services\352\002$Go" +
      "ogle::Ads::GoogleAds::V1::Servicesb\006prot" +
      "o3"
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
          com.google.ads.googleads.v1.resources.RemarketingActionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetRemarketingActionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetRemarketingActionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetRemarketingActionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_RemarketingActionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_RemarketingActionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_RemarketingActionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateRemarketingActionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateRemarketingActionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateRemarketingActionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.RemarketingActionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
