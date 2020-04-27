/*
 * 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 
 * 변수 b의 값이 true가 되도록 하는 코드이다.
 * 알맞은 코드를 넣으시오.
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
