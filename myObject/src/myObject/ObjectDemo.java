package myObject;

/*
 	Object �����νṹ�ĸ���ÿ���඼���Խ�Object��Ϊ���ࡣ�����඼ֱ�ӻ��ӵļ̳��Ը���
 	��������������д�˷���
 	�����д�أ��Զ����ɼ���
 */
public class ObjectDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("����ϼ");
		s.setAge(30);
		System.out.println(s);//myObject.Student@279f2327
		System.out.println(s.toString());//myObject.Student@279f2327
		System.out.println(s.getName()+","+s.getAge());
	}
}
