package text01;

public class Text01 {
			private String name;
			private int age;
			public void setName(String n) {
				name=n;
			}
			public String getName() {
				return name;
			}
			public void setAge(int a) {
				age=a;
			}
			public int getAge() {
				return age;
			}
			public void show() {
				System.out.println(name+","+age);
			}
}

