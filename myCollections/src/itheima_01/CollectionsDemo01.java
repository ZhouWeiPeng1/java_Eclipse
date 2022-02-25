package itheima_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 	Collections��ĸ���
 		����Լ��ϲ����Ĺ�����
 	Collections��ĳ��÷���
 		public static <T extends Comaparable<? super T>> void sort (List<T> list): ��ָ�����б���������
 		public static void reverse (List<?> list):��תָ���б���Ԫ�ص�˳��
 		public static void shuffle (List<?> list):ʹ��Ĭ�ϵ����Դ�������ָ�����б�
 */
public class CollectionsDemo01 {
	public static void main(String[] args) {
		//�������϶���
		List<Integer> list = new ArrayList<Integer>();
		
		//���Ԫ��
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		
//		public static <T extends Comaparable<? super T>> void sort (List<T> list): ��ָ�����б���������
//		Collections.sort(list);
		
// 		public static void reverse (List<?> list):��תָ���б���Ԫ�ص�˳��
//		Collections.reverse(list);
		
// 		public static void shuffle (List<?> list):ʹ��Ĭ�ϵ����Դ�������ָ�����б�
		Collections.shuffle(list);
		
		//�������
		System.out.println(list);
	}
}
