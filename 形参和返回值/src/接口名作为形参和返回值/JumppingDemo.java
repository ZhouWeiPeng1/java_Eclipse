package �ӿ�����Ϊ�βκͷ���ֵ;
/*
 	������
 */
/*
	1.3�ӿ�����Ϊ�βκͷ���ֵ
		���������β��ǽӿ�������ʵ��Ҫ���Ǹýӿڵ�ʵ�������
		�������ķ���ֵ�ǽӿ�������ʵ���ص��Ǹ���ӿڵ�ʵ�������
		
 */
public class JumppingDemo {
	public static void main(String[] args) {
		//������������󣬲����÷���
		JumppingOperator jo = new JumppingOperator();
		Jumpping j = new Cat();
		jo.useJumpping(j);
		
		Jumpping j2 = jo.getJumpping();
		j2.jump();
	}
}
