package myCollection;

import java.util.ArrayList;
import java.util.Collection;

/*
 	����Collection���ϵĶ���
 		��̬�ķ�ʽ
 		ArrayList()
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//����Collection���ϵĶ���
		Collection<String> c = new ArrayList<String>();
		
		//���Ԫ��: boolean add (E e)
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//������϶���
		System.out.println(c);
	}
}
