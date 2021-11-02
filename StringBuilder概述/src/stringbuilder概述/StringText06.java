package stringbuilder概述;
/*
 		StringBuilder是一个可变的字符串类，我们可以把它看成是一个容器
 		这里的可变指的是StringBuilder对象中的内容是可变的
 		
 		String与StringBuilder的区别：
 		 String：的内容不可变的
 		 StringBuilder：内容是可变的
 		 
 		 StringBuilder的构造方法
 		 方法名 							说明
 	public StringBuilder()			创建一个空白可变字符串对象，不含有任何内容
 	public StringBuilder(String str) 根据字符串的内容，来创建可变字符串对象
 */
public class StringText06 {
		public static void main(String[] args) {
			//public StringBuilder():创建一个空白可变字符串对象，不含有任何内容
			StringBuilder sb=new StringBuilder();
			System.out.println("sb:"+sb);
			System.out.println("sb.length():"+sb.length());
			
			//public StringBuilder(String str):根据字符串的内容，来创建可变字符串对象
			StringBuilder sb2=new StringBuilder("hello");
			System.out.println("sb2:"+sb2);
			System.out.println("sb2.length():"+sb2.length());
			
		}
}
