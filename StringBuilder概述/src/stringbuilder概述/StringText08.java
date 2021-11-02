package stringbuilder概述;
/*
 		StringBuilder转换为String
 		   public String toString():通过toString()就可以实现把StringBuilder转换为
 		   String
 		String转换为StringBuilder
 			public StringBuilder(String s):通过构造方法就可以实现把String转换为
 			StringBuilder
 */
public class StringText08 {
	public static void main(String[] args) {
		//StringBuilder转换为String
		StringBuilder sb=new StringBuilder();
		sb.append("hello");
		//public String toString():通过toString()就可以实现把StringBuilder转换为
		//String
		String s=sb.toString();
		System.out.println(s);
		
//		public StringBuilder(String s):通过构造方法就可以实现把String转换为
//			StringBuilder
		String s1="hello";
		StringBuilder sb2=new StringBuilder(s1);
		System.out.println(sb2);
	}
}
