package com.mycompany.payment.allpay;

public abstract class PaymentMethod {
	/**
     * 不指定付款方式。
     */
    static private String ALL = "ALL";

    /**
     * 信用卡付費。
     */
    static private String Credit = "Credit";

    /**
     * 網路 ATM。
     */
    static private String WebATM = "WebATM";

    /**
     * 自動櫃員機。
     */
    static private String ATM = "ATM";

    /**
     * 超商代碼。
     */
    static  private String CVS = "CVS";

    /**
     * 超商條碼。
     */
    static private String BARCODE = "BARCODE";

    /**
     * 支付寶。
     */
    static private String Alipay = "Alipay";

    /**
     * 財付通。
     */
    static private String Tenpay = "Tenpay";

    /**
     * 儲值消費。
     */
    static private String TopUpUsed = "TopUpUsed";

	public static String getALL() {
		return ALL;
	}

	public static void setALL(String aLL) {
		ALL = aLL;
	}

	public static String getCredit() {
		return Credit;
	}

	public static void setCredit(String credit) {
		Credit = credit;
	}

	public static String getWebATM() {
		return WebATM;
	}

	public static void setWebATM(String webATM) {
		WebATM = webATM;
	}

	public static String getATM() {
		return ATM;
	}

	public static void setATM(String aTM) {
		ATM = aTM;
	}

	public static String getCVS() {
		return CVS;
	}

	public static void setCVS(String cVS) {
		CVS = cVS;
	}

	public static String getBARCODE() {
		return BARCODE;
	}

	public static void setBARCODE(String bARCODE) {
		BARCODE = bARCODE;
	}

	public static String getAlipay() {
		return Alipay;
	}

	public static void setAlipay(String alipay) {
		Alipay = alipay;
	}

	public static String getTenpay() {
		return Tenpay;
	}

	public static void setTenpay(String tenpay) {
		Tenpay = tenpay;
	}

	public static String getTopUpUsed() {
		return TopUpUsed;
	}

	public static void setTopUpUsed(String topUpUsed) {
		TopUpUsed = topUpUsed;
	}
    
    
    
}
