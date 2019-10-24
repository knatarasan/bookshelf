package com.bookshelf.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@ResponseBody
	@RequestMapping("/home")
	public String loginMessage() {
		return "Vare va";
	}
	
}
