package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SecondaryField5
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class SecondaryField5   {
  @JsonProperty("typeId")
  private String typeId = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("dateTimeValue")
  private String dateTimeValue = null;

  public SecondaryField5 typeId(String typeId) {
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

  public SecondaryField5 value(String value) {
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

  public SecondaryField5 dateTimeValue(String dateTimeValue) {
    this.dateTimeValue = dateTimeValue;
    return this;
  }

  /**
   * Get dateTimeValue
   * @return dateTimeValue
  **/
  @ApiModelProperty(value = "")
  
    public String getDateTimeValue() {
    return dateTimeValue;
  }

  public void setDateTimeValue(String dateTimeValue) {
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
    SecondaryField5 secondaryField5 = (SecondaryField5) o;
    return Objects.equals(this.typeId, secondaryField5.typeId) &&
        Objects.equals(this.value, secondaryField5.value) &&
        Objects.equals(this.dateTimeValue, secondaryField5.dateTimeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, value, dateTimeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondaryField5 {\n");
    
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
