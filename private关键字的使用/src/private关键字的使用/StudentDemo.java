package private�ؼ��ֵ�ʹ��;

public class StudentDemo {
	public static void main(String[] args) {
		//��������
		Text07 s=new Text07();
		
		//ʹ��set��������Ա������ֵ
		s.setName("����ϼ");
		s.setAge(30);
		s.show();
		//ʹ��get������ȡ��Ա������ֵ
		System.out.println(s.getName()+"---"+s.getAge());
		System.out.println(s.getName()+","+s.getAge());//show()����ֻ�ܸ���һֱ�̶��ĸ�ʽ
	}
}
