package itheima_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 	����:
 		byte[] getBytes():ʹ��ƽ̨��Ĭ���ַ�������String����Ϊһϵ���ֽ�,������洢���µ��ֽ�������
 		byte[] getBytes(String charsetName):ʹ��ָ�����ַ�������String����Ϊһϵ���ֽ�,������洢���µ��ֽ�������
 		
 	����:
 		String(byte[] bytes):ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ�����ֽ������������µ�String
 		String(byte[] bytes,String charsetName):ͨ��ָ�����ַ�������ָ�����ֽ������������µ�String
 		
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//����һ���ַ���
		String s = "�й�";
		
		//byte[] getBytes():ʹ��ƽ̨��Ĭ���ַ�������String����Ϊһϵ���ֽ�,������洢���µ��ֽ�������
//		byte[] bys =s.getBytes();//[-42, -48, -71, -6]Ĭ��GBK

		//byte[] getBytes(String charsetName):ʹ��ָ�����ַ�������String����Ϊһϵ���ֽ�,������洢���µ��ֽ�������
		byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
		
		//String(byte[] bytes,String charsetName):ͨ��ָ�����ַ�������ָ�����ֽ������������µ�String
		String ss =new String(bys,"UTF-8");
		System.out.println(ss);
		System.out.println(Arrays.toString(bys));
		
		//String(byte[] bytes):ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ�����ֽ������������µ�String
		//String ss = new String(bys);
		//System.out.println(ss);
	}
}
