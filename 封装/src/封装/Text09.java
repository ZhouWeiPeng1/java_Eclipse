package ��װ;
/*
 		1.��װ������
 		�����������������֮һ����װ���̳У���̬��
 		��������������ԶԿ͹������ģ�⣬�͹��������Ա�������������ڶ����ڲ��ģ�����޷�ֱ�Ӳ���
 		
 		2.��װ��ԭ��
 		�����ĳЩ��Ϣ���������ڲ����������ⲿ����ֱ�ӷ��ʣ�����ͨ�������ṩ�ķ�����ʵ�ֶ�������Ϣ��
 		�����ͷ��ʳ�Ա����private,�ṩ��Ӧ��getXxx()/setXxx()����
 		
 		3.��װ�ĺô���
 		ͨ�����������Ƴ�Ա�����Ĳ���������˴���İ�ȫ��
 		�Ѵ����÷������з�װ������˴���ĸ�����
 */
public class Text09 {
		String name;
		private int age;
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		public void show() {
			System.out.println(name+"---"+age);
		}
}
