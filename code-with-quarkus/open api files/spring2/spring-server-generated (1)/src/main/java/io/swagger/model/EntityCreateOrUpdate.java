package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Name;
import io.swagger.model.Source;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EntityCreateOrUpdate
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T10:17:24.699Z[GMT]")
public class EntityCreateOrUpdate   {
  @JsonProperty("entityId")
  private String entityId = null;

  @JsonProperty("externalImportId")
  private String externalImportId = null;

  @JsonProperty("creationDate")
  private String creationDate = null;

  @JsonProperty("entityType")
  private String entityType = null;

  @JsonProperty("sources")
  @Valid
  private List<Source> sources = new ArrayList<Source>();

  @JsonProperty("names")
  @Valid
  private List<Name> names = new ArrayList<Name>();

  public EntityCreateOrUpdate entityId(String entityId) {
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

  public EntityCreateOrUpdate externalImportId(String externalImportId) {
    this.externalImportId = externalImportId;
    return this;
  }

  /**
   * Get externalImportId
   * @return externalImportId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getExternalImportId() {
    return externalImportId;
  }

  public void setExternalImportId(String externalImportId) {
    this.externalImportId = externalImportId;
  }

  public EntityCreateOrUpdate creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public EntityCreateOrUpdate entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public EntityCreateOrUpdate sources(List<Source> sources) {
    this.sources = sources;
    return this;
  }

  public EntityCreateOrUpdate addSourcesItem(Source sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * Get sources
   * @return sources
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<Source> getSources() {
    return sources;
  }

  public void setSources(List<Source> sources) {
    this.sources = sources;
  }

  public EntityCreateOrUpdate names(List<Name> names) {
    this.names = names;
    return this;
  }

  public EntityCreateOrUpdate addNamesItem(Name namesItem) {
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<Name> getNames() {
    return names;
  }

  public void setNames(List<Name> names) {
    this.names = names;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityCreateOrUpdate entityCreateOrUpdate = (EntityCreateOrUpdate) o;
    return Objects.equals(this.entityId, entityCreateOrUpdate.entityId) &&
        Objects.equals(this.externalImportId, entityCreateOrUpdate.externalImportId) &&
        Objects.equals(this.creationDate, entityCreateOrUpdate.creationDate) &&
        Objects.equals(this.entityType, entityCreateOrUpdate.entityType) &&
        Objects.equals(this.sources, entityCreateOrUpdate.sources) &&
        Objects.equals(this.names, entityCreateOrUpdate.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, externalImportId, creationDate, entityType, sources, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityCreateOrUpdate {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    externalImportId: ").append(toIndentedString(externalImportId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
