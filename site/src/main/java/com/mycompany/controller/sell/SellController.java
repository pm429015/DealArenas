package com.mycompany.controller.sell;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("sellController")
public class SellController {
	
	@RequestMapping("/seller_home")
	public ModelAndView chanduForm() {
		String message = "Hello World, Spring 3.0!!!";
		return new ModelAndView("seller/sell_intro", "message", message);
	}
	
	@RequestMapping("/seller_list")
	public ModelAndView seller_list() {
		String message = "Hello World, Spring 3.0!!!";
		return new ModelAndView("seller/seller_list", "message", message);
	}
}
