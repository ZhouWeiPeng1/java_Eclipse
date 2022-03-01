package itheima_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 	����:���ļ�fos.txt�е����ݶ�ȡ�����ڿ���̨���
 	
 	FileInputStream:���ļ�ϵͳ�е��ļ���ȡ�����ֽ�
 		��FileIputStream(String name):ͨ������ʵ���ļ�������������һ��FileInputStream,���ļ���
 		�ļ�ϵͳ�е�·����name����
 		
 	ʹ���ֽ������������ݵĲ���:
 		1�������ֽ�����������
 		2�������ֽ�����������Ķ����ݷ���
 		3���ͷ���Դ
 		
 */
public class FileInputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		//�����ֽ�����������
		//FileInputStream(String name)
		FileInputStream fis = new FileInputStream("E:\\javaspace\\myByteStream\\fos.txt");
		
		//�����ֽ�����������Ķ����ݷ���
		//int read():�Ӹ���������ȡһ���ֽڵ�����
		
		//��һ�ζ�ȡ����
//		int by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		
//		//�ڶ��ζ�ȡ����
//		by = fis.read();
//		System.out.println(by);
//		System.out.println((char)by);
		
		
		//����ﵽ�ļ���ĩβ
		/*
		 * int by = fis.read(); while(by != -1) { System.out.println((char)by); by =
		 * fis.read(); }
		 */
		
		//�Ż�����ĳ���
		int by;
		/*
		 	fis.read():������
		 	by=fis.read():�Ѷ�ȡ�������ݸ�ֵ��by
		 	by != -1:�ж϶�ȡ���������Ƿ���-1
		 */
		while((by=fis.read())!=-1) {
			System.out.print((char)by);
		}
		
		//�ͷ���Դ
		fis.close();
	}
}
