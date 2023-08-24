package com.invoice.invoiceapplication.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.invoice.invoiceapplication.Entity.ResourcesEntity;
import com.invoice.invoiceapplication.Entity.UsersEntity;

public interface UsersService {
	public String createUsers(UsersEntity user);
	public List<UsersEntity> userdetails();
	public Optional<UsersEntity> getuser(int empId);
	public String deleteuser(int empId);
}
