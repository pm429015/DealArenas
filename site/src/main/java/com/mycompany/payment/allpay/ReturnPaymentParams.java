package com.mycompany.payment.allpay;

public class ReturnPaymentParams {
	private String MerchantID;
	private String MerchantTradeNo;
	private int RtnCode;
	private String TradeNo;
	private String RtnMsg;
	// Decimal
	private int TradeAmt;
	private int ChargeFee;
	
	// PaymentMethodItem
	private String PaymentType;
	
	// DateTime
	private String PaymentDate;
	private String TradeDate;
	
	private int SimulatePaid;
	
	public String getMerchantID() {
		return MerchantID;
	}
	
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	
	public int getRtnCode() {
		return RtnCode;
	}
	
	public void setRtnCode(int rtnCode) {
		RtnCode = rtnCode;
	}
	
	public String getTradeNo() {
		return TradeNo;
	}
	
	public void setTradeNo(String tradeNo) {
		TradeNo = tradeNo;
	}
	
	public String getRtnMsg() {
		return RtnMsg;
	}
	
	public void setRtnMsg(String rtnMsg) {
		RtnMsg = rtnMsg;
	}
	
	public int getTradeAmt() {
		return TradeAmt;
	}
	
	public void setTradeAmt(int tradeAmt) {
		TradeAmt = tradeAmt;
	}
	
	public int getChargeFee() {
		return ChargeFee;
	}
	
	public void setChargeFee(int chargeFee) {
		ChargeFee = chargeFee;
	}
	
	public String getPaymentType() {
		return PaymentType;
	}
	
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	
	public String getPaymentDate() {
		return PaymentDate;
	}
	
	public void setPaymentDate(String paymentDate) {
		PaymentDate = paymentDate;
	}
	
	public String getTradeDate() {
		return TradeDate;
	}
	
	public void setTradeDate(String tradeDate) {
		TradeDate = tradeDate;
	}
	
	public int getSimulatePaid() {
		return SimulatePaid;
	}
	
	public void setSimulatePaid(int simulatePaid) {
		SimulatePaid = simulatePaid;
	}
}
