package date;

import java.util.Date;
/*
 	public Date():����һ��Date����,����ʼ��,�Ա����������������ʱ�䣬��ȷ������
 	public Date(long date):����һ��Date����,�������ʼ��Ϊ��ʾ�ӱ�׼��׼ʱ����ָ���ĺ�����
 	
 */
public class DataDemo {
	public static void main(String[] args) {
		//public Date():����һ��Date����,����ʼ��,�Ա����������������ʱ�䣬��ȷ������
		Date d1 = new Date();
		System.out.println(d1);
		
		//public Date(long date):����һ��Date����,�������ʼ��Ϊ��ʾ�ӱ�׼��׼ʱ����ָ���ĺ�����
		long date = 1000*60*60;//1Сʱ
		Date d2 = new Date(date);
		System.out.println(d2);
	}
}
