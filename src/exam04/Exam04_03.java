/*
 * 1+(1+2)+(1+2+3)+(1+2+3+4)+ ... + (1+2+3+...+10)�� ����� ����Ͻÿ�.
 */
package exam04;

public class Exam04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int total = 0;
		
		for(int i=1; i<11; i++) {
			sum+= i;
			total += sum;	
		}
		
		System.out.println("total="+total);
	}
		
}
