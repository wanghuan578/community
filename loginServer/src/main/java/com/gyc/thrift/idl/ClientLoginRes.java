package com.gyc.thrift.idl;
/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-08-07")
public class ClientLoginRes implements org.apache.thrift.TBase<ClientLoginRes, ClientLoginRes._Fields>, java.io.Serializable, Cloneable, Comparable<ClientLoginRes> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClientLoginRes");

  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("error_code", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("error_text", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("user_info", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SESSION_TICKET_FIELD_DESC = new org.apache.thrift.protocol.TField("session_ticket", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ROOM_GATE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("room_gate_info", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClientLoginResStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClientLoginResTupleSchemeFactory();

  public short error_code; // required
  public java.lang.String error_text; // required
  public java.lang.String user_info; // required
  public java.lang.String session_ticket; // required
  public java.util.List<ServiceInfo> room_gate_info; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR_CODE((short)1, "error_code"),
    ERROR_TEXT((short)2, "error_text"),
    USER_INFO((short)3, "user_info"),
    SESSION_TICKET((short)4, "session_ticket"),
    ROOM_GATE_INFO((short)5, "room_gate_info");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ERROR_CODE
          return ERROR_CODE;
        case 2: // ERROR_TEXT
          return ERROR_TEXT;
        case 3: // USER_INFO
          return USER_INFO;
        case 4: // SESSION_TICKET
          return SESSION_TICKET;
        case 5: // ROOM_GATE_INFO
          return ROOM_GATE_INFO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ERROR_CODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("error_code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.ERROR_TEXT, new org.apache.thrift.meta_data.FieldMetaData("error_text", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_INFO, new org.apache.thrift.meta_data.FieldMetaData("user_info", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SESSION_TICKET, new org.apache.thrift.meta_data.FieldMetaData("session_ticket", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROOM_GATE_INFO, new org.apache.thrift.meta_data.FieldMetaData("room_gate_info", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ServiceInfo.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClientLoginRes.class, metaDataMap);
  }

  public ClientLoginRes() {
  }

  public ClientLoginRes(
    short error_code,
    java.lang.String error_text,
    java.lang.String user_info,
    java.lang.String session_ticket,
    java.util.List<ServiceInfo> room_gate_info)
  {
    this();
    this.error_code = error_code;
    setError_codeIsSet(true);
    this.error_text = error_text;
    this.user_info = user_info;
    this.session_ticket = session_ticket;
    this.room_gate_info = room_gate_info;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClientLoginRes(ClientLoginRes other) {
    __isset_bitfield = other.__isset_bitfield;
    this.error_code = other.error_code;
    if (other.isSetError_text()) {
      this.error_text = other.error_text;
    }
    if (other.isSetUser_info()) {
      this.user_info = other.user_info;
    }
    if (other.isSetSession_ticket()) {
      this.session_ticket = other.session_ticket;
    }
    if (other.isSetRoom_gate_info()) {
      java.util.List<ServiceInfo> __this__room_gate_info = new java.util.ArrayList<ServiceInfo>(other.room_gate_info.size());
      for (ServiceInfo other_element : other.room_gate_info) {
        __this__room_gate_info.add(new ServiceInfo(other_element));
      }
      this.room_gate_info = __this__room_gate_info;
    }
  }

  public ClientLoginRes deepCopy() {
    return new ClientLoginRes(this);
  }

  @Override
  public void clear() {
    setError_codeIsSet(false);
    this.error_code = 0;
    this.error_text = null;
    this.user_info = null;
    this.session_ticket = null;
    this.room_gate_info = null;
  }

  public short getError_code() {
    return this.error_code;
  }

  public ClientLoginRes setError_code(short error_code) {
    this.error_code = error_code;
    setError_codeIsSet(true);
    return this;
  }

  public void unsetError_code() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ERROR_CODE_ISSET_ID);
  }

  /** Returns true if field error_code is set (has been assigned a value) and false otherwise */
  public boolean isSetError_code() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ERROR_CODE_ISSET_ID);
  }

  public void setError_codeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ERROR_CODE_ISSET_ID, value);
  }

  public java.lang.String getError_text() {
    return this.error_text;
  }

  public ClientLoginRes setError_text(java.lang.String error_text) {
    this.error_text = error_text;
    return this;
  }

  public void unsetError_text() {
    this.error_text = null;
  }

  /** Returns true if field error_text is set (has been assigned a value) and false otherwise */
  public boolean isSetError_text() {
    return this.error_text != null;
  }

  public void setError_textIsSet(boolean value) {
    if (!value) {
      this.error_text = null;
    }
  }

  public java.lang.String getUser_info() {
    return this.user_info;
  }

  public ClientLoginRes setUser_info(java.lang.String user_info) {
    this.user_info = user_info;
    return this;
  }

  public void unsetUser_info() {
    this.user_info = null;
  }

  /** Returns true if field user_info is set (has been assigned a value) and false otherwise */
  public boolean isSetUser_info() {
    return this.user_info != null;
  }

  public void setUser_infoIsSet(boolean value) {
    if (!value) {
      this.user_info = null;
    }
  }

  public java.lang.String getSession_ticket() {
    return this.session_ticket;
  }

  public ClientLoginRes setSession_ticket(java.lang.String session_ticket) {
    this.session_ticket = session_ticket;
    return this;
  }

  public void unsetSession_ticket() {
    this.session_ticket = null;
  }

  /** Returns true if field session_ticket is set (has been assigned a value) and false otherwise */
  public boolean isSetSession_ticket() {
    return this.session_ticket != null;
  }

  public void setSession_ticketIsSet(boolean value) {
    if (!value) {
      this.session_ticket = null;
    }
  }

  public int getRoom_gate_infoSize() {
    return (this.room_gate_info == null) ? 0 : this.room_gate_info.size();
  }

  public java.util.Iterator<ServiceInfo> getRoom_gate_infoIterator() {
    return (this.room_gate_info == null) ? null : this.room_gate_info.iterator();
  }

  public void addToRoom_gate_info(ServiceInfo elem) {
    if (this.room_gate_info == null) {
      this.room_gate_info = new java.util.ArrayList<ServiceInfo>();
    }
    this.room_gate_info.add(elem);
  }

  public java.util.List<ServiceInfo> getRoom_gate_info() {
    return this.room_gate_info;
  }

  public ClientLoginRes setRoom_gate_info(java.util.List<ServiceInfo> room_gate_info) {
    this.room_gate_info = room_gate_info;
    return this;
  }

  public void unsetRoom_gate_info() {
    this.room_gate_info = null;
  }

  /** Returns true if field room_gate_info is set (has been assigned a value) and false otherwise */
  public boolean isSetRoom_gate_info() {
    return this.room_gate_info != null;
  }

  public void setRoom_gate_infoIsSet(boolean value) {
    if (!value) {
      this.room_gate_info = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ERROR_CODE:
      if (value == null) {
        unsetError_code();
      } else {
        setError_code((java.lang.Short)value);
      }
      break;

    case ERROR_TEXT:
      if (value == null) {
        unsetError_text();
      } else {
        setError_text((java.lang.String)value);
      }
      break;

    case USER_INFO:
      if (value == null) {
        unsetUser_info();
      } else {
        setUser_info((java.lang.String)value);
      }
      break;

    case SESSION_TICKET:
      if (value == null) {
        unsetSession_ticket();
      } else {
        setSession_ticket((java.lang.String)value);
      }
      break;

    case ROOM_GATE_INFO:
      if (value == null) {
        unsetRoom_gate_info();
      } else {
        setRoom_gate_info((java.util.List<ServiceInfo>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_CODE:
      return getError_code();

    case ERROR_TEXT:
      return getError_text();

    case USER_INFO:
      return getUser_info();

    case SESSION_TICKET:
      return getSession_ticket();

    case ROOM_GATE_INFO:
      return getRoom_gate_info();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ERROR_CODE:
      return isSetError_code();
    case ERROR_TEXT:
      return isSetError_text();
    case USER_INFO:
      return isSetUser_info();
    case SESSION_TICKET:
      return isSetSession_ticket();
    case ROOM_GATE_INFO:
      return isSetRoom_gate_info();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ClientLoginRes)
      return this.equals((ClientLoginRes)that);
    return false;
  }

  public boolean equals(ClientLoginRes that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_error_code = true;
    boolean that_present_error_code = true;
    if (this_present_error_code || that_present_error_code) {
      if (!(this_present_error_code && that_present_error_code))
        return false;
      if (this.error_code != that.error_code)
        return false;
    }

    boolean this_present_error_text = true && this.isSetError_text();
    boolean that_present_error_text = true && that.isSetError_text();
    if (this_present_error_text || that_present_error_text) {
      if (!(this_present_error_text && that_present_error_text))
        return false;
      if (!this.error_text.equals(that.error_text))
        return false;
    }

    boolean this_present_user_info = true && this.isSetUser_info();
    boolean that_present_user_info = true && that.isSetUser_info();
    if (this_present_user_info || that_present_user_info) {
      if (!(this_present_user_info && that_present_user_info))
        return false;
      if (!this.user_info.equals(that.user_info))
        return false;
    }

    boolean this_present_session_ticket = true && this.isSetSession_ticket();
    boolean that_present_session_ticket = true && that.isSetSession_ticket();
    if (this_present_session_ticket || that_present_session_ticket) {
      if (!(this_present_session_ticket && that_present_session_ticket))
        return false;
      if (!this.session_ticket.equals(that.session_ticket))
        return false;
    }

    boolean this_present_room_gate_info = true && this.isSetRoom_gate_info();
    boolean that_present_room_gate_info = true && that.isSetRoom_gate_info();
    if (this_present_room_gate_info || that_present_room_gate_info) {
      if (!(this_present_room_gate_info && that_present_room_gate_info))
        return false;
      if (!this.room_gate_info.equals(that.room_gate_info))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + error_code;

    hashCode = hashCode * 8191 + ((isSetError_text()) ? 131071 : 524287);
    if (isSetError_text())
      hashCode = hashCode * 8191 + error_text.hashCode();

    hashCode = hashCode * 8191 + ((isSetUser_info()) ? 131071 : 524287);
    if (isSetUser_info())
      hashCode = hashCode * 8191 + user_info.hashCode();

    hashCode = hashCode * 8191 + ((isSetSession_ticket()) ? 131071 : 524287);
    if (isSetSession_ticket())
      hashCode = hashCode * 8191 + session_ticket.hashCode();

    hashCode = hashCode * 8191 + ((isSetRoom_gate_info()) ? 131071 : 524287);
    if (isSetRoom_gate_info())
      hashCode = hashCode * 8191 + room_gate_info.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ClientLoginRes other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetError_code()).compareTo(other.isSetError_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError_code()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error_code, other.error_code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetError_text()).compareTo(other.isSetError_text());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError_text()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error_text, other.error_text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUser_info()).compareTo(other.isSetUser_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser_info()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_info, other.user_info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSession_ticket()).compareTo(other.isSetSession_ticket());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSession_ticket()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.session_ticket, other.session_ticket);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRoom_gate_info()).compareTo(other.isSetRoom_gate_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoom_gate_info()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.room_gate_info, other.room_gate_info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ClientLoginRes(");
    boolean first = true;

    sb.append("error_code:");
    sb.append(this.error_code);
    first = false;
    if (!first) sb.append(", ");
    sb.append("error_text:");
    if (this.error_text == null) {
      sb.append("null");
    } else {
      sb.append(this.error_text);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("user_info:");
    if (this.user_info == null) {
      sb.append("null");
    } else {
      sb.append(this.user_info);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("session_ticket:");
    if (this.session_ticket == null) {
      sb.append("null");
    } else {
      sb.append(this.session_ticket);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("room_gate_info:");
    if (this.room_gate_info == null) {
      sb.append("null");
    } else {
      sb.append(this.room_gate_info);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ClientLoginResStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClientLoginResStandardScheme getScheme() {
      return new ClientLoginResStandardScheme();
    }
  }

  private static class ClientLoginResStandardScheme extends org.apache.thrift.scheme.StandardScheme<ClientLoginRes> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClientLoginRes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.error_code = iprot.readI16();
              struct.setError_codeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERROR_TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.error_text = iprot.readString();
              struct.setError_textIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USER_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user_info = iprot.readString();
              struct.setUser_infoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SESSION_TICKET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.session_ticket = iprot.readString();
              struct.setSession_ticketIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ROOM_GATE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.room_gate_info = new java.util.ArrayList<ServiceInfo>(_list0.size);
                ServiceInfo _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new ServiceInfo();
                  _elem1.read(iprot);
                  struct.room_gate_info.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setRoom_gate_infoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClientLoginRes struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
      oprot.writeI16(struct.error_code);
      oprot.writeFieldEnd();
      if (struct.error_text != null) {
        oprot.writeFieldBegin(ERROR_TEXT_FIELD_DESC);
        oprot.writeString(struct.error_text);
        oprot.writeFieldEnd();
      }
      if (struct.user_info != null) {
        oprot.writeFieldBegin(USER_INFO_FIELD_DESC);
        oprot.writeString(struct.user_info);
        oprot.writeFieldEnd();
      }
      if (struct.session_ticket != null) {
        oprot.writeFieldBegin(SESSION_TICKET_FIELD_DESC);
        oprot.writeString(struct.session_ticket);
        oprot.writeFieldEnd();
      }
      if (struct.room_gate_info != null) {
        oprot.writeFieldBegin(ROOM_GATE_INFO_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.room_gate_info.size()));
          for (ServiceInfo _iter3 : struct.room_gate_info)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClientLoginResTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClientLoginResTupleScheme getScheme() {
      return new ClientLoginResTupleScheme();
    }
  }

  private static class ClientLoginResTupleScheme extends org.apache.thrift.scheme.TupleScheme<ClientLoginRes> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClientLoginRes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetError_code()) {
        optionals.set(0);
      }
      if (struct.isSetError_text()) {
        optionals.set(1);
      }
      if (struct.isSetUser_info()) {
        optionals.set(2);
      }
      if (struct.isSetSession_ticket()) {
        optionals.set(3);
      }
      if (struct.isSetRoom_gate_info()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetError_code()) {
        oprot.writeI16(struct.error_code);
      }
      if (struct.isSetError_text()) {
        oprot.writeString(struct.error_text);
      }
      if (struct.isSetUser_info()) {
        oprot.writeString(struct.user_info);
      }
      if (struct.isSetSession_ticket()) {
        oprot.writeString(struct.session_ticket);
      }
      if (struct.isSetRoom_gate_info()) {
        {
          oprot.writeI32(struct.room_gate_info.size());
          for (ServiceInfo _iter4 : struct.room_gate_info)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClientLoginRes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.error_code = iprot.readI16();
        struct.setError_codeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.error_text = iprot.readString();
        struct.setError_textIsSet(true);
      }
      if (incoming.get(2)) {
        struct.user_info = iprot.readString();
        struct.setUser_infoIsSet(true);
      }
      if (incoming.get(3)) {
        struct.session_ticket = iprot.readString();
        struct.setSession_ticketIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.room_gate_info = new java.util.ArrayList<ServiceInfo>(_list5.size);
          ServiceInfo _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new ServiceInfo();
            _elem6.read(iprot);
            struct.room_gate_info.add(_elem6);
          }
        }
        struct.setRoom_gate_infoIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

