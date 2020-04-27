/*
 * 아래는 화씨를 섭씨로 변환하는 코드이다.
 * 변환공식이 'c = 5/9 x (F-32)'라고 할때, 알맞은 코드를 넣으시오.
 * 단, 변환결과값은 소수점 셋째자리에서 반올림해야한다.
 * Math.round()를 사용하지 않고 처리할것
 */
package exam03;

public class Exam03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrenheit = 100;
		float celcius = (int)((5/9f*(fahrenheit-32))*100+0.5)/100f;
		
		System.out.println("Farhrenheit: "+fahrenheit);
		System.out.println("Celcius: "+celcius);
		
		
	}

}
