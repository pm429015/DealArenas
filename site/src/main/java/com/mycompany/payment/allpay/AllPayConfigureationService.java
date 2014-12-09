package com.mycompany.payment.allpay;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;

public class AllPayConfigureationService {
	private static final Logger logger = Logger.getLogger(AllPayConfigureationService.class);
	
	private AllPayConfigureation allPayConfig = new AllPayConfigureation();
	
	public AllPayConfigureationService(String merchantTradeNo){
		allPayConfig.setMerchantTradeNo(merchantTradeNo);
		allPayConfig.config();
	}
	
	public void test(){
		System.out.println(allPayConfig.getServiceURL());
	}
	
	
	public Map ChargeBack() {
		Map chargeBackMap = allPayConfig.getChargeBack();
		chargeBackMap.remove("MerchantTradeNo");
		chargeBackMap.remove("TradeNo");
		chargeBackMap.remove("ChargeBackTotalAmount");
		chargeBackMap.remove("Remark");
		chargeBackMap.remove("PlatformID");
		chargeBackMap.remove("CheckMacValue");
		
		chargeBackMap.put("MerchantTradeNo","DA0030");
		//chargeBackMap.put("Remark", "");
		chargeBackMap.put("MerchantID",allPayConfig.getMerchantID());
		chargeBackMap.put("ChargeBackTotalAmount", "100");
		//chargeBackMap.put("PlatformID", "");
		chargeBackMap.put("TradeNo", "1412071316561935");
		
		// Sort by key to build szCheckMacValue
		Map sortedArgParameters = new TreeMap(chargeBackMap);
		
		String szCheckMacValue = "HashKey=" + allPayConfig.getHashKey();
		Set<String> argParam_keys = sortedArgParameters.keySet();
		for (String arg : argParam_keys) {
			szCheckMacValue += "&" + arg + "=" + sortedArgParameters.get(arg);
		}
		
		szCheckMacValue += "&HashIV=" + allPayConfig.getHashIV();
		
		logger.warn(szCheckMacValue);
		
		try {
			szCheckMacValue = URLEncoder.encode(szCheckMacValue, "UTF-8").toLowerCase();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		szCheckMacValue.replaceAll("%2d", "-");
		szCheckMacValue.replaceAll("%5f", "_");
		szCheckMacValue.replaceAll("%2e", ".");
		szCheckMacValue.replaceAll("%21", "!");
		szCheckMacValue.replaceAll("%2a", "*");
		szCheckMacValue.replaceAll("%28", "(");
		szCheckMacValue.replaceAll("%29", ")");
		
		szCheckMacValue = md5(szCheckMacValue);
		if (szCheckMacValue == null) {
			logger.fatal("MD5 Error");
			return null;
		}
		
		sortedArgParameters.put("CheckMacValue", szCheckMacValue);
		
		return sortedArgParameters;
	}
	
	public Map checkOutMap() {
		Map argParameters = new HashMap();
		
		Map sendMap = allPayConfig.getSend();
		
		if (allPayConfig.getServiceURL().length() == 0) {
			logger.fatal("ServiceURL is required.");
			return null;
		}
		
		if (allPayConfig.getServiceURL().length() > 200) {
			logger.fatal("ServiceURL max langth is 200.");
			return null;
		}
		
		if (allPayConfig.getHashKey().length() == 0) {
			logger.fatal("HashKey is required.");
			return null;
		}
		if (allPayConfig.getHashIV().length() == 0) {
			logger.fatal("HashIV is required.");
			return null;
		}
		
		if (allPayConfig.getMerchantID().length() == 0) {
			logger.fatal("MerchantID is required.");
			return null;
		}
		
		if (allPayConfig.getMerchantID().length() > 10) {
			logger.fatal("MerchantID max langth is 10");
			return null;
		}
		
		if (((String) allPayConfig.getSend().get("ReturnURL")).length() == 0) {
			logger.fatal("ReturnURL is required.");
			return null;
		}
		if (((String) allPayConfig.getSend().get("ClientBackURL")).length() > 200) {
			logger.fatal("ClientBackURL max langth as 10.");
			return null;
		}
		if (((String) allPayConfig.getSend().get("OrderResultURL")).length() > 200) {
			logger.fatal("OrderResultURL max langth as 10.");
			return null;
		}
		
		if (((String) allPayConfig.getSend().get("MerchantTradeNo")).length() == 0) {
			logger.fatal("MerchantTradeNo is required.");
			return null;
		}
		if (((String) allPayConfig.getSend().get("MerchantTradeNo")).length() > 20) {
			logger.fatal("MerchantTradeNo max langth as 20.");
			return null;
		}
		
		if (((String) allPayConfig.getSend().get("MerchantTradeDate")).length() == 0) {
			logger.fatal("MerchantTradeDate is required.");
			return null;
		}
		
		if (((String) allPayConfig.getSend().get("TotalAmount")).length() == 0) {
			logger.fatal("TotalAmount is required.");
			return null;
		}
		
		if (((String) allPayConfig.getSend().get("TradeDesc")).length() == 0) {
			logger.fatal("TradeDesc is required.");
			return null;
		}
		if (((String) allPayConfig.getSend().get("TradeDesc")).length() > 200) {
			logger.fatal("TradeDesc max langth as 200.");
			return null;
		}
		
		if (((String) allPayConfig.getSend().get("ChoosePayment")).length() == 0) {
			logger.fatal("ChoosePayment is required.");
			return null;
		}
		
//		if (((String) allPayConfig.getSend().get("NeedExtraPaidInfo")).length() == 0) {
//			logger.fatal("NeedExtraPaidInfo is required.");
//			return null;
//		}
		
//		if (((String) allPayConfig.getSend().get("DeviceSource")).length() == 0) {
//			logger.fatal("DeviceSource is required.");
//			return null;
//		}
		
		if (((Map) allPayConfig.getSend().get("Items")).size() == 0) {
			logger.fatal("Items is required.");
			return null;
		}
		
		// 檢查 Alipay 條件。
		if (((String) allPayConfig.getSend().get("ChoosePayment")).equals("Alipay")) {
			if (((String) allPayConfig.getSendExtend().get("Email")).length() == 0) {
				logger.fatal("Email is required.");
				return null;
			}
			
			if (((String) allPayConfig.getSendExtend().get("Email")).length() > 200) {
				logger.fatal("Email is required.");
				return null;
			}
			
			if (((String) allPayConfig.getSendExtend().get("PhoneNo")).length() == 0) {
				logger.fatal("PhoneNo is required.");
				return null;
			}
			
			if (((String) allPayConfig.getSendExtend().get("PhoneNo")).length() > 20) {
				logger.fatal("PhoneNo max langth is 20.");
				return null;
			}
			
			if (((String) allPayConfig.getSendExtend().get("UserName")).length() == 0) {
				logger.fatal("UserName is required.");
				return null;
			}
			
			if (((String) allPayConfig.getSendExtend().get("UserName")).length() > 20) {
				logger.fatal("UserName max langth is 20.");
				return null;
			}
		}
		
		// 檢查產品名稱。
		String itemName = "";
		String itemCounts = "";
		String itemPrice = "";
		if (((Map) allPayConfig.getSend().get("Items")).size() > 0) {
			Set<String> item_keys = ((Map) allPayConfig.getSend().get("Items")).keySet();
			
			for (String key : item_keys) {
				itemName += "#" + ((Map) ((Map) allPayConfig.getSend().get("Items")).get(key)).get("Name");
				itemCounts += "#" + ((Map) ((Map) allPayConfig.getSend().get("Items")).get(key)).get("Quantity");
				itemPrice += "#" + ((Map) ((Map) allPayConfig.getSend().get("Items")).get(key)).get("Price");
			}
			
			if (itemName.length() > 200) {
				itemName.substring(0, 200);
			}
			
			if (itemCounts.length() > 200) {
				itemCounts.substring(0, 200);
			}
			
			if (itemPrice.length() > 20) {
				itemPrice.substring(0, 20);
			}
		} else {
			logger.fatal("No item");
			return null;
		}
		
		// Merge arraies become a single hug array to build POST
		argParameters.put("MerchantID", allPayConfig.getMerchantID());
		argParameters.put("PaymentType", allPayConfig.getPaymentType());
		argParameters.put("ItemName", itemName);
		argParameters.put("ItemURL", allPayConfig.getSend().get("ItemURL"));
		
		//argParameters.putAll(allPayConfig.getSend());
		argParameters.putAll(sendMap);
		argParameters.putAll(allPayConfig.getSendExtend());
		
		if (allPayConfig.getSend().get("ChoosePayment").equals("ALL")) {
			argParameters.remove("CreditInstallment");
			argParameters.remove("ExecTimes");
			argParameters.remove("Frequency");
			argParameters.remove("InstallmentAmount");
			argParameters.remove("PeriodAmount");
			argParameters.remove("PeriodReturnURL");
			argParameters.remove("PeriodType");
			argParameters.remove("Redeem");
			argParameters.remove("UnionPay");
			
//			if (allPayConfig.getSend().containsKey("IgnorePayment")) {
//				argParameters.remove("IgnorePayment");
//			}
			
			if (allPayConfig.getSend().containsKey("ClientRedirectURL")) {
				argParameters.remove("ClientRedirectURL");
			}
		}
		
		argParameters.remove("Items");
		// Sort by key to build szCheckMacValue
		Map sortedArgParameters = new TreeMap(argParameters);
		
		String szCheckMacValue = "HashKey=" + allPayConfig.getHashKey();
		Set<String> argParam_keys = sortedArgParameters.keySet();
		for (String arg : argParam_keys) {
			szCheckMacValue += "&" + arg + "=" + sortedArgParameters.get(arg);
		}
		
		szCheckMacValue += "&HashIV=" + allPayConfig.getHashIV();
		try {
			szCheckMacValue = URLEncoder.encode(szCheckMacValue, "UTF-8").toLowerCase();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		szCheckMacValue.replaceAll("%2d", "-");
		szCheckMacValue.replaceAll("%5f", "_");
		szCheckMacValue.replaceAll("%2e", ".");
		szCheckMacValue.replaceAll("%21", "!");
		szCheckMacValue.replaceAll("%2a", "*");
		szCheckMacValue.replaceAll("%28", "(");
		szCheckMacValue.replaceAll("%29", ")");
		
		szCheckMacValue = md5(szCheckMacValue);
		if (szCheckMacValue == null) {
			logger.fatal("MD5 Error");
			return null;
		}
		
		sortedArgParameters.put("CheckMacValue", szCheckMacValue);
		
		return sortedArgParameters;
	}
	
	private String md5(String str) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			
			byte byteData[] = md.digest();
			
			// convert the byte to hex format method 1
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < byteData.length; i++) {
				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			}
			
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public AllPayConfigureation getAllPayConfig() {
		return allPayConfig;
	}
	
	public void setAllPayConfig(AllPayConfigureation allPayConfig) {
		this.allPayConfig = allPayConfig;
	}
}
