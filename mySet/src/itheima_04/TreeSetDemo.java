package itheima_04;

import java.util.TreeSet;
/*
 	TreeSet�����ص�
 		1��Ԫ�����������˳����ָ�洢��ȡ����˳�򣬶��ǰ���һ���Ĺ���������򣬾�������ʽȡ���ڹ��췽��
 		 TreeSet():������Ԫ�ص���Ȼ�����������
 		 TreeSet(Comparator comparator):����ָ���ıȽ�����������
 		2:û�д������ķ��������Բ���ʹ����ͨforѭ������
 		3:������Set���ϣ����Բ������ظ�Ԫ�صļ���
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		//�������϶���
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		//���Ԫ��
		ts.add(10);
		ts.add(40);
		ts.add(30);
		ts.add(50);
		ts.add(20);
		
		//��������
		for(Integer i : ts) {
			System.out.println(i);
		}
	}
}
