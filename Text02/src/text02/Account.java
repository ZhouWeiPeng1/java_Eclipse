package text02;
import java.util.Scanner;
import java.util.*;
import java.text.*;
public class Account {
	public int id;
	public int password;
	public int money;
	public static String time;
	//�˻�����ʱ��
	public String ctime(){
		Date dNow =new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy:MM:dd hh:mm:ss");
		//System.out.println(ft.format(dNow));
		time=ft.format(dNow);
		return time;
	}
	//����Accounr()�����˻����˺ţ����룬���������
	public Account(int id,int password,int money,String time) {
		this.id=id;		
		this.password=password;
		this.money=money;
		this.time=time;
	}
	//��ʾ�����˻���Ϣ
	public void Show() {
		System.out.println("ID: "+id);
		System.out.println("���: "+money);
		System.out.println("�˻�����ʱ��: "+time);
	}
	
	//ȡ��
	public void withDraw(int outmoney) {
		money-=outmoney;
		System.out.println("�˴�ȡ��Ϊ�� "+outmoney);
		System.out.println("�˻����Ϊ�� "+money);
	}
	
	//���
	public void deposit(int inmoney) {
		money+=inmoney;
		System.out.println("�˴δ��Ϊ�� "+inmoney);
		System.out.println("�˻����Ϊ�� "+money);
	}
	public static void main(String[] args) {
		Account acc = new Account(9527,123456,2000,time);//id,����,���
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-------��ӭ�������в�������ϵͳ-------");
			System.out.println("-----------1�����˻���Ϣ-----------");
			System.out.println("-----------2ȡ�����--------------");
			System.out.println("-----------3������--------------");
			System.out.println("-----------4�˳�ϵͳ--------------");
			System.out.println("--------------------------------");
			System.out.println("���������ѡ�񣺡�");
			int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("--�����˻���Ϣ--");
			acc.ctime();
			acc.Show();
			
			break;
		case 2:
			System.out.println("--ȡ�����--");
			acc.withDraw(100);
			break;
		case 3:
			System.out.println("--������--");
			acc.deposit(2000);
			break;
		case 4:
			System.out.println("�˳����й���ϵͳ");
			System.exit(0);
			break;
		default :
			System.out.println("����ѡ���д���");
			break;
		}
		}
	}
}