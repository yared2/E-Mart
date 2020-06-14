package edu.miu.e_mart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CustomerController {
	
	
	
	@RequestMapping(value = { "/customer" }, method = RequestMethod.GET)
	public String customerForm() {
	
		return "customerForm";
	}

}
