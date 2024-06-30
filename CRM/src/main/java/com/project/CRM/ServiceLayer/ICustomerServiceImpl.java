package com.project.CRM.ServiceLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.CRM.POJO.Customer;
import com.project.CRM.PersistanceLayer.ICustomerRepo;



@Service
public class ICustomerServiceImpl implements ICustomerService
{
		
     private ICustomerRepo repo;

     
    @Autowired 
	public void setRepo(ICustomerRepo repo)
	{
		this.repo = repo;
	}


	@Override
	public List<Customer> getCusDetails()
	{
		
		return repo.findAll();
	}


	@Override
	public Customer saveDetails(Customer cmp)
	{
		
		return repo.save(cmp);
	}


	@Override
	public Customer getCusDetailsById(Integer id)
	{
		Optional<Customer> cx=repo.findById(id);
		return cx.get();
		
	}

    
     
     
}
