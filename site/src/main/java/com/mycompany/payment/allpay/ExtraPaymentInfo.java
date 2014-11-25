package com.mycompany.payment.allpay;

public abstract class ExtraPaymentInfo {
	/**
     * 需要額外付款資訊。
     */
	static private String Yes = "Y";
	

    /**
     * 不需要額外付款資訊。
     */
	static private String No = "N";


	public static String getYes() {
		return Yes;
	}


	public static void setYes(String yes) {
		Yes = yes;
	}


	public static String getNo() {
		return No;
	}


	public static void setNo(String no) {
		No = no;
	}
	
	
}
