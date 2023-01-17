//package com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Controller;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Entity.Product;
//import com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Service.ProductService;
//
//
//@Controller
//public class ProductController {
//
//	@Autowired
//	private ProductService service;
//	
////	@GetMapping("/")
////	public String home(Model m) {
////		return findPaginated(0, m);
////	}
//	@GetMapping("/addProduct")
//	public String AddProductForm()
//	{
//		return "addProduct";
//	}
//	
//	@PostMapping("/registers")
//	public String ProductRegister(@ModelAttribute Product r, HttpSession session) {
//		System.out.println(r);
//		service.addProduct(r);
//		session.setAttribute("msg", "Product added successfully...");
//		return "redirect:/";
//			}
//	@GetMapping("/edits/{id}")
//	public String edit(@PathVariable int id, Model m) {
//		Product r = service.getProductById(id);
//		m.addAttribute("Product", r);
//		return "edit";
//	}
//
//	@PostMapping("/update")
//	public String updateProduct(@ModelAttribute Product r, HttpSession session) {
//		service.addProduct(r);
//		session.setAttribute("msg", "Product Update Sucessfully..");
//		return "redirect:/";
//	}
//
//	@GetMapping("/deletes/{id}")
//	public String deleteProduct(@PathVariable int id, HttpSession session) {
//
//		service.deleteProduct(id);
//		session.setAttribute("msg", "Product Data Delete Sucessfully..");
//		return "redirect:/";
//	}
//
////	@GetMapping("/page/{pageno}")
////	public String findPaginated(@PathVariable int pageno, Model m) {
////
////		Page<Product> Productlist = service.getProductByPaginate(pageno, 2);
////		m.addAttribute("Product", Productlist);
////		m.addAttribute("currentPage", pageno);
////		m.addAttribute("totalPages", Productlist.getTotalPages());
////		m.addAttribute("totalProduct", Productlist.getTotalElements());
////		return "index";
////	}
//}
