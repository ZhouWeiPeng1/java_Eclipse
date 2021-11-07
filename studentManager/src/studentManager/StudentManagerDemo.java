package studentManager;
/*
 	一、主界面代码编写
 	 思路：
 	    1.用输出语句完成主界面的编写
 		2.用Scanner实现键盘录入数据
 		3.用switch语句完成操作的选择
 		4.用循环完成再次回到主界面
 	二、添加学生的代码编写
 	 思路：
 		1.用键盘录入选择添加学生
 		2.定义一个方法，用于添加学生
 		3.创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
 		4.将学生对象添加到集合中(保存)
 		5.给出添加成功提示
 		6.调用方法
 	三、查看学生的代码编写
 	思路：
 		1.用键盘录入选择查看所有学生信息
 		2.定义一个方法，用于查看学生信息
 			1判断集合中是否有数据，如果没有显示提示信息
 		    2显示表头信息
 		    3将集合中数据取出按照对应格式显示学生信息，年龄显示补充“岁”
 		3.调用方法    
 	四、删除学生的代码编写
 	 思路：
 	 1.用键盘录入选择删除学生信息
 	 2.定义一个方法，用于删除学生信息
 	      1显示提示信息
 	      2键盘录入要删除的学生学号
 	      3遍历集合将对应学生对象从集合中删除
 	      4给出删除成功提示
 	 3.调用方法
 	 五、修改学生的代码编写
 	  思路：
 	  1.用键盘录入选择修改学生信息
 	  2.定义一个方法，用于修改学生信息
 	    1显示提示信息
 	    2键盘录入要修改的学生学号
 	    3键盘录入要修改的学生信息
 	    4遍历集合修改对应的学生信息
 	    5给出修改成功的提示
 	  3.调用方法
 	  六、解决学生添加学号重复问题的代码编写
 	  思路：
 	  1.定义一个方法，对学号是否被使用进行判断
 	       如果与集合中的某一个学生学号相同，返回true
 	       如果都不相同，返回false
 	  2.在添加学生录入学号后调用该方法
 	  		1如果返回ture,弹出提示，重新输入学号
 	  		2如果返回false，正常添加学生对象
 */
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagerDemo {
/* 		1.用输出语句完成主界面的编写
 		2.用Scanner实现键盘录入数据
 		3.用switch语句完成操作的选择
 		4.用循环完成再次回到主界面
 */
	public static void main(String[] args) {
		//创建集合对象用于存储学生数据
		ArrayList<Student> array=new ArrayList<Student>();
		
		//用循环完成再次回到主界面
		boolean ture=true;
		while(ture) {
			//用输出语句完成主界面的编写
		System.out.println("--------欢迎来到学生管理系统--------");
		System.out.println("1 添加学生");
		System.out.println("2 删除学生");
		System.out.println("3 修改学生");
		System.out.println("4 查看所有学生");
		System.out.println("5 退出");
		System.out.println("请输入你的选择：");			
		//用Scanner实现键盘录入数据
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		
		//用switch语句完成操作的选择
		switch(line) {
		case "1":
			//System.out.println("添加除学生");
			addStudent(array);
			break;
		case "2":
			//System.out.println("删除学生");
			deleteStudent(array);
			break;
		case "3":
			//System.out.println("修改学生");
			updateStudent(array);
			break;
		case "4":
			//System.out.println("查看所有学生");
			findAllStudent(array);
			break;
		case "5":
			System.out.println("谢谢使用");
			//break;
			System.exit(0);//JVM退出
		default:
			System.out.println("选择错误，请重新选择");
			break;
		 	}
		}	
		

	}
	//定义一个方法，用于添加学生信息
	public static void addStudent(ArrayList<Student> array) {
		//用键盘录入选择添加学生
		Scanner sc=new Scanner(System.in);
		
		//为了让sid在循环外面被访问到，我们把它定义在循环外部
		String sid;
		//为了让程序回到这里，我们使用循环实现
		while(true) {
		System.out.println("请输入学生学号：");
		 sid=sc.nextLine();
		
		boolean flag=isUsed(array,sid);
		
		if(flag) {
			System.out.println("你输入的学号已经被使用，请重新输入");
		}else
		 {
			break;
		 }
	}
		System.out.println("请输入学生姓名：");
		String name=sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age=sc.nextLine();
		System.out.println("请输入学生居住地：");
		String address=sc.nextLine();
		//创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
		Student s=new Student();
		s.setSid(sid);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		//将学生对象添加到集合中
		array.add(s);
		//给出添加成功提示
		System.out.println("添加学生成功");
	}
	//定义一个方法，判断学号是否被使用
	public static boolean isUsed(ArrayList<Student> array,String sid) {
		//如果与集合中的某一个学生学号相同，返回true，如果都不相同，返回false
		boolean flag=false;
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			if(s.getSid().equals(sid)) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	//定义一个方法，用于查看学生信息
	public static void findAllStudent(ArrayList<Student> array) {
		//判断集合中是否有数据，如果没有显示提示信息
		if(0==array.size()) {
			System.out.println("无信息，请先添加信息再查询");
		}else {
		
		//显示表头信息
		//  \t其实就是Tab键的位置
		System.out.println("学号\t\t姓名\t年龄\t居住地");
		
		//将集合中数据取出按照对应格式显示学生信息，年龄显示补充“岁”
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			System.out.println(s.getSid()+"\t"+s.getName()
			+"\t"+s.getAge()+"岁\t"+s.getAddress());
		}
	  }
	}
	//定义一个方法，用于删除学生信息
	public static void deleteStudent(ArrayList<Student> array) {
		//键盘录入要删除的学生学号,显示提示信息
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入你要删除的学生学号：");
		String sid=sc.nextLine();
		
		//在删除/修改学生操作前，对学号是否存在进行判断
		//如果不存在，显示提示信息
		//如果存在，执行删除或修改操作
		int index=-1;
	
		//遍历集合将对应学生对象从集合中删除
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			if(s.getSid().equals(sid)) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("该信息不存在，请重新输入");
		}else {
			array.remove(index);
			//给出删除成功提示
			System.out.println("删除学生成功");
		}
		
		
		
	}
	//定义一个方法，用于修改学生信息
	public static void updateStudent(ArrayList<Student> array) {
		//键盘录入要修改的学生学号,显示提示信息
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你要修改的学生学号：");
		String sid=sc.nextLine();
		//在删除/修改学生操作前，对学号是否存在进行判断
				//如果不存在，显示提示信息
				//如果存在，执行删除或修改操作
				int index=-1;
			
				//遍历集合将对应学生对象从集合中删除
				for(int i=0;i<array.size();i++) {
					Student s=array.get(i);
					if(s.getSid().equals(sid)) {
						index=i;
						break;
					}
				}
				if(index==-1) {
					System.out.println("该信息不存在，请重新输入");
				}else {		
		//键盘录入要修改的学生信息
		System.out.println("请输入学生新姓名：");
		String name=sc.nextLine();
		System.out.println("请输入学生新年龄：");
		String age=sc.nextLine();
		System.out.println("请输入学生新居住地：");
		String address=sc.nextLine();
		
		//创建学生对象
		Student s=new Student();
		s.setSid(sid);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		//遍历集合修改对应的学生信息
		for(int i=0;i<array.size();i++) {
			Student student=array.get(i);
			if(0==array.size()) {
				System.out.println("无信息，请先添加信息再查询");
			}
			if(student.getSid().equals(sid)) {
				array.set(i,s);
				break;
			}
		}
		//给出修改成功的提示
		System.out.println("学生信息修改成功");
				}
		
		
	}
}
