package myextends01;
/*
 * ������
 */
/*
 	������д
 		�����г����˺͸�����һģһ���ķ�������
 		
 	������д
 	 	��������Ҫ����Ĺ��ܣ������������������Լ���������ʱ��������д������
 	 	�ķ���������������Ϯ�˸���Ĺ��ܣ��ֶ������������е�����
 	 	
 	 @Override
 	 	��һ��ע��(ע������ѧϰ)
 	 	���԰������Ǽ����д�����ķ�����������ȷ��
 */
public class PhoneDemo {
	public static void main(String[] args) {
		//��������
		Phone p=new Phone();
		p.call("����ϼ");
		 System.out.println("-----------");
		 
		 NewPhone np=new NewPhone();
		 np.call("����ϼ");
	}
}
