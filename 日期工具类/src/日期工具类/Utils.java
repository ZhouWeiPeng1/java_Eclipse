package ���ڹ�����;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	������
 	
 	���췽��˽��
 	��Ա������̬
 */
public class Utils {
	private Utils() {
		
	}
	
	/*
	 	������תΪָ����ʽ���ַ���
	 	����ֵ����Ϊ��String
	 	������Date date��String format
	 */
	
	public static String dateToString(Date date,String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String s = sdf.format(date);
		return s;
	}
	
	
	/*
	 	���ַ�������Ϊָ����ʽ
	 	����ֵ���ͣ�Date
	 	����:String s��String format
	 */
	public static Date stringToDate(String s,String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date d = sdf.parse(s);
		return d;
	}
	
}
