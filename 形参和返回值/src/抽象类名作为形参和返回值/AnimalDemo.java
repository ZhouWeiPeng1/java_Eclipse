package ����������Ϊ�βκͷ���ֵ;
/*
	������
 */
/*
 	1.2����������Ϊ�βκͷ���ֵ
 		���������β��ǳ�����������ʵ��Ҫ���Ǹó�������������
 		�������ķ���ֵ�ǳ�����������ʵ���ص��Ǹó�������������
 */
public class AnimalDemo {

	public static void main(String[] args) {
		//������������󣬲����÷���
		AnimalOperator ao=new AnimalOperator();
		Animal a=new Cat();
		ao.useAnimal(a);
		
		Animal a2 = ao.getAnimal();
		a2.eat();
	}
}
