package ���ʼƻ�if��;
import java.util.Scanner;
public class select {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������:>");
		   int week=sc.nextInt();
		switch(week)
		{
		case 1:
		   System.out.println("�ܲ�");
		   break;
		case 2:
			System.out.println("��Ӿ");
			break;
		case 3:
		    System.out.println("����");
			   break;
		case 4:
			System.out.println("���е���");
				break;
		case 5:
			System.out.println("ȭ��");
				break;
		case 6:
			System.out.println("��ɽ");
			    break;
		case 7:
			System.out.println("�úó�һ��");
				break;		
		default:
			System.out.println("�����������������");
			
		}
	}
}
