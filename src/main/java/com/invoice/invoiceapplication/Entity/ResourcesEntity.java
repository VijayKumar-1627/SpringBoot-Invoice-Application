package com.invoice.invoiceapplication.Entity;

import java.sql.Date;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="resources")
public class ResourcesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="resource_id",nullable = false)
	public int resourceId;
	

//	@Column(name="emp_id")
//	private int empId;
	
	@Column(name="emp_id")
    private int empId;
	
	
	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Long getRateCard() {
		return rateCard;
	}

	public void setRateCard(Long rateCard) {
		this.rateCard = rateCard;
	}

	public Long getLeaveEliglibilty() {
		return leaveEliglibilty;
	}

	public void setLeaveEliglibilty(Long leaveEliglibilty) {
		this.leaveEliglibilty = leaveEliglibilty;
	}

	public Date getSowStartDate() {
		return sowStartDate;
	}

	public void setSowStartDate(Date sowStartDate) {
		this.sowStartDate = sowStartDate;
	}

	public Date getSowEndDate() {
		return sowEndDate;
	}

	public void setSowEndDate(Date sowEndDate) {
		this.sowEndDate = sowEndDate;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	public int getTotalBilledDays() {
		return totalBilledDays;
	}

	public void setTotalBilledDays(int totalBilledDays) {
		this.totalBilledDays = totalBilledDays;
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

//	public UsersEntity getUserentity() {
//		return userentity;
//	}
//
//	public void setUserentity(UsersEntity userentity) {
//		this.userentity = userentity;
//	}

	@Column(name="rate_card")
	public Long rateCard;
		
	@Column(name="leave_eliglibilty")
	public Long leaveEliglibilty;
	
	@Column(name="sow_startdate")
	public Date sowStartDate;
	
	@Column(name="sow_enddate")
	public Date sowEndDate;
	
	@Column(name="remarks")
	public String Remarks;
	
	@Column(name="total_billed_days")
	public int totalBilledDays;
		
	@Column(name="created_date" )
	public Date createdDate;
	
	@Column(name="updated_date" )
	public Date updatedDate;
	
	@Column(name="created_by" )
	public String createdBy;
	
	@Column(name="updated_by" )
	public String updatedBy;

	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "user_emp_id") private UsersEntity userentity;
	 */
	
	public ResourcesEntity () {};
	
	public ResourcesEntity(int resourceId, int empId, Long rateCard, Long leaveEliglibilty, Date sowStartDate,
			Date sowEndDate, String remarks, int totalBilledDays, Date createdDate, Date updatedDate, String createdBy,
			String updatedBy) {
		super();
		this.resourceId = resourceId;
		this.empId = empId;
		this.rateCard = rateCard;
		this.leaveEliglibilty = leaveEliglibilty;
		this.sowStartDate = sowStartDate;
		this.sowEndDate = sowEndDate;
		this.Remarks = remarks;
		this.totalBilledDays = totalBilledDays;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
	}

	


}
