package myCalendar;

import java.util.Calendar;
/*
 	Calendar ΪĪһʱ�̺�һ�������ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶ��ṩ��һЩ����
 	
 	Calendar �ṩ��һ���෽�� getInstance ���ڻ�ȡ Calendar ����,�������ֶ���ʹ�õ�ǰ���ں�ʱ���ʼ��
 		Calendar rightNow = Calendar.getInstance();
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//��ȡ����
		Calendar c = Calendar.getInstance();//��̬����ʽ
//		System.out.println(c);
		
		//public int get(int field)
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;//Calendar.MONTH ��Χ0��11
		int date = c.get(Calendar.DATE);
		System.out.println(year+"��"+month+"��"+date+"��");
		
		
	}
}
