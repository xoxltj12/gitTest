/*
 * 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌수의 총합을 구하시오.
 */
package exam04;

public class Exam04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=1; i<20; i++) {
			if(i%2!=0 && i%3!=0)	// 2또는 3의 배수가 아닐때만 sum에 i를 더함
				sum += i;
		
		}
		
		
		System.out.println("sum="+sum);

	}

}
