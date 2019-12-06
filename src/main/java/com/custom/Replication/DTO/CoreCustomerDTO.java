package com.custom.Replication.DTO;


import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CoreCustomerDTO
 */
@Validated

public class CoreCustomerDTO {
  @JsonProperty("country")
  private String country = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("nationality")
  private String nationality = null;

  @JsonProperty("deceased")
  private String deceased = null;

  @JsonProperty("frozen")
  private String frozen = null;

  @JsonProperty("whereaboutsUnknown")
  private String whereaboutsUnknown = null;

  @JsonProperty("rmId")
  private String rmId = null;

  @JsonProperty("sanctionsChecksRequired")
  private String sanctionsChecksRequired = null;

  @JsonProperty("walkinCustomer")
  private String walkinCustomer = null;

  @JsonProperty("sourceSystem")
  private String sourceSystem = null;

  @JsonProperty("sourceSystemCustNo")
  private String sourceSystemCustNo = null;

  @JsonProperty("customerNo")
  private String customerNo = null;

  @JsonProperty("hostCode")
  private String hostCode = null;

  @JsonProperty("customerType")
  private String customerType = null;

  @JsonProperty("customerCategory")
  private String customerCategory = null;

  @JsonProperty("customerName1")
  private String customerName1 = null;

  @JsonProperty("shortName")
  private String shortName = null;

  @JsonProperty("addressLine1")
  private String addressLine1 = null;

  @JsonProperty("addressLine2")
  private String addressLine2 = null;

  @JsonProperty("addressLine3")
  private String addressLine3 = null;

  @JsonProperty("addressLine4")
  private String addressLine4 = null;

  @JsonProperty("pincode")
  private String pincode = null;

  public CoreCustomerDTO country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country code of the customer?s address
   * @return country
  **/

@Pattern(regexp="([a-zA-Z0-9]+)?") 
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CoreCustomerDTO language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Customer's preferred language of communication
   * @return language
  **/
 

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CoreCustomerDTO nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Nationality of the customer
   * @return nationality
  **/

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public CoreCustomerDTO deceased(String deceased) {
    this.deceased = deceased;
    return this;
  }

  /**
   * Identifies that customer is deceased
   * @return deceased
  **/
  

  public String getDeceased() {
    return deceased;
  }

  public void setDeceased(String deceased) {
    this.deceased = deceased;
  }

  public CoreCustomerDTO frozen(String frozen) {
    this.frozen = frozen;
    return this;
  }

  /**
   * Identifies that the customer's account is frozen
   * @return frozen
  **/

@Pattern(regexp="[Y,N]") 
  public String getFrozen() {
    return frozen;
  }

  public void setFrozen(String frozen) {
    this.frozen = frozen;
  }

  public CoreCustomerDTO whereaboutsUnknown(String whereaboutsUnknown) {
    this.whereaboutsUnknown = whereaboutsUnknown;
    return this;
  }

  /**
   * Identifies that the customer's whareabouts not known
   * @return whereaboutsUnknown
  **/

@Pattern(regexp="[Y,N]") 
  public String getWhereaboutsUnknown() {
    return whereaboutsUnknown;
  }

  public void setWhereaboutsUnknown(String whereaboutsUnknown) {
    this.whereaboutsUnknown = whereaboutsUnknown;
  }

  public CoreCustomerDTO rmId(String rmId) {
    this.rmId = rmId;
    return this;
  }

  /**
   * Relational Manager's Id
   * @return rmId
  **/

@Pattern(regexp="([a-zA-Z0-9]+)?") @Size(min=0,max=12) 
  public String getRmId() {
    return rmId;
  }

  public void setRmId(String rmId) {
    this.rmId = rmId;
  }

  public CoreCustomerDTO sanctionsChecksRequired(String sanctionsChecksRequired) {
    this.sanctionsChecksRequired = sanctionsChecksRequired;
    return this;
  }

  /**
   * Indicates that the sanction check should be done or not
   * @return sanctionsChecksRequired
  **/

@Pattern(regexp="[Y,N]") 
  public String getSanctionsChecksRequired() {
    return sanctionsChecksRequired;
  }

  public void setSanctionsChecksRequired(String sanctionsChecksRequired) {
    this.sanctionsChecksRequired = sanctionsChecksRequired;
  }

  public CoreCustomerDTO walkinCustomer(String walkinCustomer) {
    this.walkinCustomer = walkinCustomer;
    return this;
  }

  /**
   * Walkin Customer
   * @return walkinCustomer
  **/


  public String getWalkinCustomer() {
    return walkinCustomer;
  }

  public void setWalkinCustomer(String walkinCustomer) {
    this.walkinCustomer = walkinCustomer;
  }

  public CoreCustomerDTO sourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
    return this;
  }

  /**
   * Name of the source system
   * @return sourceSystem
  **/
  @NotNull


  public String getSourceSystem() {
    return sourceSystem;
  }

  public void setSourceSystem(String sourceSystem) {
    this.sourceSystem = sourceSystem;
  }

  public CoreCustomerDTO sourceSystemCustNo(String sourceSystemCustNo) {
    this.sourceSystemCustNo = sourceSystemCustNo;
    return this;
  }

  /**
   * Customer identification details as per the source system.
   * @return sourceSystemCustNo
  **/
  
  @NotNull

@Pattern(regexp="[a-zA-Z0-9]+") @Size(min=1,max=35) 
  public String getSourceSystemCustNo() {
    return sourceSystemCustNo;
  }

  public void setSourceSystemCustNo(String sourceSystemCustNo) {
    this.sourceSystemCustNo = sourceSystemCustNo;
  }

  public CoreCustomerDTO customerNo(String customerNo) {
    this.customerNo = customerNo;
    return this;
  }

  /**
   * Customer Number of the external customer
   * @return customerNo
  **/
  @NotNull

@Pattern(regexp="[a-zA-Z0-9]+") @Size(min=1,max=20) 
  public String getCustomerNo() {
    return customerNo;
  }

  public void setCustomerNo(String customerNo) {
    this.customerNo = customerNo;
  }

  public CoreCustomerDTO hostCode(String hostCode) {
    this.hostCode = hostCode;
    return this;
  }

  /**
   * Displays the host code that is linked to the transaction branch of the customer
   * @return hostCode
  **/
 

  public String getHostCode() {
    return hostCode;
  }

  public void setHostCode(String hostCode) {
    this.hostCode = hostCode;
  }

  public CoreCustomerDTO customerType(String customerType) {
    this.customerType = customerType;
    return this;
  }

  /**
   * Customer type can be Individual,Corporate or Bank
   * @return customerType
  **/
 @NotNull

@Pattern(regexp="[I,C,B]") 
  public String getCustomerType() {
    return customerType;
  }

  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

  public CoreCustomerDTO customerCategory(String customerCategory) {
    this.customerCategory = customerCategory;
    return this;
  }

  /**
   * Category to which the customer belongs to
   * @return customerCategory
  **/
  

  public String getCustomerCategory() {
    return customerCategory;
  }

  public void setCustomerCategory(String customerCategory) {
    this.customerCategory = customerCategory;
  }

  public CoreCustomerDTO customerName1(String customerName1) {
    this.customerName1 = customerName1;
    return this;
  }

  /**
   * Name of the external customer
   * @return customerName1
  **/
 
@Pattern(regexp="([a-zA-Z0-9\\s]+)?") @Size(min=0,max=35) 
  public String getCustomerName1() {
    return customerName1;
  }

  public void setCustomerName1(String customerName1) {
    this.customerName1 = customerName1;
  }

  public CoreCustomerDTO shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * Short name of the custome
   * @return shortName
  **/
 
@Pattern(regexp="([a-zA-Z0-9\\s]+)?") @Size(min=0,max=20) 
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public CoreCustomerDTO addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * First line of the customer?s address
   * @return addressLine1
  **/
 
@Size(min=0,max=35) 
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public CoreCustomerDTO addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * Second line of the customer?s address
   * @return addressLine2
  **/
 
@Size(min=0,max=35) 
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public CoreCustomerDTO addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

  /**
   * Third line of the customer?s address
   * @return addressLine3
  **/

@Size(min=0,max=35) 
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public CoreCustomerDTO addressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
    return this;
  }

  /**
   * Fourth line of the customer?s address
   * @return addressLine4
  **/
 
@Size(min=0,max=35) 
  public String getAddressLine4() {
    return addressLine4;
  }

  public void setAddressLine4(String addressLine4) {
    this.addressLine4 = addressLine4;
  }

  public CoreCustomerDTO pincode(String pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * Pincode of the customer?s address
   * @return pincode
  **/
 
@Pattern(regexp="([a-zA-Z0-9]+)?") @Size(min=0,max=15) 
  public String getPincode() {
    return pincode;
  }

  public void setPincode(String pincode) {
    this.pincode = pincode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCustomerDTO coreCustomerDTO = (CoreCustomerDTO) o;
    return Objects.equals(this.country, coreCustomerDTO.country) &&
        Objects.equals(this.language, coreCustomerDTO.language) &&
        Objects.equals(this.nationality, coreCustomerDTO.nationality) &&
        Objects.equals(this.deceased, coreCustomerDTO.deceased) &&
        Objects.equals(this.frozen, coreCustomerDTO.frozen) &&
        Objects.equals(this.whereaboutsUnknown, coreCustomerDTO.whereaboutsUnknown) &&
        Objects.equals(this.rmId, coreCustomerDTO.rmId) &&
        Objects.equals(this.sanctionsChecksRequired, coreCustomerDTO.sanctionsChecksRequired) &&
        Objects.equals(this.walkinCustomer, coreCustomerDTO.walkinCustomer) &&
        Objects.equals(this.sourceSystem, coreCustomerDTO.sourceSystem) &&
        Objects.equals(this.sourceSystemCustNo, coreCustomerDTO.sourceSystemCustNo) &&
        Objects.equals(this.customerNo, coreCustomerDTO.customerNo) &&
        Objects.equals(this.hostCode, coreCustomerDTO.hostCode) &&
        Objects.equals(this.customerType, coreCustomerDTO.customerType) &&
        Objects.equals(this.customerCategory, coreCustomerDTO.customerCategory) &&
        Objects.equals(this.customerName1, coreCustomerDTO.customerName1) &&
        Objects.equals(this.shortName, coreCustomerDTO.shortName) &&
        Objects.equals(this.addressLine1, coreCustomerDTO.addressLine1) &&
        Objects.equals(this.addressLine2, coreCustomerDTO.addressLine2) &&
        Objects.equals(this.addressLine3, coreCustomerDTO.addressLine3) &&
        Objects.equals(this.addressLine4, coreCustomerDTO.addressLine4) &&
        Objects.equals(this.pincode, coreCustomerDTO.pincode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, language, nationality, deceased, frozen, whereaboutsUnknown, rmId, sanctionsChecksRequired, walkinCustomer, sourceSystem, sourceSystemCustNo, customerNo, hostCode, customerType, customerCategory, customerName1, shortName, addressLine1, addressLine2, addressLine3, addressLine4, pincode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCustomerDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    deceased: ").append(toIndentedString(deceased)).append("\n");
    sb.append("    frozen: ").append(toIndentedString(frozen)).append("\n");
    sb.append("    whereaboutsUnknown: ").append(toIndentedString(whereaboutsUnknown)).append("\n");
    sb.append("    rmId: ").append(toIndentedString(rmId)).append("\n");
    sb.append("    sanctionsChecksRequired: ").append(toIndentedString(sanctionsChecksRequired)).append("\n");
    sb.append("    walkinCustomer: ").append(toIndentedString(walkinCustomer)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
    sb.append("    sourceSystemCustNo: ").append(toIndentedString(sourceSystemCustNo)).append("\n");
    sb.append("    customerNo: ").append(toIndentedString(customerNo)).append("\n");
    sb.append("    hostCode: ").append(toIndentedString(hostCode)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    customerCategory: ").append(toIndentedString(customerCategory)).append("\n");
    sb.append("    customerName1: ").append(toIndentedString(customerName1)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    addressLine4: ").append(toIndentedString(addressLine4)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
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

