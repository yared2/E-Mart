package edu.miu.e_mart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LoginController {
	public String displayLogin(@ModelAttribute("credential")Credential credential) {
		
	}

}
