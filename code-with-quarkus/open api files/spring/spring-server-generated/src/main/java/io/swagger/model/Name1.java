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
 * Name1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class Name1   {
  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("givenName")
  private String givenName = null;

  @JsonProperty("languageCode")
  private String languageCode = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("originalScript")
  private String originalScript = null;

  @JsonProperty("prefix")
  private String prefix = null;

  @JsonProperty("suffix")
  private String suffix = null;

  public Name1 fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Name1 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Name1 givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  
    public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public Name1 languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Get languageCode
   * @return languageCode
  **/
  @ApiModelProperty(value = "")
  
    public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public Name1 lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Name1 originalScript(String originalScript) {
    this.originalScript = originalScript;
    return this;
  }

  /**
   * Get originalScript
   * @return originalScript
  **/
  @ApiModelProperty(value = "")
  
    public String getOriginalScript() {
    return originalScript;
  }

  public void setOriginalScript(String originalScript) {
    this.originalScript = originalScript;
  }

  public Name1 prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
  **/
  @ApiModelProperty(value = "")
  
    public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public Name1 suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  /**
   * Get suffix
   * @return suffix
  **/
  @ApiModelProperty(value = "")
  
    public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name1 name1 = (Name1) o;
    return Objects.equals(this.fullName, name1.fullName) &&
        Objects.equals(this.type, name1.type) &&
        Objects.equals(this.givenName, name1.givenName) &&
        Objects.equals(this.languageCode, name1.languageCode) &&
        Objects.equals(this.lastName, name1.lastName) &&
        Objects.equals(this.originalScript, name1.originalScript) &&
        Objects.equals(this.prefix, name1.prefix) &&
        Objects.equals(this.suffix, name1.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, type, givenName, languageCode, lastName, originalScript, prefix, suffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name1 {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    originalScript: ").append(toIndentedString(originalScript)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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
