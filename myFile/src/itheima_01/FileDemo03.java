package itheima_01;

import java.io.File;
import java.io.IOException;

/*
 	File��ɾ������:
 		public boolean delete():ɾ���ɴ˳���·������ʾ���ļ���Ŀ¼
 		
 	����·�������·��������
 		����·����������·����������Ҫ�κ�������Ϣ�Ϳ��Զ�λ������ʾ���ļ�.����:E:\\itcast\\java.txt
 		���·��������ʹ��ȡ������·��������Ϣ���н��͡����磺myFile\\java.txt
 		
 	ɾ��Ŀ¼ʱע������:
 		���һ��Ŀ¼��������(Ŀ¼,�ļ�),����ֱ��ɾ��.Ӧ����ɾ��Ŀ¼�е�����,������ɾ��Ŀ¼
 */
public class FileDemo03 {
	public static void main(String[] args) throws IOException {
		//File f1 = new File("E:\\itcast\\java.txt");
		//����1���ڵ�ǰģ��Ŀ¼�´���java.txt�ļ�
		File f1 = new File("E:\\javaspace\\myFile\\java.txt");
		//System.out.println(f1.createNewFile());
		
		//����2��ɾ����ǰģ��Ŀ¼�µ�java.txt�ļ�
		System.out.println(f1.delete());
		
		//����3���ڵ�ǰģ��Ŀ¼�´���itcastĿ¼
		File f2 = new File("E:\\javaspace\\myFile\\itcast");
		System.out.println(f2.mkdir());
		
		//����4:ɾ����ǰģ��Ŀ¼�µ�itcastĿ¼
		System.out.println(f2.delete());
		
		//����5:�ڵ�ǰģ���´���һ��Ŀ¼��Ȼ���ڸ�Ŀ¼�´���һ���ļ�java.txt
		File f3 = new File("E:\\javaspace\\myFile\\itcast");
		System.out.println(f3.mkdir());
		File f4 = new File("E:\\javaspace\\myFile\\itcast\\java.txt");
		System.out.println(f4.createNewFile());
		
		//����6��ɾ����ǰģ���µ�Ŀ¼itcast
//		System.out.println(f4.delete());
//		System.out.println(f3.delete());
		
	}
}
