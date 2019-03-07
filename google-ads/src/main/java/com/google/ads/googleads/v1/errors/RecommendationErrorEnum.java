// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/recommendation_error.proto

package com.google.ads.googleads.v1.errors;

/**
 * <pre>
 * Container for enum describing possible errors from applying a recommendation.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.errors.RecommendationErrorEnum}
 */
public  final class RecommendationErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.errors.RecommendationErrorEnum)
    RecommendationErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecommendationErrorEnum.newBuilder() to construct.
  private RecommendationErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecommendationErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecommendationErrorEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.errors.RecommendationErrorProto.internal_static_google_ads_googleads_v1_errors_RecommendationErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.errors.RecommendationErrorProto.internal_static_google_ads_googleads_v1_errors_RecommendationErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.errors.RecommendationErrorEnum.class, com.google.ads.googleads.v1.errors.RecommendationErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible errors from applying a recommendation.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v1.errors.RecommendationErrorEnum.RecommendationError}
   */
  public enum RecommendationError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The specified budget amount is too low e.g. lower than minimum currency
     * unit or lower than ad group minimum cost-per-click.
     * </pre>
     *
     * <code>BUDGET_AMOUNT_TOO_SMALL = 2;</code>
     */
    BUDGET_AMOUNT_TOO_SMALL(2),
    /**
     * <pre>
     * The specified budget amount is too large.
     * </pre>
     *
     * <code>BUDGET_AMOUNT_TOO_LARGE = 3;</code>
     */
    BUDGET_AMOUNT_TOO_LARGE(3),
    /**
     * <pre>
     * The specified budget amount is not a valid amount. e.g. not a multiple
     * of minimum currency unit.
     * </pre>
     *
     * <code>INVALID_BUDGET_AMOUNT = 4;</code>
     */
    INVALID_BUDGET_AMOUNT(4),
    /**
     * <pre>
     * The specified keyword or ad violates ad policy.
     * </pre>
     *
     * <code>POLICY_ERROR = 5;</code>
     */
    POLICY_ERROR(5),
    /**
     * <pre>
     * The specified bid amount is not valid. e.g. too many fractional digits,
     * or negative amount.
     * </pre>
     *
     * <code>INVALID_BID_AMOUNT = 6;</code>
     */
    INVALID_BID_AMOUNT(6),
    /**
     * <pre>
     * The number of keywords in ad group have reached the maximum allowed.
     * </pre>
     *
     * <code>ADGROUP_KEYWORD_LIMIT = 7;</code>
     */
    ADGROUP_KEYWORD_LIMIT(7),
    /**
     * <pre>
     * The recommendation requested to apply has already been applied.
     * </pre>
     *
     * <code>RECOMMENDATION_ALREADY_APPLIED = 8;</code>
     */
    RECOMMENDATION_ALREADY_APPLIED(8),
    /**
     * <pre>
     * The recommendation requested to apply has been invalidated.
     * </pre>
     *
     * <code>RECOMMENDATION_INVALIDATED = 9;</code>
     */
    RECOMMENDATION_INVALIDATED(9),
    /**
     * <pre>
     * The number of operations in a single request exceeds the maximum allowed.
     * </pre>
     *
     * <code>TOO_MANY_OPERATIONS = 10;</code>
     */
    TOO_MANY_OPERATIONS(10),
    /**
     * <pre>
     * There are no operations in the request.
     * </pre>
     *
     * <code>NO_OPERATIONS = 11;</code>
     */
    NO_OPERATIONS(11),
    /**
     * <pre>
     * Operations with multiple recommendation types are not supported when
     * partial failure mode is not enabled.
     * </pre>
     *
     * <code>DIFFERENT_TYPES_NOT_SUPPORTED = 12;</code>
     */
    DIFFERENT_TYPES_NOT_SUPPORTED(12),
    /**
     * <pre>
     * Request contains multiple operations with the same resource_name.
     * </pre>
     *
     * <code>DUPLICATE_RESOURCE_NAME = 13;</code>
     */
    DUPLICATE_RESOURCE_NAME(13),
    /**
     * <pre>
     * The recommendation requested to dismiss has already been dismissed.
     * </pre>
     *
     * <code>RECOMMENDATION_ALREADY_DISMISSED = 14;</code>
     */
    RECOMMENDATION_ALREADY_DISMISSED(14),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The specified budget amount is too low e.g. lower than minimum currency
     * unit or lower than ad group minimum cost-per-click.
     * </pre>
     *
     * <code>BUDGET_AMOUNT_TOO_SMALL = 2;</code>
     */
    public static final int BUDGET_AMOUNT_TOO_SMALL_VALUE = 2;
    /**
     * <pre>
     * The specified budget amount is too large.
     * </pre>
     *
     * <code>BUDGET_AMOUNT_TOO_LARGE = 3;</code>
     */
    public static final int BUDGET_AMOUNT_TOO_LARGE_VALUE = 3;
    /**
     * <pre>
     * The specified budget amount is not a valid amount. e.g. not a multiple
     * of minimum currency unit.
     * </pre>
     *
     * <code>INVALID_BUDGET_AMOUNT = 4;</code>
     */
    public static final int INVALID_BUDGET_AMOUNT_VALUE = 4;
    /**
     * <pre>
     * The specified keyword or ad violates ad policy.
     * </pre>
     *
     * <code>POLICY_ERROR = 5;</code>
     */
    public static final int POLICY_ERROR_VALUE = 5;
    /**
     * <pre>
     * The specified bid amount is not valid. e.g. too many fractional digits,
     * or negative amount.
     * </pre>
     *
     * <code>INVALID_BID_AMOUNT = 6;</code>
     */
    public static final int INVALID_BID_AMOUNT_VALUE = 6;
    /**
     * <pre>
     * The number of keywords in ad group have reached the maximum allowed.
     * </pre>
     *
     * <code>ADGROUP_KEYWORD_LIMIT = 7;</code>
     */
    public static final int ADGROUP_KEYWORD_LIMIT_VALUE = 7;
    /**
     * <pre>
     * The recommendation requested to apply has already been applied.
     * </pre>
     *
     * <code>RECOMMENDATION_ALREADY_APPLIED = 8;</code>
     */
    public static final int RECOMMENDATION_ALREADY_APPLIED_VALUE = 8;
    /**
     * <pre>
     * The recommendation requested to apply has been invalidated.
     * </pre>
     *
     * <code>RECOMMENDATION_INVALIDATED = 9;</code>
     */
    public static final int RECOMMENDATION_INVALIDATED_VALUE = 9;
    /**
     * <pre>
     * The number of operations in a single request exceeds the maximum allowed.
     * </pre>
     *
     * <code>TOO_MANY_OPERATIONS = 10;</code>
     */
    public static final int TOO_MANY_OPERATIONS_VALUE = 10;
    /**
     * <pre>
     * There are no operations in the request.
     * </pre>
     *
     * <code>NO_OPERATIONS = 11;</code>
     */
    public static final int NO_OPERATIONS_VALUE = 11;
    /**
     * <pre>
     * Operations with multiple recommendation types are not supported when
     * partial failure mode is not enabled.
     * </pre>
     *
     * <code>DIFFERENT_TYPES_NOT_SUPPORTED = 12;</code>
     */
    public static final int DIFFERENT_TYPES_NOT_SUPPORTED_VALUE = 12;
    /**
     * <pre>
     * Request contains multiple operations with the same resource_name.
     * </pre>
     *
     * <code>DUPLICATE_RESOURCE_NAME = 13;</code>
     */
    public static final int DUPLICATE_RESOURCE_NAME_VALUE = 13;
    /**
     * <pre>
     * The recommendation requested to dismiss has already been dismissed.
     * </pre>
     *
     * <code>RECOMMENDATION_ALREADY_DISMISSED = 14;</code>
     */
    public static final int RECOMMENDATION_ALREADY_DISMISSED_VALUE = 14;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RecommendationError valueOf(int value) {
      return forNumber(value);
    }

    public static RecommendationError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return BUDGET_AMOUNT_TOO_SMALL;
        case 3: return BUDGET_AMOUNT_TOO_LARGE;
        case 4: return INVALID_BUDGET_AMOUNT;
        case 5: return POLICY_ERROR;
        case 6: return INVALID_BID_AMOUNT;
        case 7: return ADGROUP_KEYWORD_LIMIT;
        case 8: return RECOMMENDATION_ALREADY_APPLIED;
        case 9: return RECOMMENDATION_INVALIDATED;
        case 10: return TOO_MANY_OPERATIONS;
        case 11: return NO_OPERATIONS;
        case 12: return DIFFERENT_TYPES_NOT_SUPPORTED;
        case 13: return DUPLICATE_RESOURCE_NAME;
        case 14: return RECOMMENDATION_ALREADY_DISMISSED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RecommendationError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RecommendationError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RecommendationError>() {
            public RecommendationError findValueByNumber(int number) {
              return RecommendationError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.RecommendationErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final RecommendationError[] VALUES = values();

    public static RecommendationError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RecommendationError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v1.errors.RecommendationErrorEnum.RecommendationError)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v1.errors.RecommendationErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.errors.RecommendationErrorEnum other = (com.google.ads.googleads.v1.errors.RecommendationErrorEnum) obj;

    boolean result = true;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.errors.RecommendationErrorEnum prototype) {
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
   * Container for enum describing possible errors from applying a recommendation.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.errors.RecommendationErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.errors.RecommendationErrorEnum)
      com.google.ads.googleads.v1.errors.RecommendationErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.errors.RecommendationErrorProto.internal_static_google_ads_googleads_v1_errors_RecommendationErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.errors.RecommendationErrorProto.internal_static_google_ads_googleads_v1_errors_RecommendationErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.errors.RecommendationErrorEnum.class, com.google.ads.googleads.v1.errors.RecommendationErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.errors.RecommendationErrorEnum.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.errors.RecommendationErrorProto.internal_static_google_ads_googleads_v1_errors_RecommendationErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.RecommendationErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.errors.RecommendationErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.RecommendationErrorEnum build() {
      com.google.ads.googleads.v1.errors.RecommendationErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.errors.RecommendationErrorEnum buildPartial() {
      com.google.ads.googleads.v1.errors.RecommendationErrorEnum result = new com.google.ads.googleads.v1.errors.RecommendationErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v1.errors.RecommendationErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v1.errors.RecommendationErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.errors.RecommendationErrorEnum other) {
      if (other == com.google.ads.googleads.v1.errors.RecommendationErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v1.errors.RecommendationErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.errors.RecommendationErrorEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.errors.RecommendationErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.errors.RecommendationErrorEnum)
  private static final com.google.ads.googleads.v1.errors.RecommendationErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.errors.RecommendationErrorEnum();
  }

  public static com.google.ads.googleads.v1.errors.RecommendationErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecommendationErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<RecommendationErrorEnum>() {
    @java.lang.Override
    public RecommendationErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecommendationErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecommendationErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecommendationErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.errors.RecommendationErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

