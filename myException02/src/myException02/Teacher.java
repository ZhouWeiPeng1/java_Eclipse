package myException02;

public class Teacher {
	public void checkScore(int score) throws ScoreException{
		if(score<0 || score>100) {
			throw new ScoreException("输入的分数异常");
		}else {
			System.out.println("分数正常");
		}
	}
}
