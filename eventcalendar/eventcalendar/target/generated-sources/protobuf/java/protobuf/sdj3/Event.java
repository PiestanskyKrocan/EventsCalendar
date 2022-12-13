// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package protobuf.sdj3;

/**
 * Protobuf type {@code Event}
 */
public final class Event extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Event)
    EventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Event.newBuilder() to construct.
  private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Event() {
    eventName_ = "";
    startTime_ = "";
    endTime_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Event();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protobuf.sdj3.Core.internal_static_Event_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protobuf.sdj3.Core.internal_static_Event_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protobuf.sdj3.Event.class, protobuf.sdj3.Event.Builder.class);
  }

  public static final int EVENTNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object eventName_;
  /**
   * <code>string eventName = 1;</code>
   * @return The eventName.
   */
  @java.lang.Override
  public java.lang.String getEventName() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventName_ = s;
      return s;
    }
  }
  /**
   * <code>string eventName = 1;</code>
   * @return The bytes for eventName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventNameBytes() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTTIME_FIELD_NUMBER = 2;
  private volatile java.lang.Object startTime_;
  /**
   * <code>string startTime = 2;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public java.lang.String getStartTime() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startTime_ = s;
      return s;
    }
  }
  /**
   * <code>string startTime = 2;</code>
   * @return The bytes for startTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartTimeBytes() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDTIME_FIELD_NUMBER = 3;
  private volatile java.lang.Object endTime_;
  /**
   * <code>string endTime = 3;</code>
   * @return The endTime.
   */
  @java.lang.Override
  public java.lang.String getEndTime() {
    java.lang.Object ref = endTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endTime_ = s;
      return s;
    }
  }
  /**
   * <code>string endTime = 3;</code>
   * @return The bytes for endTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndTimeBytes() {
    java.lang.Object ref = endTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, eventName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startTime_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, startTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endTime_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, endTime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, eventName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startTime_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, startTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endTime_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, endTime_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof protobuf.sdj3.Event)) {
      return super.equals(obj);
    }
    protobuf.sdj3.Event other = (protobuf.sdj3.Event) obj;

    if (!getEventName()
        .equals(other.getEventName())) return false;
    if (!getStartTime()
        .equals(other.getStartTime())) return false;
    if (!getEndTime()
        .equals(other.getEndTime())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EVENTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getEventName().hashCode();
    hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
    hash = (53 * hash) + getStartTime().hashCode();
    hash = (37 * hash) + ENDTIME_FIELD_NUMBER;
    hash = (53 * hash) + getEndTime().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protobuf.sdj3.Event parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf.sdj3.Event parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf.sdj3.Event parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf.sdj3.Event parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf.sdj3.Event parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf.sdj3.Event parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf.sdj3.Event parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protobuf.sdj3.Event parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protobuf.sdj3.Event parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protobuf.sdj3.Event parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protobuf.sdj3.Event parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protobuf.sdj3.Event parseFrom(
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
  public static Builder newBuilder(protobuf.sdj3.Event prototype) {
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
   * Protobuf type {@code Event}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Event)
      protobuf.sdj3.EventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf.sdj3.Core.internal_static_Event_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf.sdj3.Core.internal_static_Event_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf.sdj3.Event.class, protobuf.sdj3.Event.Builder.class);
    }

    // Construct using protobuf.sdj3.Event.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      eventName_ = "";

      startTime_ = "";

      endTime_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protobuf.sdj3.Core.internal_static_Event_descriptor;
    }

    @java.lang.Override
    public protobuf.sdj3.Event getDefaultInstanceForType() {
      return protobuf.sdj3.Event.getDefaultInstance();
    }

    @java.lang.Override
    public protobuf.sdj3.Event build() {
      protobuf.sdj3.Event result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protobuf.sdj3.Event buildPartial() {
      protobuf.sdj3.Event result = new protobuf.sdj3.Event(this);
      result.eventName_ = eventName_;
      result.startTime_ = startTime_;
      result.endTime_ = endTime_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof protobuf.sdj3.Event) {
        return mergeFrom((protobuf.sdj3.Event)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protobuf.sdj3.Event other) {
      if (other == protobuf.sdj3.Event.getDefaultInstance()) return this;
      if (!other.getEventName().isEmpty()) {
        eventName_ = other.eventName_;
        onChanged();
      }
      if (!other.getStartTime().isEmpty()) {
        startTime_ = other.startTime_;
        onChanged();
      }
      if (!other.getEndTime().isEmpty()) {
        endTime_ = other.endTime_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              eventName_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              startTime_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              endTime_ = input.readStringRequireUtf8();

              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object eventName_ = "";
    /**
     * <code>string eventName = 1;</code>
     * @return The eventName.
     */
    public java.lang.String getEventName() {
      java.lang.Object ref = eventName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string eventName = 1;</code>
     * @return The bytes for eventName.
     */
    public com.google.protobuf.ByteString
        getEventNameBytes() {
      java.lang.Object ref = eventName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string eventName = 1;</code>
     * @param value The eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eventName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string eventName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventName() {
      
      eventName_ = getDefaultInstance().getEventName();
      onChanged();
      return this;
    }
    /**
     * <code>string eventName = 1;</code>
     * @param value The bytes for eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eventName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object startTime_ = "";
    /**
     * <code>string startTime = 2;</code>
     * @return The startTime.
     */
    public java.lang.String getStartTime() {
      java.lang.Object ref = startTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string startTime = 2;</code>
     * @return The bytes for startTime.
     */
    public com.google.protobuf.ByteString
        getStartTimeBytes() {
      java.lang.Object ref = startTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string startTime = 2;</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string startTime = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      
      startTime_ = getDefaultInstance().getStartTime();
      onChanged();
      return this;
    }
    /**
     * <code>string startTime = 2;</code>
     * @param value The bytes for startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      startTime_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endTime_ = "";
    /**
     * <code>string endTime = 3;</code>
     * @return The endTime.
     */
    public java.lang.String getEndTime() {
      java.lang.Object ref = endTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string endTime = 3;</code>
     * @return The bytes for endTime.
     */
    public com.google.protobuf.ByteString
        getEndTimeBytes() {
      java.lang.Object ref = endTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string endTime = 3;</code>
     * @param value The endTime to set.
     * @return This builder for chaining.
     */
    public Builder setEndTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string endTime = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTime() {
      
      endTime_ = getDefaultInstance().getEndTime();
      onChanged();
      return this;
    }
    /**
     * <code>string endTime = 3;</code>
     * @param value The bytes for endTime to set.
     * @return This builder for chaining.
     */
    public Builder setEndTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endTime_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Event)
  }

  // @@protoc_insertion_point(class_scope:Event)
  private static final protobuf.sdj3.Event DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protobuf.sdj3.Event();
  }

  public static protobuf.sdj3.Event getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Event>
      PARSER = new com.google.protobuf.AbstractParser<Event>() {
    @java.lang.Override
    public Event parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Event> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Event> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protobuf.sdj3.Event getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
