package myInterface;
/*
 	������
 */
/*
 	����Ա����
 		ֻ���ǳ���
 		Ĭ�����η���public static final
 	�����췽��
 		�ӿ�û�й��췽������Ϊ�ӿ���Ҫ�Ƕ���Ϊ���г���ģ���û�о������
 		һ�������û�и��࣬Ĭ�ϼ̳���Object��
 		
 	����Ա����
 		ֻ���ǳ��󷽷�
 		Ĭ�����η���public abstract
 		���ڽӿ��еķ�����JDK8��JDK9����һЩ�����ԣ�������ѧ
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		Inter i=new InterImpl();
//		i.num=20;
		System.out.println(i.num);
//		i.num2=40;
		System.out.println(i.num2);
		System.out.println(Inter.num);
		System.out.println(Inter.num2);
	}
}
