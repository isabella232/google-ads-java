// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/customer_service.proto

package com.google.ads.googleads.v1.services;

public interface MutateCustomerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.services.MutateCustomerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the customer being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * The ID of the customer being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The operation to perform on the customer
   * </pre>
   *
   * <code>.google.ads.googleads.v1.services.CustomerOperation operation = 4;</code>
   */
  boolean hasOperation();
  /**
   * <pre>
   * The operation to perform on the customer
   * </pre>
   *
   * <code>.google.ads.googleads.v1.services.CustomerOperation operation = 4;</code>
   */
  com.google.ads.googleads.v1.services.CustomerOperation getOperation();
  /**
   * <pre>
   * The operation to perform on the customer
   * </pre>
   *
   * <code>.google.ads.googleads.v1.services.CustomerOperation operation = 4;</code>
   */
  com.google.ads.googleads.v1.services.CustomerOperationOrBuilder getOperationOrBuilder();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 5;</code>
   */
  boolean getValidateOnly();
}
