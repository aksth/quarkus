package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DateTimeValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecondaryField
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T10:17:24.699Z[GMT]")
public class SecondaryField   {
  @JsonProperty("typeId")
  private String typeId = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("dateTimeValue")
  private DateTimeValue dateTimeValue = null;

  public SecondaryField typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * Get typeId
   * @return typeId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public SecondaryField value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SecondaryField dateTimeValue(DateTimeValue dateTimeValue) {
    this.dateTimeValue = dateTimeValue;
    return this;
  }

  /**
   * Get dateTimeValue
   * @return dateTimeValue
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public DateTimeValue getDateTimeValue() {
    return dateTimeValue;
  }

  public void setDateTimeValue(DateTimeValue dateTimeValue) {
    this.dateTimeValue = dateTimeValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondaryField secondaryField = (SecondaryField) o;
    return Objects.equals(this.typeId, secondaryField.typeId) &&
        Objects.equals(this.value, secondaryField.value) &&
        Objects.equals(this.dateTimeValue, secondaryField.dateTimeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, value, dateTimeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondaryField {\n");
    
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    dateTimeValue: ").append(toIndentedString(dateTimeValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
