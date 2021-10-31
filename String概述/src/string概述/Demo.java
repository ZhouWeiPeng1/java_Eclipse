package string概述;
/*
 			String类在java.lang包下，所以使用的时候不需要导包
 			
 			String类代表字符串，java程序中的所有字符串文字（例如"abc"）都被实现为此类的实例
 			也就是说，java程序中所有的双引号字符串，都是String类的对象
 			
 			字符串的特点：
 			1.字符串不可变，它们的值在创建后不能被更改
 			2.虽然String的值是不可变的，但是它们可以被共享
 			3.字符串效果上相当于字符数组（char[]），但是底层原理是字节数组（byte[]）
 			//jdk8以前是字符数组，jdk9及以后是字节数组
 			 
 			 
 			 
 			 String构造方法：
 			 public String();创建一个空白字符串对象，不含有任何内容
 			 public String(char[] chs);根据字符数组的内容，来创建字符串对象
 			 public String(byte[] bys);根据字节数组的内容，来创建字符串对象
 			 String s="abc";直接赋值的方式创建字符串对象，内容就是abc
 			 
 			 推荐使用直接赋值的方式得到字符串对象
 */
public class Demo {
	public static void main(String[] args) {
		//public String();创建一个空白字符串对象，不含有任何内容
		String s1=new String();
		System.out.println("s1:"+s1);
		
		//public String(char[] chs);根据字符数组的内容，来创建字符串对象
		char[] chs= {'a','b','c'};
		String s2=new String(chs);
		System.out.println("s2:"+s2);
		
		//public String(byte[] bys);根据字节数组的内容，来创建字符串对象
		byte[] bys= {97,98,99};
		String s3=new String(bys);
		System.out.println("s3:"+s3);
		
		//String s="abc";直接赋值的方式创建字符串对象，内容就是abc
		String s4="abc";
		System.out.println("s4:"+s4);
	}
}
