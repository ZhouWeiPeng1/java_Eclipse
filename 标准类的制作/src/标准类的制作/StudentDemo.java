package ��׼�������;

public class StudentDemo {
		public static void main(String[] args) {
			Student s1=new Student();
			s1.setName("����ϼ");
			s1.setAge(30);
			s1.show();
			
			Student s2=new Student("����ϼ",30);
			s2.show();
		}
}
