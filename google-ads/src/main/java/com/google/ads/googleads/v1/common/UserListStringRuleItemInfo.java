// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/user_lists.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * A rule item fragment composed of date operation.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.UserListStringRuleItemInfo}
 */
public  final class UserListStringRuleItemInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.UserListStringRuleItemInfo)
    UserListStringRuleItemInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListStringRuleItemInfo.newBuilder() to construct.
  private UserListStringRuleItemInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListStringRuleItemInfo() {
    operator_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserListStringRuleItemInfo(
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
          case 8: {
            int rawValue = input.readEnum();

            operator_ = rawValue;
            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (value_ != null) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_UserListStringRuleItemInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_UserListStringRuleItemInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.UserListStringRuleItemInfo.class, com.google.ads.googleads.v1.common.UserListStringRuleItemInfo.Builder.class);
  }

  public static final int OPERATOR_FIELD_NUMBER = 1;
  private int operator_;
  /**
   * <pre>
   * String comparison operator.
   * This field is required and must be populated when creating a new string
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator operator = 1;</code>
   */
  public int getOperatorValue() {
    return operator_;
  }
  /**
   * <pre>
   * String comparison operator.
   * This field is required and must be populated when creating a new string
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator operator = 1;</code>
   */
  public com.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator getOperator() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator result = com.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator.valueOf(operator_);
    return result == null ? com.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue value_;
  /**
   * <pre>
   * The right hand side of the string rule item. For URLs or referrer URLs,
   * the value can not contain illegal URL chars such as newlines, quotes,
   * tabs, or parentheses. This field is required and must be populated when
   * creating a new string rule item.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 2;</code>
   */
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <pre>
   * The right hand side of the string rule item. For URLs or referrer URLs,
   * the value can not contain illegal URL chars such as newlines, quotes,
   * tabs, or parentheses. This field is required and must be populated when
   * creating a new string rule item.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 2;</code>
   */
  public com.google.protobuf.StringValue getValue() {
    return value_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * The right hand side of the string rule item. For URLs or referrer URLs,
   * the value can not contain illegal URL chars such as newlines, quotes,
   * tabs, or parentheses. This field is required and must be populated when
   * creating a new string rule item.
   * </pre>
   *
   * <code>.google.protobuf.StringValue value = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getValueOrBuilder() {
    return getValue();
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
    if (operator_ != com.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operator_);
    }
    if (value_ != null) {
      output.writeMessage(2, getValue());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operator_ != com.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operator_);
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.UserListStringRuleItemInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.UserListStringRuleItemInfo other = (com.google.ads.googleads.v1.common.UserListStringRuleItemInfo) obj;

    boolean result = true;
    result = result && operator_ == other.operator_;
    result = result && (hasValue() == other.hasValue());
    if (hasValue()) {
      result = result && getValue()
          .equals(other.getValue());
    }
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
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + operator_;
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.UserListStringRuleItemInfo prototype) {
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
   * A rule item fragment composed of date operation.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.UserListStringRuleItemInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.UserListStringRuleItemInfo)
      com.google.ads.googleads.v1.common.UserListStringRuleItemInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_UserListStringRuleItemInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_UserListStringRuleItemInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.UserListStringRuleItemInfo.class, com.google.ads.googleads.v1.common.UserListStringRuleItemInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.UserListStringRuleItemInfo.newBuilder()
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
      operator_ = 0;

      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_UserListStringRuleItemInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.UserListStringRuleItemInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.UserListStringRuleItemInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.UserListStringRuleItemInfo build() {
      com.google.ads.googleads.v1.common.UserListStringRuleItemInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.UserListStringRuleItemInfo buildPartial() {
      com.google.ads.googleads.v1.common.UserListStringRuleItemInfo result = new com.google.ads.googleads.v1.common.UserListStringRuleItemInfo(this);
      result.operator_ = operator_;
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v1.common.UserListStringRuleItemInfo) {
        return mergeFrom((com.google.ads.googleads.v1.common.UserListStringRuleItemInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.UserListStringRuleItemInfo other) {
      if (other == com.google.ads.googleads.v1.common.UserListStringRuleItemInfo.getDefaultInstance()) return this;
      if (other.operator_ != 0) {
        setOperatorValue(other.getOperatorValue());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
      com.google.ads.googleads.v1.common.UserListStringRuleItemInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.UserListStringRuleItemInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int operator_ = 0;
    /**
     * <pre>
     * String comparison operator.
     * This field is required and must be populated when creating a new string
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator operator = 1;</code>
     */
    public int getOperatorValue() {
      return operator_;
    }
    /**
     * <pre>
     * String comparison operator.
     * This field is required and must be populated when creating a new string
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator operator = 1;</code>
     */
    public Builder setOperatorValue(int value) {
      operator_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String comparison operator.
     * This field is required and must be populated when creating a new string
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator operator = 1;</code>
     */
    public com.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator getOperator() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator result = com.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator.valueOf(operator_);
      return result == null ? com.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * String comparison operator.
     * This field is required and must be populated when creating a new string
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator operator = 1;</code>
     */
    public Builder setOperator(com.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String comparison operator.
     * This field is required and must be populated when creating a new string
     * rule item.
     * </pre>
     *
     * <code>.google.ads.googleads.v1.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator operator = 1;</code>
     */
    public Builder clearOperator() {
      
      operator_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue value_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> valueBuilder_;
    /**
     * <pre>
     * The right hand side of the string rule item. For URLs or referrer URLs,
     * the value can not contain illegal URL chars such as newlines, quotes,
     * tabs, or parentheses. This field is required and must be populated when
     * creating a new string rule item.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 2;</code>
     */
    public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     * <pre>
     * The right hand side of the string rule item. For URLs or referrer URLs,
     * the value can not contain illegal URL chars such as newlines, quotes,
     * tabs, or parentheses. This field is required and must be populated when
     * creating a new string rule item.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 2;</code>
     */
    public com.google.protobuf.StringValue getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The right hand side of the string rule item. For URLs or referrer URLs,
     * the value can not contain illegal URL chars such as newlines, quotes,
     * tabs, or parentheses. This field is required and must be populated when
     * creating a new string rule item.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 2;</code>
     */
    public Builder setValue(com.google.protobuf.StringValue value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The right hand side of the string rule item. For URLs or referrer URLs,
     * the value can not contain illegal URL chars such as newlines, quotes,
     * tabs, or parentheses. This field is required and must be populated when
     * creating a new string rule item.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 2;</code>
     */
    public Builder setValue(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The right hand side of the string rule item. For URLs or referrer URLs,
     * the value can not contain illegal URL chars such as newlines, quotes,
     * tabs, or parentheses. This field is required and must be populated when
     * creating a new string rule item.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 2;</code>
     */
    public Builder mergeValue(com.google.protobuf.StringValue value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
            com.google.protobuf.StringValue.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The right hand side of the string rule item. For URLs or referrer URLs,
     * the value can not contain illegal URL chars such as newlines, quotes,
     * tabs, or parentheses. This field is required and must be populated when
     * creating a new string rule item.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 2;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The right hand side of the string rule item. For URLs or referrer URLs,
     * the value can not contain illegal URL chars such as newlines, quotes,
     * tabs, or parentheses. This field is required and must be populated when
     * creating a new string rule item.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getValueBuilder() {
      
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The right hand side of the string rule item. For URLs or referrer URLs,
     * the value can not contain illegal URL chars such as newlines, quotes,
     * tabs, or parentheses. This field is required and must be populated when
     * creating a new string rule item.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : value_;
      }
    }
    /**
     * <pre>
     * The right hand side of the string rule item. For URLs or referrer URLs,
     * the value can not contain illegal URL chars such as newlines, quotes,
     * tabs, or parentheses. This field is required and must be populated when
     * creating a new string rule item.
     * </pre>
     *
     * <code>.google.protobuf.StringValue value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.UserListStringRuleItemInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.UserListStringRuleItemInfo)
  private static final com.google.ads.googleads.v1.common.UserListStringRuleItemInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.UserListStringRuleItemInfo();
  }

  public static com.google.ads.googleads.v1.common.UserListStringRuleItemInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListStringRuleItemInfo>
      PARSER = new com.google.protobuf.AbstractParser<UserListStringRuleItemInfo>() {
    @java.lang.Override
    public UserListStringRuleItemInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserListStringRuleItemInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserListStringRuleItemInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserListStringRuleItemInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.UserListStringRuleItemInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

