package ���ڹ�����;

import java.text.ParseException;
import java.util.Date;

public class Demo {
	public static void main(String[] args) throws ParseException {
		//�������ڶ���
		Date d = new Date();
		
		String s1 = Utils.dateToString(d,"yyyy��MM��dd�� HH:mm:ss");
		System.out.println(s1);
		
		String s2 = Utils.dateToString(d,"yyyy��MM��dd��");
		System.out.println(s2);
		
		String s3 = Utils.dateToString(d,"HH:mm:ss");
		System.out.println(s3);
		System.out.println("----------------");
		
		String s = "2048-08-09 12:12:12";
		Date dd = Utils.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
		System.out.println(dd);
		
	}
}
