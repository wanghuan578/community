/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-08-07")
public class UpdateResourceReq implements org.apache.thrift.TBase<UpdateResourceReq, UpdateResourceReq._Fields>, java.io.Serializable, Cloneable, Comparable<UpdateResourceReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UpdateResourceReq");

  private static final org.apache.thrift.protocol.TField CLIENT_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("client_version", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RESOURCE_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("resource_version", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UpdateResourceReqStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UpdateResourceReqTupleSchemeFactory();

  public java.lang.String client_version; // required
  public java.lang.String resource_version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLIENT_VERSION((short)1, "client_version"),
    RESOURCE_VERSION((short)2, "resource_version");

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
        case 1: // CLIENT_VERSION
          return CLIENT_VERSION;
        case 2: // RESOURCE_VERSION
          return RESOURCE_VERSION;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLIENT_VERSION, new org.apache.thrift.meta_data.FieldMetaData("client_version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESOURCE_VERSION, new org.apache.thrift.meta_data.FieldMetaData("resource_version", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UpdateResourceReq.class, metaDataMap);
  }

  public UpdateResourceReq() {
  }

  public UpdateResourceReq(
    java.lang.String client_version,
    java.lang.String resource_version)
  {
    this();
    this.client_version = client_version;
    this.resource_version = resource_version;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateResourceReq(UpdateResourceReq other) {
    if (other.isSetClient_version()) {
      this.client_version = other.client_version;
    }
    if (other.isSetResource_version()) {
      this.resource_version = other.resource_version;
    }
  }

  public UpdateResourceReq deepCopy() {
    return new UpdateResourceReq(this);
  }

  @Override
  public void clear() {
    this.client_version = null;
    this.resource_version = null;
  }

  public java.lang.String getClient_version() {
    return this.client_version;
  }

  public UpdateResourceReq setClient_version(java.lang.String client_version) {
    this.client_version = client_version;
    return this;
  }

  public void unsetClient_version() {
    this.client_version = null;
  }

  /** Returns true if field client_version is set (has been assigned a value) and false otherwise */
  public boolean isSetClient_version() {
    return this.client_version != null;
  }

  public void setClient_versionIsSet(boolean value) {
    if (!value) {
      this.client_version = null;
    }
  }

  public java.lang.String getResource_version() {
    return this.resource_version;
  }

  public UpdateResourceReq setResource_version(java.lang.String resource_version) {
    this.resource_version = resource_version;
    return this;
  }

  public void unsetResource_version() {
    this.resource_version = null;
  }

  /** Returns true if field resource_version is set (has been assigned a value) and false otherwise */
  public boolean isSetResource_version() {
    return this.resource_version != null;
  }

  public void setResource_versionIsSet(boolean value) {
    if (!value) {
      this.resource_version = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CLIENT_VERSION:
      if (value == null) {
        unsetClient_version();
      } else {
        setClient_version((java.lang.String)value);
      }
      break;

    case RESOURCE_VERSION:
      if (value == null) {
        unsetResource_version();
      } else {
        setResource_version((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CLIENT_VERSION:
      return getClient_version();

    case RESOURCE_VERSION:
      return getResource_version();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CLIENT_VERSION:
      return isSetClient_version();
    case RESOURCE_VERSION:
      return isSetResource_version();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateResourceReq)
      return this.equals((UpdateResourceReq)that);
    return false;
  }

  public boolean equals(UpdateResourceReq that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_client_version = true && this.isSetClient_version();
    boolean that_present_client_version = true && that.isSetClient_version();
    if (this_present_client_version || that_present_client_version) {
      if (!(this_present_client_version && that_present_client_version))
        return false;
      if (!this.client_version.equals(that.client_version))
        return false;
    }

    boolean this_present_resource_version = true && this.isSetResource_version();
    boolean that_present_resource_version = true && that.isSetResource_version();
    if (this_present_resource_version || that_present_resource_version) {
      if (!(this_present_resource_version && that_present_resource_version))
        return false;
      if (!this.resource_version.equals(that.resource_version))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetClient_version()) ? 131071 : 524287);
    if (isSetClient_version())
      hashCode = hashCode * 8191 + client_version.hashCode();

    hashCode = hashCode * 8191 + ((isSetResource_version()) ? 131071 : 524287);
    if (isSetResource_version())
      hashCode = hashCode * 8191 + resource_version.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UpdateResourceReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetClient_version()).compareTo(other.isSetClient_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.client_version, other.client_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetResource_version()).compareTo(other.isSetResource_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResource_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resource_version, other.resource_version);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateResourceReq(");
    boolean first = true;

    sb.append("client_version:");
    if (this.client_version == null) {
      sb.append("null");
    } else {
      sb.append(this.client_version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("resource_version:");
    if (this.resource_version == null) {
      sb.append("null");
    } else {
      sb.append(this.resource_version);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UpdateResourceReqStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UpdateResourceReqStandardScheme getScheme() {
      return new UpdateResourceReqStandardScheme();
    }
  }

  private static class UpdateResourceReqStandardScheme extends org.apache.thrift.scheme.StandardScheme<UpdateResourceReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UpdateResourceReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLIENT_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.client_version = iprot.readString();
              struct.setClient_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESOURCE_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.resource_version = iprot.readString();
              struct.setResource_versionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UpdateResourceReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.client_version != null) {
        oprot.writeFieldBegin(CLIENT_VERSION_FIELD_DESC);
        oprot.writeString(struct.client_version);
        oprot.writeFieldEnd();
      }
      if (struct.resource_version != null) {
        oprot.writeFieldBegin(RESOURCE_VERSION_FIELD_DESC);
        oprot.writeString(struct.resource_version);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UpdateResourceReqTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UpdateResourceReqTupleScheme getScheme() {
      return new UpdateResourceReqTupleScheme();
    }
  }

  private static class UpdateResourceReqTupleScheme extends org.apache.thrift.scheme.TupleScheme<UpdateResourceReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UpdateResourceReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetClient_version()) {
        optionals.set(0);
      }
      if (struct.isSetResource_version()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetClient_version()) {
        oprot.writeString(struct.client_version);
      }
      if (struct.isSetResource_version()) {
        oprot.writeString(struct.resource_version);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UpdateResourceReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.client_version = iprot.readString();
        struct.setClient_versionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.resource_version = iprot.readString();
        struct.setResource_versionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

