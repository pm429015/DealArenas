package com.mycompany.payment.allpay;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AllPayConfigureation {
	
	private String serviceMethod;
	
	//正是資料
	private String serviceURL ="https://payment.allpay.com.tw/Cashier/AioCheckOut";
	private String hashKey = "CTndV9zqQrIjbbA9";
	private String hashIV = "tKGaXZaQ860owP0n";
	private String merchantID ="1063682";
	
//	private String serviceURL ="http://payment-stage.allpay.com.tw/Cashier/AioCheckOut";
//	private String hashKey = "5294y06JbISpM5x9";	
//	private String hashIV = "v77hoKGq4kWxNNIS";
//	private String merchantID ="2000132";
	
	private String paymentType ="aio";
	private Map send = new HashMap();
	private Map sendExtend= new HashMap();
	private Map query= new HashMap();
	private Map action= new HashMap();
	private Map chargeBack= new HashMap();
	
	// Selections for payment method, paymentMethodItem ,etc abstract classes 
	private String choosePayment ="ALL";
	private String chooseSubPayment ="";
	private String needExtraPaidInfo ="";
	private String deviceSource ="";
	private String actionType ="C";
	
	
	//set MerchantTradeNo. Make sure that MerchantTradeNo can only be used at one time only
	private String MerchantTradeNo="";
	
	public void config(){
		// What is difference between  return URL, ClientBackURL, ClientRedirectURL and ClientBackURL?
		send.put("ReturnURL", "http://www.dealarenas.com/allpay_receive");
		send.put("ClientBackURL", "");
		send.put("OrderResultURL", "");
		send.put("MerchantTradeNo", getMerchantTradeNo());
		send.put("MerchantTradeDate", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
		send.put("PaymentType", "aio");
		send.put("TotalAmount", "35");
		send.put("TradeDesc", "Payment Testing MerchantNo: "+ getMerchantTradeNo());
		send.put("ChoosePayment", choosePayment);
		send.put("Remark", "");
		send.put("ChooseSubPayment", chooseSubPayment);
		send.put("NeedExtraPaidInfo", needExtraPaidInfo);
		send.put("DeviceSource", deviceSource);
		send.put("IgnorePayment", "");
		send.put("ItemURL", "http://Item URL/");
		send.put("PlatformID", "");
		
		Map item = new HashMap();
		Map items = new HashMap();
		item.put("Name", "Payment Testing MerchantNo: "+ getMerchantTradeNo());
		item.put("Quantity", "1");
		item.put("Price", "35");
		item.put("URL", "item URL");
		
		items.put("item1", item);
		send.put("Items", items);
		
		sendExtend.put("ExpireDate", 3);
		sendExtend.put("Desc_1", "Second Hand iphone desc1");
		sendExtend.put("Desc_2", "Second Hand iphone desc2");
		sendExtend.put("Desc_3", "Second Hand iphone desc3");
		sendExtend.put("Desc_4", "Second Hand iphone desc4");
		sendExtend.put("ClientRedirectURL", "");
		sendExtend.put("Email", "dealarenas@gmail.com");
		sendExtend.put("PhoneNo", "buyer_phone");
		sendExtend.put("UserName", "Stanley_buyer");
		sendExtend.put("ExpireTime", "");
		sendExtend.put("CreditInstallment", 0);
		sendExtend.put("InstallmentAmount", 0);
		sendExtend.put("Redeem", "");
		sendExtend.put("UnionPay", "");
		sendExtend.put("PeriodAmount", "");
		sendExtend.put("PeriodType", "");
		sendExtend.put("Frequency", "");
		sendExtend.put("ExecTimes", "");
		sendExtend.put("PaymentInfoURL", "");
		sendExtend.put("PeriodReturnURL", "");
		
		query.put("MerchantTradeNo", getMerchantTradeNo());
		query.put("TimeStamp", "");
		
		action.put("MerchantTradeNo", getMerchantTradeNo());
		action.put("TradeNo", "");
		action.put("Action", actionType);
		action.put("TotalAmount", 0);
		
		chargeBack.put("MerchantTradeNo", getMerchantTradeNo());
		chargeBack.put("TradeNo", "");
		chargeBack.put("ChargeBackTotalAmount", 0);
		chargeBack.put("Remark", "");
	}
	
	
	public String getChoosePayment() {
		return choosePayment;
	}

	public void setChoosePayment(String choosePayment) {
		this.choosePayment = choosePayment;
	}

	public String getChooseSubPayment() {
		return chooseSubPayment;
	}

	public void setChooseSubPayment(String chooseSubPayment) {
		this.chooseSubPayment = chooseSubPayment;
	}

	public String getNeedExtraPaidInfo() {
		return needExtraPaidInfo;
	}

	public void setNeedExtraPaidInfo(String needExtraPaidInfo) {
		this.needExtraPaidInfo = needExtraPaidInfo;
	}

	public String getDeviceSource() {
		return deviceSource;
	}

	public void setDeviceSource(String deviceSource) {
		this.deviceSource = deviceSource;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	
	
	
	public String getServiceURL() {
		return serviceURL;
	}
	
	public void setServiceURL(String serviceURL) {
		this.serviceURL = serviceURL;
	}
	
	public String getHashIV() {
		return hashIV;
	}
	
	public void setHashIV(String hashIV) {
		this.hashIV = hashIV;
	}
	
	public String getMerchantID() {
		return merchantID;
	}
	
	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}
	
	public String getPaymentType() {
		return paymentType;
	}
	
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	public Map getSend() {
		return send;
	}
	
	public void setSend(Map send) {
		this.send = send;
	}
	
	public Map getSendExtend() {
		return sendExtend;
	}
	
	public void setSendExtend(Map sendExtend) {
		this.sendExtend = sendExtend;
	}
	
	public Map getQuery() {
		return query;
	}
	
	public void setQuery(Map query) {
		this.query = query;
	}
	
	public Map getAction() {
		return action;
	}
	
	public void setAction(Map action) {
		this.action = action;
	}
	
	public Map getChargeBack() {
		return chargeBack;
	}
	
	public void setChargeBack(Map chargeBack) {
		this.chargeBack = chargeBack;
	}
	
	public String getHashKey() {
		return hashKey;
	}
	
	public void setHashKey(String hashKey) {
		this.hashKey = hashKey;
	}
	
	public String getServiceMethod() {
		return serviceMethod;
	}
	
	public void setServiceMethod(String serviceMethod) {
		this.serviceMethod = serviceMethod;
	}

	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}

	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	
}
