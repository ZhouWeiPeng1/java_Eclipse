package itheima_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	����:
 		��E:\\itcast\\mn.jpg
 	
 	˼·:
 		1:��������Դ�����ֽ�����������
 		2:����Ŀ�ĵش����ֽ����������
 		3:��д����,����ͼƬ(һ�ζ�ȡһ���ֽ�����,һ��д��һ���ֽ�����)
 		4:�ͷ���Դ
 */
public class CopyJpgDemo {
	public static void main(String[] args) throws IOException {
		//��������Դ�����ֽ�����������
		FileInputStream fis = new FileInputStream("E:\\itcast\\mn.jpg");
		
		//����Ŀ�ĵش����ֽ����������
		FileOutputStream fos = new FileOutputStream("E:\\javaspace\\myByteStream\\mn.jpg");
		
		
		//��д����,����ͼƬ(һ�ζ�ȡһ���ֽ�����,һ��д��һ���ֽ�����)
		byte[] bys = new byte[1024];
		int len;
		 while((len=fis.read(bys))!=-1) {
			 fos.write(bys,0,len);
		 }
		 //�ͷ���Դ
		 fos.close();
		 fis.close();
	}
}
