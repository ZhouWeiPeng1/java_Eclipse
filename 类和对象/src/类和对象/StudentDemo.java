package ��Ͷ���;
/*
 	  ѧ��������
 */
public class StudentDemo {
	public static void main(String[] args) {
		//������һ������ʹ��
		Text06 s=new Text06();
		
		//ʹ�ö���
//		System.out.println(s);
//		System.out.println(s.name+","+s.age);
		
		s.name="����ϼ";
//		s.age=30;
		s.setAge(30);
//		System.out.println(s.name+","+s.age);
		
//		s.study();
//		s.doHomework();
		//�����ڶ�������ʹ��
		Text06 s2=new Text06();
		s2.name="������";
//		s2.age=28;
		s2.setAge(28);
//		System.out.println(s2.name+","+s2.age);
//		s2.study();
//		s2.doHomework();
		s.show();
		s2.show();
	}
}
