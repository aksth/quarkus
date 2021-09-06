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
 * SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest   {
  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("entityType")
  private String entityType = null;

  @JsonProperty("providerTypes")
  @Valid
  private List<String> providerTypes = new ArrayList<String>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("secondaryFields")
  @Valid
  private List<String> secondaryFields = new ArrayList<String>();

  @JsonProperty("customFields")
  @Valid
  private List<String> customFields = new ArrayList<String>();

  public SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest entityType(String entityType) {
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

  public SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest providerTypes(List<String> providerTypes) {
    this.providerTypes = providerTypes;
    return this;
  }

  public SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest addProviderTypesItem(String providerTypesItem) {
    this.providerTypes.add(providerTypesItem);
    return this;
  }

  /**
   * Get providerTypes
   * @return providerTypes
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public List<String> getProviderTypes() {
    return providerTypes;
  }

  public void setProviderTypes(List<String> providerTypes) {
    this.providerTypes = providerTypes;
  }

  public SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest secondaryFields(List<String> secondaryFields) {
    this.secondaryFields = secondaryFields;
    return this;
  }

  public SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest addSecondaryFieldsItem(String secondaryFieldsItem) {
    this.secondaryFields.add(secondaryFieldsItem);
    return this;
  }

  /**
   * Get secondaryFields
   * @return secondaryFields
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public List<String> getSecondaryFields() {
    return secondaryFields;
  }

  public void setSecondaryFields(List<String> secondaryFields) {
    this.secondaryFields = secondaryFields;
  }

  public SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest customFields(List<String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest addCustomFieldsItem(String customFieldsItem) {
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public List<String> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<String> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest seQScreenSyncSimplePerformSynchronousScreeningSimpleRequest = (SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest) o;
    return Objects.equals(this.groupId, seQScreenSyncSimplePerformSynchronousScreeningSimpleRequest.groupId) &&
        Objects.equals(this.entityType, seQScreenSyncSimplePerformSynchronousScreeningSimpleRequest.entityType) &&
        Objects.equals(this.providerTypes, seQScreenSyncSimplePerformSynchronousScreeningSimpleRequest.providerTypes) &&
        Objects.equals(this.name, seQScreenSyncSimplePerformSynchronousScreeningSimpleRequest.name) &&
        Objects.equals(this.secondaryFields, seQScreenSyncSimplePerformSynchronousScreeningSimpleRequest.secondaryFields) &&
        Objects.equals(this.customFields, seQScreenSyncSimplePerformSynchronousScreeningSimpleRequest.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, entityType, providerTypes, name, secondaryFields, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEQScreenSyncSimplePerformSynchronousScreeningSimpleRequest {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    providerTypes: ").append(toIndentedString(providerTypes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryFields: ").append(toIndentedString(secondaryFields)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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
