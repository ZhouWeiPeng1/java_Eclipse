package itheima_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 	����:���ļ�fos.txt�е����ݶ�ȡ�����ڿ���̨���
 	
 	ʹ���ֽ������������ݵĲ���:
 		1:�����ֽ�����������
 		2:�����ֽ�����������Ķ����ݷ���
 		3:�ͷ���Դ
 */
public class FileInputStreamDemo02 {
	public static void main(String[] args) throws IOException {
		//�����ֽ�����������
		FileInputStream fis = new FileInputStream("E:\\javaspace\\myByteStream\\fos.txt");
		
		/*
		//�����ֽ�����������Ķ����ݷ���
		//in read (byte[] b):�Ӹ���������ȡ��� b.length���ֽڵ����ݵ�һ���ֽ�����
		byte[] bys = new byte[5];
		
		//��һ�ζ�ȡ����
		int len = fis.read(bys);
		System.out.println(len);
		//String (byte[] bytes)
		//System.out.println(new String(bys));
		System.out.println(new String(bys,0,len));
		
		//�ڶ��ζ�ȡ����
		len = fis.read(bys);
		System.out.println(len);
		//System.out.println(new String(bys));
		System.out.println(new String(bys,0,len));
		
		//�����ζ�ȡ����
		len = fis.read(bys);
		System.out.println(len);
		//String (byte[] bytes,int offset,int length)
		System.out.println(new String(bys,0,len));
		
		//�ٶ��ȡ����
		len = fis.read(bys);
		System.out.println(len);
		len = fis.read(bys);
		System.out.println(len);

		*/
		//�Ľ�����
		byte[] bys = new byte[1024];//1024����������
		int len;
		while((len=fis.read(bys))!=-1) {
			System.out.println(new String(bys,0,len));
		}
				
		/*
		 		hello\r\n
		 		world\r\n
		 		
		 		��һ��:hello
		 		�ڶ���:\r\nwor
		 		������:ld\r\nj
		 */
		//�ͷ���Դ
		fis.close();
	}
}
