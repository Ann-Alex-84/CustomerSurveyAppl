package com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Entity.Product;
import com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Repository.ProductRepository;


@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public void addProduct(Product r)
	{
		repo.save(r);
	}

	public List<Product> getAllProduct()
	{
		return repo.findAll();
	}
	public Product getProductById(int id) {
		Optional<Product> r = repo.findById(id);
		if (r.isPresent()) {
			return r.get();
		}
		return null;
	}

	public void deleteProduct(int id) {
		repo.deleteById(id);
	}

	public Page<Product> getProductByPaginate(int currentPage, int size) {
		Pageable p = PageRequest.of(currentPage, size);
		return repo.findAll(p);
	}

}
