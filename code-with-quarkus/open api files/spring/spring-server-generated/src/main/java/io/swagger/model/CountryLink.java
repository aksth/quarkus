package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Country;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CountryLink
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class CountryLink   {
  @JsonProperty("country")
  private Country country = null;

  @JsonProperty("countryText")
  private String countryText = null;

  @JsonProperty("type")
  private String type = null;

  public CountryLink country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public CountryLink countryText(String countryText) {
    this.countryText = countryText;
    return this;
  }

  /**
   * Get countryText
   * @return countryText
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getCountryText() {
    return countryText;
  }

  public void setCountryText(String countryText) {
    this.countryText = countryText;
  }

  public CountryLink type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryLink countryLink = (CountryLink) o;
    return Objects.equals(this.country, countryLink.country) &&
        Objects.equals(this.countryText, countryLink.countryText) &&
        Objects.equals(this.type, countryLink.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, countryText, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryLink {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryText: ").append(toIndentedString(countryText)).append("\n");
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
