package stringbuilder����;
/*
 		StringBuilderת��ΪString
 		   public String toString():ͨ��toString()�Ϳ���ʵ�ְ�StringBuilderת��Ϊ
 		   String
 		Stringת��ΪStringBuilder
 			public StringBuilder(String s):ͨ�����췽���Ϳ���ʵ�ְ�Stringת��Ϊ
 			StringBuilder
 */
public class StringText08 {
	public static void main(String[] args) {
		//StringBuilderת��ΪString
		StringBuilder sb=new StringBuilder();
		sb.append("hello");
		//public String toString():ͨ��toString()�Ϳ���ʵ�ְ�StringBuilderת��Ϊ
		//String
		String s=sb.toString();
		System.out.println(s);
		
//		public StringBuilder(String s):ͨ�����췽���Ϳ���ʵ�ְ�Stringת��Ϊ
//			StringBuilder
		String s1="hello";
		StringBuilder sb2=new StringBuilder(s1);
		System.out.println(sb2);
	}
}
