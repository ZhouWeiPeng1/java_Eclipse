package myDuoTai01;
/*
 		������
 */
/*
 	��̬�ĺô�������˳������չ��
 		�������֣����巽����ʱ��ʹ�ø�������Ϊ������������ʹ�õ�ʱ��ʹ�þ����������
 		�������
 		
 	��̬�ı׶ˣ�����ʹ����������й���
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//�������������Ķ��󣬵��÷���
		AnimalOperator ao=new AnimalOperator();
		Cat c=new Cat();
		ao.useAnimal(c);
		
		Dog d=new Dog();
		ao.useAnimal(d);
		
	}
}
