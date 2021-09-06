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
 * DateTimeValue
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class DateTimeValue   {
  @JsonProperty("timelinePrecision")
  private String timelinePrecision = null;

  @JsonProperty("pointInTimePrecision")
  private String pointInTimePrecision = null;

  @JsonProperty("utcDateTime")
  private Long utcDateTime = null;

  @JsonProperty("timeZone")
  private String timeZone = null;

  public DateTimeValue timelinePrecision(String timelinePrecision) {
    this.timelinePrecision = timelinePrecision;
    return this;
  }

  /**
   * Get timelinePrecision
   * @return timelinePrecision
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getTimelinePrecision() {
    return timelinePrecision;
  }

  public void setTimelinePrecision(String timelinePrecision) {
    this.timelinePrecision = timelinePrecision;
  }

  public DateTimeValue pointInTimePrecision(String pointInTimePrecision) {
    this.pointInTimePrecision = pointInTimePrecision;
    return this;
  }

  /**
   * Get pointInTimePrecision
   * @return pointInTimePrecision
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getPointInTimePrecision() {
    return pointInTimePrecision;
  }

  public void setPointInTimePrecision(String pointInTimePrecision) {
    this.pointInTimePrecision = pointInTimePrecision;
  }

  public DateTimeValue utcDateTime(Long utcDateTime) {
    this.utcDateTime = utcDateTime;
    return this;
  }

  /**
   * Get utcDateTime
   * @return utcDateTime
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Long getUtcDateTime() {
    return utcDateTime;
  }

  public void setUtcDateTime(Long utcDateTime) {
    this.utcDateTime = utcDateTime;
  }

  public DateTimeValue timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * Get timeZone
   * @return timeZone
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeValue dateTimeValue = (DateTimeValue) o;
    return Objects.equals(this.timelinePrecision, dateTimeValue.timelinePrecision) &&
        Objects.equals(this.pointInTimePrecision, dateTimeValue.pointInTimePrecision) &&
        Objects.equals(this.utcDateTime, dateTimeValue.utcDateTime) &&
        Objects.equals(this.timeZone, dateTimeValue.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timelinePrecision, pointInTimePrecision, utcDateTime, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeValue {\n");
    
    sb.append("    timelinePrecision: ").append(toIndentedString(timelinePrecision)).append("\n");
    sb.append("    pointInTimePrecision: ").append(toIndentedString(pointInTimePrecision)).append("\n");
    sb.append("    utcDateTime: ").append(toIndentedString(utcDateTime)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
