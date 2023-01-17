package com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Entity.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer,  Integer>

{
//	public boolean existsByEmail(String email);
//
//	public Customer findByEmail(String email);

}