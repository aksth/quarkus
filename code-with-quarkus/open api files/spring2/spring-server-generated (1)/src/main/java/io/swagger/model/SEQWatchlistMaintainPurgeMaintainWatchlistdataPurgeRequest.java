package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EntityPurge;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SEQWatchlistMaintainPurgeMaintainWatchlistdataPurgeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T10:17:24.699Z[GMT]")
public class SEQWatchlistMaintainPurgeMaintainWatchlistdataPurgeRequest   {
  @JsonProperty("entityPurge")
  @Valid
  private List<EntityPurge> entityPurge = new ArrayList<EntityPurge>();

  public SEQWatchlistMaintainPurgeMaintainWatchlistdataPurgeRequest entityPurge(List<EntityPurge> entityPurge) {
    this.entityPurge = entityPurge;
    return this;
  }

  public SEQWatchlistMaintainPurgeMaintainWatchlistdataPurgeRequest addEntityPurgeItem(EntityPurge entityPurgeItem) {
    this.entityPurge.add(entityPurgeItem);
    return this;
  }

  /**
   * Get entityPurge
   * @return entityPurge
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<EntityPurge> getEntityPurge() {
    return entityPurge;
  }

  public void setEntityPurge(List<EntityPurge> entityPurge) {
    this.entityPurge = entityPurge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEQWatchlistMaintainPurgeMaintainWatchlistdataPurgeRequest seQWatchlistMaintainPurgeMaintainWatchlistdataPurgeRequest = (SEQWatchlistMaintainPurgeMaintainWatchlistdataPurgeRequest) o;
    return Objects.equals(this.entityPurge, seQWatchlistMaintainPurgeMaintainWatchlistdataPurgeRequest.entityPurge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityPurge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEQWatchlistMaintainPurgeMaintainWatchlistdataPurgeRequest {\n");
    
    sb.append("    entityPurge: ").append(toIndentedString(entityPurge)).append("\n");
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
