package com.invoice.invoiceapplication.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoice.invoiceapplication.Entity.ResourcesEntity;
import com.invoice.invoiceapplication.Repository.ResourceRepository;
import com.invoice.invoiceapplication.Service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService{
	@Autowired
	private ResourceRepository resourceRepo; 
	
	public void createResource(ResourcesEntity res) {
		resourceRepo.save(res);
	}

}
