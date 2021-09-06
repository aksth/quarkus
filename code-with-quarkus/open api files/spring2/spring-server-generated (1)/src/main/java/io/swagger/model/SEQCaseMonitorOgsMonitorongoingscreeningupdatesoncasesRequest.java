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
 * SEQCaseMonitorOgsMonitorongoingscreeningupdatesoncasesRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T10:17:24.699Z[GMT]")
public class SEQCaseMonitorOgsMonitorongoingscreeningupdatesoncasesRequest   {
  @JsonProperty("query")
  private String query = null;

  public SEQCaseMonitorOgsMonitorongoingscreeningupdatesoncasesRequest query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEQCaseMonitorOgsMonitorongoingscreeningupdatesoncasesRequest seQCaseMonitorOgsMonitorongoingscreeningupdatesoncasesRequest = (SEQCaseMonitorOgsMonitorongoingscreeningupdatesoncasesRequest) o;
    return Objects.equals(this.query, seQCaseMonitorOgsMonitorongoingscreeningupdatesoncasesRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEQCaseMonitorOgsMonitorongoingscreeningupdatesoncasesRequest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
