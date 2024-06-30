package com.project.CRM.PersistanceLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CRM.POJO.Customer;


@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Integer> 
{

}
