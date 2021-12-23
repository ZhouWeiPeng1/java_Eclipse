package 自定义异常;

/*
 		throws									throw
 		·用在方法声明后面，跟的是异常类名				·用在方法体内，跟的是异常对象名
 		·表示抛出异常，由该方法的调用者来处理				·表示抛出异常，由方法体内的语句处理
 		·表示出现异常的一种可能性，并不一定会发生这些异常 	·执行throw一定抛出了某种异常
 */
public class Teacher {
	public void checkScore(int score) throws ScoreException {
		if(score<0 || score>100) {
//			throw new ScoreException();
			throw new ScoreException("你给的分数有误，分数应该在0~100之间");
		}else {
			System.out.println("分数正常");
		}
	}
}
