package this关键字;

public class StudentDemo {
		public static void main(String[] args) {
			//创建对象
			Student s=new Student();
			Student s1=new Student();
			
			//使用set方法给成员变量赋值
			s.setName("林青霞");
			s.setAge(28);
			s1.setName("张曼玉");
			s1.setAge(30);
			
			//调用show()方法
			s.show();
			s1.show();
		}
}
