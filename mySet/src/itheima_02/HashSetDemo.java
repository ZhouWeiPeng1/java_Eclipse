package itheima_02;

import java.util.HashSet;

/*
 	HashSet�����ص�
 		1���ײ����ݽṹ�ǹ�ϣ��
 		2���Լ��ϵĵ���˳�����κα�֤��Ҳ����˵����֤�洢��ȡ����Ԫ��˳��һ��
 		3��û�д������ķ��������Բ���ʹ����ͨforѭ������
 		4��������Set���ϣ������ǲ������ظ�Ԫ�صļ���
 */
public class HashSetDemo {
	public static void main(String[] args) {
		//�������϶���
		HashSet<String> hs = new HashSet<String>();
		
		//���Ԫ��
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		
		hs.add("world");
		
		//����
		for(String s : hs) {
			System.out.println(s);
		}
	}
}
