package myException02;

import java.util.Scanner;

public class TeacherTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������:");
		int score = sc.nextInt();
		
		Teacher t = new Teacher();
		try {
			t.checkScore(score);
		} catch (ScoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
