package itheima_01;


/*
 	��ϣֵ��
 		��JDK���ݶ���ĵ�ַ�����ַ������������������int���͵���ֵ
 		
 	Object������һ���������Ի�ȡ����Ĺ�ϣֵ
 		public int hashCode();//���ض���Ĺ�ϣ��ֵ
 		
 	����Ĺ�ϣֵ�ص�
 		ͬһ�������ε���hashCode()�������صĹ�ϣֵ����ͬ��
 		Ĭ������£���ͬ����Ĺ�ϣֵ�ǲ�ͬ�ġ�����дhashCode()����������ʵ���ò�ͬ����Ĺ�ϣֵ��ͬ
 */
public class HashDemo {
	public static void main(String[] args) {
		//����ѧ������
		Student s1 = new Student("����ϼ",30);
		
		//ͬһ�������ε���hashCode()�������صĹ�ϣֵ����ͬ��
		System.out.println(s1.hashCode());//26726214
		System.out.println(s1.hashCode());//26726214
		System.out.println("--------");
		
		Student s2 = new Student("����ϼ",30);
		
		//Ĭ������£���ͬ����Ĺ�ϣֵ�ǲ���ͬ��
		//ͨ��������д������ʵ�ֲ�ͬ�Ķ����ϣֵ����ͬ��
		System.out.println(s2.hashCode());//26726214
		System.out.println("--------");
		
		System.out.println("hello".hashCode());//99162322
		System.out.println("world".hashCode());//113318802
		System.out.println("java".hashCode());//3254818
		
		System.out.println("world".hashCode());//113318802
		System.out.println("--------");
		
		System.out.println("�ص�".hashCode());//1179395
		System.out.println("ͨ��".hashCode());//1179395
	}
}
