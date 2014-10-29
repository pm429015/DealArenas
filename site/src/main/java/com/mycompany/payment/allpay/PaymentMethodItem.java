package com.mycompany.payment.allpay;

public abstract class PaymentMethodItem {
	/**
     * 不指定。
     */
    static private String None = "";
    
    // WebATM 類(001~100)
    /**
     * 台新銀行。
     */
    static private String WebATM_TAISHIN = "TAISHIN";

    /**
     * 玉山銀行。
     */
    static private String WebATM_ESUN = "ESUN";

    /**
     * 華南銀行。
     */
    static private String WebATM_HUANAN = "HUANAN";

    /**
     * 台灣銀行。
     */
    static private String WebATM_BOT = "BOT";

    /**
     * 台北富邦。
     */
    static private String WebATM_FUBON = "FUBON";

    /**
     * 中國信託。
     */
    static private String WebATM_CHINATRUST = "CHINATRUST";

    /**
     * 第一銀行。
     */
    static private String WebATM_FIRST = "FIRST";

    /**
     * 國泰世華。
     */
    static private String WebATM_CATHAY = "CATHAY";

    /**
     * 兆豐銀行。
     */
    static private String WebATM_MEGA = "MEGA";

    /**
     * 元大銀行。
     */
    static private String WebATM_YUANTA = "YUANTA";

    /**
     * 土地銀行。
     */
    static private String WebATM_LAND = "LAND";
    
    // ATM 類(101~200)
    /**
     * 台新銀行。
     */
    static private String ATM_TAISHIN = "TAISHIN";

    /**
     * 玉山銀行。
     */
    static private String ATM_ESUN = "ESUN";

    /**
     * 華南銀行。
     */
    static private String ATM_HUANAN = "HUANAN";

    /**
     * 台灣銀行。
     */
    static private String ATM_BOT = "BOT";

    /**
     * 台北富邦。
     */
    static private String ATM_FUBON = "FUBON";

    /**
     * 中國信託。
     */
    static private String ATM_CHINATRUST = "CHINATRUST";

    /**
     * 第一銀行。
     */
    static private String ATM_FIRST = "FIRST";
    
    // 超商類(201~300)
    /**
     * 超商代碼繳款。
     */
    static private String CVS = "CVS";

    /**
     * OK超商代碼繳款。
     */
    static private String CVS_OK = "OK";

    /**
     * 全家超商代碼繳款。
     */
    static private String CVS_FAMILY = "FAMILY";

    /**
     * 萊爾富超商代碼繳款。
     */
    static private String CVS_HILIFE = "HILIFE";

    /**
     * 7-11 ibon代碼繳款。
     */
    static private String CVS_IBON = "IBON";
    
    // 其他第三方支付類(301~400)
    /**
     * 支付寶。
     */
    static private String Alipay = "Alipay";

    /**
     * 財付通。
     */
    static private String Tenpay = "Tenpay";
    
    // 儲值/餘額消費類(401~500)
    /**
     * 儲值/餘額消費(歐付寶)
     */
    static private String TopUpUsed_AllPay = "AllPay";

    /**
     * 儲值/餘額消費(玉山)
     */
    static private String TopUpUsed_ESUN = "ESUN";
    // 其他類(901~999)
    /**
     * 超商條碼繳款。
     */
    static private String BARCODE = "BARCODE";

    /**
     * 信用卡(MasterCard/JCB/VISA)。
     */
    static private String Credit = "Credit";

    /**
     * 貨到付款。
     */
    static private String COD = "COD";

	public static String getNone() {
		return None;
	}

	public static void setNone(String none) {
		None = none;
	}

	public static String getWebATM_TAISHIN() {
		return WebATM_TAISHIN;
	}

	public static void setWebATM_TAISHIN(String webATM_TAISHIN) {
		WebATM_TAISHIN = webATM_TAISHIN;
	}

	public static String getWebATM_ESUN() {
		return WebATM_ESUN;
	}

	public static void setWebATM_ESUN(String webATM_ESUN) {
		WebATM_ESUN = webATM_ESUN;
	}

	public static String getWebATM_HUANAN() {
		return WebATM_HUANAN;
	}

	public static void setWebATM_HUANAN(String webATM_HUANAN) {
		WebATM_HUANAN = webATM_HUANAN;
	}

	public static String getWebATM_BOT() {
		return WebATM_BOT;
	}

	public static void setWebATM_BOT(String webATM_BOT) {
		WebATM_BOT = webATM_BOT;
	}

	public static String getWebATM_FUBON() {
		return WebATM_FUBON;
	}

	public static void setWebATM_FUBON(String webATM_FUBON) {
		WebATM_FUBON = webATM_FUBON;
	}

	public static String getWebATM_CHINATRUST() {
		return WebATM_CHINATRUST;
	}

	public static void setWebATM_CHINATRUST(String webATM_CHINATRUST) {
		WebATM_CHINATRUST = webATM_CHINATRUST;
	}

	public static String getWebATM_FIRST() {
		return WebATM_FIRST;
	}

	public static void setWebATM_FIRST(String webATM_FIRST) {
		WebATM_FIRST = webATM_FIRST;
	}

	public static String getWebATM_CATHAY() {
		return WebATM_CATHAY;
	}

	public static void setWebATM_CATHAY(String webATM_CATHAY) {
		WebATM_CATHAY = webATM_CATHAY;
	}

	public static String getWebATM_MEGA() {
		return WebATM_MEGA;
	}

	public static void setWebATM_MEGA(String webATM_MEGA) {
		WebATM_MEGA = webATM_MEGA;
	}

	public static String getWebATM_YUANTA() {
		return WebATM_YUANTA;
	}

	public static void setWebATM_YUANTA(String webATM_YUANTA) {
		WebATM_YUANTA = webATM_YUANTA;
	}

	public static String getWebATM_LAND() {
		return WebATM_LAND;
	}

	public static void setWebATM_LAND(String webATM_LAND) {
		WebATM_LAND = webATM_LAND;
	}

	public static String getATM_TAISHIN() {
		return ATM_TAISHIN;
	}

	public static void setATM_TAISHIN(String aTM_TAISHIN) {
		ATM_TAISHIN = aTM_TAISHIN;
	}

	public static String getATM_ESUN() {
		return ATM_ESUN;
	}

	public static void setATM_ESUN(String aTM_ESUN) {
		ATM_ESUN = aTM_ESUN;
	}

	public static String getATM_HUANAN() {
		return ATM_HUANAN;
	}

	public static void setATM_HUANAN(String aTM_HUANAN) {
		ATM_HUANAN = aTM_HUANAN;
	}

	public static String getATM_BOT() {
		return ATM_BOT;
	}

	public static void setATM_BOT(String aTM_BOT) {
		ATM_BOT = aTM_BOT;
	}

	public static String getATM_FUBON() {
		return ATM_FUBON;
	}

	public static void setATM_FUBON(String aTM_FUBON) {
		ATM_FUBON = aTM_FUBON;
	}

	public static String getATM_CHINATRUST() {
		return ATM_CHINATRUST;
	}

	public static void setATM_CHINATRUST(String aTM_CHINATRUST) {
		ATM_CHINATRUST = aTM_CHINATRUST;
	}

	public static String getATM_FIRST() {
		return ATM_FIRST;
	}

	public static void setATM_FIRST(String aTM_FIRST) {
		ATM_FIRST = aTM_FIRST;
	}

	public static String getCVS() {
		return CVS;
	}

	public static void setCVS(String cVS) {
		CVS = cVS;
	}

	public static String getCVS_OK() {
		return CVS_OK;
	}

	public static void setCVS_OK(String cVS_OK) {
		CVS_OK = cVS_OK;
	}

	public static String getCVS_FAMILY() {
		return CVS_FAMILY;
	}

	public static void setCVS_FAMILY(String cVS_FAMILY) {
		CVS_FAMILY = cVS_FAMILY;
	}

	public static String getCVS_HILIFE() {
		return CVS_HILIFE;
	}

	public static void setCVS_HILIFE(String cVS_HILIFE) {
		CVS_HILIFE = cVS_HILIFE;
	}

	public static String getCVS_IBON() {
		return CVS_IBON;
	}

	public static void setCVS_IBON(String cVS_IBON) {
		CVS_IBON = cVS_IBON;
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

	public static String getTopUpUsed_AllPay() {
		return TopUpUsed_AllPay;
	}

	public static void setTopUpUsed_AllPay(String topUpUsed_AllPay) {
		TopUpUsed_AllPay = topUpUsed_AllPay;
	}

	public static String getTopUpUsed_ESUN() {
		return TopUpUsed_ESUN;
	}

	public static void setTopUpUsed_ESUN(String topUpUsed_ESUN) {
		TopUpUsed_ESUN = topUpUsed_ESUN;
	}

	public static String getBARCODE() {
		return BARCODE;
	}

	public static void setBARCODE(String bARCODE) {
		BARCODE = bARCODE;
	}

	public static String getCredit() {
		return Credit;
	}

	public static void setCredit(String credit) {
		Credit = credit;
	}

	public static String getCOD() {
		return COD;
	}

	public static void setCOD(String cOD) {
		COD = cOD;
	}
    
    
}
