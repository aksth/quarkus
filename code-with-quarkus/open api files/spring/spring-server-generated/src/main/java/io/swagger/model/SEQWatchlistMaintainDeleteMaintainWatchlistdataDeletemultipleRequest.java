package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EntityDelete;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SEQWatchlistMaintainDeleteMaintainWatchlistdataDeletemultipleRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class SEQWatchlistMaintainDeleteMaintainWatchlistdataDeletemultipleRequest   {
  @JsonProperty("entityDelete")
  @Valid
  private List<EntityDelete> entityDelete = new ArrayList<EntityDelete>();

  public SEQWatchlistMaintainDeleteMaintainWatchlistdataDeletemultipleRequest entityDelete(List<EntityDelete> entityDelete) {
    this.entityDelete = entityDelete;
    return this;
  }

  public SEQWatchlistMaintainDeleteMaintainWatchlistdataDeletemultipleRequest addEntityDeleteItem(EntityDelete entityDeleteItem) {
    this.entityDelete.add(entityDeleteItem);
    return this;
  }

  /**
   * Get entityDelete
   * @return entityDelete
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<EntityDelete> getEntityDelete() {
    return entityDelete;
  }

  public void setEntityDelete(List<EntityDelete> entityDelete) {
    this.entityDelete = entityDelete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEQWatchlistMaintainDeleteMaintainWatchlistdataDeletemultipleRequest seQWatchlistMaintainDeleteMaintainWatchlistdataDeletemultipleRequest = (SEQWatchlistMaintainDeleteMaintainWatchlistdataDeletemultipleRequest) o;
    return Objects.equals(this.entityDelete, seQWatchlistMaintainDeleteMaintainWatchlistdataDeletemultipleRequest.entityDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityDelete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEQWatchlistMaintainDeleteMaintainWatchlistdataDeletemultipleRequest {\n");
    
    sb.append("    entityDelete: ").append(toIndentedString(entityDelete)).append("\n");
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
