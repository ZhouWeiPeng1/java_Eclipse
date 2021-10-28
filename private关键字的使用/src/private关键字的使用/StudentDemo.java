package private关键字的使用;

public class StudentDemo {
	public static void main(String[] args) {
		//创建对象
		Text07 s=new Text07();
		
		//使用set方法给成员变量赋值
		s.setName("林青霞");
		s.setAge(30);
		s.show();
		//使用get方法获取成员变量的值
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s.getName()+","+s.getAge());//show()方法只能给出一直固定的格式
	}
}
