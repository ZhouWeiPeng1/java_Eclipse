package ������;
import java.util.Calendar;
import java.util.Scanner;
/*
 	����
 		��ȡ����һ��Ķ����ж�����
 		
 	˼·��
 		1.����¼����������
 		2.��������������ꡢ�¡���
 			�꣺�����ڼ���¼��
 			�£�����Ϊ3�£��·��Ǵ�0��ʼ�ģ��������õ�ֵλ2
 			�գ�����Ϊ1��
 		3.3��1����ǰ��һ�죬����2�µ����һ��
 		4.��ȡ��һ���������
 */
public class CalendarTest {
	public static void main(String[] args) {
		//����¼����������
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		
		//��������������ꡢ�¡���
		Calendar c = Calendar.getInstance();
		c.set(year,2,1);
		
		//3��1����ǰ��һ�죬����2�µ����һ��
		c.add(Calendar.DATE,-1);
		
		//��ȡ��һ���������
		int date = c.get(Calendar.DATE);
		
		System.out.println(year+"���2�·���"+date+"��");
	}
}
