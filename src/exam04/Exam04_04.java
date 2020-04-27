/*
 * 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을때,
 * 몇까지 더해야 총합이 100이상이 되는지 구하시오.
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
