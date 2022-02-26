package itheima_01;

import java.io.File;
import java.io.IOException;

/*
 	File类删除功能:
 		public boolean delete():删除由此抽象路径名表示的文件或目录
 		
 	绝对路径和相对路径的区别
 		绝对路径：完整的路径名，不需要任何其他信息就可以定位它所表示的文件.例如:E:\\itcast\\java.txt
 		相对路径：必须使用取自其他路径名的信息进行解释。例如：myFile\\java.txt
 		
 	删除目录时注意事项:
 		如果一个目录中有内容(目录,文件),不能直接删除.应该先删除目录中的内容,最后才能删除目录
 */
public class FileDemo03 {
	public static void main(String[] args) throws IOException {
		//File f1 = new File("E:\\itcast\\java.txt");
		//需求1：在当前模块目录下创建java.txt文件
		File f1 = new File("E:\\javaspace\\myFile\\java.txt");
		//System.out.println(f1.createNewFile());
		
		//需求2：删除当前模块目录下的java.txt文件
		System.out.println(f1.delete());
		
		//需求3：在当前模块目录下创建itcast目录
		File f2 = new File("E:\\javaspace\\myFile\\itcast");
		System.out.println(f2.mkdir());
		
		//需求4:删除当前模块目录下的itcast目录
		System.out.println(f2.delete());
		
		//需求5:在当前模块下创建一个目录，然后在该目录下创建一个文件java.txt
		File f3 = new File("E:\\javaspace\\myFile\\itcast");
		System.out.println(f3.mkdir());
		File f4 = new File("E:\\javaspace\\myFile\\itcast\\java.txt");
		System.out.println(f4.createNewFile());
		
		//需求6：删除当前模块下的目录itcast
//		System.out.println(f4.delete());
//		System.out.println(f3.delete());
		
	}
}
