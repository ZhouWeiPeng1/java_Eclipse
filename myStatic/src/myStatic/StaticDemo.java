package myStatic;
/*
 	static
 		static�ؼ����Ǿ�̬����˼���������γ�Ա��������Ա����
 		
 	static���ε��ص�
 		��������ж�����
 			��Ҳ�������ж��Ƿ�ʹ�þ�̬�ؼ��ֵ�����
 		����ͨ����������
 			��Ȼ��Ҳ����ͨ������������
 */
public class StaticDemo {
	public static void main(String[] args) {
		Student.university="������԰��ѧ";
		
		Student s=new Student();
		s.name="��ͼͼ";
		s.age=8;
//		s.university="������԰��ѧ";
		s.show();
		
		Student s2=new Student();
		s2.name="����";
		s2.age=7;
//		s2.university="������԰��ѧ";
		s2.show();
	}
}
