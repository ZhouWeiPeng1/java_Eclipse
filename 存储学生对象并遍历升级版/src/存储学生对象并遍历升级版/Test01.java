package �洢ѧ�����󲢱���������;
/*
 		����
 		����һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
 		ѧ�������������������ڼ���¼��
 		˼·��
 		1.����ѧ���࣬Ϊ�˼���¼�����ݷ��㣬��ѧ�����еĳ�Ա����������ΪString����
 		2.����һ�����϶���
 		3.����¼��ѧ����������Ҫ������
 		4.����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
 		5.�����������ѧ������
 		6.�������ϣ�����ͨ�ñ�����ʽʵ��
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Test01 {
		public static void main(String[] args) {
			ArrayList<Student> array=new ArrayList<Student>();
			for(int i=0;i<3;i++) {
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				System.out.println("������ѧ��������:");
				String name=sc.nextLine();
				System.out.println("������ѧ��������:");
				String age=sc.nextLine();
				Student s=new Student();
				s.setName(name);
				s.setAge(age);
				array.add(s);
			}
			for(int i=0;i<array.size();i++) {
				Student s=array.get(i);
				System.out.println(s.getName()+","+s.getAge());
			}
		}
}
