package ��ʦ��ѧ��;
/*
 	������
 */
/*
 	����:
 		������ʦ���ѧ���࣬Ȼ��д�������;����ҵ���ʦ���ѧ���൱�еĹ������ݣ�
 		��ȡ��һ�����࣬�ü̳еķ�ʽ��д���룬�����в���
 	
 	˼·:
 		1.������ʦ��(���������䣬����())
 		1.����ѧ����(���������䣬ѧϰ())
 		3.��������࣬д�������
 		4.���Գ�ȡ���࣬��������(����,����)
 		5.������ʦ�࣬�̳����࣬�������Լ����з���:����()
 		6.����ѧ���࣬�̳����࣬�������Լ����з���:ѧϰ()
 		7.��������࣬д�������
 */
public class Demo {
	public static void main(String[] args) {
		//������ʦ��������в���
		Teacher t1=new Teacher();
		t1.setName("����ϼ");
		t1.setAge(30);
		System.out.println(t1.getName()+","+t1.getAge());
		t1.teach();
		
		Teacher t2=new Teacher("������",25);
		System.out.println(t2.getName()+","+t2.getAge());
		t2.teach();
		
		Student s1=new Student();
		s1.setName("��ͼͼ");
		s1.setAge(8);
		System.out.println(s1.getName()+","+s1.getAge());
		s1.study();
		
		Student s2=new Student("����",6);
		System.out.println(s2.getName()+","+s2.getAge());
		s2.study();
	}
}

