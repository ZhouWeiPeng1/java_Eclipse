package itheima_02;

/*
 	����:
 		�õݹ���5�Ľ׳�,���ѽ���ڿ���̨���
 		
 	˼·:
 		1:����һ������,���ڵݹ���׳�,����Ϊһ��int���͵ı���
 		2:�ڷ����ڲ��жϸñ�����ֵ�Ƿ���1
 			��:����1
 			����:����n*(n-1)!
 		3:���÷���
 		4:������
 */
public class DiGuiDemo01 {
	public static void main(String[] args) {
		//���÷���
		int result = jc(5);
		
		//������
		System.out.println(result);
	}
	//����һ������,���ڵݹ���׳�,����Ϊһ��int���͵ı���
	public static int jc(int n) {
		//�ڷ����ڲ��жϸñ�����ֵ�Ƿ���1
		if(n == 1) {
			//��:����1
			return 1;
		}else {
			return n*jc(n-1);
		}
	}
}
