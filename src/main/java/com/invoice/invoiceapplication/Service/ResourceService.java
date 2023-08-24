package com.invoice.invoiceapplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoice.invoiceapplication.Entity.ResourcesEntity;
import com.invoice.invoiceapplication.Repository.ResourceRepository;
import com.invoice.invoiceapplication.ServiceImpl.ResourceServiceImpl;

public interface ResourceService {
	public void createResource(ResourcesEntity resource);

}
