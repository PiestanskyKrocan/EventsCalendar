// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Event.proto

package sdj.project.eventcalendar.protobuf;

public final class EventOuterClass {
  private EventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sdj_project_eventcalendar_protobuf_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sdj_project_eventcalendar_protobuf_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sdj_project_eventcalendar_protobuf_JoinedEvents_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sdj_project_eventcalendar_protobuf_JoinedEvents_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sdj_project_eventcalendar_protobuf_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sdj_project_eventcalendar_protobuf_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Event.proto\022\"sdj.project.eventcalendar" +
      ".protobuf\032\nUser.proto\"\251\001\n\005Event\022\020\n\010event" +
      "_id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\020\n\010bodytext\030\003 \001(" +
      "\t\022\021\n\tstartTime\030\004 \001(\t\022\017\n\007endTime\030\005 \001(\t\022\017\n" +
      "\007address\030\006 \001(\t\0229\n\007creator\030\007 \001(\0132(.sdj.pr" +
      "oject.eventcalendar.protobuf.User\"1\n\014Joi" +
      "nedEvents\022\017\n\007user_id\030\001 \001(\003\022\020\n\010event_id\030\002" +
      " \001(\003\"\007\n\005Empty2\333\n\n\020GRPCEventService\022s\n\030RP" +
      "CGetListOfUsersinEvent\022).sdj.project.eve" +
      "ntcalendar.protobuf.Event\032(.sdj.project." +
      "eventcalendar.protobuf.User\"\0000\001\022t\n\031RPCGe" +
      "tListofCreatedEvents\022(.sdj.project.event" +
      "calendar.protobuf.User\032).sdj.project.eve" +
      "ntcalendar.protobuf.Event\"\0000\001\022s\n\030RPCGetL" +
      "istOfJoinedEvents\022(.sdj.project.eventcal" +
      "endar.protobuf.User\032).sdj.project.eventc" +
      "alendar.protobuf.Event\"\0000\001\022m\n\022RPCGetList" +
      "OfEvents\022(.sdj.project.eventcalendar.pro" +
      "tobuf.User\032).sdj.project.eventcalendar.p" +
      "rotobuf.Event\"\0000\001\022r\n\021RPCAddUserToEvent\0220" +
      ".sdj.project.eventcalendar.protobuf.Join" +
      "edEvents\032).sdj.project.eventcalendar.pro" +
      "tobuf.Empty\"\000\022w\n\026RPCRemoveUserFromEvent\022" +
      "0.sdj.project.eventcalendar.protobuf.Joi" +
      "nedEvents\032).sdj.project.eventcalendar.pr" +
      "otobuf.Empty\"\000\022r\n\021RPCAddEventToUser\0220.sd" +
      "j.project.eventcalendar.protobuf.JoinedE" +
      "vents\032).sdj.project.eventcalendar.protob" +
      "uf.Empty\"\000\022w\n\026RPCRemoveEventFromUser\0220.s" +
      "dj.project.eventcalendar.protobuf.Joined" +
      "Events\032).sdj.project.eventcalendar.proto" +
      "buf.Empty\"\000\022h\n\020RPCfindEventById\022).sdj.pr" +
      "oject.eventcalendar.protobuf.Event\032).sdj" +
      ".project.eventcalendar.protobuf.Event\022d\n" +
      "\014RPCsaveEvent\022).sdj.project.eventcalenda" +
      "r.protobuf.Event\032).sdj.project.eventcale" +
      "ndar.protobuf.Event\022f\n\016RPCupdateEvent\022)." +
      "sdj.project.eventcalendar.protobuf.Event" +
      "\032).sdj.project.eventcalendar.protobuf.Ev" +
      "ent\022f\n\016RPCdeleteEvent\022).sdj.project.even" +
      "tcalendar.protobuf.Event\032).sdj.project.e" +
      "ventcalendar.protobuf.EventB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          sdj.project.eventcalendar.protobuf.UserOuterClass.getDescriptor(),
        });
    internal_static_sdj_project_eventcalendar_protobuf_Event_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sdj_project_eventcalendar_protobuf_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sdj_project_eventcalendar_protobuf_Event_descriptor,
        new java.lang.String[] { "EventId", "Name", "Bodytext", "StartTime", "EndTime", "Address", "Creator", });
    internal_static_sdj_project_eventcalendar_protobuf_JoinedEvents_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sdj_project_eventcalendar_protobuf_JoinedEvents_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sdj_project_eventcalendar_protobuf_JoinedEvents_descriptor,
        new java.lang.String[] { "UserId", "EventId", });
    internal_static_sdj_project_eventcalendar_protobuf_Empty_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sdj_project_eventcalendar_protobuf_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sdj_project_eventcalendar_protobuf_Empty_descriptor,
        new java.lang.String[] { });
    sdj.project.eventcalendar.protobuf.UserOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}