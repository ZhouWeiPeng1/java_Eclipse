package itheima_01;

import java.io.File;

/*
 	File: �ļ���Ŀ¼·�����ĳ���ʽ
 		1���ļ���Ŀ¼�ǿ���ͨ��File��װ�ɶ����
 		2������File����,���װ�Ĳ�����һ���������ڵ��ļ���������һ��·�������ѡ��������Ǵ��ڵ�
 		��Ҳ�����ǲ����ڵġ�
 		������Ҫͨ������Ĳ��������·��������ת��Ϊ������ڵ�
 	���췽����
 		File(String pathname):ͨ����������·�����ַ���ת��Ϊ����·�����������µ�Fileʵ����
 		File(String parent,String child):�Ӹ�·�����ַ�������·�����ַ��������µ�Fileʵ����
 		File(File parent,String child):�Ӹ�����·��������·�����ַ��������µ�Fileʵ����
 */
public class FileDemo01 {
	public static void main(String[] args) {
		//File(String pathname):ͨ����������·�����ַ���ת��Ϊ����·�����������µ�Fileʵ����
		File f1 = new File("E:\\itcast\\java.txt");
		System.out.println(f1);
		
		//File(String parent,String child):�Ӹ�·�����ַ�������·�����ַ��������µ�Fileʵ����
		File f2 = new File("E:\\itcast","java.txt");
		System.out.println(f2);
		
		//File(File parent,String child):�Ӹ�����·��������·�����ַ��������µ�Fileʵ����
		File f3 = new File("E:\\itcast");
		File f4 = new File(f3,"java.txt");
		System.out.println(f4);
		
	}
}
