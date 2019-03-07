// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/custom_interest_service.proto

package com.google.ads.googleads.v1.services;

/**
 * <pre>
 * Response message for custom interest mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.services.MutateCustomInterestsResponse}
 */
public  final class MutateCustomInterestsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.services.MutateCustomInterestsResponse)
    MutateCustomInterestsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCustomInterestsResponse.newBuilder() to construct.
  private MutateCustomInterestsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCustomInterestsResponse() {
    results_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateCustomInterestsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              results_ = new java.util.ArrayList<com.google.ads.googleads.v1.services.MutateCustomInterestResult>();
              mutable_bitField0_ |= 0x00000001;
            }
            results_.add(
                input.readMessage(com.google.ads.googleads.v1.services.MutateCustomInterestResult.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        results_ = java.util.Collections.unmodifiableList(results_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.services.CustomInterestServiceProto.internal_static_google_ads_googleads_v1_services_MutateCustomInterestsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.services.CustomInterestServiceProto.internal_static_google_ads_googleads_v1_services_MutateCustomInterestsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.services.MutateCustomInterestsResponse.class, com.google.ads.googleads.v1.services.MutateCustomInterestsResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.ads.googleads.v1.services.MutateCustomInterestResult> results_;
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
   */
  public java.util.List<com.google.ads.googleads.v1.services.MutateCustomInterestResult> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
   */
  public java.util.List<? extends com.google.ads.googleads.v1.services.MutateCustomInterestResultOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
   */
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
   */
  public com.google.ads.googleads.v1.services.MutateCustomInterestResult getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
   */
  public com.google.ads.googleads.v1.services.MutateCustomInterestResultOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(2, results_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, results_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v1.services.MutateCustomInterestsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.services.MutateCustomInterestsResponse other = (com.google.ads.googleads.v1.services.MutateCustomInterestsResponse) obj;

    boolean result = true;
    result = result && getResultsList()
        .equals(other.getResultsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v1.services.MutateCustomInterestsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Response message for custom interest mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.services.MutateCustomInterestsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.services.MutateCustomInterestsResponse)
      com.google.ads.googleads.v1.services.MutateCustomInterestsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.services.CustomInterestServiceProto.internal_static_google_ads_googleads_v1_services_MutateCustomInterestsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.services.CustomInterestServiceProto.internal_static_google_ads_googleads_v1_services_MutateCustomInterestsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.services.MutateCustomInterestsResponse.class, com.google.ads.googleads.v1.services.MutateCustomInterestsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.services.MutateCustomInterestsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getResultsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.services.CustomInterestServiceProto.internal_static_google_ads_googleads_v1_services_MutateCustomInterestsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.services.MutateCustomInterestsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.services.MutateCustomInterestsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.services.MutateCustomInterestsResponse build() {
      com.google.ads.googleads.v1.services.MutateCustomInterestsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.services.MutateCustomInterestsResponse buildPartial() {
      com.google.ads.googleads.v1.services.MutateCustomInterestsResponse result = new com.google.ads.googleads.v1.services.MutateCustomInterestsResponse(this);
      int from_bitField0_ = bitField0_;
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v1.services.MutateCustomInterestsResponse) {
        return mergeFrom((com.google.ads.googleads.v1.services.MutateCustomInterestsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.services.MutateCustomInterestsResponse other) {
      if (other == com.google.ads.googleads.v1.services.MutateCustomInterestsResponse.getDefaultInstance()) return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultsFieldBuilder() : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v1.services.MutateCustomInterestsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.services.MutateCustomInterestsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v1.services.MutateCustomInterestResult> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        results_ = new java.util.ArrayList<com.google.ads.googleads.v1.services.MutateCustomInterestResult>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v1.services.MutateCustomInterestResult, com.google.ads.googleads.v1.services.MutateCustomInterestResult.Builder, com.google.ads.googleads.v1.services.MutateCustomInterestResultOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v1.services.MutateCustomInterestResult> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public com.google.ads.googleads.v1.services.MutateCustomInterestResult getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public Builder setResults(
        int index, com.google.ads.googleads.v1.services.MutateCustomInterestResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public Builder setResults(
        int index, com.google.ads.googleads.v1.services.MutateCustomInterestResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public Builder addResults(com.google.ads.googleads.v1.services.MutateCustomInterestResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public Builder addResults(
        int index, com.google.ads.googleads.v1.services.MutateCustomInterestResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public Builder addResults(
        com.google.ads.googleads.v1.services.MutateCustomInterestResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public Builder addResults(
        int index, com.google.ads.googleads.v1.services.MutateCustomInterestResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.google.ads.googleads.v1.services.MutateCustomInterestResult> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public com.google.ads.googleads.v1.services.MutateCustomInterestResult.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public com.google.ads.googleads.v1.services.MutateCustomInterestResultOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v1.services.MutateCustomInterestResultOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public com.google.ads.googleads.v1.services.MutateCustomInterestResult.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          com.google.ads.googleads.v1.services.MutateCustomInterestResult.getDefaultInstance());
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public com.google.ads.googleads.v1.services.MutateCustomInterestResult.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v1.services.MutateCustomInterestResult.getDefaultInstance());
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.services.MutateCustomInterestResult results = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v1.services.MutateCustomInterestResult.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v1.services.MutateCustomInterestResult, com.google.ads.googleads.v1.services.MutateCustomInterestResult.Builder, com.google.ads.googleads.v1.services.MutateCustomInterestResultOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v1.services.MutateCustomInterestResult, com.google.ads.googleads.v1.services.MutateCustomInterestResult.Builder, com.google.ads.googleads.v1.services.MutateCustomInterestResultOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.services.MutateCustomInterestsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.services.MutateCustomInterestsResponse)
  private static final com.google.ads.googleads.v1.services.MutateCustomInterestsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.services.MutateCustomInterestsResponse();
  }

  public static com.google.ads.googleads.v1.services.MutateCustomInterestsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCustomInterestsResponse>
      PARSER = new com.google.protobuf.AbstractParser<MutateCustomInterestsResponse>() {
    @java.lang.Override
    public MutateCustomInterestsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateCustomInterestsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateCustomInterestsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCustomInterestsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.services.MutateCustomInterestsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

