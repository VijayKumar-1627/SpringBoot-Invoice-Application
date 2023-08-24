package com.invoice.invoiceapplication.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="business")
public class BusinessEntity {
	
	@Id
	@Column(name="business_Id",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int businessId;
	
	@Column(name="business_name",nullable= false,length=20)
	public String businessName;
	
	@Column(name="address",nullable=false)
	public String Address;
	
	@Column(name="spoc",nullable=false)
	public String Spoc;
	
	@Column(name="Gst_no",nullable=false)
	public String GstNo;
	
	@Column(name ="billing_type",nullable=false)
	public String billingType;
	
	@Column(name="currency",nullable =false)
	public Long Currency;
	
	@Column(name="created_date",nullable =false)
	public Date createdDate;
	
	@Column(name="updated_date",nullable =false)
	public Date updatedDate;
	
	@Column(name="created_by",nullable =false)
	public String createdBy;
	
	@Column(name="updated_by",nullable =false)
	public String updatedBy;

	public int getBusinessId() {
		return businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getSpoc() {
		return Spoc;
	}

	public void setSpoc(String spoc) {
		Spoc = spoc;
	}

	public String getGstNo() {
		return GstNo;
	}

	public void setGstNo(String gstNo) {
		GstNo = gstNo;
	}

	public String getBillingType() {
		return billingType;
	}

	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}

	public Long getCurrency() {
		return Currency;
	}

	public void setCurrency(Long currency) {
		Currency = currency;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public BusinessEntity() {};
	public BusinessEntity(int businessId, String businessName, String address, String spoc, String gstNo,
			String billingType, Long currency, Date createdDate, Date updatedDate, String createdBy, String updatedBy) {
		super();
		this.businessId = businessId;
		this.businessName = businessName;
		this.Address = address;
		this.Spoc = spoc;
		this.GstNo = gstNo;
		this.billingType = billingType;
		this.Currency = currency;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}
	

}
