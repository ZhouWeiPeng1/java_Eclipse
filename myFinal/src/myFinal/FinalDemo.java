package myFinal;
/*
 	������
 */
/*
 	final�ؼ��������յ���˼���������γ�Ա��������Ա��������
 	
 		final���ε��ص㣺
 			���η����������÷���Ϊ���շ��������ܱ���д
 			���α����������ñ���Ϊ�����������ٴθ�ֵ
 			�����ࣺ��������Ϊ�����࣬���ܱ��̳�
 		
 		
 	�����ǻ������ͣ�final����ָ���ǻ������͵�����ֵ���ܷ����ı�
 	�������������ͣ�final����ָ�����������͵ĵ�ֵַ���ܷ����ı䣬���ǵ�ַ
 	����������ǿ��Է����ı��
 */
public class FinalDemo {
	public static void main(String[] args) {
		//final���λ������ͱ���
		final int age=20;
//		age=100;
		System.out.println(age);
		
		//final�����������ͱ���
		final Student s=new Student();//s��ַ���ܱ䣬s����������ݿ��Ըı�
		s.age=100;
		System.out.println(s.age);
		
//		s=new Student();
	}
}
