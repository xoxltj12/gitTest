/*
 * ���ڷ� �̷���� ���ڿ� str�� ���� ��,  �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
 * ���� ���ڿ��� "12345"���, '1+2+3+4+5'�� ����� 15�� ����� ��µǾ�� �Ѵ�.
 * Hint) StringŬ������ charAt(int i)�� ���
 */
package exam04;

public class Exam04_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i) - '0';
			
			
		}
		System.out.println("sum="+sum);
	}

}
