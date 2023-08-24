package com.invoice.invoiceapplication.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoice.invoiceapplication.Entity.BusinessEntity;
import com.invoice.invoiceapplication.Entity.UsersEntity;
import com.invoice.invoiceapplication.Repository.BusinessRepository;
import com.invoice.invoiceapplication.Service.BusinessService;

@Service
public class BusinessServiceImpl implements BusinessService{
	@Autowired
	private BusinessRepository businessRepo;
	
	public String createBusiness(BusinessEntity business) {
		
		businessRepo.save(business);
		return "Users created";
	}
	public String deleteBusiness(String businessName) {
		 businessRepo.deleteBusiness(businessName);
		 return "deleted";
		 
	}
}
