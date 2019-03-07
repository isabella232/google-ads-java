// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/value.proto

package com.google.ads.googleads.v1.common;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A boolean.
   * </pre>
   *
   * <code>bool boolean_value = 1;</code>
   */
  boolean getBooleanValue();

  /**
   * <pre>
   * An int64.
   * </pre>
   *
   * <code>int64 int64_value = 2;</code>
   */
  long getInt64Value();

  /**
   * <pre>
   * A float.
   * </pre>
   *
   * <code>float float_value = 3;</code>
   */
  float getFloatValue();

  /**
   * <pre>
   * A double.
   * </pre>
   *
   * <code>double double_value = 4;</code>
   */
  double getDoubleValue();

  /**
   * <pre>
   * A string.
   * </pre>
   *
   * <code>string string_value = 5;</code>
   */
  java.lang.String getStringValue();
  /**
   * <pre>
   * A string.
   * </pre>
   *
   * <code>string string_value = 5;</code>
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  public com.google.ads.googleads.v1.common.Value.ValueCase getValueCase();
}
