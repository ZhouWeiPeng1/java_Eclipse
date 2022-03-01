package itheima_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 	�ֽ���д���ݼ��쳣����:
 		finally:���쳣����ʱ�ṩfinally����ִ�������������.����˵IO���е��ͷ���Դ
 		�ص�:��finally���Ƶ����һ��ִ��,����JVM�˳�
 		
 		try{
 			���ܳ����쳣�Ĵ���;
 		}catch(�쳣���� ������){
 			�쳣�Ĵ������;
 		}finally{
 			ִ�������������;
 		}
 */
public class FileOutputStreamDemo04 {
	public static void main(String[] args) {
		//����finally��ʵ���ͷ���Դ
		FileOutputStream fos =null;
		try {
			fos = new FileOutputStream("E:\\javaspace\\myByteStream\\fos.txt");
			
			fos.write("hello".getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fos != null) {
				try {
					fos.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
