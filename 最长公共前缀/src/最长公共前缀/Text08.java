package �����ǰ׺;
import java.util.Arrays;
public class Text08 {
	public static String replaceSpace(String[] strs) {

		// ������ֵ���Ϸ����ͷ��ؿմ�
		if (!chechStrs(strs)) {
			return "";
		}
		// ���鳤��
		int len = strs.length;
		// ���ڱ�����
		StringBuilder res = new StringBuilder();
		// ���ַ��������Ԫ�ذ�����������(�������ֵĻ������ֻ�����ǰ��)
		Arrays.sort(strs);
		int m = strs[0].length();
		int n = strs[len - 1].length();
		int num = Math.min(m, n);
		for (int i = 0; i < num; i++) {
			if (strs[0].charAt(i) == strs[len - 1].charAt(i)) {
				res.append(strs[0].charAt(i));
			} else
				break;

		}
		return res.toString();

	}

	private static boolean chechStrs(String[] strs) {
		boolean flag = false;
		if (strs != null) {
			// ����strs���Ԫ��ֵ
			for (int i = 0; i < strs.length; i++) {
				if (strs[i] != null && strs[i].length() != 0) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	// ����
	public static void main(String[] args) {
		String[] strs = { "hutong", "hututu", "huyinjun" };
		// String[] strs = { "customer", "car", null };//�մ�
		// String[] strs = {};//�մ�
		// String[] strs = null;//�մ�
		System.out.println(Text08.replaceSpace(strs));// c
	}
}
