package com.project.CRM.weblayer;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.CRM.POJO.Customer;
import com.project.CRM.ServiceLayer.ICustomerService;

@Controller
public class CxController
{
	@Autowired
	private ICustomerService service;
	
	@GetMapping("/getDetails")
    public String getCusDetails(Map<String,Object> m)
    {
		
		m.put("Cdetails",service.getCusDetails());
		
    	return "Customer";
    }
	
	@GetMapping("/ShowForm")
	public String showForm()
	{	
		return "register";
	}
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute("cx") Customer cus,Map<String,Object> m)
	{
		service.saveDetails(cus);
		return "redirect:/getDetails";
	}
	
	@GetMapping("/updateForm")
	public String update( @RequestParam("customerId") Integer id,Map<String,Object> map) 
	{
		map.put("Updated", service.getCusDetailsById(id));
		
		return "updateForm";
	}
	
}
