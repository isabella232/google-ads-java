// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/billing_setup_service.proto

package com.google.ads.googleads.v1.services;

public final class BillingSetupServiceProto {
  private BillingSetupServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetBillingSetupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetBillingSetupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateBillingSetupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateBillingSetupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_BillingSetupOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_BillingSetupOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateBillingSetupResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateBillingSetupResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateBillingSetupResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateBillingSetupResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v1/services/billi" +
      "ng_setup_service.proto\022 google.ads.googl" +
      "eads.v1.services\0325google/ads/googleads/v" +
      "1/resources/billing_setup.proto\032\034google/" +
      "api/annotations.proto\"/\n\026GetBillingSetup" +
      "Request\022\025\n\rresource_name\030\001 \001(\t\"|\n\031Mutate" +
      "BillingSetupRequest\022\023\n\013customer_id\030\001 \001(\t" +
      "\022J\n\toperation\030\002 \001(\01327.google.ads.googlea" +
      "ds.v1.services.BillingSetupOperation\"y\n\025" +
      "BillingSetupOperation\022A\n\006create\030\002 \001(\0132/." +
      "google.ads.googleads.v1.resources.Billin" +
      "gSetupH\000\022\020\n\006remove\030\001 \001(\tH\000B\013\n\toperation\"" +
      "h\n\032MutateBillingSetupResponse\022J\n\006result\030" +
      "\001 \001(\0132:.google.ads.googleads.v1.services" +
      ".MutateBillingSetupResult\"1\n\030MutateBilli" +
      "ngSetupResult\022\025\n\rresource_name\030\001 \001(\t2\236\003\n" +
      "\023BillingSetupService\022\265\001\n\017GetBillingSetup" +
      "\0228.google.ads.googleads.v1.services.GetB" +
      "illingSetupRequest\032/.google.ads.googlead" +
      "s.v1.resources.BillingSetup\"7\202\323\344\223\0021\022//v1" +
      "/{resource_name=customers/*/billingSetup" +
      "s/*}\022\316\001\n\022MutateBillingSetup\022;.google.ads" +
      ".googleads.v1.services.MutateBillingSetu" +
      "pRequest\032<.google.ads.googleads.v1.servi" +
      "ces.MutateBillingSetupResponse\"=\202\323\344\223\0027\"2" +
      "/v1/customers/{customer_id=*}/billingSet" +
      "ups:mutate:\001*B\377\001\n$com.google.ads.googlea" +
      "ds.v1.servicesB\030BillingSetupServiceProto" +
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
          com.google.ads.googleads.v1.resources.BillingSetupProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetBillingSetupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetBillingSetupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetBillingSetupRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateBillingSetupRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateBillingSetupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateBillingSetupRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", });
    internal_static_google_ads_googleads_v1_services_BillingSetupOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_BillingSetupOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_BillingSetupOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateBillingSetupResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateBillingSetupResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateBillingSetupResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v1_services_MutateBillingSetupResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateBillingSetupResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateBillingSetupResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.BillingSetupProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
