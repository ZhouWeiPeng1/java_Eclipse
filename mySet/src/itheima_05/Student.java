package itheima_05;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int compareTo(Student s) {
		//return 0;˵��Ԫ���ظ���������������ظ���Ԫ����
		//return 1;˵����һ��Ԫ�ر�ǰһ��Ԫ�ش�����洢
		//return -1;˵����һ��Ԫ�ر�ǰһ��Ԫ��С������洢
		//���������С��������
		int num = this.age-s.age;
		//������ͬʱ��������������ĸ˳������
		int num2 = num == 0?this.name.compareTo(s.name):num;
		return num2;
		
	}
}
