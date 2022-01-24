package myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



/*
 	Iterator: �����������ϵ�ר�ñ�����ʽ
 		Iterator<E> iterator(): ���ش˼�����Ԫ�صĵ�����,ͨ�����ϵ�iterator()�����õ�
 		��������ͨ�����ϵ�iterator()�����õ���,��������˵���������ڼ��϶����ڵ�
 		
 	Iterator�еĳ��÷���
 		E next(): ���ص����е���һ��Ԫ��
 		boolean hasNext(): ����������и���Ԫ��,�򷵻�true
 */
public class iteratorDemo {
	public static void main(String[] args) {
		//����һ�����϶���
		Collection<String> c = new ArrayList<String>();
		
		//���Ԫ��
		c.add("Hello");
		c.add("World");
		c.add("java");
	
		//Iterator<E> iterator(): ���ش˼�����Ԫ�صĵ�����,ͨ�����ϵ�iterator()�����õ�
		Iterator<String> it = c.iterator();
		
		//E next(): ���ص����е���һ��Ԫ��
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
//		System.out.println(it.next());//NoSuchElementException:��ʾ�����Ԫ�ز�����
		
		//boolean hasNext(): ����������и���Ԫ��,�򷵻�true
		/*
		if(it.hasNext()) {
			System.out.println(it.next());
		}
		if(it.hasNext()) {
			System.out.println(it.next());
		}
		if(it.hasNext()) {
			System.out.println(it.next());
		}
		if(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		//��whileѭ���Ľ�
		while(it.hasNext()) {
//			System.out.println(it.next());
			String s=it.next();
			System.out.println(s);
		}
		
	}
}
