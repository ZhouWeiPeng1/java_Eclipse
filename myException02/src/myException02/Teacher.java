package myException02;

public class Teacher {
	public void checkScore(int score) throws ScoreException{
		if(score<0 || score>100) {
			throw new ScoreException("����ķ����쳣");
		}else {
			System.out.println("��������");
		}
	}
}
