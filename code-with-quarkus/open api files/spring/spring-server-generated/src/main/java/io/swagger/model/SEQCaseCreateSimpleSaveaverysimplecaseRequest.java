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
 * SEQCaseCreateSimpleSaveaverysimplecaseRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class SEQCaseCreateSimpleSaveaverysimplecaseRequest   {
  @JsonProperty("secondaryFields")
  @Valid
  private List<String> secondaryFields = new ArrayList<String>();

  @JsonProperty("entityType")
  private String entityType = null;

  @JsonProperty("customFields")
  @Valid
  private List<String> customFields = new ArrayList<String>();

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("providerTypes")
  @Valid
  private List<String> providerTypes = new ArrayList<String>();

  @JsonProperty("name")
  private String name = null;

  public SEQCaseCreateSimpleSaveaverysimplecaseRequest secondaryFields(List<String> secondaryFields) {
    this.secondaryFields = secondaryFields;
    return this;
  }

  public SEQCaseCreateSimpleSaveaverysimplecaseRequest addSecondaryFieldsItem(String secondaryFieldsItem) {
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

  public SEQCaseCreateSimpleSaveaverysimplecaseRequest entityType(String entityType) {
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

  public SEQCaseCreateSimpleSaveaverysimplecaseRequest customFields(List<String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public SEQCaseCreateSimpleSaveaverysimplecaseRequest addCustomFieldsItem(String customFieldsItem) {
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

  public SEQCaseCreateSimpleSaveaverysimplecaseRequest groupId(String groupId) {
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

  public SEQCaseCreateSimpleSaveaverysimplecaseRequest providerTypes(List<String> providerTypes) {
    this.providerTypes = providerTypes;
    return this;
  }

  public SEQCaseCreateSimpleSaveaverysimplecaseRequest addProviderTypesItem(String providerTypesItem) {
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

  public SEQCaseCreateSimpleSaveaverysimplecaseRequest name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEQCaseCreateSimpleSaveaverysimplecaseRequest seQCaseCreateSimpleSaveaverysimplecaseRequest = (SEQCaseCreateSimpleSaveaverysimplecaseRequest) o;
    return Objects.equals(this.secondaryFields, seQCaseCreateSimpleSaveaverysimplecaseRequest.secondaryFields) &&
        Objects.equals(this.entityType, seQCaseCreateSimpleSaveaverysimplecaseRequest.entityType) &&
        Objects.equals(this.customFields, seQCaseCreateSimpleSaveaverysimplecaseRequest.customFields) &&
        Objects.equals(this.groupId, seQCaseCreateSimpleSaveaverysimplecaseRequest.groupId) &&
        Objects.equals(this.providerTypes, seQCaseCreateSimpleSaveaverysimplecaseRequest.providerTypes) &&
        Objects.equals(this.name, seQCaseCreateSimpleSaveaverysimplecaseRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secondaryFields, entityType, customFields, groupId, providerTypes, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEQCaseCreateSimpleSaveaverysimplecaseRequest {\n");
    
    sb.append("    secondaryFields: ").append(toIndentedString(secondaryFields)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    providerTypes: ").append(toIndentedString(providerTypes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
