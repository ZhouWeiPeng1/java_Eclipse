package myException02;
/*
 	自定义异常
 	
 		格式:
 		public class 异常类名 extends Exception {
 			无参构造
 			带参构造
 		}
 		
 		范例:
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
