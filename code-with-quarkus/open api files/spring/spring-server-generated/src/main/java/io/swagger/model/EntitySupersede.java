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
 * EntitySupersede
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class EntitySupersede   {
  @JsonProperty("entityId")
  private String entityId = null;

  @JsonProperty("supersedingEntityId")
  private String supersedingEntityId = null;

  public EntitySupersede entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Get entityId
   * @return entityId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public EntitySupersede supersedingEntityId(String supersedingEntityId) {
    this.supersedingEntityId = supersedingEntityId;
    return this;
  }

  /**
   * Get supersedingEntityId
   * @return supersedingEntityId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getSupersedingEntityId() {
    return supersedingEntityId;
  }

  public void setSupersedingEntityId(String supersedingEntityId) {
    this.supersedingEntityId = supersedingEntityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitySupersede entitySupersede = (EntitySupersede) o;
    return Objects.equals(this.entityId, entitySupersede.entityId) &&
        Objects.equals(this.supersedingEntityId, entitySupersede.supersedingEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, supersedingEntityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitySupersede {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    supersedingEntityId: ").append(toIndentedString(supersedingEntityId)).append("\n");
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
