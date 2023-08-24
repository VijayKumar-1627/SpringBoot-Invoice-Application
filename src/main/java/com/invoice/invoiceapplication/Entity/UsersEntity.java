package com.invoice.invoiceapplication.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "users")
public class UsersEntity {

	public UsersEntity () {};
	public UsersEntity(int empId, String empName, Long mobileNumber, String address, String state, String city,
			int pincode, int phone, Date createdDate, Date updatedDate, String createdBy, String updatedBy,
			String emailId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.mobileNumber = mobileNumber;
		Address = address;
		State = state;
		City = city;
		Pincode = pincode;
		Phone = phone;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.emailId = emailId;
	}

	@Id
	@Column(name="emp_id", nullable=false, length=10)
	public int empId;
	
	@Column(name="emp_name",nullable =false,length=20)
	public String empName;
	
	@Column(name="mobile",nullable =false,length=20)
	public Long mobileNumber;
	
	@Column(name="address",nullable =true)
	public String Address;
	
	@Column(name="state",nullable =false,length=20)
	public String State;
	
	@Column(name="city",nullable =false,length=20)
	public String City;
	
	@Column(name="pincode",nullable =false,length=20)
	public int Pincode;
	
	@Column(name="phone",nullable =false,length=20)
	public int Phone;
	
	@Column(name="created_date",nullable =false)
	public Date createdDate;
	
	@Column(name="updated_date",nullable =false)
	public Date updatedDate;
	
	@Column(name="created_by",nullable =false)
	public String createdBy;
	
	@Column(name="updated_by",nullable =false)
	public String updatedBy;
	
	@Column(name="email_id",nullable =false)
	public String emailId;
	
	@PrePersist
    protected void onCreate() {
		createdDate = new Date();
		updatedDate = new Date();
        
    }
	
	@PreUpdate
	    protected void onUpdate() {
	        updatedDate = new Date();
	    }
//	@OneToMany(mappedBy = "empId", cascade = CascadeType.ALL)
//	private List<ResourcesEntity> resource = new ArrayList<>();
//	
	}