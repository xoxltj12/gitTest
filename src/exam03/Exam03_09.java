/*
 * ������ ������ ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�̰ų� ������ ���� 
 * ���� b�� ���� true�� �ǵ��� �ϴ� �ڵ��̴�.
 * �˸��� �ڵ带 �����ÿ�.
 */
package exam03;

public class Exam03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'z';
		boolean b = ('A' <= ch && ch <= 'Z')||('a' <= ch && ch <= 'z')||('0' <= ch && ch <= '9');
		
		System.out.println(b);

	}

}
