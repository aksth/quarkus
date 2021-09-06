package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Event
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class Event   {
  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("day")
  private Integer day = null;

  @JsonProperty("fullDate")
  private String fullDate = null;

  @JsonProperty("month")
  private Integer month = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("year")
  private Integer year = null;

  public Event address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Event day(Integer day) {
    this.day = day;
    return this;
  }

  /**
   * Get day
   * @return day
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public Event fullDate(String fullDate) {
    this.fullDate = fullDate;
    return this;
  }

  /**
   * Get fullDate
   * @return fullDate
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getFullDate() {
    return fullDate;
  }

  public void setFullDate(String fullDate) {
    this.fullDate = fullDate;
  }

  public Event month(Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public Event type(String type) {
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

  public Event year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.address, event.address) &&
        Objects.equals(this.day, event.day) &&
        Objects.equals(this.fullDate, event.fullDate) &&
        Objects.equals(this.month, event.month) &&
        Objects.equals(this.type, event.type) &&
        Objects.equals(this.year, event.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, day, fullDate, month, type, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    fullDate: ").append(toIndentedString(fullDate)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
