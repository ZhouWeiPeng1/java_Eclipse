package itheima_02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
/*	������			˵��
 	flush()			ˢ����,�����Լ���д����
 	close()			�ر���,�ͷ���Դ,�����ڹر�֮ǰ����ˢ����.һ���ر�,�Ͳ�����д����
 	
 */
/*
 	���췽��:
 		OutputStreamWriter(OutputStream out):����һ��ʹ��Ĭ���ַ������OutputStreamWriter
 	
 	д���ݵ�5�ַ�ʽ:
 		void write(int c):д��һ���ַ�
 		void write(char[] cbuf):д��һ���ַ�����
 		void write(char[] cbuf,int off,int len):д���ַ������һ����
 		void write(String str):дһ���ַ���
 		void write(String str,int off,int len):дһ���ַ�����һ����
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//OutputStreamWriter(OutputStream out):����һ��ʹ��Ĭ���ַ������OutputStreamWriter
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\javaspace\\myCharStream\\osw.txt"));
		
		//void write(int c):д��һ���ַ�
//		osw.write(97);
//		//void flush():ˢ����
//		osw.flush();
//		osw.write(98);
//		osw.flush();
//		osw.write(99);
		
		//void write(char[] cbuf):д��һ���ַ�����
		char[] chs = {'a','b','c','d','e'};
		//osw.write(chs);
		
		//void write(char[] cbuf,int off,int len):д���ַ������һ����
//		osw.write(chs, 0, chs.length);
		//osw.write(chs, 1, 3);
		
		//void write(String str):дһ���ַ���
//		osw.write("abcde");
		
		//void write(String str,int off,int len):дһ���ַ�����һ����
		//osw.write("abcde",0,"abcde".length());
		osw.write("abcde",1,3);
		
		//�ͷ���Դ
		osw.close();//�ͷ���Դǰ,�����һ��flush������Ҳ������ˢ��һ�����ͷ���Դ
		
		
	}
}
