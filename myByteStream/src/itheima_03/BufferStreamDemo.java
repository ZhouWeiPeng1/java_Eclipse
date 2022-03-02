package itheima_03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	�ֽڻ�����:
 		BufferOutputStream
 		BufferedInputStream
 		
 	���췽��:
 		�ֽڻ��������:BufferedOutputStream(OutputStream out)
 		�ֽڻ���������:BufferedInputStream(InputStream in)
 */
public class BufferStreamDemo {
	public static void main(String[] args) throws IOException {
		//�ֽڻ��������:BufferedOutputStream(OutputStream out)
//		FileOutputStream fos = new FileOutputStream("E:\\javaspace\\myByteStream\\bos.txt");
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		/*
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\javaspace\\myByteStream\\bos.txt"));
		//д����
		bos.write("hello\r\n".getBytes());
		bos.write("world\r\n".getBytes());
		
		//�ͷ���Դ
		bos.close();
		*/
		
		//�ֽڻ���������:BufferedInputStream(InputStream in)
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\\\javaspace\\\\myByteStream\\\\bos.txt"));
		
		//һ�ζ�ȡһ���ֽ�����
//		int by;
//		while((by=bis.read())!=-1) {
//			System.out.print((char)by);
//		}
		
		//һ�ζ�ȡһ���ֽ�����52
		byte[] bys = new byte[1024];
		int len;
		while((len=bis.read(bys))!=-1) {
			System.out.println(new String(bys,0,len));
		}
		
		//�ͷ���Դ
		bis.close();
	}
}
