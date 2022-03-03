package itheima_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 	编码:
 		byte[] getBytes():使用平台的默认字符集将该String编码为一系列字节,将结果存储到新的字节数组中
 		byte[] getBytes(String charsetName):使用指定的字符集将该String编码为一系列字节,将结果存储到新的字节数组中
 		
 	解码:
 		String(byte[] bytes):通过使用平台的默认字符集解码指定的字节数组来构造新的String
 		String(byte[] bytes,String charsetName):通过指定的字符集解码指定的字节数组来构造新的String
 		
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//定义一个字符串
		String s = "中国";
		
		//byte[] getBytes():使用平台的默认字符集将该String编码为一系列字节,将结果存储到新的字节数组中
//		byte[] bys =s.getBytes();//[-42, -48, -71, -6]默认GBK

		//byte[] getBytes(String charsetName):使用指定的字符集将该String编码为一系列字节,将结果存储到新的字节数组中
		byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
		
		//String(byte[] bytes,String charsetName):通过指定的字符集解码指定的字节数组来构造新的String
		String ss =new String(bys,"UTF-8");
		System.out.println(ss);
		System.out.println(Arrays.toString(bys));
		
		//String(byte[] bytes):通过使用平台的默认字符集解码指定的字节数组来构造新的String
		//String ss = new String(bys);
		//System.out.println(ss);
	}
}
