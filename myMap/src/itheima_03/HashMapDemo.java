package itheima_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 	����:
 		����һ��HashMap����,����ѧ��(String),ֵ��ѧ������(Student)���洢������ֵ��Ԫ�أ�������
 		
 	˼·��
 		1.����ѧ����
 		2.����HashMap���϶���
 		3.����ѧ������
 		4.��ѧ����ӵ�����
 		5.��������
 			��ʽ1������ֵ
 			��ʽ2����ֵ�Զ����Ҽ���ֵ
 */
public class HashMapDemo {
	public static void main(String[] args) {
		//����HashMap���϶���
		Map<String,Student> map = new HashMap<String,Student>();
		
		//����ѧ������
		Student s1 = new Student("����ϼ",30);
		Student s2 = new Student("������",33);
		Student s3 = new Student("������",34);
		
		//��ѧ����ӵ�����
		map.put("itheima001",s1);
		map.put("itheima002",s2);
		map.put("itheima003",s3);
		
		//��ʽ1:����ֵ
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			Student value = map.get(key);
			System.out.println(key+","+value.getName()+","+value.getAge());
			
		}
		System.out.println("--------");
		
		//��ʽ2����ֵ�Զ����Ҽ���ֵ
				Set<Map.Entry<String,Student>> entrySet = map.entrySet();
				for(Map.Entry<String,Student> me : entrySet) {
					String key = me.getKey();
					Student value = me.getValue();
					System.out.println(key+","+value.getName()+","+value.getAge());
		}
	}
}
