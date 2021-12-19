package text04;
import java.util.Arrays;
import java.util.Random;

public class Ar {
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr =new int[10];
		
		//±éÀúÔªËØ
		for(int i=0;i<10;i++) {
			arr[i]=r.nextInt(101);	
		}
		Arrays.sort(arr);
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
