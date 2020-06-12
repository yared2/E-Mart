package edu.miu.e_mart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String displayIndex() {
		return "index";
	}
	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public String displayHome() {
		return "tiles/home";
	}

}
