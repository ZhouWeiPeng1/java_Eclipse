package ��׼�������;
/*
 	1����Ա������
 		ʹ��private����
 	2�����췽����
 	    1.�ṩһ���޲ι��췽��
 	    2.�ṩһ������������Ĺ��췽��
 	3����Ա������
 		1.�ṩÿһ����Ա������Ӧ��setXxx()/getXxx()
 		2.�ṩһ����ʾ������Ϣ��show()
 	4����������Ϊ���Ա������ֵ�����ַ�ʽ
 		1.�޲ι��췽�����������ʹ��setXxx()��ֵ
 		2.ʹ�ô��ι��췽��ֱ�Ӵ�����������ֵ�Ķ���
 */
public class Student {
	//��Ա����
		private String name;
		private int age;
	//���췽��
		public Student() {
			
		}
		public Student(String name,int age) {
			this.name=name;
			this.age=age;
		}
		//��Ա����
		public  void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		//show()����
		public void show() {
			System.out.println(name+","+age);
		}
}
