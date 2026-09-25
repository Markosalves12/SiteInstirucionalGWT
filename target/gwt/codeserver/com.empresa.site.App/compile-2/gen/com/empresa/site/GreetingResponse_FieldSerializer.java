package com.empresa.site;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GreetingResponse_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getGreeting(com.empresa.site.GreetingResponse instance) /*-{
    return instance.@com.empresa.site.GreetingResponse::greeting;
  }-*/;
  
  private static native void setGreeting(com.empresa.site.GreetingResponse instance, java.lang.String value) 
  /*-{
    instance.@com.empresa.site.GreetingResponse::greeting = value;
  }-*/;
  
  private static native java.lang.String getServerInfo(com.empresa.site.GreetingResponse instance) /*-{
    return instance.@com.empresa.site.GreetingResponse::serverInfo;
  }-*/;
  
  private static native void setServerInfo(com.empresa.site.GreetingResponse instance, java.lang.String value) 
  /*-{
    instance.@com.empresa.site.GreetingResponse::serverInfo = value;
  }-*/;
  
  private static native java.lang.String getUserAgent(com.empresa.site.GreetingResponse instance) /*-{
    return instance.@com.empresa.site.GreetingResponse::userAgent;
  }-*/;
  
  private static native void setUserAgent(com.empresa.site.GreetingResponse instance, java.lang.String value) 
  /*-{
    instance.@com.empresa.site.GreetingResponse::userAgent = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.empresa.site.GreetingResponse instance) throws SerializationException {
    setGreeting(instance, streamReader.readString());
    setServerInfo(instance, streamReader.readString());
    setUserAgent(instance, streamReader.readString());
    
  }
  
  public static com.empresa.site.GreetingResponse instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.empresa.site.GreetingResponse();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.empresa.site.GreetingResponse instance) throws SerializationException {
    streamWriter.writeString(getGreeting(instance));
    streamWriter.writeString(getServerInfo(instance));
    streamWriter.writeString(getUserAgent(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.empresa.site.GreetingResponse_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.empresa.site.GreetingResponse_FieldSerializer.deserialize(reader, (com.empresa.site.GreetingResponse)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.empresa.site.GreetingResponse_FieldSerializer.serialize(writer, (com.empresa.site.GreetingResponse)object);
  }
  
}
