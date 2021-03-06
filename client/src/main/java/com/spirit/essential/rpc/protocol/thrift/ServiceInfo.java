/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.spirit.essential.rpc.protocol.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2019-08-22")
public class ServiceInfo implements org.apache.thrift.TBase<ServiceInfo, ServiceInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ServiceInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ServiceInfo");

  private static final org.apache.thrift.protocol.TField APP_FIELD_DESC = new org.apache.thrift.protocol.TField("app", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SYSTEM_FIELD_DESC = new org.apache.thrift.protocol.TField("system", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField ROUTE_FIELD_DESC = new org.apache.thrift.protocol.TField("route", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ServiceInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ServiceInfoTupleSchemeFactory();

  public ApplicationInfo app; // required
  public SystemInfo system; // required
  public com.spirit.essential.rpc.protocol.thrift.RouteInfo route; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    APP((short)1, "app"),
    SYSTEM((short)2, "system"),
    ROUTE((short)3, "route");

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
        case 1: // APP
          return APP;
        case 2: // SYSTEM
          return SYSTEM;
        case 3: // ROUTE
          return ROUTE;
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
    tmpMap.put(_Fields.APP, new org.apache.thrift.meta_data.FieldMetaData("app", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ApplicationInfo.class)));
    tmpMap.put(_Fields.SYSTEM, new org.apache.thrift.meta_data.FieldMetaData("system", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SystemInfo.class)));
    tmpMap.put(_Fields.ROUTE, new org.apache.thrift.meta_data.FieldMetaData("route", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.spirit.essential.rpc.protocol.thrift.RouteInfo.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ServiceInfo.class, metaDataMap);
  }

  public ServiceInfo() {
  }

  public ServiceInfo(
    ApplicationInfo app,
    SystemInfo system,
    com.spirit.essential.rpc.protocol.thrift.RouteInfo route)
  {
    this();
    this.app = app;
    this.system = system;
    this.route = route;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServiceInfo(ServiceInfo other) {
    if (other.isSetApp()) {
      this.app = new ApplicationInfo(other.app);
    }
    if (other.isSetSystem()) {
      this.system = new SystemInfo(other.system);
    }
    if (other.isSetRoute()) {
      this.route = new com.spirit.essential.rpc.protocol.thrift.RouteInfo(other.route);
    }
  }

  public ServiceInfo deepCopy() {
    return new ServiceInfo(this);
  }

  @Override
  public void clear() {
    this.app = null;
    this.system = null;
    this.route = null;
  }

  public ApplicationInfo getApp() {
    return this.app;
  }

  public ServiceInfo setApp(ApplicationInfo app) {
    this.app = app;
    return this;
  }

  public void unsetApp() {
    this.app = null;
  }

  /** Returns true if field app is set (has been assigned a value) and false otherwise */
  public boolean isSetApp() {
    return this.app != null;
  }

  public void setAppIsSet(boolean value) {
    if (!value) {
      this.app = null;
    }
  }

  public SystemInfo getSystem() {
    return this.system;
  }

  public ServiceInfo setSystem(SystemInfo system) {
    this.system = system;
    return this;
  }

  public void unsetSystem() {
    this.system = null;
  }

  /** Returns true if field system is set (has been assigned a value) and false otherwise */
  public boolean isSetSystem() {
    return this.system != null;
  }

  public void setSystemIsSet(boolean value) {
    if (!value) {
      this.system = null;
    }
  }

  public com.spirit.essential.rpc.protocol.thrift.RouteInfo getRoute() {
    return this.route;
  }

  public ServiceInfo setRoute(com.spirit.essential.rpc.protocol.thrift.RouteInfo route) {
    this.route = route;
    return this;
  }

  public void unsetRoute() {
    this.route = null;
  }

  /** Returns true if field route is set (has been assigned a value) and false otherwise */
  public boolean isSetRoute() {
    return this.route != null;
  }

  public void setRouteIsSet(boolean value) {
    if (!value) {
      this.route = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case APP:
      if (value == null) {
        unsetApp();
      } else {
        setApp((ApplicationInfo)value);
      }
      break;

    case SYSTEM:
      if (value == null) {
        unsetSystem();
      } else {
        setSystem((SystemInfo)value);
      }
      break;

    case ROUTE:
      if (value == null) {
        unsetRoute();
      } else {
        setRoute((com.spirit.essential.rpc.protocol.thrift.RouteInfo)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case APP:
      return getApp();

    case SYSTEM:
      return getSystem();

    case ROUTE:
      return getRoute();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case APP:
      return isSetApp();
    case SYSTEM:
      return isSetSystem();
    case ROUTE:
      return isSetRoute();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ServiceInfo)
      return this.equals((ServiceInfo)that);
    return false;
  }

  public boolean equals(ServiceInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_app = true && this.isSetApp();
    boolean that_present_app = true && that.isSetApp();
    if (this_present_app || that_present_app) {
      if (!(this_present_app && that_present_app))
        return false;
      if (!this.app.equals(that.app))
        return false;
    }

    boolean this_present_system = true && this.isSetSystem();
    boolean that_present_system = true && that.isSetSystem();
    if (this_present_system || that_present_system) {
      if (!(this_present_system && that_present_system))
        return false;
      if (!this.system.equals(that.system))
        return false;
    }

    boolean this_present_route = true && this.isSetRoute();
    boolean that_present_route = true && that.isSetRoute();
    if (this_present_route || that_present_route) {
      if (!(this_present_route && that_present_route))
        return false;
      if (!this.route.equals(that.route))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetApp()) ? 131071 : 524287);
    if (isSetApp())
      hashCode = hashCode * 8191 + app.hashCode();

    hashCode = hashCode * 8191 + ((isSetSystem()) ? 131071 : 524287);
    if (isSetSystem())
      hashCode = hashCode * 8191 + system.hashCode();

    hashCode = hashCode * 8191 + ((isSetRoute()) ? 131071 : 524287);
    if (isSetRoute())
      hashCode = hashCode * 8191 + route.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ServiceInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetApp()).compareTo(other.isSetApp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.app, other.app);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSystem()).compareTo(other.isSetSystem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSystem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.system, other.system);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRoute()).compareTo(other.isSetRoute());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoute()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.route, other.route);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ServiceInfo(");
    boolean first = true;

    sb.append("app:");
    if (this.app == null) {
      sb.append("null");
    } else {
      sb.append(this.app);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("system:");
    if (this.system == null) {
      sb.append("null");
    } else {
      sb.append(this.system);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("route:");
    if (this.route == null) {
      sb.append("null");
    } else {
      sb.append(this.route);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (app != null) {
      app.validate();
    }
    if (system != null) {
      system.validate();
    }
    if (route != null) {
      route.validate();
    }
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

  private static class ServiceInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ServiceInfoStandardScheme getScheme() {
      return new ServiceInfoStandardScheme();
    }
  }

  private static class ServiceInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ServiceInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ServiceInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // APP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.app = new ApplicationInfo();
              struct.app.read(iprot);
              struct.setAppIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SYSTEM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.system = new SystemInfo();
              struct.system.read(iprot);
              struct.setSystemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ROUTE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.route = new com.spirit.essential.rpc.protocol.thrift.RouteInfo();
              struct.route.read(iprot);
              struct.setRouteIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ServiceInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.app != null) {
        oprot.writeFieldBegin(APP_FIELD_DESC);
        struct.app.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.system != null) {
        oprot.writeFieldBegin(SYSTEM_FIELD_DESC);
        struct.system.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.route != null) {
        oprot.writeFieldBegin(ROUTE_FIELD_DESC);
        struct.route.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ServiceInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ServiceInfoTupleScheme getScheme() {
      return new ServiceInfoTupleScheme();
    }
  }

  private static class ServiceInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ServiceInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ServiceInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetApp()) {
        optionals.set(0);
      }
      if (struct.isSetSystem()) {
        optionals.set(1);
      }
      if (struct.isSetRoute()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetApp()) {
        struct.app.write(oprot);
      }
      if (struct.isSetSystem()) {
        struct.system.write(oprot);
      }
      if (struct.isSetRoute()) {
        struct.route.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ServiceInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.app = new ApplicationInfo();
        struct.app.read(iprot);
        struct.setAppIsSet(true);
      }
      if (incoming.get(1)) {
        struct.system = new SystemInfo();
        struct.system.read(iprot);
        struct.setSystemIsSet(true);
      }
      if (incoming.get(2)) {
        struct.route = new com.spirit.essential.rpc.protocol.thrift.RouteInfo();
        struct.route.read(iprot);
        struct.setRouteIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

