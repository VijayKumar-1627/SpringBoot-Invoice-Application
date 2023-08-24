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
@Table(name="login")
@NoArgsConstructor
@Getter
@Setter
public class LoginEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="login_id",nullable=false)
	private int loginId;
	
	@Column(name="user_name",nullable=false)
	private Long userName;
	
	@Column(name="password",nullable=false)
	private Long password;
	
	@Column(name="role",nullable=false)
	private String role;
	
	@Column(name="created_date",nullable =false)
	private Date createdDate;
	
	@Column(name="updated_date",nullable =false)
	private Date updatedDate;
	
	@Column(name="created_by",nullable =false)
	private String createdBy;
	
	@Column(name="updated_by",nullable =false)
	private String updatedBy;
}
