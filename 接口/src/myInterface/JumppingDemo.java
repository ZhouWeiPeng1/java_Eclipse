package myInterface;

/*
 	������
 */
/*
 	���ӿ��ùؼ���interface����
 	   public interface �ӿ���{}
 	����ʵ�ֽӿ���implements��ʾ
 		public class ���� implements �ӿ���{}
 	���ӿڲ���ʵ����
 		�ӿ����ʵ��ʵ�����أ����ն�̬�ķ�ʽ��ͨ��ʵ�������ʵ��������нӿڶ�̬��
 		��̬����ʽ���������̬���������̬���ӿڶ�̬
 		��̬��ǰ�᣺�м̳л���ʵ�ֹ�ϵ���з�����д���и�(��/�ӿ�)����ָ��(��/ʵ��)�����
 	���ӿڵ�ʵ����
 		Ҫô��д�ӿ��е����г��󷽷�
 		Ҫô�ǳ�����
 */
public class JumppingDemo {
	public static void main(String[] args) {
//		Jumpping j=new Jumpping();
		
		Jumpping j=new Cat();
		j.jump();
	}
}
