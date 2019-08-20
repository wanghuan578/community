package com.gyc.thrift.idl;
/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-08-07")
public class KeepAliveReq implements org.apache.thrift.TBase<KeepAliveReq, KeepAliveReq._Fields>, java.io.Serializable, Cloneable, Comparable<KeepAliveReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("KeepAliveReq");

  private static final org.apache.thrift.protocol.TField REQ_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("req_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CURRENT_TIME_REQ_FIELD_DESC = new org.apache.thrift.protocol.TField("current_time_req", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField NETWORK_STATUS_LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("network_status_level", org.apache.thrift.protocol.TType.I16, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new KeepAliveReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new KeepAliveReqTupleSchemeFactory();

  public int req_id; // required
  public long current_time_req; // required
  public short network_status_level; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQ_ID((short)1, "req_id"),
    CURRENT_TIME_REQ((short)2, "current_time_req"),
    NETWORK_STATUS_LEVEL((short)3, "network_status_level");

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
        case 1: // REQ_ID
          return REQ_ID;
        case 2: // CURRENT_TIME_REQ
          return CURRENT_TIME_REQ;
        case 3: // NETWORK_STATUS_LEVEL
          return NETWORK_STATUS_LEVEL;
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
  private static final int __REQ_ID_ISSET_ID = 0;
  private static final int __CURRENT_TIME_REQ_ISSET_ID = 1;
  private static final int __NETWORK_STATUS_LEVEL_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQ_ID, new org.apache.thrift.meta_data.FieldMetaData("req_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CURRENT_TIME_REQ, new org.apache.thrift.meta_data.FieldMetaData("current_time_req", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NETWORK_STATUS_LEVEL, new org.apache.thrift.meta_data.FieldMetaData("network_status_level", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(KeepAliveReq.class, metaDataMap);
  }

  public KeepAliveReq() {
  }

  public KeepAliveReq(
    int req_id,
    long current_time_req,
    short network_status_level)
  {
    this();
    this.req_id = req_id;
    setReq_idIsSet(true);
    this.current_time_req = current_time_req;
    setCurrent_time_reqIsSet(true);
    this.network_status_level = network_status_level;
    setNetwork_status_levelIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public KeepAliveReq(KeepAliveReq other) {
    __isset_bitfield = other.__isset_bitfield;
    this.req_id = other.req_id;
    this.current_time_req = other.current_time_req;
    this.network_status_level = other.network_status_level;
  }

  public KeepAliveReq deepCopy() {
    return new KeepAliveReq(this);
  }

  @Override
  public void clear() {
    setReq_idIsSet(false);
    this.req_id = 0;
    setCurrent_time_reqIsSet(false);
    this.current_time_req = 0;
    setNetwork_status_levelIsSet(false);
    this.network_status_level = 0;
  }

  public int getReq_id() {
    return this.req_id;
  }

  public KeepAliveReq setReq_id(int req_id) {
    this.req_id = req_id;
    setReq_idIsSet(true);
    return this;
  }

  public void unsetReq_id() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REQ_ID_ISSET_ID);
  }

  /** Returns true if field req_id is set (has been assigned a value) and false otherwise */
  public boolean isSetReq_id() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REQ_ID_ISSET_ID);
  }

  public void setReq_idIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REQ_ID_ISSET_ID, value);
  }

  public long getCurrent_time_req() {
    return this.current_time_req;
  }

  public KeepAliveReq setCurrent_time_req(long current_time_req) {
    this.current_time_req = current_time_req;
    setCurrent_time_reqIsSet(true);
    return this;
  }

  public void unsetCurrent_time_req() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CURRENT_TIME_REQ_ISSET_ID);
  }

  /** Returns true if field current_time_req is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrent_time_req() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CURRENT_TIME_REQ_ISSET_ID);
  }

  public void setCurrent_time_reqIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CURRENT_TIME_REQ_ISSET_ID, value);
  }

  public short getNetwork_status_level() {
    return this.network_status_level;
  }

  public KeepAliveReq setNetwork_status_level(short network_status_level) {
    this.network_status_level = network_status_level;
    setNetwork_status_levelIsSet(true);
    return this;
  }

  public void unsetNetwork_status_level() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __NETWORK_STATUS_LEVEL_ISSET_ID);
  }

  /** Returns true if field network_status_level is set (has been assigned a value) and false otherwise */
  public boolean isSetNetwork_status_level() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __NETWORK_STATUS_LEVEL_ISSET_ID);
  }

  public void setNetwork_status_levelIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __NETWORK_STATUS_LEVEL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case REQ_ID:
      if (value == null) {
        unsetReq_id();
      } else {
        setReq_id((java.lang.Integer)value);
      }
      break;

    case CURRENT_TIME_REQ:
      if (value == null) {
        unsetCurrent_time_req();
      } else {
        setCurrent_time_req((java.lang.Long)value);
      }
      break;

    case NETWORK_STATUS_LEVEL:
      if (value == null) {
        unsetNetwork_status_level();
      } else {
        setNetwork_status_level((java.lang.Short)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case REQ_ID:
      return getReq_id();

    case CURRENT_TIME_REQ:
      return getCurrent_time_req();

    case NETWORK_STATUS_LEVEL:
      return getNetwork_status_level();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case REQ_ID:
      return isSetReq_id();
    case CURRENT_TIME_REQ:
      return isSetCurrent_time_req();
    case NETWORK_STATUS_LEVEL:
      return isSetNetwork_status_level();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof KeepAliveReq)
      return this.equals((KeepAliveReq)that);
    return false;
  }

  public boolean equals(KeepAliveReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_req_id = true;
    boolean that_present_req_id = true;
    if (this_present_req_id || that_present_req_id) {
      if (!(this_present_req_id && that_present_req_id))
        return false;
      if (this.req_id != that.req_id)
        return false;
    }

    boolean this_present_current_time_req = true;
    boolean that_present_current_time_req = true;
    if (this_present_current_time_req || that_present_current_time_req) {
      if (!(this_present_current_time_req && that_present_current_time_req))
        return false;
      if (this.current_time_req != that.current_time_req)
        return false;
    }

    boolean this_present_network_status_level = true;
    boolean that_present_network_status_level = true;
    if (this_present_network_status_level || that_present_network_status_level) {
      if (!(this_present_network_status_level && that_present_network_status_level))
        return false;
      if (this.network_status_level != that.network_status_level)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + req_id;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(current_time_req);

    hashCode = hashCode * 8191 + network_status_level;

    return hashCode;
  }

  @Override
  public int compareTo(KeepAliveReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetReq_id()).compareTo(other.isSetReq_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReq_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.req_id, other.req_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCurrent_time_req()).compareTo(other.isSetCurrent_time_req());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrent_time_req()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.current_time_req, other.current_time_req);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNetwork_status_level()).compareTo(other.isSetNetwork_status_level());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNetwork_status_level()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.network_status_level, other.network_status_level);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("KeepAliveReq(");
    boolean first = true;

    sb.append("req_id:");
    sb.append(this.req_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("current_time_req:");
    sb.append(this.current_time_req);
    first = false;
    if (!first) sb.append(", ");
    sb.append("network_status_level:");
    sb.append(this.network_status_level);
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

  private static class KeepAliveReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeepAliveReqStandardScheme getScheme() {
      return new KeepAliveReqStandardScheme();
    }
  }

  private static class KeepAliveReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<KeepAliveReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, KeepAliveReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQ_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.req_id = iprot.readI32();
              struct.setReq_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CURRENT_TIME_REQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.current_time_req = iprot.readI64();
              struct.setCurrent_time_reqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NETWORK_STATUS_LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.network_status_level = iprot.readI16();
              struct.setNetwork_status_levelIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, KeepAliveReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REQ_ID_FIELD_DESC);
      oprot.writeI32(struct.req_id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CURRENT_TIME_REQ_FIELD_DESC);
      oprot.writeI64(struct.current_time_req);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NETWORK_STATUS_LEVEL_FIELD_DESC);
      oprot.writeI16(struct.network_status_level);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class KeepAliveReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public KeepAliveReqTupleScheme getScheme() {
      return new KeepAliveReqTupleScheme();
    }
  }

  private static class KeepAliveReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<KeepAliveReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, KeepAliveReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetReq_id()) {
        optionals.set(0);
      }
      if (struct.isSetCurrent_time_req()) {
        optionals.set(1);
      }
      if (struct.isSetNetwork_status_level()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetReq_id()) {
        oprot.writeI32(struct.req_id);
      }
      if (struct.isSetCurrent_time_req()) {
        oprot.writeI64(struct.current_time_req);
      }
      if (struct.isSetNetwork_status_level()) {
        oprot.writeI16(struct.network_status_level);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, KeepAliveReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.req_id = iprot.readI32();
        struct.setReq_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.current_time_req = iprot.readI64();
        struct.setCurrent_time_reqIsSet(true);
      }
      if (incoming.get(2)) {
        struct.network_status_level = iprot.readI16();
        struct.setNetwork_status_levelIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

