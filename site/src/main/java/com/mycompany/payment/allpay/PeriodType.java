package com.mycompany.payment.allpay;

public abstract class PeriodType {
	/**
     * 無
     */
    static private String None = "";

    /**
     * 年
     */
    static private String Year = "Y";

    /**
     * 月
     */
    static private String Month = "M";

    /**
     * 日
     */
    static private String Day = "D";

	public static String getNone() {
		return None;
	}

	public static void setNone(String none) {
		None = none;
	}

	public static String getYear() {
		return Year;
	}

	public static void setYear(String year) {
		Year = year;
	}

	public static String getMonth() {
		return Month;
	}

	public static void setMonth(String month) {
		Month = month;
	}

	public static String getDay() {
		return Day;
	}

	public static void setDay(String day) {
		Day = day;
	}
    
    
}
