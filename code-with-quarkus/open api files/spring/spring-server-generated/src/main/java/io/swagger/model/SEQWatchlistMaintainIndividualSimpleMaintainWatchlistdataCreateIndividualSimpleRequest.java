package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EntityCreateOrUpdate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SEQWatchlistMaintainIndividualSimpleMaintainWatchlistdataCreateIndividualSimpleRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class SEQWatchlistMaintainIndividualSimpleMaintainWatchlistdataCreateIndividualSimpleRequest   {
  @JsonProperty("entityCreateOrUpdate")
  @Valid
  private List<EntityCreateOrUpdate> entityCreateOrUpdate = new ArrayList<EntityCreateOrUpdate>();

  public SEQWatchlistMaintainIndividualSimpleMaintainWatchlistdataCreateIndividualSimpleRequest entityCreateOrUpdate(List<EntityCreateOrUpdate> entityCreateOrUpdate) {
    this.entityCreateOrUpdate = entityCreateOrUpdate;
    return this;
  }

  public SEQWatchlistMaintainIndividualSimpleMaintainWatchlistdataCreateIndividualSimpleRequest addEntityCreateOrUpdateItem(EntityCreateOrUpdate entityCreateOrUpdateItem) {
    this.entityCreateOrUpdate.add(entityCreateOrUpdateItem);
    return this;
  }

  /**
   * Get entityCreateOrUpdate
   * @return entityCreateOrUpdate
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<EntityCreateOrUpdate> getEntityCreateOrUpdate() {
    return entityCreateOrUpdate;
  }

  public void setEntityCreateOrUpdate(List<EntityCreateOrUpdate> entityCreateOrUpdate) {
    this.entityCreateOrUpdate = entityCreateOrUpdate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEQWatchlistMaintainIndividualSimpleMaintainWatchlistdataCreateIndividualSimpleRequest seQWatchlistMaintainIndividualSimpleMaintainWatchlistdataCreateIndividualSimpleRequest = (SEQWatchlistMaintainIndividualSimpleMaintainWatchlistdataCreateIndividualSimpleRequest) o;
    return Objects.equals(this.entityCreateOrUpdate, seQWatchlistMaintainIndividualSimpleMaintainWatchlistdataCreateIndividualSimpleRequest.entityCreateOrUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityCreateOrUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEQWatchlistMaintainIndividualSimpleMaintainWatchlistdataCreateIndividualSimpleRequest {\n");
    
    sb.append("    entityCreateOrUpdate: ").append(toIndentedString(entityCreateOrUpdate)).append("\n");
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
