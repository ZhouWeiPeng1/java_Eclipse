package ƴ���ַ���;

public class StringText04 {
	public static void main(String[] args) {
		//����һ��int���͵����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
		int[] arr= {1,2,3};
		//���÷�������һ���������ս��
		String s=arrayToString(arr);
		
		//������
		System.out.println("s:"+s);
	}
	//����һ�����������ڰ�int�����е����ݰ���ָ����ʽƴ�ӳ�һ���ַ�������
	public static String arrayToString(int[] arr) {
		//�ڷ����б�������
		String s="";
		s+="{";
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				s+=arr[i];
			}else {
				s+=arr[i];
				s+=", ";
			}
		}
		s+="}";
		
		return s;
	}
}
