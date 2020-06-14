package edu.miu.e_mart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.miu.e_mart.domain.Category;
import edu.miu.e_mart.service.definition.ICategoryService;

@Controller
public class CustomerController {
	
	@Autowired
	private ICategoryService iCategoryService;
	
	@RequestMapping(value = { "/customer" }, method = RequestMethod.GET)
	public String customerForm() {
		
		Category ca =new Category("Fruit");
		
		iCategoryService.save(ca);
		return "customerForm";
	}

}
