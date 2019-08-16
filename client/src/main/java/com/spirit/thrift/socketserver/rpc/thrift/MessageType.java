package com.spirit.thrift.socketserver.rpc.thrift;

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum MessageType implements org.apache.thrift.TEnum {
  MT_CLIENT_REGISTER_REQ(500),
  MT_CLIENT_REGISTER_RES(501),
  MT_CLIENT_PASSWORD_LOGIN_REQ(502),
  MT_CLIENT_LOGIN_RES(503),
  MT_CLIENT_LOGOUT_REQ(504),
  MT_CLIENT_LOGOUT_RES(505),
  MT_UPDATE_AVAILABLE_RES(506);

  private final int value;

  private MessageType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static MessageType findByValue(int value) { 
    switch (value) {
      case 500:
        return MT_CLIENT_REGISTER_REQ;
      case 501:
        return MT_CLIENT_REGISTER_RES;
      case 502:
        return MT_CLIENT_PASSWORD_LOGIN_REQ;
      case 503:
        return MT_CLIENT_LOGIN_RES;
      case 504:
        return MT_CLIENT_LOGOUT_REQ;
      case 505:
        return MT_CLIENT_LOGOUT_RES;
      case 506:
        return MT_UPDATE_AVAILABLE_RES;
      default:
        return null;
    }
  }
}
