package �Զ����쳣;

/*
 		throws									throw
 		�����ڷ����������棬�������쳣����				�����ڷ������ڣ��������쳣������
 		����ʾ�׳��쳣���ɸ÷����ĵ�����������				����ʾ�׳��쳣���ɷ������ڵ���䴦��
 		����ʾ�����쳣��һ�ֿ����ԣ�����һ���ᷢ����Щ�쳣 	��ִ��throwһ���׳���ĳ���쳣
 */
public class Teacher {
	public void checkScore(int score) throws ScoreException {
		if(score<0 || score>100) {
//			throw new ScoreException();
			throw new ScoreException("����ķ������󣬷���Ӧ����0~100֮��");
		}else {
			System.out.println("��������");
		}
	}
}
