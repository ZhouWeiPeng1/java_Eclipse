package itheima_01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 	字节流写数据加异常处理:
 		finally:在异常处理时提供finally块来执行所有清除操作.比如说IO流中的释放资源
 		特点:被finally控制的语句一定执行,除非JVM退出
 		
 		try{
 			可能出现异常的代码;
 		}catch(异常类名 变量名){
 			异常的处理代码;
 		}finally{
 			执行所有清除操作;
 		}
 */
public class FileOutputStreamDemo04 {
	public static void main(String[] args) {
		//加入finally来实现释放资源
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
