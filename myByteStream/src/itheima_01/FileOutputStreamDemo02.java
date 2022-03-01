package itheima_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	���췽��:
 		FileOutputStream(String name):�����ļ��������ָ��������д���ļ�
 		FileOutputStream(File file):�����ļ��������д����ָ����File�����ʾ���ļ�
 	д���ݵ����ַ�ʽ:
 		void write(int b):��ָ�����ֽ�д����ļ������
 		һ��дһ���ֽ�����
 		
 		void write(byte[] b):��b.length�ֽڴ�ָ�����ֽ�����д����ļ������
 		һ��дһ���ֽ���������
 		
 		void write(byte[] b,int off,int len),��len�ֽڴ�ָ�����ֽ����鿪ʼ,��ƫ����off
 		��ʼд����ļ������
 		һ��дһ���ֽ�����Ĳ�������
 */
public class FileOutputStreamDemo02 {
	public static void main(String[] args) throws IOException {
		//FileOutputStream(String name):�����ļ��������ָ��������д���ļ�
		FileOutputStream fos = new FileOutputStream("E:\\javaspace\\myByteStream\\fos.txt");
		
		//void write(int b):��ָ�����ֽ�д����ļ������
		
//		fos.write(97);
//		fos.write(98);
//		fos.write(99);
//		fos.write(100);
//		fos.write(101);
		
		//void write(byte[] b):��b.length�ֽڴ�ָ�����ֽ�����д����ļ������
//		byte[] bys = {97,98,99,100,101};
		//byte[] getByte():�����ַ�����Ӧ���ֽ�����
		byte[] bys = "abcde".getBytes();
		//fos.write(bys);
		
		//void write(byte[] b,int off,int len),��len�ֽڴ�ָ�����ֽ����鿪ʼ,��ƫ����off��ʼд����ļ������
 		fos.write(bys,0,bys.length);
		
	}
}
