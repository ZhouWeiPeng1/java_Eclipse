package itheima_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/*
 	throws �쳣����;
 	�����ʽ�Ǹ��ڷ��������ź����
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("��ʼ");
//		method();
		try {
			method2();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����");
	}
	//����ʱ�쳣
	
	   public static void method2() throws ParseException{
	 	String s = "2048-08-09";
	 	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	 	Date d = sdf.parse(s);
	 	System.out.println(d);
	 	}
	 
	
	//����ʱ�쳣
//	public static void method() throws ArrayIndexOutOfBoundsException{
//		int[] arr = {1,2,3};
//		System.out.println(arr[3]);
//	}
}
