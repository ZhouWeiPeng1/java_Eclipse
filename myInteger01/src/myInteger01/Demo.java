package myInteger01;

public class Demo {
	public static void main(String[] args) {
		/*
		//public Integer(int value):根据int值创建 Integer 对象(过时)
		Integer i1 = new Integer(100);
		System.out.println(i1);
		
		//public Integer(String s):根据 String 值创建 Integer 对象(过时)
		Integer i2 = new Integer("100");
//		Integer i2 = new Integer("abc");//NumberFormatException
		System.out.println(i2);
		*/
		
		//public static Integer valueOf(int i):返回表示指定的 int 值的 Integer 实例
		Integer i1 = Integer.valueOf(100);
		System.out.println(i1);
		
		
		//public static Integer valueOf(String s):返回一个保存指定值的Integer 对象String
		
		Integer i2 = Integer.valueOf("100");
		System.out.println(i2);
	}
}
