package kkt.java.tips;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class UniqueIDGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueIDGen uniqueidObj=new UniqueIDGen();
		String generatedid=uniqueidObj.generateUniqueId();
		System.out.println("ID generated:"+generatedid);
		System.out.println(Integer.decode("123"));
	}
	
	public String generateUniqueId() {
		String id ="";
		String DATE_FORMAT_NOW = "yyyyMMddhhmm";
		SimpleDateFormat formatdt = new SimpleDateFormat(DATE_FORMAT_NOW);
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100);
		id = formatdt.format(new Date()) + randomInt; 
		return id;
	}

}
