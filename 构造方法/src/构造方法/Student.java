package ���췽��;
/*
    ���췽����һ������ķ���
    	���ã���������
    	
    	��ʽ��
    	public class ����{
    	 	���η� ������������{
    	 	
    	}
    	���ܣ���Ҫ��ɶ������ݵĳ�ʼ��
    	���η�һ����public
    	
    	���췽���Ĵ�����
    	1.���û�ж��幹�췽����ϵͳ������һ��Ĭ�ϵ��޲������췽��
    	2.��������˹��췽����ϵͳ�������ṩĬ�ϵĹ��췽��
    	
    	���췽�������أ�
    	��������˴������Ĺ��췽������Ҫʹ���޲����Ĺ��췽�����ͱ�����дһ���޲����Ĺ��췽��
    	
    	�Ƽ�ʹ�õķ�ʽ��
    	*�����Ƿ�ʹ�ã����ֹ���д�޲������췽��
 */
public class Student {
			private String name;
			private int age;
			
			//���췽��
			public Student() {
				System.out.println("�޲ι��췽��");
			}
			public Student(String name) {
				this.name=name;
			}
			public Student(int age) {
				this.age=age;
			}
			public Student(String name,int age) {
				this.name=name;
				this.age=age;
			}
			
			public void show() {
				System.out.println(name+","+age);
			}
}
