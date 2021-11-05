package myArrayList01;
/*
 	ArrayList���÷���:
 	   1.public boolean remove(Object o):ɾ��ָ����Ԫ�أ�����ɾ���Ƿ�ɹ�
 	   2.public E remove(int index):ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
 	   3.public E set(int index,E element):�޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
 	   4.public E get(int index):����ָ����������Ԫ��
 	   5.public int size():���ؼ����е�Ԫ�صĸ���
 */
import java.util.ArrayList;
public class ArrayListDemo02 {
	public static void main(String[] args) {
		//��������
		ArrayList<String> array=new ArrayList<String>();
		
		//���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//public boolean remove(Object o):ɾ��ָ����Ԫ�أ�����ɾ���Ƿ�ɹ�
//		System.out.println(array.remove("world"));
//		System.out.println(array.remove("javaspace"));
		
		//public E remove(int index):ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
//		System.out.println(array.remove(1));
		
		//IndexOutOfBoundsException
//		System.out.println(array.remove(3));
		
		//public E set(int index,E element):�޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
//		System.out.println(array.set(1,"javaee"));
		
		//IndexOutOfBoundsException
//		System.out.println(array.set(3, "javaee"));
		
		//public E get(int index):����ָ����������Ԫ��
//		System.out.println(array.get(0));
		//IndexOutOfBoundsException
//		System.out.println(array.get(3));
		
		//public int size():���ؼ����е�Ԫ�صĸ���
		System.out.println(array.size());
		
		//�������
		System.out.println("array:"+array);
	}
}
