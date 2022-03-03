package itheima_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 	InputStreamReader:�Ǵ��ֽ������ַ���������
 		����ȡ�ֽ�,��ʹ��ָ���ı��뽫�����Ϊ�ַ�
 		��ʹ�õ��ַ�������������ָ��,Ҳ���Ա���ȷָ��,���߿��Խ���ƽ̨��Ĭ���ַ���
 		
 		
 	OutputStreamWrite:�Ǵ��ַ������ֽ���������
 		�Ǵ��ַ������ֽ���������,ʹ��ָ���ı��뽫д����ַ�����Ϊ�ֽ�
 		��ʹ�õ��ַ�������������ָ��,Ҳ���Ա���ȷָ��,���߿��Խ���ƽ̨��Ĭ���ַ���
 */
public class ConversionStreamDemo {
	public static void main(String[] args) throws IOException {
//		OutputStreamWriter (OutputStream out)����һ��ʹ��Ĭ���ַ������OutputStreamWriter��
//		OutputStreamWriter (OutputStream out,String charsetName)����һ��ʹ�������ַ�����OutputStreamWriter��
//		FileOutputStream fos = new FileOutputStram("E:\\javaspace\\myCharStream\\osw.txt");
//		OutputStreamWrite osw = new OutputStreamWriter(fos);
		
//		OutputStreamWriter osw = new OutputStreamWriter (new FileOutputStream("E:\\javaspace\\myCharStream\\osw.txt"));
//		OutputStreamWriter osw = new OutputStreamWriter (new FileOutputStream("E:\\javaspace\\myCharStream\\osw.txt"),"UTF-8");
		OutputStreamWriter osw = new OutputStreamWriter (new FileOutputStream("E:\\javaspace\\myCharStream\\osw.txt"),"GBK");
		osw.write("�й�");
		osw.close();
		
//		InputStreamReader(InputString in)����һ��ʹ��Ĭ���ַ�����InputStreamReader��
//		InputStreamReader(InputString in,String charsetName)����һ��ʹ�������ַ�����InputStreamReader��
		//InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\javaspace\\myCharStream\\osw.txt"),"UTF-8");
		InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\javaspace\\myCharStream\\osw.txt"),"GBK");
		//InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\javaspace\\myCharStream\\osw.txt"));
		
		//һ�ζ�ȡһ���ַ�����
		int ch;
		while((ch=isr.read())!=-1) {
			System.out.print((char)ch);
		}
		isr.close();
		
	}
}
