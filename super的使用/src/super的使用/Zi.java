package super��ʹ��;

public class Zi extends Fu {
	public int age=30;
	
	public void show() {
		int age=20;
		System.out.println(age);
		//��Ҫ���ʳ�Ա����age,��ô����?
		System.out.println(this.age);
		//��Ҫ���ʸ���ĳ�Ա����age,��ôbane��?
		System.out.println(super.age);
	}
}
