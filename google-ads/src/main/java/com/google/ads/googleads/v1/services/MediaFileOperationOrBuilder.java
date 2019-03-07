// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/media_file_service.proto

package com.google.ads.googleads.v1.services;

public interface MediaFileOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.services.MediaFileOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new media file.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.MediaFile create = 1;</code>
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new media file.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.MediaFile create = 1;</code>
   */
  com.google.ads.googleads.v1.resources.MediaFile getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new media file.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.resources.MediaFile create = 1;</code>
   */
  com.google.ads.googleads.v1.resources.MediaFileOrBuilder getCreateOrBuilder();

  public com.google.ads.googleads.v1.services.MediaFileOperation.OperationCase getOperationCase();
}
