package myArrays;

public class ArrayDemo {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {24,69,80,57,13};
		System.out.println("����ǰ" + arrayToString(arr));
		
		for(int x=0;x<4;x++) {
			for(int i=0;i<arr.length-1-x;i++) {
				if(arr[i]>arr[i+1]) {
					int tmp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
				}
			}
		}
		System.out.println("�����"+arrayToString(arr));
	}
	
	
	
	//�������е�Ԫ�ذ���ָ���Ĺ������һ���ַ�����[Ԫ��1��Ԫ��2������]
	public static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0;i < arr.length;i++) {
			if(i == arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(",");
			}
		}
		sb.append("]");
		String s = sb.toString();
		return s;
	}
}
