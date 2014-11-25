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

package com.mycompany.controller.payment;


import java.util.Set;

import org.broadleafcommerce.core.web.controller.cart.BroadleafCartController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.payment.allpay.AllPayConfigureationService;
import com.mycompany.payment.allpay.ReturnPaymentParams;

@Controller
public class AllPayController extends BroadleafCartController {
	private static final Logger logger = LoggerFactory.getLogger(AllPayController.class);
	AllPayConfigureationService allpayService = new AllPayConfigureationService();
	
	@RequestMapping("allpay_pay")
	public ModelAndView allpayForm() {
		logger.warn("Start allpay test");
		
		ModelAndView model = new ModelAndView();
		model.addObject("action", allpayService.getAllPayConfig().getServiceURL());
		model.addObject("argMap",allpayService.checkOutMap());
		model.setViewName("content/allpay");
		return model;
	}
	
	@RequestMapping(value = "allpay_receive", method = RequestMethod.POST)
	public String allPayResultBack(ReturnPaymentParams params){
		logger.warn(params.getMerchantID());
		logger.warn(params.getMerchantTradeNo());
		
		return "content/allpayReturnSuccess";
	}
}
