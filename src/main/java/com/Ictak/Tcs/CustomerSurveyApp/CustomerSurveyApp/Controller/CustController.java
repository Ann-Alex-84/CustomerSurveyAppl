package com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Entity.Customer;
//import com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Entity.Product;
import com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Service.CustomerService;
//import com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Service.ProductService;


@Controller
@RequestMapping
public class CustController {
	
	@Autowired
	private CustomerService service;
	//private ProductService services;
	
//	@GetMapping("/index")
//	public String home(Model m)
//	{
//	List<Customer> customer=service.getAllCustomer();	
//	m.addAttribute("customer", customer);
//	return "index";
//	}
	
	@GetMapping("/")
	public String home(Model m) {
		return findPaginated(0, m);
	}
	
	@GetMapping("/Login")
	public String LoginForm()
	{
		return "Login";
	}
	@GetMapping("/Logout")
	public String LogoutForm()
	{
		return "Logout";
	}
	
	@GetMapping("/Register")
	public String RegisterForm()
	{
		return "Register";
	}
	
	@GetMapping("/AddCustomer")
	public String AddCustomerForm()
	{
		return "AddCustomer";
	}
	@GetMapping("/AddProduct")
	public String AddProductForm()
	{
		return "AddProduct";
	}
	@GetMapping("/Review")
	public String ReviewForm()
	{
		return "Review";
	}
	@GetMapping("/customerView")
	public String customerView()
	{
		return "customerView";
	}
	
	
	@PostMapping("/register")
	public String CustomerRegister(@ModelAttribute Customer c, HttpSession session) {
		System.out.println(c);
		service.addCustomer(c);
		session.setAttribute("msg", "Customer added successfully...");
		return "redirect:/";
			}
//	@PostMapping("/register")
//	public String ProductRegister(@ModelAttribute Product r, HttpSession session) {
//		System.out.println(r);
//		services.addProduct(r);
//		session.setAttribute("msg", "Product added successfully...");
//		return "redirect:/";
//			}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Customer c = service.getCustomerById(id);
		m.addAttribute("Customer", c);
		return "edit";
	}
//	@GetMapping("/edit/{id}")
//	public String edits(@PathVariable int id, Model m) {
//		Product r = services.getProductById(id);
//		m.addAttribute("Product", r);
//		return "edit";
//	}
	@PostMapping("/update")
	public String updateCustomer(@ModelAttribute Customer c, HttpSession session) {
		service.addCustomer(c);
		session.setAttribute("msg", "Customer Update Sucessfully..");
		return "redirect:/";
	}
//	@PostMapping("/update")
//	public String updateProduct(@ModelAttribute Product r, HttpSession session) {
//		services.addProduct(r);
//		session.setAttribute("msg", "Product Update Sucessfully..");
//		return "redirect:/";
//	}

	@GetMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id, HttpSession session) {

		service.deleteCustomer(id);
		session.setAttribute("msg", "Customer Data Delete Sucessfully..");
		return "redirect:/";
	}
//	@GetMapping("/delete/{id}")
//	public String deleteProduct(@PathVariable int id, HttpSession session) {
//
//		services.deleteProduct(id);
//		session.setAttribute("msg", "Product Data Delete Sucessfully..");
//		return "redirect:/";
//	}

	@GetMapping("/page/{pageno}")
	public String findPaginated(@PathVariable int pageno, Model m) {

		Page<Customer> Customerlist = service.getCustomerByPaginate(pageno, 2);
		m.addAttribute("Customer", Customerlist);
		m.addAttribute("currentPage", pageno);
		m.addAttribute("totalPages", Customerlist.getTotalPages());
		m.addAttribute("totalCustomer", Customerlist.getTotalElements());
		return "index";
	}
//	@GetMapping("/page/{pageno}")

	//	public String findPaginateds(@PathVariable int pageno, Model m) {
//
//		Page<Product> Productlist = services.getProductByPaginate(pageno, 2);
//		m.addAttribute("Product", Productlist);
//		m.addAttribute("currentPage", pageno);
//		m.addAttribute("totalPages", Productlist.getTotalPages());
//		m.addAttribute("totalProduct", Productlist.getTotalElements());
//		return "index";
//	}
	

	}

	

