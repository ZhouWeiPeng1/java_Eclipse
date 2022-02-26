package itheima_01;

import java.io.File;

/*			����										˵��
 	public boolean isDirectory()	���Դ˳���·������ʾ��File�Ƿ�ΪĿ¼
 	public boolean isFile()			���Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�
 	public boolean exists()			���Դ˳���·������ʾ��File�Ƿ����
 	public String getAbsolutePath()	���ش˳���·�����ľ���·�����ַ���
 	public String getPath()			���˳���·����תΪ·�����ַ���
 	public String getName()			�����ɴ˳���·������ʾ���ļ���Ŀ¼������
 	public String[] list()			���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�������ַ�������
 	public File[] listFiles()		���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������
 	
 */
public class FileDemo04 {
	public static void main(String[] args) {
		//����һ��File����
		File f = new File("E:\\javaspace\\myFile\\itcast\\java.txt");
//		public boolean isDirectory()	���Դ˳���·������ʾ��File�Ƿ�ΪĿ¼
//	 	public boolean isFile()			���Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�
//	 	public boolean exists()			���Դ˳���·������ʾ��File�Ƿ����
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.exists());
		
//		public String getAbsolutePath()	���ش˳���·�����ľ���·�����ַ���
//	 	public String getPath()			���˳���·����תΪ·�����ַ���
//	 	public String getName()			�����ɴ˳���·������ʾ���ļ���Ŀ¼������
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		System.out.println(f.getName());
		System.out.println("--------");
		
//		public String[] list()			���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�������ַ�������
//	 	public File[] listFiles()		���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������
		File f2 = new File("E:\\itcast");
		 String[] strArray = f2.list();
		for(String str : strArray) {
			System.out.println(str);
		}
		System.out.println("--------");
		
		File[] fileArray = f2.listFiles();
		for(File file : fileArray) {
			//System.out.println(file);
		//System.out.println(file.getName());
			if(file.isFile()) {
				System.out.println(file.getName());
			}
		}
	}
}
