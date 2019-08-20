package com.spirit.thrift.socketserver.rpc.thrift;

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-08-19")
public class ClientPasswordLoginReqChecksum implements org.apache.thrift.TBase<ClientPasswordLoginReqChecksum, ClientPasswordLoginReqChecksum._Fields>, java.io.Serializable, Cloneable, Comparable<ClientPasswordLoginReqChecksum> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ClientPasswordLoginReqChecksum");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("user_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CLIENT_RANDOM_FIELD_DESC = new org.apache.thrift.protocol.TField("client_random", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField SERVER_RANDOM_FIELD_DESC = new org.apache.thrift.protocol.TField("server_random", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClientPasswordLoginReqChecksumStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClientPasswordLoginReqChecksumTupleSchemeFactory();

  public long user_id; // required
  public String password; // required
  public long client_random; // required
  public long server_random; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "user_id"),
    PASSWORD((short)2, "password"),
    CLIENT_RANDOM((short)3, "client_random"),
    SERVER_RANDOM((short)4, "server_random");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

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
        case 2: // PASSWORD
          return PASSWORD;
        case 3: // CLIENT_RANDOM
          return CLIENT_RANDOM;
        case 4: // SERVER_RANDOM
          return SERVER_RANDOM;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __USER_ID_ISSET_ID = 0;
  private static final int __CLIENT_RANDOM_ISSET_ID = 1;
  private static final int __SERVER_RANDOM_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("user_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLIENT_RANDOM, new org.apache.thrift.meta_data.FieldMetaData("client_random", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SERVER_RANDOM, new org.apache.thrift.meta_data.FieldMetaData("server_random", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ClientPasswordLoginReqChecksum.class, metaDataMap);
  }

  public ClientPasswordLoginReqChecksum() {
  }

  public ClientPasswordLoginReqChecksum(
    long user_id,
    String password,
    long client_random,
    long server_random)
  {
    this();
    this.user_id = user_id;
    setUser_idIsSet(true);
    this.password = password;
    this.client_random = client_random;
    setClient_randomIsSet(true);
    this.server_random = server_random;
    setServer_randomIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ClientPasswordLoginReqChecksum(ClientPasswordLoginReqChecksum other) {
    __isset_bitfield = other.__isset_bitfield;
    this.user_id = other.user_id;
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    this.client_random = other.client_random;
    this.server_random = other.server_random;
  }

  public ClientPasswordLoginReqChecksum deepCopy() {
    return new ClientPasswordLoginReqChecksum(this);
  }

  @Override
  public void clear() {
    setUser_idIsSet(false);
    this.user_id = 0;
    this.password = null;
    setClient_randomIsSet(false);
    this.client_random = 0;
    setServer_randomIsSet(false);
    this.server_random = 0;
  }

  public long getUser_id() {
    return this.user_id;
  }

  public ClientPasswordLoginReqChecksum setUser_id(long user_id) {
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

  public String getPassword() {
    return this.password;
  }

  public ClientPasswordLoginReqChecksum setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public long getClient_random() {
    return this.client_random;
  }

  public ClientPasswordLoginReqChecksum setClient_random(long client_random) {
    this.client_random = client_random;
    setClient_randomIsSet(true);
    return this;
  }

  public void unsetClient_random() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CLIENT_RANDOM_ISSET_ID);
  }

  /** Returns true if field client_random is set (has been assigned a value) and false otherwise */
  public boolean isSetClient_random() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CLIENT_RANDOM_ISSET_ID);
  }

  public void setClient_randomIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CLIENT_RANDOM_ISSET_ID, value);
  }

  public long getServer_random() {
    return this.server_random;
  }

  public ClientPasswordLoginReqChecksum setServer_random(long server_random) {
    this.server_random = server_random;
    setServer_randomIsSet(true);
    return this;
  }

  public void unsetServer_random() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SERVER_RANDOM_ISSET_ID);
  }

  /** Returns true if field server_random is set (has been assigned a value) and false otherwise */
  public boolean isSetServer_random() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SERVER_RANDOM_ISSET_ID);
  }

  public void setServer_randomIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SERVER_RANDOM_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUser_id();
      } else {
        setUser_id((Long)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    case CLIENT_RANDOM:
      if (value == null) {
        unsetClient_random();
      } else {
        setClient_random((Long)value);
      }
      break;

    case SERVER_RANDOM:
      if (value == null) {
        unsetServer_random();
      } else {
        setServer_random((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUser_id();

    case PASSWORD:
      return getPassword();

    case CLIENT_RANDOM:
      return getClient_random();

    case SERVER_RANDOM:
      return getServer_random();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUser_id();
    case PASSWORD:
      return isSetPassword();
    case CLIENT_RANDOM:
      return isSetClient_random();
    case SERVER_RANDOM:
      return isSetServer_random();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ClientPasswordLoginReqChecksum)
      return this.equals((ClientPasswordLoginReqChecksum)that);
    return false;
  }

  public boolean equals(ClientPasswordLoginReqChecksum that) {
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

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_client_random = true;
    boolean that_present_client_random = true;
    if (this_present_client_random || that_present_client_random) {
      if (!(this_present_client_random && that_present_client_random))
        return false;
      if (this.client_random != that.client_random)
        return false;
    }

    boolean this_present_server_random = true;
    boolean that_present_server_random = true;
    if (this_present_server_random || that_present_server_random) {
      if (!(this_present_server_random && that_present_server_random))
        return false;
      if (this.server_random != that.server_random)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(user_id);

    hashCode = hashCode * 8191 + ((isSetPassword()) ? 131071 : 524287);
    if (isSetPassword())
      hashCode = hashCode * 8191 + password.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(client_random);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(server_random);

    return hashCode;
  }

  @Override
  public int compareTo(ClientPasswordLoginReqChecksum other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUser_id()).compareTo(other.isSetUser_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_id, other.user_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClient_random()).compareTo(other.isSetClient_random());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_random()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.client_random, other.client_random);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServer_random()).compareTo(other.isSetServer_random());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServer_random()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.server_random, other.server_random);
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
  public String toString() {
    StringBuilder sb = new StringBuilder("ClientPasswordLoginReqChecksum(");
    boolean first = true;

    sb.append("user_id:");
    sb.append(this.user_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("client_random:");
    sb.append(this.client_random);
    first = false;
    if (!first) sb.append(", ");
    sb.append("server_random:");
    sb.append(this.server_random);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ClientPasswordLoginReqChecksumStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClientPasswordLoginReqChecksumStandardScheme getScheme() {
      return new ClientPasswordLoginReqChecksumStandardScheme();
    }
  }

  private static class ClientPasswordLoginReqChecksumStandardScheme extends org.apache.thrift.scheme.StandardScheme<ClientPasswordLoginReqChecksum> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ClientPasswordLoginReqChecksum struct) throws org.apache.thrift.TException {
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
          case 2: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CLIENT_RANDOM
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.client_random = iprot.readI64();
              struct.setClient_randomIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SERVER_RANDOM
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.server_random = iprot.readI64();
              struct.setServer_randomIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ClientPasswordLoginReqChecksum struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI64(struct.user_id);
      oprot.writeFieldEnd();
      if (struct.password != null) {
        oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
        oprot.writeString(struct.password);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CLIENT_RANDOM_FIELD_DESC);
      oprot.writeI64(struct.client_random);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SERVER_RANDOM_FIELD_DESC);
      oprot.writeI64(struct.server_random);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ClientPasswordLoginReqChecksumTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClientPasswordLoginReqChecksumTupleScheme getScheme() {
      return new ClientPasswordLoginReqChecksumTupleScheme();
    }
  }

  private static class ClientPasswordLoginReqChecksumTupleScheme extends org.apache.thrift.scheme.TupleScheme<ClientPasswordLoginReqChecksum> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ClientPasswordLoginReqChecksum struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUser_id()) {
        optionals.set(0);
      }
      if (struct.isSetPassword()) {
        optionals.set(1);
      }
      if (struct.isSetClient_random()) {
        optionals.set(2);
      }
      if (struct.isSetServer_random()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUser_id()) {
        oprot.writeI64(struct.user_id);
      }
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
      if (struct.isSetClient_random()) {
        oprot.writeI64(struct.client_random);
      }
      if (struct.isSetServer_random()) {
        oprot.writeI64(struct.server_random);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ClientPasswordLoginReqChecksum struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.user_id = iprot.readI64();
        struct.setUser_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
      if (incoming.get(2)) {
        struct.client_random = iprot.readI64();
        struct.setClient_randomIsSet(true);
      }
      if (incoming.get(3)) {
        struct.server_random = iprot.readI64();
        struct.setServer_randomIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

