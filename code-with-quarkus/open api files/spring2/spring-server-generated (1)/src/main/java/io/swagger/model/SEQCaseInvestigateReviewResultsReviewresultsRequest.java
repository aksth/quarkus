package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SEQCaseInvestigateReviewResultsReviewresultsRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T10:17:24.699Z[GMT]")
public class SEQCaseInvestigateReviewResultsReviewresultsRequest   {
  @JsonProperty("resultIds")
  @Valid
  private List<String> resultIds = new ArrayList<String>();

  @JsonProperty("remark")
  private String remark = null;

  public SEQCaseInvestigateReviewResultsReviewresultsRequest resultIds(List<String> resultIds) {
    this.resultIds = resultIds;
    return this;
  }

  public SEQCaseInvestigateReviewResultsReviewresultsRequest addResultIdsItem(String resultIdsItem) {
    this.resultIds.add(resultIdsItem);
    return this;
  }

  /**
   * Get resultIds
   * @return resultIds
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public List<String> getResultIds() {
    return resultIds;
  }

  public void setResultIds(List<String> resultIds) {
    this.resultIds = resultIds;
  }

  public SEQCaseInvestigateReviewResultsReviewresultsRequest remark(String remark) {
    this.remark = remark;
    return this;
  }

  /**
   * Get remark
   * @return remark
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEQCaseInvestigateReviewResultsReviewresultsRequest seQCaseInvestigateReviewResultsReviewresultsRequest = (SEQCaseInvestigateReviewResultsReviewresultsRequest) o;
    return Objects.equals(this.resultIds, seQCaseInvestigateReviewResultsReviewresultsRequest.resultIds) &&
        Objects.equals(this.remark, seQCaseInvestigateReviewResultsReviewresultsRequest.remark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultIds, remark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEQCaseInvestigateReviewResultsReviewresultsRequest {\n");
    
    sb.append("    resultIds: ").append(toIndentedString(resultIds)).append("\n");
    sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
