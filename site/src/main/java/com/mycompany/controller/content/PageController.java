/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mycompany.controller.content;

import org.broadleafcommerce.cms.web.controller.BroadleafPageController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.bean.mail.SendEmail;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class works in combination with the PageHandlerMapping which finds a
 * category based upon the passed in URL.
 */
@Controller("blPageController")
public class PageController extends BroadleafPageController {
	
	@Resource(name="sendEmail")
	private SendEmail sendEmail;

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return super.handleRequest(request, response);
	}

	@RequestMapping("/still_working")
	public ModelAndView chanduForm() {
		// String message = "Hello World, Spring 3.0!!!";
		String message = "Hello World, Spring 3.0!!!";
		return new ModelAndView("content/still_working", "message", message);
	}
	
	@RequestMapping("/about_us")
	public ModelAndView aboutUs() {
		// String message = "Hello World, Spring 3.0!!!";
		String message = "Hello World, Spring 3.0!!!";
		return new ModelAndView("FAQ/AboutUs", "message", message);
	}
	
	@RequestMapping("/seller_FAQ")
	public ModelAndView seller_FAQ() {
		// String message = "Hello World, Spring 3.0!!!";
		String message = "Hello World, Spring 3.0!!!";
		return new ModelAndView("FAQ/sellerFAQ", "message", message);
	}
	
	@RequestMapping("/buyer_FAQ")
	public ModelAndView buyer_FAQ() {
		// String message = "Hello World, Spring 3.0!!!";
		String message = "Hello World, Spring 3.0!!!";
		return new ModelAndView("FAQ/buyerFAQ", "message", message);
	}
	
	@RequestMapping(value="/collectEmail" , method=RequestMethod.GET)
	public ModelAndView register(@RequestParam(value = "email") String email) {
		System.out.println("got an email: "+email);
		sendEmail.sendMail("dealarenas@no-reply", "dealarenas@gmail.com", email, email);
		
		return new ModelAndView("redirect:/still_working");
	}

}
