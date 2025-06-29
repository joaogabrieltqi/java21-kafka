/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ps.customer.event.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Phone extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3565381431512149999L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Phone\",\"namespace\":\"ps.customer.event.avro\",\"fields\":[{\"name\":\"label\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"areaCode\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"number\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"obs\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"phoneType\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"PhoneType\",\"symbols\":[\"MOBILE\",\"LANDLINE\",\"NOT_INFORMED\",\"UNRECOGNIZED\"]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Phone> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Phone> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Phone> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Phone> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Phone> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Phone to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Phone from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Phone instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Phone fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence label;
  private java.lang.CharSequence areaCode;
  private java.lang.CharSequence number;
  private java.lang.CharSequence obs;
  private ps.customer.event.avro.PhoneType phoneType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Phone() {}

  /**
   * All-args constructor.
   * @param label The new value for label
   * @param areaCode The new value for areaCode
   * @param number The new value for number
   * @param obs The new value for obs
   * @param phoneType The new value for phoneType
   */
  public Phone(java.lang.CharSequence label, java.lang.CharSequence areaCode, java.lang.CharSequence number, java.lang.CharSequence obs, ps.customer.event.avro.PhoneType phoneType) {
    this.label = label;
    this.areaCode = areaCode;
    this.number = number;
    this.obs = obs;
    this.phoneType = phoneType;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return label;
    case 1: return areaCode;
    case 2: return number;
    case 3: return obs;
    case 4: return phoneType;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: label = (java.lang.CharSequence)value$; break;
    case 1: areaCode = (java.lang.CharSequence)value$; break;
    case 2: number = (java.lang.CharSequence)value$; break;
    case 3: obs = (java.lang.CharSequence)value$; break;
    case 4: phoneType = (ps.customer.event.avro.PhoneType)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'label' field.
   * @return The value of the 'label' field.
   */
  public java.lang.CharSequence getLabel() {
    return label;
  }


  /**
   * Sets the value of the 'label' field.
   * @param value the value to set.
   */
  public void setLabel(java.lang.CharSequence value) {
    this.label = value;
  }

  /**
   * Gets the value of the 'areaCode' field.
   * @return The value of the 'areaCode' field.
   */
  public java.lang.CharSequence getAreaCode() {
    return areaCode;
  }


  /**
   * Sets the value of the 'areaCode' field.
   * @param value the value to set.
   */
  public void setAreaCode(java.lang.CharSequence value) {
    this.areaCode = value;
  }

  /**
   * Gets the value of the 'number' field.
   * @return The value of the 'number' field.
   */
  public java.lang.CharSequence getNumber() {
    return number;
  }


  /**
   * Sets the value of the 'number' field.
   * @param value the value to set.
   */
  public void setNumber(java.lang.CharSequence value) {
    this.number = value;
  }

  /**
   * Gets the value of the 'obs' field.
   * @return The value of the 'obs' field.
   */
  public java.lang.CharSequence getObs() {
    return obs;
  }


  /**
   * Sets the value of the 'obs' field.
   * @param value the value to set.
   */
  public void setObs(java.lang.CharSequence value) {
    this.obs = value;
  }

  /**
   * Gets the value of the 'phoneType' field.
   * @return The value of the 'phoneType' field.
   */
  public ps.customer.event.avro.PhoneType getPhoneType() {
    return phoneType;
  }


  /**
   * Sets the value of the 'phoneType' field.
   * @param value the value to set.
   */
  public void setPhoneType(ps.customer.event.avro.PhoneType value) {
    this.phoneType = value;
  }

  /**
   * Creates a new Phone RecordBuilder.
   * @return A new Phone RecordBuilder
   */
  public static ps.customer.event.avro.Phone.Builder newBuilder() {
    return new ps.customer.event.avro.Phone.Builder();
  }

  /**
   * Creates a new Phone RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Phone RecordBuilder
   */
  public static ps.customer.event.avro.Phone.Builder newBuilder(ps.customer.event.avro.Phone.Builder other) {
    if (other == null) {
      return new ps.customer.event.avro.Phone.Builder();
    } else {
      return new ps.customer.event.avro.Phone.Builder(other);
    }
  }

  /**
   * Creates a new Phone RecordBuilder by copying an existing Phone instance.
   * @param other The existing instance to copy.
   * @return A new Phone RecordBuilder
   */
  public static ps.customer.event.avro.Phone.Builder newBuilder(ps.customer.event.avro.Phone other) {
    if (other == null) {
      return new ps.customer.event.avro.Phone.Builder();
    } else {
      return new ps.customer.event.avro.Phone.Builder(other);
    }
  }

  /**
   * RecordBuilder for Phone instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Phone>
    implements org.apache.avro.data.RecordBuilder<Phone> {

    private java.lang.CharSequence label;
    private java.lang.CharSequence areaCode;
    private java.lang.CharSequence number;
    private java.lang.CharSequence obs;
    private ps.customer.event.avro.PhoneType phoneType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ps.customer.event.avro.Phone.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.label)) {
        this.label = data().deepCopy(fields()[0].schema(), other.label);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.areaCode)) {
        this.areaCode = data().deepCopy(fields()[1].schema(), other.areaCode);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.number)) {
        this.number = data().deepCopy(fields()[2].schema(), other.number);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.obs)) {
        this.obs = data().deepCopy(fields()[3].schema(), other.obs);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.phoneType)) {
        this.phoneType = data().deepCopy(fields()[4].schema(), other.phoneType);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Phone instance
     * @param other The existing instance to copy.
     */
    private Builder(ps.customer.event.avro.Phone other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.label)) {
        this.label = data().deepCopy(fields()[0].schema(), other.label);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.areaCode)) {
        this.areaCode = data().deepCopy(fields()[1].schema(), other.areaCode);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.number)) {
        this.number = data().deepCopy(fields()[2].schema(), other.number);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.obs)) {
        this.obs = data().deepCopy(fields()[3].schema(), other.obs);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.phoneType)) {
        this.phoneType = data().deepCopy(fields()[4].schema(), other.phoneType);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'label' field.
      * @return The value.
      */
    public java.lang.CharSequence getLabel() {
      return label;
    }


    /**
      * Sets the value of the 'label' field.
      * @param value The value of 'label'.
      * @return This builder.
      */
    public ps.customer.event.avro.Phone.Builder setLabel(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.label = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'label' field has been set.
      * @return True if the 'label' field has been set, false otherwise.
      */
    public boolean hasLabel() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'label' field.
      * @return This builder.
      */
    public ps.customer.event.avro.Phone.Builder clearLabel() {
      label = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'areaCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getAreaCode() {
      return areaCode;
    }


    /**
      * Sets the value of the 'areaCode' field.
      * @param value The value of 'areaCode'.
      * @return This builder.
      */
    public ps.customer.event.avro.Phone.Builder setAreaCode(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.areaCode = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'areaCode' field has been set.
      * @return True if the 'areaCode' field has been set, false otherwise.
      */
    public boolean hasAreaCode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'areaCode' field.
      * @return This builder.
      */
    public ps.customer.event.avro.Phone.Builder clearAreaCode() {
      areaCode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'number' field.
      * @return The value.
      */
    public java.lang.CharSequence getNumber() {
      return number;
    }


    /**
      * Sets the value of the 'number' field.
      * @param value The value of 'number'.
      * @return This builder.
      */
    public ps.customer.event.avro.Phone.Builder setNumber(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.number = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'number' field has been set.
      * @return True if the 'number' field has been set, false otherwise.
      */
    public boolean hasNumber() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'number' field.
      * @return This builder.
      */
    public ps.customer.event.avro.Phone.Builder clearNumber() {
      number = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'obs' field.
      * @return The value.
      */
    public java.lang.CharSequence getObs() {
      return obs;
    }


    /**
      * Sets the value of the 'obs' field.
      * @param value The value of 'obs'.
      * @return This builder.
      */
    public ps.customer.event.avro.Phone.Builder setObs(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.obs = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'obs' field has been set.
      * @return True if the 'obs' field has been set, false otherwise.
      */
    public boolean hasObs() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'obs' field.
      * @return This builder.
      */
    public ps.customer.event.avro.Phone.Builder clearObs() {
      obs = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'phoneType' field.
      * @return The value.
      */
    public ps.customer.event.avro.PhoneType getPhoneType() {
      return phoneType;
    }


    /**
      * Sets the value of the 'phoneType' field.
      * @param value The value of 'phoneType'.
      * @return This builder.
      */
    public ps.customer.event.avro.Phone.Builder setPhoneType(ps.customer.event.avro.PhoneType value) {
      validate(fields()[4], value);
      this.phoneType = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'phoneType' field has been set.
      * @return True if the 'phoneType' field has been set, false otherwise.
      */
    public boolean hasPhoneType() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'phoneType' field.
      * @return This builder.
      */
    public ps.customer.event.avro.Phone.Builder clearPhoneType() {
      phoneType = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Phone build() {
      try {
        Phone record = new Phone();
        record.label = fieldSetFlags()[0] ? this.label : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.areaCode = fieldSetFlags()[1] ? this.areaCode : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.number = fieldSetFlags()[2] ? this.number : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.obs = fieldSetFlags()[3] ? this.obs : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.phoneType = fieldSetFlags()[4] ? this.phoneType : (ps.customer.event.avro.PhoneType) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Phone>
    WRITER$ = (org.apache.avro.io.DatumWriter<Phone>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Phone>
    READER$ = (org.apache.avro.io.DatumReader<Phone>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.label == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.label);
    }

    if (this.areaCode == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.areaCode);
    }

    if (this.number == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.number);
    }

    if (this.obs == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.obs);
    }

    if (this.phoneType == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeEnum(this.phoneType.ordinal());
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.label = null;
      } else {
        this.label = in.readString(this.label instanceof Utf8 ? (Utf8)this.label : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.areaCode = null;
      } else {
        this.areaCode = in.readString(this.areaCode instanceof Utf8 ? (Utf8)this.areaCode : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.number = null;
      } else {
        this.number = in.readString(this.number instanceof Utf8 ? (Utf8)this.number : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.obs = null;
      } else {
        this.obs = in.readString(this.obs instanceof Utf8 ? (Utf8)this.obs : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.phoneType = null;
      } else {
        this.phoneType = ps.customer.event.avro.PhoneType.values()[in.readEnum()];
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.label = null;
          } else {
            this.label = in.readString(this.label instanceof Utf8 ? (Utf8)this.label : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.areaCode = null;
          } else {
            this.areaCode = in.readString(this.areaCode instanceof Utf8 ? (Utf8)this.areaCode : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.number = null;
          } else {
            this.number = in.readString(this.number instanceof Utf8 ? (Utf8)this.number : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.obs = null;
          } else {
            this.obs = in.readString(this.obs instanceof Utf8 ? (Utf8)this.obs : null);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.phoneType = null;
          } else {
            this.phoneType = ps.customer.event.avro.PhoneType.values()[in.readEnum()];
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










