package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomField;
import io.swagger.model.SecondaryField5;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SEQCaseCreateIndividualSaveacaseIndividualRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
public class SEQCaseCreateIndividualSaveacaseIndividualRequest   {
  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("entityType")
  private String entityType = null;

  @JsonProperty("providerTypes")
  @Valid
  private List<String> providerTypes = new ArrayList<String>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("customFields")
  @Valid
  private List<CustomField> customFields = new ArrayList<CustomField>();

  @JsonProperty("secondaryFields")
  @Valid
  private List<SecondaryField5> secondaryFields = new ArrayList<SecondaryField5>();

  public SEQCaseCreateIndividualSaveacaseIndividualRequest groupId(String groupId) {
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

  public SEQCaseCreateIndividualSaveacaseIndividualRequest entityType(String entityType) {
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

  public SEQCaseCreateIndividualSaveacaseIndividualRequest providerTypes(List<String> providerTypes) {
    this.providerTypes = providerTypes;
    return this;
  }

  public SEQCaseCreateIndividualSaveacaseIndividualRequest addProviderTypesItem(String providerTypesItem) {
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

  public SEQCaseCreateIndividualSaveacaseIndividualRequest name(String name) {
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

  public SEQCaseCreateIndividualSaveacaseIndividualRequest customFields(List<CustomField> customFields) {
    this.customFields = customFields;
    return this;
  }

  public SEQCaseCreateIndividualSaveacaseIndividualRequest addCustomFieldsItem(CustomField customFieldsItem) {
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<CustomField> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<CustomField> customFields) {
    this.customFields = customFields;
  }

  public SEQCaseCreateIndividualSaveacaseIndividualRequest secondaryFields(List<SecondaryField5> secondaryFields) {
    this.secondaryFields = secondaryFields;
    return this;
  }

  public SEQCaseCreateIndividualSaveacaseIndividualRequest addSecondaryFieldsItem(SecondaryField5 secondaryFieldsItem) {
    this.secondaryFields.add(secondaryFieldsItem);
    return this;
  }

  /**
   * Get secondaryFields
   * @return secondaryFields
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<SecondaryField5> getSecondaryFields() {
    return secondaryFields;
  }

  public void setSecondaryFields(List<SecondaryField5> secondaryFields) {
    this.secondaryFields = secondaryFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SEQCaseCreateIndividualSaveacaseIndividualRequest seQCaseCreateIndividualSaveacaseIndividualRequest = (SEQCaseCreateIndividualSaveacaseIndividualRequest) o;
    return Objects.equals(this.groupId, seQCaseCreateIndividualSaveacaseIndividualRequest.groupId) &&
        Objects.equals(this.entityType, seQCaseCreateIndividualSaveacaseIndividualRequest.entityType) &&
        Objects.equals(this.providerTypes, seQCaseCreateIndividualSaveacaseIndividualRequest.providerTypes) &&
        Objects.equals(this.name, seQCaseCreateIndividualSaveacaseIndividualRequest.name) &&
        Objects.equals(this.customFields, seQCaseCreateIndividualSaveacaseIndividualRequest.customFields) &&
        Objects.equals(this.secondaryFields, seQCaseCreateIndividualSaveacaseIndividualRequest.secondaryFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, entityType, providerTypes, name, customFields, secondaryFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SEQCaseCreateIndividualSaveacaseIndividualRequest {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    providerTypes: ").append(toIndentedString(providerTypes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    secondaryFields: ").append(toIndentedString(secondaryFields)).append("\n");
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
