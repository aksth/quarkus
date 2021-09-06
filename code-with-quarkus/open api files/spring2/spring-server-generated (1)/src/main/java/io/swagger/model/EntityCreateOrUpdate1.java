package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import io.swagger.model.CountryLink;
import io.swagger.model.Detail;
import io.swagger.model.Event;
import io.swagger.model.IdentityDocument;
import io.swagger.model.Name1;
import io.swagger.model.Role;
import io.swagger.model.Source;
import io.swagger.model.Weblink;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EntityCreateOrUpdate1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T10:17:24.699Z[GMT]")
public class EntityCreateOrUpdate1   {
  @JsonProperty("age")
  private String age = null;

  @JsonProperty("ageAsOfDate")
  private String ageAsOfDate = null;

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

  @JsonProperty("events")
  @Valid
  private List<Event> events = new ArrayList<Event>();

  @JsonProperty("externalImportId")
  private String externalImportId = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("identityDocuments")
  @Valid
  private List<IdentityDocument> identityDocuments = new ArrayList<IdentityDocument>();

  @JsonProperty("names")
  @Valid
  private List<Name1> names = new ArrayList<Name1>();

  @JsonProperty("roles")
  @Valid
  private List<Role> roles = new ArrayList<Role>();

  @JsonProperty("sources")
  @Valid
  private List<Source> sources = new ArrayList<Source>();

  @JsonProperty("updateCategory")
  private String updateCategory = null;

  @JsonProperty("weblinks")
  @Valid
  private List<Weblink> weblinks = new ArrayList<Weblink>();

  public EntityCreateOrUpdate1 age(String age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public EntityCreateOrUpdate1 ageAsOfDate(String ageAsOfDate) {
    this.ageAsOfDate = ageAsOfDate;
    return this;
  }

  /**
   * Get ageAsOfDate
   * @return ageAsOfDate
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getAgeAsOfDate() {
    return ageAsOfDate;
  }

  public void setAgeAsOfDate(String ageAsOfDate) {
    this.ageAsOfDate = ageAsOfDate;
  }

  public EntityCreateOrUpdate1 addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public EntityCreateOrUpdate1 addAddressesItem(Address addressesItem) {
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

  public EntityCreateOrUpdate1 category(String category) {
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

  public EntityCreateOrUpdate1 countryLinks(List<CountryLink> countryLinks) {
    this.countryLinks = countryLinks;
    return this;
  }

  public EntityCreateOrUpdate1 addCountryLinksItem(CountryLink countryLinksItem) {
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

  public EntityCreateOrUpdate1 creationDate(String creationDate) {
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

  public EntityCreateOrUpdate1 details(List<Detail> details) {
    this.details = details;
    return this;
  }

  public EntityCreateOrUpdate1 addDetailsItem(Detail detailsItem) {
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

  public EntityCreateOrUpdate1 entityId(String entityId) {
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

  public EntityCreateOrUpdate1 entityType(String entityType) {
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

  public EntityCreateOrUpdate1 events(List<Event> events) {
    this.events = events;
    return this;
  }

  public EntityCreateOrUpdate1 addEventsItem(Event eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<Event> getEvents() {
    return events;
  }

  public void setEvents(List<Event> events) {
    this.events = events;
  }

  public EntityCreateOrUpdate1 externalImportId(String externalImportId) {
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

  public EntityCreateOrUpdate1 gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public EntityCreateOrUpdate1 identityDocuments(List<IdentityDocument> identityDocuments) {
    this.identityDocuments = identityDocuments;
    return this;
  }

  public EntityCreateOrUpdate1 addIdentityDocumentsItem(IdentityDocument identityDocumentsItem) {
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

  public EntityCreateOrUpdate1 names(List<Name1> names) {
    this.names = names;
    return this;
  }

  public EntityCreateOrUpdate1 addNamesItem(Name1 namesItem) {
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
    public List<Name1> getNames() {
    return names;
  }

  public void setNames(List<Name1> names) {
    this.names = names;
  }

  public EntityCreateOrUpdate1 roles(List<Role> roles) {
    this.roles = roles;
    return this;
  }

  public EntityCreateOrUpdate1 addRolesItem(Role rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
    public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public EntityCreateOrUpdate1 sources(List<Source> sources) {
    this.sources = sources;
    return this;
  }

  public EntityCreateOrUpdate1 addSourcesItem(Source sourcesItem) {
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

  public EntityCreateOrUpdate1 updateCategory(String updateCategory) {
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

  public EntityCreateOrUpdate1 weblinks(List<Weblink> weblinks) {
    this.weblinks = weblinks;
    return this;
  }

  public EntityCreateOrUpdate1 addWeblinksItem(Weblink weblinksItem) {
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
    EntityCreateOrUpdate1 entityCreateOrUpdate1 = (EntityCreateOrUpdate1) o;
    return Objects.equals(this.age, entityCreateOrUpdate1.age) &&
        Objects.equals(this.ageAsOfDate, entityCreateOrUpdate1.ageAsOfDate) &&
        Objects.equals(this.addresses, entityCreateOrUpdate1.addresses) &&
        Objects.equals(this.category, entityCreateOrUpdate1.category) &&
        Objects.equals(this.countryLinks, entityCreateOrUpdate1.countryLinks) &&
        Objects.equals(this.creationDate, entityCreateOrUpdate1.creationDate) &&
        Objects.equals(this.details, entityCreateOrUpdate1.details) &&
        Objects.equals(this.entityId, entityCreateOrUpdate1.entityId) &&
        Objects.equals(this.entityType, entityCreateOrUpdate1.entityType) &&
        Objects.equals(this.events, entityCreateOrUpdate1.events) &&
        Objects.equals(this.externalImportId, entityCreateOrUpdate1.externalImportId) &&
        Objects.equals(this.gender, entityCreateOrUpdate1.gender) &&
        Objects.equals(this.identityDocuments, entityCreateOrUpdate1.identityDocuments) &&
        Objects.equals(this.names, entityCreateOrUpdate1.names) &&
        Objects.equals(this.roles, entityCreateOrUpdate1.roles) &&
        Objects.equals(this.sources, entityCreateOrUpdate1.sources) &&
        Objects.equals(this.updateCategory, entityCreateOrUpdate1.updateCategory) &&
        Objects.equals(this.weblinks, entityCreateOrUpdate1.weblinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, ageAsOfDate, addresses, category, countryLinks, creationDate, details, entityId, entityType, events, externalImportId, gender, identityDocuments, names, roles, sources, updateCategory, weblinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityCreateOrUpdate1 {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    ageAsOfDate: ").append(toIndentedString(ageAsOfDate)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    countryLinks: ").append(toIndentedString(countryLinks)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    externalImportId: ").append(toIndentedString(externalImportId)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    identityDocuments: ").append(toIndentedString(identityDocuments)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
