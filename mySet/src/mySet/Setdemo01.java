package mySet;

import java.util.HashSet;
import java.util.Set;

/*
 	Set�����ص�
 		�������ظ�Ԫ�صļ���
 		û�д������ķ��������Բ���ʹ����ͨforѭ������
 		
 	 HashSet:�Լ��ϵĵ���˳�����κα�֤
 */
public class Setdemo01 {
	public static void main(String[] args) {
		//�������϶���
		Set<String> set = new HashSet<String>();
		
		//���Ԫ��
		set.add("hello");
		set.add("java");
		set.add("world");
		//set.add("java"); ������Set���ϣ������ǲ������ظ�Ԫ�صļ���
		
		//����
		for(String s : set) {
			System.out.println(s);
		}
	}
}
