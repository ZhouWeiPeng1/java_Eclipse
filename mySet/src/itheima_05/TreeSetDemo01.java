package itheima_05;

import java.util.TreeSet;
/*
 	�洢ѧ�����󲢱�������������ʹ���޲ι��췽��
 	Ҫ�󣺰��������С��������������ͬʱ��������������ĸ˳������
 	
 	���ۣ�
 	��TreeSet���ϴ洢�Զ�������޲ι��췽��ʹ�õ�����Ȼ�����Ԫ�ؽ��������
 	��Ȼ���򣬾�����Ԫ����������ʵ��Comparable�ӿڣ���дcompareTo(To)����
 	��д�����ǣ�һ��Ҫע�����������밴��Ҫ�����Ҫ�����ʹ�Ҫ������д
 */
public class TreeSetDemo01 {
	public static void main(String[] args) {
		//�������϶���
		TreeSet<Student> ts = new TreeSet<Student>();
		
		//����ѧ������
		Student s1 = new Student("xishi",30);
		Student s2 = new Student("wangzhaojun",35);
		Student s3 = new Student("diaochan",33);
		Student s4 = new Student("yangyuhuan",35);
		
		Student s5 = new Student("lingqinxia",28);
		Student s6 = new Student("lingqinxia",28);
		//��ѧ����ӵ�����
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		
		//��������(��ǿfor)
		for(Student s :ts) {
			System.out.println("������"+s.getName()+" ���䣺"+s.getAge());
		}
	}
}
