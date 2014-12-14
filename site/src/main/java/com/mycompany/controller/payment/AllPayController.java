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


import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.broadleafcommerce.core.web.controller.cart.BroadleafCartController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.payment.allpay.AllPayConfigureationService;
import com.mycompany.payment.allpay.ReturnPaymentParams;

@Controller
public class AllPayController extends BroadleafCartController {
	private static final Logger logger = LoggerFactory.getLogger(AllPayController.class);
	
	
	// tmp MerchantTradeNo 
	int merchantNo = 0;
	
	@RequestMapping("allpay_pay")
	public ModelAndView allpayForm() {
		logger.warn("Start allpay test");
		// Start a new payment MerchantTradeNo (for testing)
		AllPayConfigureationService allpayService = new AllPayConfigureationService("Test00"+merchantNo);
		
		ModelAndView model = new ModelAndView();
		model.addObject("action", allpayService.getAllPayConfig().getServiceURL());
		model.addObject("argMap",allpayService.checkOutMap());
		model.setViewName("content/allpay");
		
		logger.warn("A new Allpay payment was created with MerchantTradeNo: "+ "TEST00"+merchantNo);
		// Assign a new  MerchantTradeNo id (for testing)
		merchantNo++;
		
		return model;
	}
	
	@RequestMapping(value = "allpay_receive", method = RequestMethod.POST)
	public @ResponseBody String allPayResultBack(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//Map<String, Object> responseMap = new HashMap<String, Object>();
		logger.warn("test allpay receive succesfully");
		
		Map map = request.getParameterMap();
		Set s = map.entrySet();
		Iterator iter = s.iterator();
		while(iter.hasNext()){ 
			Map.Entry<String,String[]> entry = (Map.Entry<String,String[]>)iter.next();
	        String strKey = entry.getKey();
	        String[] strObj = entry.getValue();
	        String value =  strObj[0];
	        logger.warn(strKey+":"+value);
		}
		
		/*
		logger.warn("MerchantID:"+params.getMerchantID());
		logger.warn("MerchantTradeNo:"+params.getMerchantTradeNo());
		logger.warn("TradeNo:"+params.getTradeNo());
		logger.warn("TradeAmt:"+String.valueOf(params.getTradeAmt()));
		*/
	
	    return "1|OK";
	}
	
//	@RequestMapping("allpay_refund")
//	public ModelAndView allpayRefundForm() {
//		logger.warn("Start allpay refund test");
//		ModelAndView model = new ModelAndView();
//		model.addObject("action", "http://payment-stage.allpay.com.tw/Cashier/AioChargeback");
//		model.addObject("argMap",allpayService.ChargeBack());
//		model.setViewName("content/allpayRefund");
//		return model;
//	}
	
}
