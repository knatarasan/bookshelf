package com.bookshelf.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


//Step5 4th min
@Controller
public class LoginController {

	@RequestMapping("/login")
	public String loginMessage(@RequestParam String name) {
		System.out.println(name);
		return "login";
	}
	
}
