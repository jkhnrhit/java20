package com.rhit.java20.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class MyDateConverter implements Converter<String, Date> {

	
	
	public Date convert(String arg0) {
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = sdf.parse(arg0);
		} catch (ParseException e) {
			sdf = new SimpleDateFormat("yyyy/MM/dd");
			try {
				date = sdf.parse(arg0);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		return date;
	}

}
