package this�ؼ���;
/*
 		this���εı�������ָ����Ա����
 		*�������β�������Ա����ͬ��������this���εı���ָ�����βΣ������ǳ�Ա����
 		*�������β�û�����Ա����ͬ��������this���εı���ָ���ǳ�Ա����
 		����this����������ֲ��������س�Ա����������
 */
public class Student {
		private String name;
		private int age;
		
//		public void setName(String n) {
//			name=n;
//		}
		public void setName(String name) {
			this.name=name;//this.nameָ����Ա����
		}
		public String getName() {
			return name;
		}
//		public void setAge(int a) {
//			age=a;
//		}
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		public void show() {
			System.out.println(name+","+age);
		}
}
