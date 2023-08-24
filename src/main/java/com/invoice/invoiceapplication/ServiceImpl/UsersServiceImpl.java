package com.invoice.invoiceapplication.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.invoice.invoiceapplication.Entity.UsersEntity;
import com.invoice.invoiceapplication.Repository.ResourceRepository;
import com.invoice.invoiceapplication.Repository.UsersRepository;
import com.invoice.invoiceapplication.Service.UsersService;

@Service
public class UsersServiceImpl implements  UsersService{
	@Autowired
	private UsersRepository usersRepo;

	public String createUsers(UsersEntity user) {
		
		usersRepo.save(user);
		return "Users created";
	}
	public List<UsersEntity> userdetails(){
		return usersRepo.findAll();
		
	}
	public Optional<UsersEntity> getuser(int empId){
		return usersRepo.findById(empId);
	}
	public String deleteuser(int empId) {
		 usersRepo.deleteById(empId);
		 return "User Id " + empId + " is deleted  ";
	}
}
