package ��̬�е�ת��;
/*
 	����ת��
 		���ӵ���
 		��������ָ���������
 	����ת��
 		�Ӹ�����
 		��������תΪ�������
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//��̬
		Animal a=new Cat();//����ת��
		a.eat();
	/*
		//����Cat��Ķ���
		Cat c=new Cat();
		c.eat();
		c.playGame();
	*/
		
		//����ת��
		 Cat c=(Cat)a;
		 c.eat();
		 c.playGame();
	}
}
