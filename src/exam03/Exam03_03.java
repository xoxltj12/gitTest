/*
 * 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
 * 삼항 연산자를 이용해서 (1)에 알맞는 코드를 넣으시오.
 * 실행결과 : 양수
 * Hint // 삼항연산자를 두번 사용하라.
 */
package exam03;

public class Exam03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 10;
		 System.out.println(num>0 ? "양수" :(num<0 ? "음수" : "0"));
	}

}
