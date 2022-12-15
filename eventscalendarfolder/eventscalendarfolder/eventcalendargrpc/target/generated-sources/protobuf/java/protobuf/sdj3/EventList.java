// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Core.proto

package protobuf.sdj3;

/**
 * Protobuf type {@code EventList}
 */
public final class EventList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EventList)
    EventListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventList.newBuilder() to construct.
  private EventList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventList() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protobuf.sdj3.Core.internal_static_EventList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protobuf.sdj3.Core.internal_static_EventList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protobuf.sdj3.EventList.class, protobuf.sdj3.EventList.Builder.class);
  }

  public static final int EVENT_FIELD_NUMBER = 1;
  private protobuf.sdj3.Event event_;
  /**
   * <code>.Event event = 1;</code>
   * @return Whether the event field is set.
   */
  @java.lang.Override
  public boolean hasEvent() {
    return event_ != null;
  }
  /**
   * <code>.Event event = 1;</code>
   * @return The event.
   */
  @java.lang.Override
  public protobuf.sdj3.Event getEvent() {
    return event_ == null ? protobuf.sdj3.Event.getDefaultInstance() : event_;
  }
  /**
   * <code>.Event event = 1;</code>
   */
  @java.lang.Override
  public protobuf.sdj3.EventOrBuilder getEventOrBuilder() {
    return getEvent();
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
    if (event_ != null) {
      output.writeMessage(1, getEvent());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (event_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEvent());
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
    if (!(obj instanceof protobuf.sdj3.EventList)) {
      return super.equals(obj);
    }
    protobuf.sdj3.EventList other = (protobuf.sdj3.EventList) obj;

    if (hasEvent() != other.hasEvent()) return false;
    if (hasEvent()) {
      if (!getEvent()
          .equals(other.getEvent())) return false;
    }
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
    if (hasEvent()) {
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getEvent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protobuf.sdj3.EventList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf.sdj3.EventList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf.sdj3.EventList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf.sdj3.EventList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf.sdj3.EventList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf.sdj3.EventList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf.sdj3.EventList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protobuf.sdj3.EventList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protobuf.sdj3.EventList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protobuf.sdj3.EventList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protobuf.sdj3.EventList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protobuf.sdj3.EventList parseFrom(
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
  public static Builder newBuilder(protobuf.sdj3.EventList prototype) {
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
   * Protobuf type {@code EventList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EventList)
      protobuf.sdj3.EventListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf.sdj3.Core.internal_static_EventList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf.sdj3.Core.internal_static_EventList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf.sdj3.EventList.class, protobuf.sdj3.EventList.Builder.class);
    }

    // Construct using protobuf.sdj3.EventList.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (eventBuilder_ == null) {
        event_ = null;
      } else {
        event_ = null;
        eventBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protobuf.sdj3.Core.internal_static_EventList_descriptor;
    }

    @java.lang.Override
    public protobuf.sdj3.EventList getDefaultInstanceForType() {
      return protobuf.sdj3.EventList.getDefaultInstance();
    }

    @java.lang.Override
    public protobuf.sdj3.EventList build() {
      protobuf.sdj3.EventList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public protobuf.sdj3.EventList buildPartial() {
      protobuf.sdj3.EventList result = new protobuf.sdj3.EventList(this);
      if (eventBuilder_ == null) {
        result.event_ = event_;
      } else {
        result.event_ = eventBuilder_.build();
      }
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
      if (other instanceof protobuf.sdj3.EventList) {
        return mergeFrom((protobuf.sdj3.EventList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protobuf.sdj3.EventList other) {
      if (other == protobuf.sdj3.EventList.getDefaultInstance()) return this;
      if (other.hasEvent()) {
        mergeEvent(other.getEvent());
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
              input.readMessage(
                  getEventFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
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

    private protobuf.sdj3.Event event_;
    private com.google.protobuf.SingleFieldBuilderV3<
        protobuf.sdj3.Event, protobuf.sdj3.Event.Builder, protobuf.sdj3.EventOrBuilder> eventBuilder_;
    /**
     * <code>.Event event = 1;</code>
     * @return Whether the event field is set.
     */
    public boolean hasEvent() {
      return eventBuilder_ != null || event_ != null;
    }
    /**
     * <code>.Event event = 1;</code>
     * @return The event.
     */
    public protobuf.sdj3.Event getEvent() {
      if (eventBuilder_ == null) {
        return event_ == null ? protobuf.sdj3.Event.getDefaultInstance() : event_;
      } else {
        return eventBuilder_.getMessage();
      }
    }
    /**
     * <code>.Event event = 1;</code>
     */
    public Builder setEvent(protobuf.sdj3.Event value) {
      if (eventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
        onChanged();
      } else {
        eventBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Event event = 1;</code>
     */
    public Builder setEvent(
        protobuf.sdj3.Event.Builder builderForValue) {
      if (eventBuilder_ == null) {
        event_ = builderForValue.build();
        onChanged();
      } else {
        eventBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Event event = 1;</code>
     */
    public Builder mergeEvent(protobuf.sdj3.Event value) {
      if (eventBuilder_ == null) {
        if (event_ != null) {
          event_ =
            protobuf.sdj3.Event.newBuilder(event_).mergeFrom(value).buildPartial();
        } else {
          event_ = value;
        }
        onChanged();
      } else {
        eventBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Event event = 1;</code>
     */
    public Builder clearEvent() {
      if (eventBuilder_ == null) {
        event_ = null;
        onChanged();
      } else {
        event_ = null;
        eventBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Event event = 1;</code>
     */
    public protobuf.sdj3.Event.Builder getEventBuilder() {
      
      onChanged();
      return getEventFieldBuilder().getBuilder();
    }
    /**
     * <code>.Event event = 1;</code>
     */
    public protobuf.sdj3.EventOrBuilder getEventOrBuilder() {
      if (eventBuilder_ != null) {
        return eventBuilder_.getMessageOrBuilder();
      } else {
        return event_ == null ?
            protobuf.sdj3.Event.getDefaultInstance() : event_;
      }
    }
    /**
     * <code>.Event event = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protobuf.sdj3.Event, protobuf.sdj3.Event.Builder, protobuf.sdj3.EventOrBuilder> 
        getEventFieldBuilder() {
      if (eventBuilder_ == null) {
        eventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protobuf.sdj3.Event, protobuf.sdj3.Event.Builder, protobuf.sdj3.EventOrBuilder>(
                getEvent(),
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      return eventBuilder_;
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


    // @@protoc_insertion_point(builder_scope:EventList)
  }

  // @@protoc_insertion_point(class_scope:EventList)
  private static final protobuf.sdj3.EventList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protobuf.sdj3.EventList();
  }

  public static protobuf.sdj3.EventList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventList>
      PARSER = new com.google.protobuf.AbstractParser<EventList>() {
    @java.lang.Override
    public EventList parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public protobuf.sdj3.EventList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

