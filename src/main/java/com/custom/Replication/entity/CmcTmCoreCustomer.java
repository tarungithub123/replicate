package com.custom.Replication.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "CMC_TM_CORE_CUSTOMER")
@NamedQuery(query = "select u from CmcTmCoreCustomer u where u.customerNo = :customerNo", name = "QueryByCustomerNo")
public class CmcTmCoreCustomer implements Serializable {
	
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")@Column(name="Id")
	private String id; 
	

	@Column(name = "COUNTRY", length = 12)
	private String country;
	@Column(name = "LANGUAGE", length = 12)
	private String language;
	@Column(name = "NATIONALITY", length = 12)
	private String nationality;
	@Column(name = "DECEASED", length = 4)
	private String deceased;
	@Column(name = "FROZEN", length = 4)
	private String frozen;
	@Column(name = "WHEREABOUTS_UNKNOWN", length = 4)
	private String whereaboutsUnknown;
	@Column(name = "RM_ID", length = 48)
	private String rmId;
	@Column(name = "SANCTIONS_CHECKS_REQUIRED", length = 4)
	private String sanctionsChecksRequired;
	@Column(name = "WALKIN_CUSTOMER", length = 4)
	private String walkinCustomer;
	@Column(name = "SOURCE_SYSTEM", length = 140)
	private String sourceSystem;
	@Column(name = "SOURCE_SYSTEM_CUST_NO", length = 140)
	private String sourceSystemCustNo;
	@Column(name = "CUSTOMER_NO", length = 80)
	private String customerNo;
	@Column(name = "HOST_CODE", length = 32)
	private String hostCode;
	@Column(name = "CUSTOMER_TYPE", length = 4)
	private String customerType;
	@Column(name = "CUSTOMER_CATEGORY", length = 40)
	private String customerCategory;
	@Column(name = "CUSTOMER_NAME1", length = 140)
	private String customerName1;
	@Column(name = "SHORT_NAME", length = 80)
	private String shortName;
	@Column(name = "ADDRESS_LINE1", length = 140)
	private String addressLine1;
	@Column(name = "ADDRESS_LINE2", length = 140)
	private String addressLine2;
	@Column(name = "ADDRESS_LINE3", length = 140)
	private String addressLine3;
	@Column(name = "ADDRESS_LINE4", length = 140)
	private String addressLine4;
	@Column(name = "PINCODE", length = 60)
	private String pincode;
	@Column(name = "IS_FORGOTTEN", length = 1)
	private String isForgotten;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDeceased() {
		return deceased;
	}

	public void setDeceased(String deceased) {
		this.deceased = deceased;
	}

	public String getFrozen() {
		return frozen;
	}

	public void setFrozen(String frozen) {
		this.frozen = frozen;
	}

	public String getWhereaboutsUnknown() {
		return whereaboutsUnknown;
	}

	public void setWhereaboutsUnknown(String whereaboutsUnknown) {
		this.whereaboutsUnknown = whereaboutsUnknown;
	}

	public String getRmId() {
		return rmId;
	}

	public void setRmId(String rmId) {
		this.rmId = rmId;
	}

	public String getSanctionsChecksRequired() {
		return sanctionsChecksRequired;
	}

	public void setSanctionsChecksRequired(String sanctionsChecksRequired) {
		this.sanctionsChecksRequired = sanctionsChecksRequired;
	}

	public String getWalkinCustomer() {
		return walkinCustomer;
	}

	public void setWalkinCustomer(String walkinCustomer) {
		this.walkinCustomer = walkinCustomer;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getSourceSystemCustNo() {
		return sourceSystemCustNo;
	}

	public void setSourceSystemCustNo(String sourceSystemCustNo) {
		this.sourceSystemCustNo = sourceSystemCustNo;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getHostCode() {
		return hostCode;
	}

	public void setHostCode(String hostCode) {
		this.hostCode = hostCode;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCustomerCategory() {
		return customerCategory;
	}

	public void setCustomerCategory(String customerCategory) {
		this.customerCategory = customerCategory;
	}

	public String getCustomerName1() {
		return customerName1;
	}

	public void setCustomerName1(String customerName1) {
		this.customerName1 = customerName1;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getIsForgotten() {
		return isForgotten;
	}

	public void setIsForgotten(String isForgotten) {
		this.isForgotten = isForgotten;

	}

	@Override
	public String toString() {
		return "CmcTmCoreCustomer [id=" + id + ", country=" + country + ", language=" + language + ", nationality="
				+ nationality + ", deceased=" + deceased + ", frozen=" + frozen + ", whereaboutsUnknown="
				+ whereaboutsUnknown + ", rmId=" + rmId + ", sanctionsChecksRequired=" + sanctionsChecksRequired
				+ ", walkinCustomer=" + walkinCustomer + ", sourceSystem=" + sourceSystem + ", sourceSystemCustNo="
				+ sourceSystemCustNo + ", customerNo=" + customerNo + ", hostCode=" + hostCode + ", customerType="
				+ customerType + ", customerCategory=" + customerCategory + ", customerName1=" + customerName1
				+ ", shortName=" + shortName + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", addressLine3=" + addressLine3 + ", addressLine4=" + addressLine4 + ", pincode=" + pincode
				+ ", isForgotten=" + isForgotten + "]";
	}

	
}