/*
 * 1+(-2)+3+(-4)+... �� ���� ������ ��� ���س�������,
 * ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.
 */
package exam04;

public class Exam04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int s = 1;
		int num = 0;
		
		for(int i=1;i<100000;i++,s=-s) {
			num = s*i;
			sum += num;
			
			
			
			
			if(sum>=100	) {
				break;
			}
			
			
		}
		
		System.out.println("num="+num);
		System.out.println("sum="+sum);
		
	}

}
