package text02;
import java.util.Scanner;
import java.util.*;
import java.text.*;
public class Account {
	public int id;
	public int password;
	public int money;
	public static String time;
	//账户创建时间
	public String ctime(){
		Date dNow =new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy:MM:dd hh:mm:ss");
		//System.out.println(ft.format(dNow));
		time=ft.format(dNow);
		return time;
	}
	//方法Accounr()创建账户的账号，密码，姓名和余额
	public Account(int id,int password,int money,String time) {
		this.id=id;		
		this.password=password;
		this.money=money;
		this.time=time;
	}
	//显示银行账户信息
	public void Show() {
		System.out.println("ID: "+id);
		System.out.println("余额: "+money);
		System.out.println("账户创建时间: "+time);
	}
	
	//取款
	public void withDraw(int outmoney) {
		money-=outmoney;
		System.out.println("此次取款为： "+outmoney);
		System.out.println("账户余额为： "+money);
	}
	
	//存款
	public void deposit(int inmoney) {
		money+=inmoney;
		System.out.println("此次存款为： "+inmoney);
		System.out.println("账户余额为： "+money);
	}
	public static void main(String[] args) {
		Account acc = new Account(9527,123456,2000,time);//id,密码,余额
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-------欢迎进入银行操作管理系统-------");
			System.out.println("-----------1银行账户信息-----------");
			System.out.println("-----------2取款操作--------------");
			System.out.println("-----------3存款操作--------------");
			System.out.println("-----------4退出系统--------------");
			System.out.println("--------------------------------");
			System.out.println("请输入你的选择：》");
			int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("--银行账户信息--");
			acc.ctime();
			acc.Show();
			
			break;
		case 2:
			System.out.println("--取款操作--");
			acc.withDraw(100);
			break;
		case 3:
			System.out.println("--存款操作--");
			acc.deposit(2000);
			break;
		case 4:
			System.out.println("退出银行管理系统");
			System.exit(0);
			break;
		default :
			System.out.println("您的选择有错误！");
			break;
		}
		}
	}
}