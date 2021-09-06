package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EntitySupersede;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SEQWatchlistMaintainIndividualMaintainWatchlistdataSupersedeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T10:17:24.699Z[GMT]")
public class SEQWatchlistMaintainIndividualMaintainWatchlistdataSupersedeRequest   {
  @JsonProperty("entitySupersede")
  @Valid
  private List<EntitySupersede> entitySupersede = new ArrayList<EntitySupersede>();

  public SEQWatchlistMaintainIndividualMaintainWatchlistdataSupersedeRequest entitySupersede(List<EntitySupersede> entitySupersede) {
    this.entitySupersede = entitySupersede;
    return this;
  }

  public SEQWatchlistMaintainIndividualMaintainWatchlistdataSupersedeRequest addEntitySupersedeItem(EntitySupersede entitySupersedeItem) {
    this.entitySupersede.add(entitySupersedeItem);
    return this;
  }

  /**
   * Get entitySupersede
   * @return entitySupersede
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<EntitySupersede> getEntitySupersede() {
    return entitySupersede;
  }

  public void setEntitySupersede(List<EntitySupersede> entitySupersede) {
    this.entitySupersede = entitySupersede;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEQWatchlistMaintainIndividualMaintainWatchlistdataSupersedeRequest seQWatchlistMaintainIndividualMaintainWatchlistdataSupersedeRequest = (SEQWatchlistMaintainIndividualMaintainWatchlistdataSupersedeRequest) o;
    return Objects.equals(this.entitySupersede, seQWatchlistMaintainIndividualMaintainWatchlistdataSupersedeRequest.entitySupersede);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitySupersede);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEQWatchlistMaintainIndividualMaintainWatchlistdataSupersedeRequest {\n");
    
    sb.append("    entitySupersede: ").append(toIndentedString(entitySupersede)).append("\n");
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
