package myInteger02;

/*
 	int��String���໥ת��
 	
 	1.int ת��Ϊ String
 	public static String valueOf(int i):����int�������ַ�����ʾ��ʽ���÷�����String���еķ���

 	
 	2.String ת��Ϊ int
 	public static int parselnt(String s):���ַ�������Ϊint���͡��÷�����Integer���еķ���
 	
 */
public class Demo {
	public static void main(String[] args) {
		//int---String
		int number = 100;
		//��ʽ1
		String s1= ""+ number;
		System.out.println(s1);
		
		//��ʽ2
		String s2 = String.valueOf(number);
		System.out.println(s2);
		System.out.println("---------");
		
		//String---int
		String s = "100";
		//��ʽ1
		//String --- Integer --- int
		Integer i = Integer.valueOf(s);
		//public int intValue
		int x = i.intValue();
		System.out.println(x);
		
		//��ʽ2
		//public static int parseInt(String s)
		int y = Integer.parseInt(s);
		System.out.println(y);
	}
}
