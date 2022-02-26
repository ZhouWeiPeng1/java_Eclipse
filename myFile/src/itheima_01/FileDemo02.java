package itheima_01;

import java.io.File;
import java.io.IOException;

/*
 	File�ഴ�����ܣ�
 		public boolean createNewFile():�����и����Ƶ��ļ�������ʱ,����һ���ɸó���·�������������ļ�
 			����ļ������ڣ��ʹ����ļ���������true
 			����ļ������ڣ��Ͳ������ļ���������false
 		public boolean mkdir():�����ɴ˳���·��������Ŀ¼
 			���Ŀ¼�����ڣ��ʹ���Ŀ¼��������true
 			���Ŀ¼�����ڣ��Ͳ�����Ŀ¼��������false
 		public boolean mkdirs():�����ɴ˳���·��������Ŀ¼,�����κα��뵫�����ڵĸ�Ŀ¼
 			���Ŀ¼�����ڣ��ʹ���Ŀ¼��������true
 			���Ŀ¼�����ڣ��Ͳ�����Ŀ¼��������false
 */
public class FileDemo02 {
	public static void main(String[] args) throws IOException {
		//����1����Ҫ��E:\\itcastĿ¼�´���һ���ļ�java.txt
		File f1 = new File("E:\\itcast\\java.txt");
		System.out.println(f1.createNewFile());
		System.out.println("--------");
		
		//����2:��Ҫ��E:\\itcastĿ¼�´���һ��Ŀ¼JavaSE
		File f2 = new File("E:\\itcast\\JavaSE");
		System.out.println(f2.mkdir());
		System.out.println("--------");
		
		//����3:��Ҫ��E:\\itcastĿ¼�´���һ���༶Ŀ¼JavaWEB\\HTML
		File f3 = new File("E:\\itcast\\JavaWEB\\HTML");
		System.out.println(f3.mkdirs());
		System.out.println("--------");
		
		//����4:��Ҫ��E:\\itcastĿ¼�´���һ���ļ�javase.txt
		File f4 = new File("E:\\itcast\\javase.txt");
		System.out.println(f4.createNewFile());
		System.out.println("--------");
	}
}
