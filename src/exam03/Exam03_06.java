/*
 * 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다.
 * 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다.
 * 19의 경우 20이고, 81의 경우 90이된다.
 * 30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야한다.
 * 알맞은 코드를 넣으시오.
 * Hint 나머지 연산자를 사용하라 
 */
package exam03;

public class Exam03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 24;
		System.out.println(10-num%10); // (num/10+1)*10-num

	}

}
