package stringbuilderTest01;
/*
 	����
 	����һ����������int�����е����ݰ���ָ���ĸ�ʽƴ�ӳ�һ���ַ������أ����ø÷��������ڿ���̨
 	��������
 	���磬����Ϊint[] arr={1,2,3};,ִ�з������������Ϊ[1,2,3]
 	
 	˼·��
 	 1.����һ��int���͵����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
 	 2.����һ�����������ڰ�int�����е����ݰ���ָ����ʽƴ�ӳ�һ���ַ�������
 	 3.�ڷ�����StringBuilder����Ҫ�����ƴ�ӣ����ѽ��ת��String����
 	 4.���÷�������һ���������ս��
 	 5.������
 */
public class StringBuilderTest01 {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		String s=arrayToString(arr);
		System.out.println("s:"+s);
	}
	public static String arrayToString(int[] arr) {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(", ");
			}
		}
		
		sb.append("]");
		String s=sb.toString();
		return s;
	}
}
