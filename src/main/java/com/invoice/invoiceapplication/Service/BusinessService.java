package com.invoice.invoiceapplication.Service;

import com.invoice.invoiceapplication.Entity.BusinessEntity;
import com.invoice.invoiceapplication.Entity.UsersEntity;

public interface BusinessService {

	public String createBusiness(BusinessEntity business);
	public String deleteBusiness(String businessName);
}
