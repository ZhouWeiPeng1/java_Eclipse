package ����;
/*
 	����Խ�磬�����������в����ڵ�������ӦԪ�أ��������Խ������
 	Array IndexOut Of Bounds Exception
 	
 	��ָ���쳣�����ʵ������Ѿ�����ָ����ڴ�����ݣ���ɿ�ָ���쳣
 	NuLL Pointer Exception
 	null ��ֵ�������������͵�Ĭ��ֵ����ʾ��ָ���κ���Ч����
 	������.length       ��ȡ����Ԫ�ظ���
 	      
 	      ��ȡ��ֵ
 	      ˼·��
 	      1������һ�����������ڱ������ֵ
 	      2��ȡ�����еĵ�һ��������Ϊ�����ĳ�ʼֵ
 	      3����������ʣ�����������ȶԣ�ÿ�ν��ȶԽ����ֵ�����ڱ�����
 	      4��ѭ���������ӡ����ֵ
 */
public class Arr {
	public static void main(String[] args) {
		int[] arr= {10,9,8,7,6,4,5,3,2,1};
		int max=arr[0];
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]>max)
			{
				max=arr[x];
			}
		}
		System.out.println("max="+max);
	}
}
