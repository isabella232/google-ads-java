// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/user_list_error.proto

package com.google.ads.googleads.v1.errors;

public final class UserListErrorProto {
  private UserListErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_errors_UserListErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_errors_UserListErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v1/errors/user_li" +
      "st_error.proto\022\036google.ads.googleads.v1." +
      "errors\032\034google/api/annotations.proto\"\354\007\n" +
      "\021UserListErrorEnum\"\326\007\n\rUserListError\022\017\n\013" +
      "UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\0227\n3EXTERNAL_R" +
      "EMARKETING_USER_LIST_MUTATE_NOT_SUPPORTE" +
      "D\020\002\022\032\n\026CONCRETE_TYPE_REQUIRED\020\003\022\037\n\033CONVE" +
      "RSION_TYPE_ID_REQUIRED\020\004\022\036\n\032DUPLICATE_CO" +
      "NVERSION_TYPES\020\005\022\033\n\027INVALID_CONVERSION_T" +
      "YPE\020\006\022\027\n\023INVALID_DESCRIPTION\020\007\022\020\n\014INVALI" +
      "D_NAME\020\010\022\020\n\014INVALID_TYPE\020\t\0224\n0CAN_NOT_AD" +
      "D_LOGICAL_LIST_AS_LOGICAL_LIST_OPERAND\020\n" +
      "\022*\n&INVALID_USER_LIST_LOGICAL_RULE_OPERA" +
      "ND\020\013\022\025\n\021NAME_ALREADY_USED\020\014\022%\n!NEW_CONVE" +
      "RSION_TYPE_NAME_REQUIRED\020\r\022%\n!CONVERSION" +
      "_TYPE_NAME_ALREADY_USED\020\016\022\036\n\032OWNERSHIP_R" +
      "EQUIRED_FOR_SET\020\017\022\"\n\036USER_LIST_MUTATE_NO" +
      "T_SUPPORTED\020\020\022\020\n\014INVALID_RULE\020\021\022\026\n\022INVAL" +
      "ID_DATE_RANGE\020\033\022%\n!CAN_NOT_MUTATE_SENSIT" +
      "IVE_USERLIST\020\034\022\037\n\033MAX_NUM_RULEBASED_USER" +
      "LISTS\020\035\022\'\n#CANNOT_MODIFY_BILLABLE_RECORD" +
      "_COUNT\020\036\022\022\n\016APP_ID_NOT_SET\020\037\022-\n)USERLIST" +
      "_NAME_IS_RESERVED_FOR_SYSTEM_LIST\020 \0226\n2A" +
      "DVERTISER_NOT_WHITELISTED_FOR_USING_UPLO" +
      "ADED_DATA\020!\022\036\n\032RULE_TYPE_IS_NOT_SUPPORTE" +
      "D\020\"\022:\n6CAN_NOT_ADD_A_SIMILAR_USERLIST_AS" +
      "_LOGICAL_LIST_OPERAND\020#\022:\n6CAN_NOT_MIX_C" +
      "RM_BASED_IN_LOGICAL_LIST_WITH_OTHER_LIST" +
      "S\020$B\355\001\n\"com.google.ads.googleads.v1.erro" +
      "rsB\022UserListErrorProtoP\001ZDgoogle.golang." +
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
    internal_static_google_ads_googleads_v1_errors_UserListErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_errors_UserListErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_errors_UserListErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
