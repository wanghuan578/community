package com.spirit.thrift.socketserver.rpc.thrift;
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-08-07")
public class UserRegisterRes implements org.apache.thrift.TBase<UserRegisterRes, UserRegisterRes._Fields>, java.io.Serializable, Cloneable, Comparable<UserRegisterRes> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserRegisterRes");

  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("error_code", org.apache.thrift.protocol.TType.I16, (short)1);
  private static final org.apache.thrift.protocol.TField ERROR_TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("error_text", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("user_id", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserRegisterResStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserRegisterResTupleSchemeFactory();

  public short error_code; // required
  public java.lang.String error_text; // required
  public java.lang.String user_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR_CODE((short)1, "error_code"),
    ERROR_TEXT((short)2, "error_text"),
    USER_ID((short)3, "user_id");

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
        case 3: // USER_ID
          return USER_ID;
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
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("user_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserRegisterRes.class, metaDataMap);
  }

  public UserRegisterRes() {
  }

  public UserRegisterRes(
    short error_code,
    java.lang.String error_text,
    java.lang.String user_id)
  {
    this();
    this.error_code = error_code;
    setError_codeIsSet(true);
    this.error_text = error_text;
    this.user_id = user_id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserRegisterRes(UserRegisterRes other) {
    __isset_bitfield = other.__isset_bitfield;
    this.error_code = other.error_code;
    if (other.isSetError_text()) {
      this.error_text = other.error_text;
    }
    if (other.isSetUser_id()) {
      this.user_id = other.user_id;
    }
  }

  public UserRegisterRes deepCopy() {
    return new UserRegisterRes(this);
  }

  @Override
  public void clear() {
    setError_codeIsSet(false);
    this.error_code = 0;
    this.error_text = null;
    this.user_id = null;
  }

  public short getError_code() {
    return this.error_code;
  }

  public UserRegisterRes setError_code(short error_code) {
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

  public UserRegisterRes setError_text(java.lang.String error_text) {
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

  public java.lang.String getUser_id() {
    return this.user_id;
  }

  public UserRegisterRes setUser_id(java.lang.String user_id) {
    this.user_id = user_id;
    return this;
  }

  public void unsetUser_id() {
    this.user_id = null;
  }

  /** Returns true if field user_id is set (has been assigned a value) and false otherwise */
  public boolean isSetUser_id() {
    return this.user_id != null;
  }

  public void setUser_idIsSet(boolean value) {
    if (!value) {
      this.user_id = null;
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

    case USER_ID:
      if (value == null) {
        unsetUser_id();
      } else {
        setUser_id((java.lang.String)value);
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

    case USER_ID:
      return getUser_id();

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
    case USER_ID:
      return isSetUser_id();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UserRegisterRes)
      return this.equals((UserRegisterRes)that);
    return false;
  }

  public boolean equals(UserRegisterRes that) {
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

    boolean this_present_user_id = true && this.isSetUser_id();
    boolean that_present_user_id = true && that.isSetUser_id();
    if (this_present_user_id || that_present_user_id) {
      if (!(this_present_user_id && that_present_user_id))
        return false;
      if (!this.user_id.equals(that.user_id))
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

    hashCode = hashCode * 8191 + ((isSetUser_id()) ? 131071 : 524287);
    if (isSetUser_id())
      hashCode = hashCode * 8191 + user_id.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UserRegisterRes other) {
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UserRegisterRes(");
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
    sb.append("user_id:");
    if (this.user_id == null) {
      sb.append("null");
    } else {
      sb.append(this.user_id);
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

  private static class UserRegisterResStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserRegisterResStandardScheme getScheme() {
      return new UserRegisterResStandardScheme();
    }
  }

  private static class UserRegisterResStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserRegisterRes> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserRegisterRes struct) throws org.apache.thrift.TException {
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
          case 3: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user_id = iprot.readString();
              struct.setUser_idIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserRegisterRes struct) throws org.apache.thrift.TException {
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
      if (struct.user_id != null) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeString(struct.user_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserRegisterResTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserRegisterResTupleScheme getScheme() {
      return new UserRegisterResTupleScheme();
    }
  }

  private static class UserRegisterResTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserRegisterRes> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserRegisterRes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetError_code()) {
        optionals.set(0);
      }
      if (struct.isSetError_text()) {
        optionals.set(1);
      }
      if (struct.isSetUser_id()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetError_code()) {
        oprot.writeI16(struct.error_code);
      }
      if (struct.isSetError_text()) {
        oprot.writeString(struct.error_text);
      }
      if (struct.isSetUser_id()) {
        oprot.writeString(struct.user_id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserRegisterRes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.error_code = iprot.readI16();
        struct.setError_codeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.error_text = iprot.readString();
        struct.setError_textIsSet(true);
      }
      if (incoming.get(2)) {
        struct.user_id = iprot.readString();
        struct.setUser_idIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

