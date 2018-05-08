package com.commonclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BuildCalender {

	public static void main(String[] args) {
		// 创建Calendar对象
		Calendar c = Calendar.getInstance();
		        
		// 将Calendar对象转换为Date对象
		Date date = c.getTime();
		        
		// 创建SimpleDateFormat对象，指定目标格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		        
		// 将日期转换为指定格式的字符串
		String now = sdf.format(date);
		System.out.println("当前时间：" + now);

	}

}
