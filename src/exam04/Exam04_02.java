/*
 * 1���� 20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴѼ��� ������ ���Ͻÿ�.
 */
package exam04;

public class Exam04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<20; i++) {
			if(i%2!=0 && i%3!=0)	// 2�Ǵ� 3�� ����� �ƴҶ��� sum�� i�� ����
				sum += i;
		
		}
		
		
		System.out.println("sum="+sum);

	}

}
