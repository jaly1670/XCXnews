package com.news.utils;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * 时间操作类
 * 
 * @author cshu
 * 
 */
@SuppressWarnings("deprecation")
public class DateTimeHelper {

	/**
	 * 获取当前时间的年份
	 * 
	 * @return
	 */
	public static String getNowYear() {
		return format(new Date(), "yyyy");
	}

	public static String getNowMonthAndDay() {
		return format(new Date(), "MM-dd");
	}
	
	public static String getFormatNowMonthAndDay() {
		return format(new Date(), "MMdd");
	}

	public static String getYear(Date d) {
		int year = d.getYear() + 1900;
		return year + "";
	}

	public static String getMonth(Date d) {
		int month = d.getMonth() + 1;
		return StringHelper.fillPrefixZero(month, 2);
	}

	/**
	 * 格式化 时间
	 * 
	 * @param format
	 * @return
	 */
	public static String format(Date d, String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		return df.format(d);
	}

	public static String format(String str, String format, String disFormat) {
		Date d = parse(str, format);
		return format(d, disFormat);
	}

	/**
	 * 格式化 时间
	 * 
	 * @param format
	 * @return
	 */
	public static String format(Date d, DateFormat format) {
		return format.format(d);
	}

	/**
	 * 格式化 时间
	 * 
	 * @param format
	 * @return Date
	 * @throws ParseException
	 */
	public static Date parse(String dateStr, String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		try {
			return df.parse(dateStr);
		} catch (ParseException e) {
			return new Date();
		}
	}

	public static Date parse(String dateStr, String format, Date d) {
		try {
			SimpleDateFormat df = new SimpleDateFormat(format);
			return df.parse(dateStr);
		} catch (Exception e) {
			return d;
		}
	}

	/**
	 * 解析时间
	 * 
	 * @param String
	 * @param DateFormat
	 * @return Date
	 * @throws ParseException
	 */
	public static Date parse(String dateStr, DateFormat format) throws ParseException {
		return format.parse(dateStr);
	}

	public static Date parseDate(String dateStr) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(dateStr);
	}

	/**
	 * 获取当前时间的年月
	 * 
	 * @return
	 */
	public static String getPrevMonth() {
		return minusMonth(new Date(), 1);
	}

	/**
	 * 获取当前时间的上个年月
	 * 
	 * @return
	 */
	public static String getNowMonth() {
		return format(new Date(), "yyyy-MM");
	}

	/**
	 * 获取当前时间的上个年月格式化
	 * 
	 * @return
	 */
	public static String getNowMonthFomart() {
		return format(new Date(), "yyyyMM");
	}

	/**
	 * 获取当前时间的上一个月
	 * 
	 * @return
	 */
	public static String getPreMonthDate() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date); // 设置为当前时间
		calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 1); // 设置为上一个月
		date = calendar.getTime();
		return format(date, "yyyy-MM-dd");
	}
	
	/**
	 * 获取当前时间的前两个月
	 * 
	 * @return
	 */
	public static String getTwoMonthDate() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date); // 设置为当前时间
		calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 2); // 设置为前两个月
		date = calendar.getTime();
		return format(date, "yyyy-MM-dd");
	}

	/**
	 * 获取当前时间的年月日
	 * 
	 * @return
	 */
	public static String getNowDate() {
		return format(new Date(), "yyyy-MM-dd");
	}

	public static String getNowDateFomart() {
		return format(new Date(), "yyyyMMdd");
	}

	
	/**
	 * 明年的昨天
	 * @param dateStr
	 * @return
	 */
	public static String getNextYearDate(String dateStr) {
		Date date = parse(dateStr, "yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.YEAR, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		return format(c.getTime(), "yyyy-MM-dd");
	}

	/**
	 * 获取明天时间的年月日
	 * 
	 * @return
	 */
	public static String getTomorrowDate(String nowDate) {
		Date date = parse(nowDate, "yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, 1);
		return format(c.getTime(), "yyyy年MM月dd日");
	}

	/**
	 * 获取当前时间
	 * 
	 * @return
	 */
	public static String getNowTime() {
		return format(new Date(), "yyyy-MM-dd HH:mm:ss");
	}

	public static String getNowTimeFomart() {
		return format(new Date(), "yyyyMMddHHmmss");
	}

	public static String getNextYear() {
		return format(new Date(), "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 
	 * @param month
	 * @param dates
	 * @return
	 */
	public static String minusMonth(Date date, int c) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.MONTH, -c);
			return format(cal.getTime(), df);
		} catch (Exception e) {
			return format(date, df);
		}
	}

	/**
	 * 
	 * @param month
	 * @param dates
	 * @return
	 */
	public static String minusMonth(String month, int c) {
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
			Date date = parse(month, df);

			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.MONTH, -c);

			return format(cal.getTime(), df);
		} catch (Exception e) {
			return month;
		}
	}

	/**
	 * 
	 * @param month
	 * @param dates
	 * @return
	 */
	public static Date minus(Date d, int type, int c) {
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTime(d);
			cal.add(type, -c);
			return cal.getTime();
		} catch (Exception e) {
			return new Date();
		}
	}

	/**
	 * 得到前一个月
	 * 
	 * @param month
	 * @return
	 */
	public static String prevMonth(String month) {
		return minusMonth(month, 1);
	}

	/**
	 * 得到前一个月
	 * 
	 * @param month
	 * @return
	 */
	public static String prevMonth(String month, int c) {
		return minusMonth(month, c);
	}

	public static float duration(String startTime, String stopTime) {
		Date sd = DateTimeHelper.parse(startTime, "yyyy-MM-dd HH:mm");
		long sl = sd.getTime();

		Date ed = DateTimeHelper.parse(stopTime, "yyyy-MM-dd HH:mm");
		long el = ed.getTime();

		float l = el - sl;
		if (l <= 0) {
			l = 0;
		}
		l = l / (1000 * 60);
		return l;
	}

	public static String getStartYearMonthBySeason(String year, int season) {
		switch (season) {
		case 1:
			return getYearMonth(year, "01");
		case 2:
			return getYearMonth(year, "04");
		case 3:
			return getYearMonth(year, "07");
		case 4:
			return getYearMonth(year, "10");
		default:
			return getYearMonth(year, "01");
		}
	}

	private static String getYearMonth(String year, String month) {
		return year + "-" + month;
	}

	public static String getEndYearMonthBySeason(String year, int season) {
		switch (season) {
		case 1:
			return getYearMonth(year, "03");
		case 2:
			return getYearMonth(year, "06");
		case 3:
			return getYearMonth(year, "09");
		case 4:
			return getYearMonth(year, "12");
		default:
			return getYearMonth(year, "03");
		}
	}

	public static String getAddNumDay(String giveTime, int addDay) {
		String time = giveTime;
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		try {
			date = sdf.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, +addDay);// +1今天的时间加一天
		date = calendar.getTime();
		time = sdf.format(date);
		return time;
	}

	/**
	 * date2比date1多的天数
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int differentDays(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		int day1 = cal1.get(Calendar.DAY_OF_YEAR);
		int day2 = cal2.get(Calendar.DAY_OF_YEAR);

		int year1 = cal1.get(Calendar.YEAR);
		int year2 = cal2.get(Calendar.YEAR);
		if (year1 != year2) // 同一年
		{
			int timeDistance = 0;
			for (int i = year1; i < year2; i++) {
				if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) // 闰年
				{
					timeDistance += 366;
				} else // 不是闰年
				{
					timeDistance += 365;
				}
			}

			return timeDistance + (day2 - day1);
		} else // 不同年
		{
//			System.out.println("判断day2 - day1 : " + (day2 - day1));
			return day2 - day1;
		}
	}

	/**
	 * 通过时间秒毫秒数判断两个时间的间隔
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int differentDaysByMillisecond(Date date1, Date date2) {
		int days = (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
		return days;
	}

	public static int calcDate(String dateStr, String dateStr2) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(dateStr);
			Date date2 = format.parse(dateStr2);
			return DateTimeHelper.differentDays(date, date2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * 结束时间和开始时间进行相减
	 * 柳青
	 * 返回格式如：58分40秒
	 * @throws ParseException 
	 */
 
	public static String DateCompare(String startTime,String endTime) throws ParseException{
		DecimalFormat format = new DecimalFormat("00");
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		Date dateTimeStart =sdf.parse(startTime);
		Date dateTimeend =sdf.parse(endTime);
		long timecha = dateTimeend.getTime()-dateTimeStart.getTime();//获得时间差
		double daytime = Math.floor(timecha/(24 * 60 * 60 * 1000));
		int day=(int)Math.floor(daytime);//转化天
		double housess = timecha % (1000 * 60 * 60 * 24) / (1000 * 60 * 60);
		int house = (int) Math.floor(housess);//转化小时
		double mi = timecha % (1000 * 60 * 60) / (1000 * 60);
		int minutes = (int) Math.floor(mi);//转化分钟
		 long mss = timecha / 1000;
	        long seconds = mss % 60;
	        String second = format.format(seconds);
		System.out.println( minutes + "分"+ second + "秒");
		String team=  minutes + "分"+ second + "秒";
 
		return team;
		
	}
	public static void main(String[] args) throws ParseException {	
		String start="2019-12-18 11:25:12";
		String end="2019-12-18 11:36:08";
		DateCompare(start,end);
	//	formatDateTime();
	}
	
	/**
	 * 已知毫秒数直接获取时分秒
	 * @return
	 */
 	 public static String formatDateTime( long milliseconds) {
		// long milliseconds=656000;
	        StringBuilder sb = new StringBuilder();
	        long mss = milliseconds / 1000;
	        long days = mss / (60 * 60 * 24);
	        long hours = (mss % (60 * 60 * 24)) / (60 * 60);
	        long minutes = (mss % (60 * 60)) / 60;
	        long seconds = mss % 60;
	        DecimalFormat format = new DecimalFormat("00");
	        if (days > 0 || hours > 0) {
	            sb.append(format.format(hours)).append(":").append(format.format(minutes)).append(":").append(format.format(seconds));
	        }else {
	            sb.append(format.format(minutes)).append(":").append(format.format(seconds));
	        }
	        System.out.println(sb.toString());
	        return sb.toString();
	    } 
 
}
