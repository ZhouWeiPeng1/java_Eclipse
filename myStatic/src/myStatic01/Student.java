package myStatic01;
/*
 	�Ǿ�̬�ĳ�Ա������
 		���ܷ��ʾ�̬�ĳ�Ա����
 		���ܷ��ʷǾ�̬�ĳ�Ա����
 		���ܷ��ʾ�̬�ĳ�Ա����
 		���ܷ��ʷǾ�̬�ĳ�Ա����
 	
 	��̬�ĳ�Ա����:
 		���ܷ��ʾ�̬�ĳ�Ա����
 		���ܷ��ʾ�̬�ĳ�Ա����
 	�ܽ᣺��̬��Ա����ֻ�ܷ��ʾ�̬��Ա
 */
public class Student {
	//�Ǿ�̬��Ա����
	private String name="����ϼ";
	//��̬��Ա����
	private static String university="java��ѧ";
	
	//�Ǿ�̬��Ա����
	public void show1() {
		
	}
	
	//�Ǿ�̬��Ա����
	public void show2() {
		System.out.println(name);
		System.out.println(university);
		show1();
		show3();
		
	}
	
	//��̬��Ա����
	public static void show3() {
		
	}
	
	//��̬��Ա����
	public static void show4() {
//		System.out.println(name);
		System.out.println(university);
//		show1();
		show3();
	}
}
