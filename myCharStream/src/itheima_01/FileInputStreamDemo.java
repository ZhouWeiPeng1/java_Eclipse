package itheima_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
 	����:�ֽ������ı��ļ�����
 	
 	һ�����ִ洢:
 		�����GBK����,ռ��2���ֽ�
 		�����UTF-8����,ռ��3���ֽ�
 		
 	*Ϊʲô������ַ�����*
 		�����ֽڲ������Ĳ����ر�ķ���,����java���ṩ�ַ���
 		���ַ��� = �ֽ��� + �����
 		
 	���ֽ��������ı�ʱ,�ı��ļ�Ҳ��������,�ı��ļ�Ҳ��������,����û������,ԭ�������յײ����
 	���Զ������ֽ�ƴ�ӳ�����,���ʶ�������ĵ���?
 	
 		�������ڴ洢��ʱ��,����ѡ�����ֱ���洢,��һ���ֽڶ��Ǹ���
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream("E:\\javaspace\\myCharStream\\a.txt");
//		
//		int by;
//		while((by=fis.read())!=-1) {
//			System.out.print((char)by);
//		}
//		
//		fis.close();
		
		//String s ="abc";//[97, 98, 99]
		String s ="�й�";//[-42, -48, -71, -6]

		//byte[] bys = s.getBytes();
		//byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
		byte[] bys = s.getBytes("GBK");//[-42, -48, -71, -6]
		
		
		System.out.println(Arrays.toString(bys));
	}
}
