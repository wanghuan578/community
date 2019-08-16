package com.spirit.thrift.socketserver.rpc.thrift;
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-08-07")
public class ClientLoginResUserInfo implements org.apache.thrift.TBase<ClientLoginResUserInfo, ClientLoginResUserInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ClientLoginResUserInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClientLoginResUserInfo");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("user_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("user_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField NICK_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("nick_name", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField AVATAR_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("avatar_url", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField CLIENT_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("client_ip", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClientLoginResUserInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClientLoginResUserInfoTupleSchemeFactory();

  public long user_id; // required
  public java.lang.String user_name; // required
  public java.lang.String email; // required
  public java.lang.String nick_name; // required
  public java.lang.String avatar_url; // required
  public java.lang.String client_ip; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "user_id"),
    USER_NAME((short)2, "user_name"),
    EMAIL((short)3, "email"),
    NICK_NAME((short)4, "nick_name"),
    AVATAR_URL((short)5, "avatar_url"),
    CLIENT_IP((short)6, "client_ip");

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
        case 1: // USER_ID
          return USER_ID;
        case 2: // USER_NAME
          return USER_NAME;
        case 3: // EMAIL
          return EMAIL;
        case 4: // NICK_NAME
          return NICK_NAME;
        case 5: // AVATAR_URL
          return AVATAR_URL;
        case 6: // CLIENT_IP
          return CLIENT_IP;
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
  private static final int __USER_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("user_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("user_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NICK_NAME, new org.apache.thrift.meta_data.FieldMetaData("nick_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AVATAR_URL, new org.apache.thrift.meta_data.FieldMetaData("avatar_url", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLIENT_IP, new org.apache.thrift.meta_data.FieldMetaData("client_ip", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClientLoginResUserInfo.class, metaDataMap);
  }

  public ClientLoginResUserInfo() {
  }

  public ClientLoginResUserInfo(
    long user_id,
    java.lang.String user_name,
    java.lang.String email,
    java.lang.String nick_name,
    java.lang.String avatar_url,
    java.lang.String client_ip)
  {
    this();
    this.user_id = user_id;
    setUser_idIsSet(true);
    this.user_name = user_name;
    this.email = email;
    this.nick_name = nick_name;
    this.avatar_url = avatar_url;
    this.client_ip = client_ip;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClientLoginResUserInfo(ClientLoginResUserInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.user_id = other.user_id;
    if (other.isSetUser_name()) {
      this.user_name = other.user_name;
    }
    if (other.isSetEmail()) {
      this.email = other.email;
    }
    if (other.isSetNick_name()) {
      this.nick_name = other.nick_name;
    }
    if (other.isSetAvatar_url()) {
      this.avatar_url = other.avatar_url;
    }
    if (other.isSetClient_ip()) {
      this.client_ip = other.client_ip;
    }
  }

  public ClientLoginResUserInfo deepCopy() {
    return new ClientLoginResUserInfo(this);
  }

  @Override
  public void clear() {
    setUser_idIsSet(false);
    this.user_id = 0;
    this.user_name = null;
    this.email = null;
    this.nick_name = null;
    this.avatar_url = null;
    this.client_ip = null;
  }

  public long getUser_id() {
    return this.user_id;
  }

  public ClientLoginResUserInfo setUser_id(long user_id) {
    this.user_id = user_id;
    setUser_idIsSet(true);
    return this;
  }

  public void unsetUser_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USER_ID_ISSET_ID);
  }

  /** Returns true if field user_id is set (has been assigned a value) and false otherwise */
  public boolean isSetUser_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USER_ID_ISSET_ID);
  }

  public void setUser_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USER_ID_ISSET_ID, value);
  }

  public java.lang.String getUser_name() {
    return this.user_name;
  }

  public ClientLoginResUserInfo setUser_name(java.lang.String user_name) {
    this.user_name = user_name;
    return this;
  }

  public void unsetUser_name() {
    this.user_name = null;
  }

  /** Returns true if field user_name is set (has been assigned a value) and false otherwise */
  public boolean isSetUser_name() {
    return this.user_name != null;
  }

  public void setUser_nameIsSet(boolean value) {
    if (!value) {
      this.user_name = null;
    }
  }

  public java.lang.String getEmail() {
    return this.email;
  }

  public ClientLoginResUserInfo setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public java.lang.String getNick_name() {
    return this.nick_name;
  }

  public ClientLoginResUserInfo setNick_name(java.lang.String nick_name) {
    this.nick_name = nick_name;
    return this;
  }

  public void unsetNick_name() {
    this.nick_name = null;
  }

  /** Returns true if field nick_name is set (has been assigned a value) and false otherwise */
  public boolean isSetNick_name() {
    return this.nick_name != null;
  }

  public void setNick_nameIsSet(boolean value) {
    if (!value) {
      this.nick_name = null;
    }
  }

  public java.lang.String getAvatar_url() {
    return this.avatar_url;
  }

  public ClientLoginResUserInfo setAvatar_url(java.lang.String avatar_url) {
    this.avatar_url = avatar_url;
    return this;
  }

  public void unsetAvatar_url() {
    this.avatar_url = null;
  }

  /** Returns true if field avatar_url is set (has been assigned a value) and false otherwise */
  public boolean isSetAvatar_url() {
    return this.avatar_url != null;
  }

  public void setAvatar_urlIsSet(boolean value) {
    if (!value) {
      this.avatar_url = null;
    }
  }

  public java.lang.String getClient_ip() {
    return this.client_ip;
  }

  public ClientLoginResUserInfo setClient_ip(java.lang.String client_ip) {
    this.client_ip = client_ip;
    return this;
  }

  public void unsetClient_ip() {
    this.client_ip = null;
  }

  /** Returns true if field client_ip is set (has been assigned a value) and false otherwise */
  public boolean isSetClient_ip() {
    return this.client_ip != null;
  }

  public void setClient_ipIsSet(boolean value) {
    if (!value) {
      this.client_ip = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUser_id();
      } else {
        setUser_id((java.lang.Long)value);
      }
      break;

    case USER_NAME:
      if (value == null) {
        unsetUser_name();
      } else {
        setUser_name((java.lang.String)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((java.lang.String)value);
      }
      break;

    case NICK_NAME:
      if (value == null) {
        unsetNick_name();
      } else {
        setNick_name((java.lang.String)value);
      }
      break;

    case AVATAR_URL:
      if (value == null) {
        unsetAvatar_url();
      } else {
        setAvatar_url((java.lang.String)value);
      }
      break;

    case CLIENT_IP:
      if (value == null) {
        unsetClient_ip();
      } else {
        setClient_ip((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUser_id();

    case USER_NAME:
      return getUser_name();

    case EMAIL:
      return getEmail();

    case NICK_NAME:
      return getNick_name();

    case AVATAR_URL:
      return getAvatar_url();

    case CLIENT_IP:
      return getClient_ip();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUser_id();
    case USER_NAME:
      return isSetUser_name();
    case EMAIL:
      return isSetEmail();
    case NICK_NAME:
      return isSetNick_name();
    case AVATAR_URL:
      return isSetAvatar_url();
    case CLIENT_IP:
      return isSetClient_ip();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ClientLoginResUserInfo)
      return this.equals((ClientLoginResUserInfo)that);
    return false;
  }

  public boolean equals(ClientLoginResUserInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_user_id = true;
    boolean that_present_user_id = true;
    if (this_present_user_id || that_present_user_id) {
      if (!(this_present_user_id && that_present_user_id))
        return false;
      if (this.user_id != that.user_id)
        return false;
    }

    boolean this_present_user_name = true && this.isSetUser_name();
    boolean that_present_user_name = true && that.isSetUser_name();
    if (this_present_user_name || that_present_user_name) {
      if (!(this_present_user_name && that_present_user_name))
        return false;
      if (!this.user_name.equals(that.user_name))
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    boolean this_present_nick_name = true && this.isSetNick_name();
    boolean that_present_nick_name = true && that.isSetNick_name();
    if (this_present_nick_name || that_present_nick_name) {
      if (!(this_present_nick_name && that_present_nick_name))
        return false;
      if (!this.nick_name.equals(that.nick_name))
        return false;
    }

    boolean this_present_avatar_url = true && this.isSetAvatar_url();
    boolean that_present_avatar_url = true && that.isSetAvatar_url();
    if (this_present_avatar_url || that_present_avatar_url) {
      if (!(this_present_avatar_url && that_present_avatar_url))
        return false;
      if (!this.avatar_url.equals(that.avatar_url))
        return false;
    }

    boolean this_present_client_ip = true && this.isSetClient_ip();
    boolean that_present_client_ip = true && that.isSetClient_ip();
    if (this_present_client_ip || that_present_client_ip) {
      if (!(this_present_client_ip && that_present_client_ip))
        return false;
      if (!this.client_ip.equals(that.client_ip))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(user_id);

    hashCode = hashCode * 8191 + ((isSetUser_name()) ? 131071 : 524287);
    if (isSetUser_name())
      hashCode = hashCode * 8191 + user_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetEmail()) ? 131071 : 524287);
    if (isSetEmail())
      hashCode = hashCode * 8191 + email.hashCode();

    hashCode = hashCode * 8191 + ((isSetNick_name()) ? 131071 : 524287);
    if (isSetNick_name())
      hashCode = hashCode * 8191 + nick_name.hashCode();

    hashCode = hashCode * 8191 + ((isSetAvatar_url()) ? 131071 : 524287);
    if (isSetAvatar_url())
      hashCode = hashCode * 8191 + avatar_url.hashCode();

    hashCode = hashCode * 8191 + ((isSetClient_ip()) ? 131071 : 524287);
    if (isSetClient_ip())
      hashCode = hashCode * 8191 + client_ip.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ClientLoginResUserInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUser_id()).compareTo(other.isSetUser_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_id, other.user_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUser_name()).compareTo(other.isSetUser_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_name, other.user_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, other.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNick_name()).compareTo(other.isSetNick_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNick_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nick_name, other.nick_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAvatar_url()).compareTo(other.isSetAvatar_url());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAvatar_url()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.avatar_url, other.avatar_url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetClient_ip()).compareTo(other.isSetClient_ip());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_ip()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.client_ip, other.client_ip);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ClientLoginResUserInfo(");
    boolean first = true;

    sb.append("user_id:");
    sb.append(this.user_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("user_name:");
    if (this.user_name == null) {
      sb.append("null");
    } else {
      sb.append(this.user_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("email:");
    if (this.email == null) {
      sb.append("null");
    } else {
      sb.append(this.email);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nick_name:");
    if (this.nick_name == null) {
      sb.append("null");
    } else {
      sb.append(this.nick_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("avatar_url:");
    if (this.avatar_url == null) {
      sb.append("null");
    } else {
      sb.append(this.avatar_url);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("client_ip:");
    if (this.client_ip == null) {
      sb.append("null");
    } else {
      sb.append(this.client_ip);
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

  private static class ClientLoginResUserInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClientLoginResUserInfoStandardScheme getScheme() {
      return new ClientLoginResUserInfoStandardScheme();
    }
  }

  private static class ClientLoginResUserInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ClientLoginResUserInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClientLoginResUserInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.user_id = iprot.readI64();
              struct.setUser_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user_name = iprot.readString();
              struct.setUser_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NICK_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nick_name = iprot.readString();
              struct.setNick_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AVATAR_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.avatar_url = iprot.readString();
              struct.setAvatar_urlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CLIENT_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.client_ip = iprot.readString();
              struct.setClient_ipIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClientLoginResUserInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI64(struct.user_id);
      oprot.writeFieldEnd();
      if (struct.user_name != null) {
        oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
        oprot.writeString(struct.user_name);
        oprot.writeFieldEnd();
      }
      if (struct.email != null) {
        oprot.writeFieldBegin(EMAIL_FIELD_DESC);
        oprot.writeString(struct.email);
        oprot.writeFieldEnd();
      }
      if (struct.nick_name != null) {
        oprot.writeFieldBegin(NICK_NAME_FIELD_DESC);
        oprot.writeString(struct.nick_name);
        oprot.writeFieldEnd();
      }
      if (struct.avatar_url != null) {
        oprot.writeFieldBegin(AVATAR_URL_FIELD_DESC);
        oprot.writeString(struct.avatar_url);
        oprot.writeFieldEnd();
      }
      if (struct.client_ip != null) {
        oprot.writeFieldBegin(CLIENT_IP_FIELD_DESC);
        oprot.writeString(struct.client_ip);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClientLoginResUserInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClientLoginResUserInfoTupleScheme getScheme() {
      return new ClientLoginResUserInfoTupleScheme();
    }
  }

  private static class ClientLoginResUserInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ClientLoginResUserInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClientLoginResUserInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUser_id()) {
        optionals.set(0);
      }
      if (struct.isSetUser_name()) {
        optionals.set(1);
      }
      if (struct.isSetEmail()) {
        optionals.set(2);
      }
      if (struct.isSetNick_name()) {
        optionals.set(3);
      }
      if (struct.isSetAvatar_url()) {
        optionals.set(4);
      }
      if (struct.isSetClient_ip()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetUser_id()) {
        oprot.writeI64(struct.user_id);
      }
      if (struct.isSetUser_name()) {
        oprot.writeString(struct.user_name);
      }
      if (struct.isSetEmail()) {
        oprot.writeString(struct.email);
      }
      if (struct.isSetNick_name()) {
        oprot.writeString(struct.nick_name);
      }
      if (struct.isSetAvatar_url()) {
        oprot.writeString(struct.avatar_url);
      }
      if (struct.isSetClient_ip()) {
        oprot.writeString(struct.client_ip);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClientLoginResUserInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.user_id = iprot.readI64();
        struct.setUser_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.user_name = iprot.readString();
        struct.setUser_nameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.email = iprot.readString();
        struct.setEmailIsSet(true);
      }
      if (incoming.get(3)) {
        struct.nick_name = iprot.readString();
        struct.setNick_nameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.avatar_url = iprot.readString();
        struct.setAvatar_urlIsSet(true);
      }
      if (incoming.get(5)) {
        struct.client_ip = iprot.readString();
        struct.setClient_ipIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

