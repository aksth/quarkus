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
 * Source
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class Source   {
  @JsonProperty("abbreviation")
  private String abbreviation = null;

  @JsonProperty("identifier")
  private String identifier = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("providerSourceStatus")
  private String providerSourceStatus = null;

  @JsonProperty("type")
  private Object type = null;

  public Source abbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
    return this;
  }

  /**
   * Get abbreviation
   * @return abbreviation
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public Source identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Source name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Source providerSourceStatus(String providerSourceStatus) {
    this.providerSourceStatus = providerSourceStatus;
    return this;
  }

  /**
   * Get providerSourceStatus
   * @return providerSourceStatus
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getProviderSourceStatus() {
    return providerSourceStatus;
  }

  public void setProviderSourceStatus(String providerSourceStatus) {
    this.providerSourceStatus = providerSourceStatus;
  }

  public Source type(Object type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Source source = (Source) o;
    return Objects.equals(this.abbreviation, source.abbreviation) &&
        Objects.equals(this.identifier, source.identifier) &&
        Objects.equals(this.name, source.name) &&
        Objects.equals(this.providerSourceStatus, source.providerSourceStatus) &&
        Objects.equals(this.type, source.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviation, identifier, name, providerSourceStatus, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    
    sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerSourceStatus: ").append(toIndentedString(providerSourceStatus)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
