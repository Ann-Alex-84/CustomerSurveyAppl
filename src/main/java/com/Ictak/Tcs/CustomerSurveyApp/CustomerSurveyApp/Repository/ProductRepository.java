package com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
