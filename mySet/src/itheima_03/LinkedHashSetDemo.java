package itheima_03;

import java.util.LinkedHashSet;

/*
 	LinkedHashSet�����ص�
 		��ϣ�������ʵ�ֵ�Set�ӿ�,���п�Ԥ��ĵ�������
 		������֤Ԫ������,Ҳ����˵Ԫ�صĴ洢��ȡ��˳����һ�µ�
 		�ɹ�ϣ��֤Ԫ��Ψһ��Ҳ����˵û���ظ���Ԫ��
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//����LinkedHashSet����
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		
		//����ַ���������
		lh.add("java");
		lh.add("world");
		lh.add("hello");
		
		//lh.add("world");
		
		//ѭ������
		for(String s : lh) {
			System.out.println(s);
		}
	}
}
