package itheima_01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
/*
 	�ֽ���������ࣺ
 		InputStream:����������Ǳ�ʾ�ֽ���������������ĳ���
 		OutputStream:����������Ǳ�ʾ�ֽ��������������ĳ���
 		�������ص�:�������ƶ������丸������Ϊ�������ĺ�׺
 
 	FileOutputStream:�ļ���������ڽ�����д��File
 		FileOutputStream(String name):�����ļ��������ָ��������д���ļ�
 		
 	ʹ���ֽ������д���ݵĲ���:
 		�����ֽ����������(����ϵͳ���ܴ������ļ�,�����ֽ����������,���ֽ����������ָ���ļ�)
 		�����ֽ�����������д���ݷ���
 		�ͷ���Դ(�رմ��ļ���������ͷ��������������κ�ϵͳ��Դ)
 */
public class FileOutputStreamDemo01 {

	public static void main(String[] args) throws IOException{
	//�����ֽ����������
	//FileOutputStream:�ļ���������ڽ�����д��File
		FileOutputStream fos = new FileOutputStream("E:\\javaspace\\myByteStream\\fos.txt");
		/*
		 	������������:
		 		A:����ϵͳ���ܴ������ļ�
		 		B:�������ֽ����������
		 		C:���ֽ����������ָ�򴴽��õ��ļ�
		 */
		//void write(int b):��ָ�����ֽ�д����ļ������
		fos.write(97);//�ַ�a
		fos.write(57);//�ַ�9
		fos.write(55);//�ַ�7
		
		//���Ҫ�ͷ���Դ
		//void close():�رմ��ļ���������ͷ��������������κ�ϵͳ��Դ
		fos.close();
		
	}
}
