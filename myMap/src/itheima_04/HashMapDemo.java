package itheima_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 	����
 		����һ��HashMap����,����ѧ������(Student),ֵ�Ǿ�ס��(String)���洢�����ֵ��Ԫ��,��������
 		Ҫ��֤����Ψһ��,���ѧ������ĳ�Ա����ֵ��ͬ,���Ǿ���Ϊ��ͬһ������
 		
 	˼·��
 		1.����ѧ����
 		2.����HashMap���϶���
 		3.����ѧ������
 		4.��ѧ����ӵ�����
 		5.��������
 		6.��ѧ��������д��������
 			hashCode()
 			equals()
 */
public class HashMapDemo {
	public static void main(String[] args) {
		//����HashMap���϶���
		Map<Student,String> map = new HashMap<Student,String>();
		
		//����ѧ������
		Student s1 = new Student("����ϼ",30);
		Student s2 = new Student("������",35);
		Student s3 = new Student("������",33);
		Student s4 = new Student("������",33);
		
		//��ѧ����ӵ�����
		map.put(s1,"����");
		map.put(s2,"�ϲ�");
		map.put(s3,"����");
		map.put(s4,"����");
		
		//��������
		Set<Student> keySet = map.keySet();
		for(Student key : keySet) {
			String value = map.get(key);
			System.out.println(key.getName()+","+key.getAge()+","+value);		
		}
		
		
	}
}
