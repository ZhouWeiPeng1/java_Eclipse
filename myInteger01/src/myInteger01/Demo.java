package myInteger01;

public class Demo {
	public static void main(String[] args) {
		/*
		//public Integer(int value):����intֵ���� Integer ����(��ʱ)
		Integer i1 = new Integer(100);
		System.out.println(i1);
		
		//public Integer(String s):���� String ֵ���� Integer ����(��ʱ)
		Integer i2 = new Integer("100");
//		Integer i2 = new Integer("abc");//NumberFormatException
		System.out.println(i2);
		*/
		
		//public static Integer valueOf(int i):���ر�ʾָ���� int ֵ�� Integer ʵ��
		Integer i1 = Integer.valueOf(100);
		System.out.println(i1);
		
		
		//public static Integer valueOf(String s):����һ������ָ��ֵ��Integer ����String
		
		Integer i2 = Integer.valueOf("100");
		System.out.println(i2);
	}
}
