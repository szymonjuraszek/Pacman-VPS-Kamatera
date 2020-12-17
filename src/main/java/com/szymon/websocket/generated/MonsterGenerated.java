// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monsterProto.proto

package com.szymon.websocket.generated;

public final class MonsterGenerated {
  private MonsterGenerated() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MonsterProtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MonsterProto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>int32 position_x = 2;</code>
     * @return The positionX.
     */
    int getPositionX();

    /**
     * <code>int32 position_y = 3;</code>
     * @return The positionY.
     */
    int getPositionY();

    /**
     * <code>string previous_direction = 4;</code>
     * @return The previousDirection.
     */
    java.lang.String getPreviousDirection();
    /**
     * <code>string previous_direction = 4;</code>
     * @return The bytes for previousDirection.
     */
    com.google.protobuf.ByteString
        getPreviousDirectionBytes();

    /**
     * <code>int32 timestamp = 5;</code>
     * @return The timestamp.
     */
    int getTimestamp();
  }
  /**
   * Protobuf type {@code MonsterProto}
   */
  public static final class MonsterProto extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MonsterProto)
      MonsterProtoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MonsterProto.newBuilder() to construct.
    private MonsterProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MonsterProto() {
      previousDirection_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MonsterProto();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MonsterProto(
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
            case 8: {

              id_ = input.readInt32();
              break;
            }
            case 16: {

              positionX_ = input.readInt32();
              break;
            }
            case 24: {

              positionY_ = input.readInt32();
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              previousDirection_ = s;
              break;
            }
            case 40: {

              timestamp_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return com.szymon.websocket.generated.MonsterGenerated.internal_static_MonsterProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.szymon.websocket.generated.MonsterGenerated.internal_static_MonsterProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.szymon.websocket.generated.MonsterGenerated.MonsterProto.class, com.szymon.websocket.generated.MonsterGenerated.MonsterProto.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int POSITION_X_FIELD_NUMBER = 2;
    private int positionX_;
    /**
     * <code>int32 position_x = 2;</code>
     * @return The positionX.
     */
    @java.lang.Override
    public int getPositionX() {
      return positionX_;
    }

    public static final int POSITION_Y_FIELD_NUMBER = 3;
    private int positionY_;
    /**
     * <code>int32 position_y = 3;</code>
     * @return The positionY.
     */
    @java.lang.Override
    public int getPositionY() {
      return positionY_;
    }

    public static final int PREVIOUS_DIRECTION_FIELD_NUMBER = 4;
    private volatile java.lang.Object previousDirection_;
    /**
     * <code>string previous_direction = 4;</code>
     * @return The previousDirection.
     */
    @java.lang.Override
    public java.lang.String getPreviousDirection() {
      java.lang.Object ref = previousDirection_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        previousDirection_ = s;
        return s;
      }
    }
    /**
     * <code>string previous_direction = 4;</code>
     * @return The bytes for previousDirection.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPreviousDirectionBytes() {
      java.lang.Object ref = previousDirection_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        previousDirection_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    private int timestamp_;
    /**
     * <code>int32 timestamp = 5;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public int getTimestamp() {
      return timestamp_;
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
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (positionX_ != 0) {
        output.writeInt32(2, positionX_);
      }
      if (positionY_ != 0) {
        output.writeInt32(3, positionY_);
      }
      if (!getPreviousDirectionBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, previousDirection_);
      }
      if (timestamp_ != 0) {
        output.writeInt32(5, timestamp_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (positionX_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, positionX_);
      }
      if (positionY_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, positionY_);
      }
      if (!getPreviousDirectionBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, previousDirection_);
      }
      if (timestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, timestamp_);
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
      if (!(obj instanceof com.szymon.websocket.generated.MonsterGenerated.MonsterProto)) {
        return super.equals(obj);
      }
      com.szymon.websocket.generated.MonsterGenerated.MonsterProto other = (com.szymon.websocket.generated.MonsterGenerated.MonsterProto) obj;

      if (getId()
          != other.getId()) return false;
      if (getPositionX()
          != other.getPositionX()) return false;
      if (getPositionY()
          != other.getPositionY()) return false;
      if (!getPreviousDirection()
          .equals(other.getPreviousDirection())) return false;
      if (getTimestamp()
          != other.getTimestamp()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + POSITION_X_FIELD_NUMBER;
      hash = (53 * hash) + getPositionX();
      hash = (37 * hash) + POSITION_Y_FIELD_NUMBER;
      hash = (53 * hash) + getPositionY();
      hash = (37 * hash) + PREVIOUS_DIRECTION_FIELD_NUMBER;
      hash = (53 * hash) + getPreviousDirection().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto parseFrom(
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
    public static Builder newBuilder(com.szymon.websocket.generated.MonsterGenerated.MonsterProto prototype) {
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
     * Protobuf type {@code MonsterProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MonsterProto)
        com.szymon.websocket.generated.MonsterGenerated.MonsterProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.szymon.websocket.generated.MonsterGenerated.internal_static_MonsterProto_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.szymon.websocket.generated.MonsterGenerated.internal_static_MonsterProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.szymon.websocket.generated.MonsterGenerated.MonsterProto.class, com.szymon.websocket.generated.MonsterGenerated.MonsterProto.Builder.class);
      }

      // Construct using com.szymon.websocket.generated.MonsterGenerated.MonsterProto.newBuilder()
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
        id_ = 0;

        positionX_ = 0;

        positionY_ = 0;

        previousDirection_ = "";

        timestamp_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.szymon.websocket.generated.MonsterGenerated.internal_static_MonsterProto_descriptor;
      }

      @java.lang.Override
      public com.szymon.websocket.generated.MonsterGenerated.MonsterProto getDefaultInstanceForType() {
        return com.szymon.websocket.generated.MonsterGenerated.MonsterProto.getDefaultInstance();
      }

      @java.lang.Override
      public com.szymon.websocket.generated.MonsterGenerated.MonsterProto build() {
        com.szymon.websocket.generated.MonsterGenerated.MonsterProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.szymon.websocket.generated.MonsterGenerated.MonsterProto buildPartial() {
        com.szymon.websocket.generated.MonsterGenerated.MonsterProto result = new com.szymon.websocket.generated.MonsterGenerated.MonsterProto(this);
        result.id_ = id_;
        result.positionX_ = positionX_;
        result.positionY_ = positionY_;
        result.previousDirection_ = previousDirection_;
        result.timestamp_ = timestamp_;
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
        if (other instanceof com.szymon.websocket.generated.MonsterGenerated.MonsterProto) {
          return mergeFrom((com.szymon.websocket.generated.MonsterGenerated.MonsterProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.szymon.websocket.generated.MonsterGenerated.MonsterProto other) {
        if (other == com.szymon.websocket.generated.MonsterGenerated.MonsterProto.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getPositionX() != 0) {
          setPositionX(other.getPositionX());
        }
        if (other.getPositionY() != 0) {
          setPositionY(other.getPositionY());
        }
        if (!other.getPreviousDirection().isEmpty()) {
          previousDirection_ = other.previousDirection_;
          onChanged();
        }
        if (other.getTimestamp() != 0) {
          setTimestamp(other.getTimestamp());
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
        com.szymon.websocket.generated.MonsterGenerated.MonsterProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.szymon.websocket.generated.MonsterGenerated.MonsterProto) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int positionX_ ;
      /**
       * <code>int32 position_x = 2;</code>
       * @return The positionX.
       */
      @java.lang.Override
      public int getPositionX() {
        return positionX_;
      }
      /**
       * <code>int32 position_x = 2;</code>
       * @param value The positionX to set.
       * @return This builder for chaining.
       */
      public Builder setPositionX(int value) {
        
        positionX_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 position_x = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPositionX() {
        
        positionX_ = 0;
        onChanged();
        return this;
      }

      private int positionY_ ;
      /**
       * <code>int32 position_y = 3;</code>
       * @return The positionY.
       */
      @java.lang.Override
      public int getPositionY() {
        return positionY_;
      }
      /**
       * <code>int32 position_y = 3;</code>
       * @param value The positionY to set.
       * @return This builder for chaining.
       */
      public Builder setPositionY(int value) {
        
        positionY_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 position_y = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPositionY() {
        
        positionY_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object previousDirection_ = "";
      /**
       * <code>string previous_direction = 4;</code>
       * @return The previousDirection.
       */
      public java.lang.String getPreviousDirection() {
        java.lang.Object ref = previousDirection_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          previousDirection_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string previous_direction = 4;</code>
       * @return The bytes for previousDirection.
       */
      public com.google.protobuf.ByteString
          getPreviousDirectionBytes() {
        java.lang.Object ref = previousDirection_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          previousDirection_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string previous_direction = 4;</code>
       * @param value The previousDirection to set.
       * @return This builder for chaining.
       */
      public Builder setPreviousDirection(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        previousDirection_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string previous_direction = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPreviousDirection() {
        
        previousDirection_ = getDefaultInstance().getPreviousDirection();
        onChanged();
        return this;
      }
      /**
       * <code>string previous_direction = 4;</code>
       * @param value The bytes for previousDirection to set.
       * @return This builder for chaining.
       */
      public Builder setPreviousDirectionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        previousDirection_ = value;
        onChanged();
        return this;
      }

      private int timestamp_ ;
      /**
       * <code>int32 timestamp = 5;</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public int getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int32 timestamp = 5;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(int value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 timestamp = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MonsterProto)
    }

    // @@protoc_insertion_point(class_scope:MonsterProto)
    private static final com.szymon.websocket.generated.MonsterGenerated.MonsterProto DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.szymon.websocket.generated.MonsterGenerated.MonsterProto();
    }

    public static com.szymon.websocket.generated.MonsterGenerated.MonsterProto getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MonsterProto>
        PARSER = new com.google.protobuf.AbstractParser<MonsterProto>() {
      @java.lang.Override
      public MonsterProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MonsterProto(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MonsterProto> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MonsterProto> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.szymon.websocket.generated.MonsterGenerated.MonsterProto getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MonsterProto_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MonsterProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022monsterProto.proto\"q\n\014MonsterProto\022\n\n\002" +
      "id\030\001 \001(\005\022\022\n\nposition_x\030\002 \001(\005\022\022\n\nposition" +
      "_y\030\003 \001(\005\022\032\n\022previous_direction\030\004 \001(\t\022\021\n\t" +
      "timestamp\030\005 \001(\005B2\n\036com.szymon.websocket." +
      "generatedB\020MonsterGeneratedb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MonsterProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MonsterProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MonsterProto_descriptor,
        new java.lang.String[] { "Id", "PositionX", "PositionY", "PreviousDirection", "Timestamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}