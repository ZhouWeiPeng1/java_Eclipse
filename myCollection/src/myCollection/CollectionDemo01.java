package myCollection;

import java.util.ArrayList;
import java.util.Collection;

/*
 	Collection ���ϳ��÷���
 		������					˵��
 	boolean add(E e)			���Ԫ��
 	boolean remove(Object o)	�Ӽ������Ƴ�ָ��Ԫ��
 	void clear()				��ռ����е�Ԫ��
 	boolean contains(Object o)	�жϼ������Ƿ����ָ����Ԫ��
 	boolean isEmpty()			�жϼ����Ƿ�Ϊ��
 	int size()					���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ���
 */
public class CollectionDemo01 {
	public static void main(String[] args) {
		//�������϶���
		Collection<String> c = new ArrayList<String>();
		
		//boolean add(E e)			���Ԫ��
//		System.out.println(c.add("hello"));
//		System.out.println(c.add("world"));
//		System.out.println(c.add("world"));
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//boolean remove(Object o)	�Ӽ������Ƴ�ָ��Ԫ��
//		System.out.println(c.remove("world"));
//		System.out.println(c.remove("e"));
		
		//void clear()				��ռ����е�Ԫ��
//		c.clear();
		
		//boolean contains(Object o)	�жϼ������Ƿ����ָ����Ԫ��
//		System.out.println(c.contains("hello"));
//		System.out.println(c.contains("e"));
		
		//boolean isEmpty()			�жϼ����Ƿ�Ϊ��
//		c.clear();
//		System.out.println(c.isEmpty());
		
		//int size()					���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ���
		System.out.println(c.size());
		
		//������϶���
		System.out.println(c);
	}
}
