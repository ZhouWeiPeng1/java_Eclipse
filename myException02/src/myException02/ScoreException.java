package myException02;
/*
 	�Զ����쳣
 	
 		��ʽ:
 		public class �쳣���� extends Exception {
 			�޲ι���
 			���ι���
 		}
 		
 		����:
 		public class ScoreException extends Exception{
 		
 		public ScoreException() {}
 		
 		public ScoreException(String message) {
 				super(message);
 			}
 	}
 */
public class ScoreException extends Exception{
		public ScoreException() {}
		
		public ScoreException(String message) {
				super(message);
			}
}
