package itheima_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	����:
 		��"E:\\itcast\\���ﴰ��.txt"���Ƶ�ģ��Ŀ¼�µġ����ﴰ��.txt��
 		
 		����Դ:
 			E:\\itcast\\���ﴰ��.txt---������---InputStream---FileInputStream
 		Ŀ�ĵ�:
 			myByteStream\\���ﴰ��.txt---д����---OutputStream---FileOutputStream
 	
 	˼·:
 		1:��������Դ�����ֽ�����������
 		2:����Ŀ�ĵش����ֽ����������
 		3:��д����,�����ı��ļ�(һ�ζ�ȡһ���ֽ�,һ��д��һ���ֽ�)
 */
public class CopyTxtDemo {
	public static void main(String[] args) throws IOException {
		//��������Դ�����ֽ�����������
		FileInputStream fis = new FileInputStream("E:\\itcast\\���ﴰ��.txt");
		
		//����Ŀ�ĵش����ֽ����������
		FileOutputStream fos = new FileOutputStream("E:\\javaspace\\myByteStream\\���ﴰ��.txt");
		
		//��д����,�����ı��ļ�(һ�ζ�ȡһ���ֽ�,һ��д��һ���ֽ�)
		int by;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		
		//�ͷ���Դ
		fos.close();
		fis.close();
	}
}
