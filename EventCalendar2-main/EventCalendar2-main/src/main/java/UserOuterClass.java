// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

public final class UserOuterClass {
  private UserOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nUser.proto\"o\n\004User\022\017\n\007user_id\030\001 \001(\005\022\014\n" +
      "\004name\030\002 \001(\t\022\020\n\010password\030\003 \001(\t\022\016\n\006gender\030" +
      "\004 \001(\t\022\025\n\rdate_of_birth\030\005 \001(\t\022\017\n\007adrdess\030" +
      "\006 \001(\t2\215\001\n\017GRPCUserService\022\037\n\017RPCfindUser" +
      "ById\022\005.User\032\005.User\022\033\n\013RPCsaveUser\022\005.User" +
      "\032\005.User\022\035\n\rRPCupdateUser\022\005.User\032\005.User\022\035" +
      "\n\rRPCdeleteUser\022\005.User\032\005.UserB\002P\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_User_descriptor,
        new java.lang.String[] { "UserId", "Name", "Password", "Gender", "DateOfBirth", "Adrdess", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
