package com.invoice.invoiceapplication.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invoice.invoiceapplication.Entity.BusinessEntity;
import com.invoice.invoiceapplication.Entity.ResourcesEntity;
import com.invoice.invoiceapplication.Entity.UsersEntity;
import com.invoice.invoiceapplication.Service.ResourceService;
import com.invoice.invoiceapplication.ServiceImpl.BusinessServiceImpl;
import com.invoice.invoiceapplication.ServiceImpl.ResourceServiceImpl;
import com.invoice.invoiceapplication.ServiceImpl.UsersServiceImpl;

import jakarta.websocket.server.PathParam;

@RestController

public class RestControllerApi {
	@Autowired 
	private ResourceServiceImpl resourceService;
	@Autowired
	private UsersServiceImpl usersService;
	@Autowired
	private BusinessServiceImpl BusinessService;
	
	@GetMapping("/")
	public String print(){
	System.out.println("sda");
	return "spring boot";
	}
	@PostMapping("/createresource")
	public String create(@RequestBody ResourcesEntity resource) {
	resourceService.createResource(resource);
	return "Created"+resource.createdBy;
	}
	
	@PostMapping("/createUsers")
	public String create(@RequestBody UsersEntity user) {
		System.out.println(user.empName);
		return usersService.createUsers(user);
	}
	@GetMapping("/getuserdetails")
	public List<UsersEntity> userdetails() {
		return usersService.userdetails();
		
	}
	@GetMapping("/getuser/{empId}")
	public Optional<UsersEntity> getuser(@PathVariable("empId") int empId){
		return usersService.getuser(empId);
		
	}
	@DeleteMapping("/deleteuser/{empId}")
	public String deleteuser(@PathVariable("empId") int empId) {
		return	usersService.deleteuser(empId);
	}
	
	@PostMapping("/addbusiness")
	public String createBusiness(@RequestBody BusinessEntity business) {
		BusinessService.createBusiness(business);
		return " Created New Business "  + business.getBusinessName() + " Created By " + business.getCreatedBy();
	}
	
	@DeleteMapping("/removebusiness/{businessName}")
	public String deleteBusiness(@PathVariable("businessName") String businessName) {
		System.out.println(businessName);
		return BusinessService.deleteBusiness(businessName);
		
	}
}

