/*
 * intŸ���� ���� num�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
 * ���� ���� num�� ���� 12345���, '1+2+3+4+5'�� �����  15�� ����϶�
 * �˸��� �ڵ带 �ۼ��϶�.
 * ���ڿ��� ��ȯ���� ���� ���ڷθ� ó���ؾ� �Ѵ�.
 */
package exam04;

public class Exam04_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int sum = 0;
		
		while(num>0) {
			sum += num%10;	
			num /= 10;
			
		}
		
		
		System.out.println("sum="+sum);
	}

}
