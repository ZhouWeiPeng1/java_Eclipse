package myInteger02;

/*
 	int和String的相互转换
 	
 	1.int 转换为 String
 	public static String valueOf(int i):返回int参数的字符串表示形式。该方法是String类中的方法

 	
 	2.String 转换为 int
 	public static int parselnt(String s):将字符串解析为int类型。该方法是Integer类中的方法
 	
 */
public class Demo {
	public static void main(String[] args) {
		//int---String
		int number = 100;
		//方式1
		String s1= ""+ number;
		System.out.println(s1);
		
		//方式2
		String s2 = String.valueOf(number);
		System.out.println(s2);
		System.out.println("---------");
		
		//String---int
		String s = "100";
		//方式1
		//String --- Integer --- int
		Integer i = Integer.valueOf(s);
		//public int intValue
		int x = i.intValue();
		System.out.println(x);
		
		//方式2
		//public static int parseInt(String s)
		int y = Integer.parseInt(s);
		System.out.println(y);
	}
}
