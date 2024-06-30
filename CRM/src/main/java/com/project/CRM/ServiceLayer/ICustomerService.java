package com.project.CRM.ServiceLayer;

import java.util.*;

import com.project.CRM.POJO.Customer;

public interface ICustomerService
{
	public Customer saveDetails(Customer cmp);
	
    public List<Customer> getCusDetails();
    
    public Customer getCusDetailsById(Integer id);
}
