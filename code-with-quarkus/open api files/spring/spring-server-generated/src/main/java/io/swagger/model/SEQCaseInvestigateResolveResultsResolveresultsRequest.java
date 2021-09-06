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
 * SEQCaseInvestigateResolveResultsResolveresultsRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class SEQCaseInvestigateResolveResultsResolveresultsRequest   {
  @JsonProperty("resultIds")
  @Valid
  private List<String> resultIds = new ArrayList<String>();

  @JsonProperty("statusId")
  private String statusId = null;

  @JsonProperty("riskId")
  private String riskId = null;

  @JsonProperty("reasonId")
  private String reasonId = null;

  @JsonProperty("resolutionRemark")
  private String resolutionRemark = null;

  public SEQCaseInvestigateResolveResultsResolveresultsRequest resultIds(List<String> resultIds) {
    this.resultIds = resultIds;
    return this;
  }

  public SEQCaseInvestigateResolveResultsResolveresultsRequest addResultIdsItem(String resultIdsItem) {
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

  public SEQCaseInvestigateResolveResultsResolveresultsRequest statusId(String statusId) {
    this.statusId = statusId;
    return this;
  }

  /**
   * Get statusId
   * @return statusId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getStatusId() {
    return statusId;
  }

  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }

  public SEQCaseInvestigateResolveResultsResolveresultsRequest riskId(String riskId) {
    this.riskId = riskId;
    return this;
  }

  /**
   * Get riskId
   * @return riskId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getRiskId() {
    return riskId;
  }

  public void setRiskId(String riskId) {
    this.riskId = riskId;
  }

  public SEQCaseInvestigateResolveResultsResolveresultsRequest reasonId(String reasonId) {
    this.reasonId = reasonId;
    return this;
  }

  /**
   * Get reasonId
   * @return reasonId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getReasonId() {
    return reasonId;
  }

  public void setReasonId(String reasonId) {
    this.reasonId = reasonId;
  }

  public SEQCaseInvestigateResolveResultsResolveresultsRequest resolutionRemark(String resolutionRemark) {
    this.resolutionRemark = resolutionRemark;
    return this;
  }

  /**
   * Get resolutionRemark
   * @return resolutionRemark
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getResolutionRemark() {
    return resolutionRemark;
  }

  public void setResolutionRemark(String resolutionRemark) {
    this.resolutionRemark = resolutionRemark;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEQCaseInvestigateResolveResultsResolveresultsRequest seQCaseInvestigateResolveResultsResolveresultsRequest = (SEQCaseInvestigateResolveResultsResolveresultsRequest) o;
    return Objects.equals(this.resultIds, seQCaseInvestigateResolveResultsResolveresultsRequest.resultIds) &&
        Objects.equals(this.statusId, seQCaseInvestigateResolveResultsResolveresultsRequest.statusId) &&
        Objects.equals(this.riskId, seQCaseInvestigateResolveResultsResolveresultsRequest.riskId) &&
        Objects.equals(this.reasonId, seQCaseInvestigateResolveResultsResolveresultsRequest.reasonId) &&
        Objects.equals(this.resolutionRemark, seQCaseInvestigateResolveResultsResolveresultsRequest.resolutionRemark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultIds, statusId, riskId, reasonId, resolutionRemark);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEQCaseInvestigateResolveResultsResolveresultsRequest {\n");
    
    sb.append("    resultIds: ").append(toIndentedString(resultIds)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    riskId: ").append(toIndentedString(riskId)).append("\n");
    sb.append("    reasonId: ").append(toIndentedString(reasonId)).append("\n");
    sb.append("    resolutionRemark: ").append(toIndentedString(resolutionRemark)).append("\n");
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
