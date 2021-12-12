package simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	���췽����
 		public SimpleDateFormat():����һ��SimpleDateFormat,ʹ��Ĭ��ģʽ�����ڸ�ʽ
 		public SimpleDateFormat(String pattern):����һ��SimpleDateFormatʹ�ø�����ģʽ��Ĭ�ϵ����ڸ�ʽ
 	
 	��ʽ������Date��String
 		public final String format(Date date):�����ڸ�ʽ��������/ʱ���ַ���
 		
 	��������String��Date
 		public Date parse(String source):�Ӹ����ַ����Ŀ�ʼ�����ı�����������
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		//��ʽ������Date��String
		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��");
		String s = sdf.format(d);
		System.out.println(s);
		System.out.println("---------");
		
		//��String��Date
		String ss = "2048-08-09 11:11:11";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd=sdf2.parse(ss);
		System.out.println(dd);
	}
}
