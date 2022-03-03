package itheima_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
 	需求:字节流读文本文件数据
 	
 	一个汉字存储:
 		如果是GBK编码,占用2个字节
 		如果是UTF-8编码,占用3个字节
 		
 	*为什么会出现字符流？*
 		由于字节操作中文不是特别的方便,所以java就提供字符流
 		·字符流 = 字节流 + 编码表
 		
 	用字节流复制文本时,文本文件也会有中文,文本文件也会有中文,但是没有问题,原因是最终底层操作
 	会自动进行字节拼接成中文,如何识别是中文的呢?
 	
 		·汉字在存储的时候,无论选择哪种编码存储,第一个字节都是负数
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
		String s ="中国";//[-42, -48, -71, -6]

		//byte[] bys = s.getBytes();
		//byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
		byte[] bys = s.getBytes("GBK");//[-42, -48, -71, -6]
		
		
		System.out.println(Arrays.toString(bys));
	}
}
