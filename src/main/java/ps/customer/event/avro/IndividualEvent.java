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
public class IndividualEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7391188463389419317L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IndividualEvent\",\"namespace\":\"ps.customer.event.avro\",\"fields\":[{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"bornDate\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"logicalType\":\"timestamp-micros\"},{\"name\":\"motherName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"nationality\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"ufNaturality\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"naturality\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"registryInformation\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"RegistryInformation\",\"fields\":[{\"name\":\"rg\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"issuingOranization\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"issuingDate\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null,\"logicalType\":\"timestamp-micros\"}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<IndividualEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<IndividualEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<IndividualEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<IndividualEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<IndividualEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this IndividualEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a IndividualEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a IndividualEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static IndividualEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence name;
  private java.lang.CharSequence bornDate;
  private java.lang.CharSequence motherName;
  private java.lang.CharSequence nationality;
  private java.lang.CharSequence ufNaturality;
  private java.lang.CharSequence naturality;
  private ps.customer.event.avro.RegistryInformation registryInformation;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public IndividualEvent() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param bornDate The new value for bornDate
   * @param motherName The new value for motherName
   * @param nationality The new value for nationality
   * @param ufNaturality The new value for ufNaturality
   * @param naturality The new value for naturality
   * @param registryInformation The new value for registryInformation
   */
  public IndividualEvent(java.lang.CharSequence name, java.lang.CharSequence bornDate, java.lang.CharSequence motherName, java.lang.CharSequence nationality, java.lang.CharSequence ufNaturality, java.lang.CharSequence naturality, ps.customer.event.avro.RegistryInformation registryInformation) {
    this.name = name;
    this.bornDate = bornDate;
    this.motherName = motherName;
    this.nationality = nationality;
    this.ufNaturality = ufNaturality;
    this.naturality = naturality;
    this.registryInformation = registryInformation;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return bornDate;
    case 2: return motherName;
    case 3: return nationality;
    case 4: return ufNaturality;
    case 5: return naturality;
    case 6: return registryInformation;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: bornDate = (java.lang.CharSequence)value$; break;
    case 2: motherName = (java.lang.CharSequence)value$; break;
    case 3: nationality = (java.lang.CharSequence)value$; break;
    case 4: ufNaturality = (java.lang.CharSequence)value$; break;
    case 5: naturality = (java.lang.CharSequence)value$; break;
    case 6: registryInformation = (ps.customer.event.avro.RegistryInformation)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'bornDate' field.
   * @return The value of the 'bornDate' field.
   */
  public java.lang.CharSequence getBornDate() {
    return bornDate;
  }


  /**
   * Sets the value of the 'bornDate' field.
   * @param value the value to set.
   */
  public void setBornDate(java.lang.CharSequence value) {
    this.bornDate = value;
  }

  /**
   * Gets the value of the 'motherName' field.
   * @return The value of the 'motherName' field.
   */
  public java.lang.CharSequence getMotherName() {
    return motherName;
  }


  /**
   * Sets the value of the 'motherName' field.
   * @param value the value to set.
   */
  public void setMotherName(java.lang.CharSequence value) {
    this.motherName = value;
  }

  /**
   * Gets the value of the 'nationality' field.
   * @return The value of the 'nationality' field.
   */
  public java.lang.CharSequence getNationality() {
    return nationality;
  }


  /**
   * Sets the value of the 'nationality' field.
   * @param value the value to set.
   */
  public void setNationality(java.lang.CharSequence value) {
    this.nationality = value;
  }

  /**
   * Gets the value of the 'ufNaturality' field.
   * @return The value of the 'ufNaturality' field.
   */
  public java.lang.CharSequence getUfNaturality() {
    return ufNaturality;
  }


  /**
   * Sets the value of the 'ufNaturality' field.
   * @param value the value to set.
   */
  public void setUfNaturality(java.lang.CharSequence value) {
    this.ufNaturality = value;
  }

  /**
   * Gets the value of the 'naturality' field.
   * @return The value of the 'naturality' field.
   */
  public java.lang.CharSequence getNaturality() {
    return naturality;
  }


  /**
   * Sets the value of the 'naturality' field.
   * @param value the value to set.
   */
  public void setNaturality(java.lang.CharSequence value) {
    this.naturality = value;
  }

  /**
   * Gets the value of the 'registryInformation' field.
   * @return The value of the 'registryInformation' field.
   */
  public ps.customer.event.avro.RegistryInformation getRegistryInformation() {
    return registryInformation;
  }


  /**
   * Sets the value of the 'registryInformation' field.
   * @param value the value to set.
   */
  public void setRegistryInformation(ps.customer.event.avro.RegistryInformation value) {
    this.registryInformation = value;
  }

  /**
   * Creates a new IndividualEvent RecordBuilder.
   * @return A new IndividualEvent RecordBuilder
   */
  public static ps.customer.event.avro.IndividualEvent.Builder newBuilder() {
    return new ps.customer.event.avro.IndividualEvent.Builder();
  }

  /**
   * Creates a new IndividualEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new IndividualEvent RecordBuilder
   */
  public static ps.customer.event.avro.IndividualEvent.Builder newBuilder(ps.customer.event.avro.IndividualEvent.Builder other) {
    if (other == null) {
      return new ps.customer.event.avro.IndividualEvent.Builder();
    } else {
      return new ps.customer.event.avro.IndividualEvent.Builder(other);
    }
  }

  /**
   * Creates a new IndividualEvent RecordBuilder by copying an existing IndividualEvent instance.
   * @param other The existing instance to copy.
   * @return A new IndividualEvent RecordBuilder
   */
  public static ps.customer.event.avro.IndividualEvent.Builder newBuilder(ps.customer.event.avro.IndividualEvent other) {
    if (other == null) {
      return new ps.customer.event.avro.IndividualEvent.Builder();
    } else {
      return new ps.customer.event.avro.IndividualEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for IndividualEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IndividualEvent>
    implements org.apache.avro.data.RecordBuilder<IndividualEvent> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence bornDate;
    private java.lang.CharSequence motherName;
    private java.lang.CharSequence nationality;
    private java.lang.CharSequence ufNaturality;
    private java.lang.CharSequence naturality;
    private ps.customer.event.avro.RegistryInformation registryInformation;
    private ps.customer.event.avro.RegistryInformation.Builder registryInformationBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ps.customer.event.avro.IndividualEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.bornDate)) {
        this.bornDate = data().deepCopy(fields()[1].schema(), other.bornDate);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.motherName)) {
        this.motherName = data().deepCopy(fields()[2].schema(), other.motherName);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.nationality)) {
        this.nationality = data().deepCopy(fields()[3].schema(), other.nationality);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.ufNaturality)) {
        this.ufNaturality = data().deepCopy(fields()[4].schema(), other.ufNaturality);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.naturality)) {
        this.naturality = data().deepCopy(fields()[5].schema(), other.naturality);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.registryInformation)) {
        this.registryInformation = data().deepCopy(fields()[6].schema(), other.registryInformation);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (other.hasRegistryInformationBuilder()) {
        this.registryInformationBuilder = ps.customer.event.avro.RegistryInformation.newBuilder(other.getRegistryInformationBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing IndividualEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(ps.customer.event.avro.IndividualEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.bornDate)) {
        this.bornDate = data().deepCopy(fields()[1].schema(), other.bornDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.motherName)) {
        this.motherName = data().deepCopy(fields()[2].schema(), other.motherName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.nationality)) {
        this.nationality = data().deepCopy(fields()[3].schema(), other.nationality);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ufNaturality)) {
        this.ufNaturality = data().deepCopy(fields()[4].schema(), other.ufNaturality);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.naturality)) {
        this.naturality = data().deepCopy(fields()[5].schema(), other.naturality);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.registryInformation)) {
        this.registryInformation = data().deepCopy(fields()[6].schema(), other.registryInformation);
        fieldSetFlags()[6] = true;
      }
      this.registryInformationBuilder = null;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'bornDate' field.
      * @return The value.
      */
    public java.lang.CharSequence getBornDate() {
      return bornDate;
    }


    /**
      * Sets the value of the 'bornDate' field.
      * @param value The value of 'bornDate'.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder setBornDate(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.bornDate = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'bornDate' field has been set.
      * @return True if the 'bornDate' field has been set, false otherwise.
      */
    public boolean hasBornDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'bornDate' field.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder clearBornDate() {
      bornDate = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'motherName' field.
      * @return The value.
      */
    public java.lang.CharSequence getMotherName() {
      return motherName;
    }


    /**
      * Sets the value of the 'motherName' field.
      * @param value The value of 'motherName'.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder setMotherName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.motherName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'motherName' field has been set.
      * @return True if the 'motherName' field has been set, false otherwise.
      */
    public boolean hasMotherName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'motherName' field.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder clearMotherName() {
      motherName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'nationality' field.
      * @return The value.
      */
    public java.lang.CharSequence getNationality() {
      return nationality;
    }


    /**
      * Sets the value of the 'nationality' field.
      * @param value The value of 'nationality'.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder setNationality(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.nationality = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'nationality' field has been set.
      * @return True if the 'nationality' field has been set, false otherwise.
      */
    public boolean hasNationality() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'nationality' field.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder clearNationality() {
      nationality = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'ufNaturality' field.
      * @return The value.
      */
    public java.lang.CharSequence getUfNaturality() {
      return ufNaturality;
    }


    /**
      * Sets the value of the 'ufNaturality' field.
      * @param value The value of 'ufNaturality'.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder setUfNaturality(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.ufNaturality = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'ufNaturality' field has been set.
      * @return True if the 'ufNaturality' field has been set, false otherwise.
      */
    public boolean hasUfNaturality() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'ufNaturality' field.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder clearUfNaturality() {
      ufNaturality = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'naturality' field.
      * @return The value.
      */
    public java.lang.CharSequence getNaturality() {
      return naturality;
    }


    /**
      * Sets the value of the 'naturality' field.
      * @param value The value of 'naturality'.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder setNaturality(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.naturality = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'naturality' field has been set.
      * @return True if the 'naturality' field has been set, false otherwise.
      */
    public boolean hasNaturality() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'naturality' field.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder clearNaturality() {
      naturality = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'registryInformation' field.
      * @return The value.
      */
    public ps.customer.event.avro.RegistryInformation getRegistryInformation() {
      return registryInformation;
    }


    /**
      * Sets the value of the 'registryInformation' field.
      * @param value The value of 'registryInformation'.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder setRegistryInformation(ps.customer.event.avro.RegistryInformation value) {
      validate(fields()[6], value);
      this.registryInformationBuilder = null;
      this.registryInformation = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'registryInformation' field has been set.
      * @return True if the 'registryInformation' field has been set, false otherwise.
      */
    public boolean hasRegistryInformation() {
      return fieldSetFlags()[6];
    }

    /**
     * Gets the Builder instance for the 'registryInformation' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public ps.customer.event.avro.RegistryInformation.Builder getRegistryInformationBuilder() {
      if (registryInformationBuilder == null) {
        if (hasRegistryInformation()) {
          setRegistryInformationBuilder(ps.customer.event.avro.RegistryInformation.newBuilder(registryInformation));
        } else {
          setRegistryInformationBuilder(ps.customer.event.avro.RegistryInformation.newBuilder());
        }
      }
      return registryInformationBuilder;
    }

    /**
     * Sets the Builder instance for the 'registryInformation' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public ps.customer.event.avro.IndividualEvent.Builder setRegistryInformationBuilder(ps.customer.event.avro.RegistryInformation.Builder value) {
      clearRegistryInformation();
      registryInformationBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'registryInformation' field has an active Builder instance
     * @return True if the 'registryInformation' field has an active Builder instance
     */
    public boolean hasRegistryInformationBuilder() {
      return registryInformationBuilder != null;
    }

    /**
      * Clears the value of the 'registryInformation' field.
      * @return This builder.
      */
    public ps.customer.event.avro.IndividualEvent.Builder clearRegistryInformation() {
      registryInformation = null;
      registryInformationBuilder = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public IndividualEvent build() {
      try {
        IndividualEvent record = new IndividualEvent();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.bornDate = fieldSetFlags()[1] ? this.bornDate : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.motherName = fieldSetFlags()[2] ? this.motherName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.nationality = fieldSetFlags()[3] ? this.nationality : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.ufNaturality = fieldSetFlags()[4] ? this.ufNaturality : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.naturality = fieldSetFlags()[5] ? this.naturality : (java.lang.CharSequence) defaultValue(fields()[5]);
        if (registryInformationBuilder != null) {
          try {
            record.registryInformation = this.registryInformationBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("registryInformation"));
            throw e;
          }
        } else {
          record.registryInformation = fieldSetFlags()[6] ? this.registryInformation : (ps.customer.event.avro.RegistryInformation) defaultValue(fields()[6]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<IndividualEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<IndividualEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<IndividualEvent>
    READER$ = (org.apache.avro.io.DatumReader<IndividualEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.name == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.name);
    }

    if (this.bornDate == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.bornDate);
    }

    if (this.motherName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.motherName);
    }

    if (this.nationality == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.nationality);
    }

    if (this.ufNaturality == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.ufNaturality);
    }

    if (this.naturality == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.naturality);
    }

    if (this.registryInformation == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.registryInformation.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.name = null;
      } else {
        this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.bornDate = null;
      } else {
        this.bornDate = in.readString(this.bornDate instanceof Utf8 ? (Utf8)this.bornDate : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.motherName = null;
      } else {
        this.motherName = in.readString(this.motherName instanceof Utf8 ? (Utf8)this.motherName : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.nationality = null;
      } else {
        this.nationality = in.readString(this.nationality instanceof Utf8 ? (Utf8)this.nationality : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.ufNaturality = null;
      } else {
        this.ufNaturality = in.readString(this.ufNaturality instanceof Utf8 ? (Utf8)this.ufNaturality : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.naturality = null;
      } else {
        this.naturality = in.readString(this.naturality instanceof Utf8 ? (Utf8)this.naturality : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.registryInformation = null;
      } else {
        if (this.registryInformation == null) {
          this.registryInformation = new ps.customer.event.avro.RegistryInformation();
        }
        this.registryInformation.customDecode(in);
      }

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.name = null;
          } else {
            this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.bornDate = null;
          } else {
            this.bornDate = in.readString(this.bornDate instanceof Utf8 ? (Utf8)this.bornDate : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.motherName = null;
          } else {
            this.motherName = in.readString(this.motherName instanceof Utf8 ? (Utf8)this.motherName : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.nationality = null;
          } else {
            this.nationality = in.readString(this.nationality instanceof Utf8 ? (Utf8)this.nationality : null);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.ufNaturality = null;
          } else {
            this.ufNaturality = in.readString(this.ufNaturality instanceof Utf8 ? (Utf8)this.ufNaturality : null);
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.naturality = null;
          } else {
            this.naturality = in.readString(this.naturality instanceof Utf8 ? (Utf8)this.naturality : null);
          }
          break;

        case 6:
          if (in.readIndex() != 1) {
            in.readNull();
            this.registryInformation = null;
          } else {
            if (this.registryInformation == null) {
              this.registryInformation = new ps.customer.event.avro.RegistryInformation();
            }
            this.registryInformation.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










