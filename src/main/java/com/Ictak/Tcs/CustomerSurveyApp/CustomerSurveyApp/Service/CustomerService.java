package com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Entity.Customer;
import com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Repository.CustomerRepository;



@Service
public class CustomerService {
	
		@Autowired
		private CustomerRepository repo;
		

		public void addCustomer(Customer c)
		{
			repo.save(c);
		}

		public List<Customer> getAllCustomer()
		{
			return repo.findAll();
		}
		public Customer getCustomerById(int id) {
			Optional<Customer> c = repo.findById(id);
			if (c.isPresent()) {
				return c.get();
			}
			return null;
		}
		
		public void deleteCustomer(int id) {
			repo.deleteById(id);
		}

		public Page<Customer> getCustomerByPaginate(int currentPage, int size) {
			Pageable p = PageRequest.of(currentPage, size);
			return repo.findAll(p);
		}
//Added to check email
//		public  Customer createCustomer(Customer customer) {
//			customer.setPassword((customer.getPassword()));
//				customer.setRole("ROLE_Customer");
//
//				return repo.save(customer);
//			}
//
//			public boolean checkEmail(String email) {
//
//				return repo.existsByEmail(email);
//			}

			
		}
		
			

