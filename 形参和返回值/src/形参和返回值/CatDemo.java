package �βκͷ���ֵ;

/*
 	������
 */
/*
 	1.1������Ϊ�βκͷ���ֵ
 		���������β�����������ʵ����Ҫ���Ǹ���Ķ���
 		�������ķ���ֵ����������ʵ���ص��Ǹ���Ķ���
 */
public class CatDemo {
	
	public static void main(String[] args) {
		//������������󣬲����÷���
		CatOperator co=new CatOperator();
		Cat c = new Cat();
		co.useCat(c);
		
		Cat c2 = co.getCat();
		c2.eat();
	}
}
