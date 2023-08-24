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
@Table(name="timesheet")
@NoArgsConstructor
@Getter
@Setter
public class TimesheetEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="timesheet_id",nullable=false)
	private int timesheetId;
	
	@Column(name="official_working_days",nullable =false)
	private int officialWorkingDays;
	
	@Column(name="resource_working_days",nullable=false)
	private int resourceWorkingDays;
	
	@Column(name="resource_leave_days",nullable =false)
	private int resourceLeaveDays; 
	
	@Column(name="billing_days",nullable =false)
	private int billingDays; 

	@Column(name="resource_id",nullable=false)
	private int resourceId;
	
	@Column(name="business_id",nullable=false)
	private int businessId;
	
	@Column(name ="updated_by",nullable=false)
	private String updatedBy;
	
	@Column(name="updated_date",nullable=false)
	private Date updateDate;
	
	@Column(name="individual_cost",nullable=false)
	private Long individualCost;
	
	@Column(name="total_cost",nullable=false)
	private Long totalCost;
	
	@Column(name="created_date",nullable=false)
	private Date createdDate;
	
	@Column(name="created_by",nullable=false)
	private String createdBy;

}
