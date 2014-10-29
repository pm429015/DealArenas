package com.mycompany.payment.allpay;

public abstract class DeviceType {
	/**
     * 桌機版付費頁面。
     */
    static private String PC = "P";

    /**
     * 行動裝置版付費頁面。
     */
    static private String Mobile = "M";

	public static String getPC() {
		return PC;
	}

	public static void setPC(String pC) {
		PC = pC;
	}

	public static String getMobile() {
		return Mobile;
	}

	public static void setMobile(String mobile) {
		Mobile = mobile;
	}
    
    
}
