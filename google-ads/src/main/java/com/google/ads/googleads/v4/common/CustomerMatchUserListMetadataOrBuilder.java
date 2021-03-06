// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/offline_user_data.proto

package com.google.ads.googleads.v4.common;

public interface CustomerMatchUserListMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.common.CustomerMatchUserListMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of remarketing list to update data.
   * Required for job of CUSTOMER_MATCH_USER_LIST type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_list = 1;</code>
   * @return Whether the userList field is set.
   */
  boolean hasUserList();
  /**
   * <pre>
   * The resource name of remarketing list to update data.
   * Required for job of CUSTOMER_MATCH_USER_LIST type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_list = 1;</code>
   * @return The userList.
   */
  com.google.protobuf.StringValue getUserList();
  /**
   * <pre>
   * The resource name of remarketing list to update data.
   * Required for job of CUSTOMER_MATCH_USER_LIST type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_list = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getUserListOrBuilder();
}
