package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import io.swagger.model.CountryLink;
import io.swagger.model.Detail;
import io.swagger.model.IdentityDocument;
import io.swagger.model.Name2;
import io.swagger.model.Source;
import io.swagger.model.Weblink;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EntityCreateOrUpdate3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T10:17:24.699Z[GMT]")
public class EntityCreateOrUpdate3   {
  @JsonProperty("addresses")
  @Valid
  private List<Address> addresses = new ArrayList<Address>();

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("countryLinks")
  @Valid
  private List<CountryLink> countryLinks = new ArrayList<CountryLink>();

  @JsonProperty("creationDate")
  private String creationDate = null;

  @JsonProperty("details")
  @Valid
  private List<Detail> details = new ArrayList<Detail>();

  @JsonProperty("entityId")
  private String entityId = null;

  @JsonProperty("entityType")
  private String entityType = null;

  @JsonProperty("externalImportId")
  private String externalImportId = null;

  @JsonProperty("identityDocuments")
  @Valid
  private List<IdentityDocument> identityDocuments = new ArrayList<IdentityDocument>();

  @JsonProperty("imo")
  private String imo = null;

  @JsonProperty("names")
  @Valid
  private List<Name2> names = new ArrayList<Name2>();

  @JsonProperty("sources")
  @Valid
  private List<Source> sources = new ArrayList<Source>();

  @JsonProperty("updateCategory")
  private String updateCategory = null;

  @JsonProperty("weblinks")
  @Valid
  private List<Weblink> weblinks = new ArrayList<Weblink>();

  public EntityCreateOrUpdate3 addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public EntityCreateOrUpdate3 addAddressesItem(Address addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

  /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public EntityCreateOrUpdate3 category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public EntityCreateOrUpdate3 countryLinks(List<CountryLink> countryLinks) {
    this.countryLinks = countryLinks;
    return this;
  }

  public EntityCreateOrUpdate3 addCountryLinksItem(CountryLink countryLinksItem) {
    this.countryLinks.add(countryLinksItem);
    return this;
  }

  /**
   * Get countryLinks
   * @return countryLinks
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<CountryLink> getCountryLinks() {
    return countryLinks;
  }

  public void setCountryLinks(List<CountryLink> countryLinks) {
    this.countryLinks = countryLinks;
  }

  public EntityCreateOrUpdate3 creationDate(String creationDate) {
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

  public EntityCreateOrUpdate3 details(List<Detail> details) {
    this.details = details;
    return this;
  }

  public EntityCreateOrUpdate3 addDetailsItem(Detail detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<Detail> getDetails() {
    return details;
  }

  public void setDetails(List<Detail> details) {
    this.details = details;
  }

  public EntityCreateOrUpdate3 entityId(String entityId) {
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

  public EntityCreateOrUpdate3 entityType(String entityType) {
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

  public EntityCreateOrUpdate3 externalImportId(String externalImportId) {
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

  public EntityCreateOrUpdate3 identityDocuments(List<IdentityDocument> identityDocuments) {
    this.identityDocuments = identityDocuments;
    return this;
  }

  public EntityCreateOrUpdate3 addIdentityDocumentsItem(IdentityDocument identityDocumentsItem) {
    this.identityDocuments.add(identityDocumentsItem);
    return this;
  }

  /**
   * Get identityDocuments
   * @return identityDocuments
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<IdentityDocument> getIdentityDocuments() {
    return identityDocuments;
  }

  public void setIdentityDocuments(List<IdentityDocument> identityDocuments) {
    this.identityDocuments = identityDocuments;
  }

  public EntityCreateOrUpdate3 imo(String imo) {
    this.imo = imo;
    return this;
  }

  /**
   * Get imo
   * @return imo
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getImo() {
    return imo;
  }

  public void setImo(String imo) {
    this.imo = imo;
  }

  public EntityCreateOrUpdate3 names(List<Name2> names) {
    this.names = names;
    return this;
  }

  public EntityCreateOrUpdate3 addNamesItem(Name2 namesItem) {
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
    public List<Name2> getNames() {
    return names;
  }

  public void setNames(List<Name2> names) {
    this.names = names;
  }

  public EntityCreateOrUpdate3 sources(List<Source> sources) {
    this.sources = sources;
    return this;
  }

  public EntityCreateOrUpdate3 addSourcesItem(Source sourcesItem) {
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

  public EntityCreateOrUpdate3 updateCategory(String updateCategory) {
    this.updateCategory = updateCategory;
    return this;
  }

  /**
   * Get updateCategory
   * @return updateCategory
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getUpdateCategory() {
    return updateCategory;
  }

  public void setUpdateCategory(String updateCategory) {
    this.updateCategory = updateCategory;
  }

  public EntityCreateOrUpdate3 weblinks(List<Weblink> weblinks) {
    this.weblinks = weblinks;
    return this;
  }

  public EntityCreateOrUpdate3 addWeblinksItem(Weblink weblinksItem) {
    this.weblinks.add(weblinksItem);
    return this;
  }

  /**
   * Get weblinks
   * @return weblinks
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<Weblink> getWeblinks() {
    return weblinks;
  }

  public void setWeblinks(List<Weblink> weblinks) {
    this.weblinks = weblinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityCreateOrUpdate3 entityCreateOrUpdate3 = (EntityCreateOrUpdate3) o;
    return Objects.equals(this.addresses, entityCreateOrUpdate3.addresses) &&
        Objects.equals(this.category, entityCreateOrUpdate3.category) &&
        Objects.equals(this.countryLinks, entityCreateOrUpdate3.countryLinks) &&
        Objects.equals(this.creationDate, entityCreateOrUpdate3.creationDate) &&
        Objects.equals(this.details, entityCreateOrUpdate3.details) &&
        Objects.equals(this.entityId, entityCreateOrUpdate3.entityId) &&
        Objects.equals(this.entityType, entityCreateOrUpdate3.entityType) &&
        Objects.equals(this.externalImportId, entityCreateOrUpdate3.externalImportId) &&
        Objects.equals(this.identityDocuments, entityCreateOrUpdate3.identityDocuments) &&
        Objects.equals(this.imo, entityCreateOrUpdate3.imo) &&
        Objects.equals(this.names, entityCreateOrUpdate3.names) &&
        Objects.equals(this.sources, entityCreateOrUpdate3.sources) &&
        Objects.equals(this.updateCategory, entityCreateOrUpdate3.updateCategory) &&
        Objects.equals(this.weblinks, entityCreateOrUpdate3.weblinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, category, countryLinks, creationDate, details, entityId, entityType, externalImportId, identityDocuments, imo, names, sources, updateCategory, weblinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityCreateOrUpdate3 {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    countryLinks: ").append(toIndentedString(countryLinks)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    externalImportId: ").append(toIndentedString(externalImportId)).append("\n");
    sb.append("    identityDocuments: ").append(toIndentedString(identityDocuments)).append("\n");
    sb.append("    imo: ").append(toIndentedString(imo)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    updateCategory: ").append(toIndentedString(updateCategory)).append("\n");
    sb.append("    weblinks: ").append(toIndentedString(weblinks)).append("\n");
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
