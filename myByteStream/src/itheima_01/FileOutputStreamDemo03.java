package itheima_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	�ֽ���д���ݵ�����С����:
 		1:�ֽ���д�������ʵ�ֻ����أ�
 			window:\r\n
 			Linux:\n
 			mac:\r
 			
 		2.�ֽ���д�������ʵ��׷��д����?
 			public FileOutputStream(String name,boolean append)
 				�����ļ��������ָ��������д���ļ�.
 				����ڶ�������Ϊtrue,���ֽڽ�д����ļ���ĩβ�����ǿ�ͷ
 */
public class FileOutputStreamDemo03 {
	public static void main(String[] args) throws IOException {
		//�����ֽ����������
		FileOutputStream fos = new FileOutputStream("E:\\javaspace\\myByteStream\\fos.txt",true);
		
		//д����
		for(int i=0;i<10;i++) {
			fos.write("hello".getBytes());
			fos.write("\r\n".getBytes());
		}
		
		//�ͷ���Դ
		fos.close();
	}
}
