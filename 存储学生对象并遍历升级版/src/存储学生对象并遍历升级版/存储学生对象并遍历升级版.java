package �洢ѧ�����󲢱���������;
/*
 	����
 		����һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
 		ѧ�������������������ڼ���¼��
 	˼·��
 	1.����ѧ���࣬Ϊ�˼���¼�����ݷ��㣬��ѧ�����еĳ�Ա����������ΪString����
 	2.�������϶���
 	3.����¼��ѧ����������Ҫ������
 	4.����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
 	5.�����������ѧ������
 	6.�������ϣ�����ͨ�ñ�����ʽʵ��
 */
import java.util.ArrayList;
import java.util.Scanner;
public class �洢ѧ�����󲢱��������� {
	public static void main(String[] args) {
		//��������
		ArrayList<Student> array=new ArrayList<Student>();
		
		/*
		//����¼��ѧ����������Ҫ������
		Scanner sc=new Scanner(System.in);
		
		System.out.println("������ѧ��������");
		String name=sc.nextLine();
		
		System.out.println("������ѧ�����䣺");
		String age=sc.nextLine();
		
		//����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
		Student s=new Student();
		s.setName(name);
		s.setAge(age);
		
//		//�����������ѧ������
//		array.add(s);
		*/
		//Ϊ����ߴ���ĸ����ԣ������÷������Ľ�����
		addStudent(array);
		addStudent(array);
		addStudent(array);
		//�������ϣ�����ͨ�ñ�����ʽʵ��
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			System.out.println(s.getName()+","+s.getAge());
		}
		
	}
	/*
	 	������ȷ��
	 		����ֵ���ͣ�void
	 		������ArrayList<Student> array
	 */
	public static void addStudent(ArrayList<Student> array) {
		//����¼��ѧ����������Ҫ������
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				
				System.out.println("������ѧ��������");
				String name=sc.nextLine();
				
				System.out.println("������ѧ�����䣺");
				String age=sc.nextLine();
				
				//����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա����
				Student s=new Student();
				s.setName(name);
				s.setAge(age);
				
				//�����������ѧ������
 			     array.add(s);
	}
}
