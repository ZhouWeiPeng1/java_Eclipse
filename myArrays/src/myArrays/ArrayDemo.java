package myArrays;

public class ArrayDemo {
	public static void main(String[] args) {
		//定义一个数组
		int[] arr = {24,69,80,57,13};
		System.out.println("排序前" + arrayToString(arr));
		
		for(int x=0;x<4;x++) {
			for(int i=0;i<arr.length-1-x;i++) {
				if(arr[i]>arr[i+1]) {
					int tmp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
				}
			}
		}
		System.out.println("排序后"+arrayToString(arr));
	}
	
	
	
	//把数组中的元素按照指定的规则组成一个字符串：[元素1，元素2···]
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
