/*
 * lotto 프로그램을 작성하라.
 */
package exam04;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1 = (int)(Math.random()*45+1);
//		int num2 = (int)(Math.random()*45+1);
//		int num3 = (int)(Math.random()*45+1);
//		int num4 = (int)(Math.random()*45+1);
//		int num5 = (int)(Math.random()*45+1);
//		int num6 = (int)(Math.random()*45+1);
//		
//		System.out.println(num1+","+num2+","+num3+","+num4+","+num5+","+num6);

		int Lotto[] = new int[6];
		//System.out.print("선택 숫자 : ");

		for (int i = 0; i < Lotto.length; i++) {
			Lotto[i] = (int) (Math.random() * 45) + 1;
			if(i>=1) {
				for (int j = i-1; j>=i; j--) {
					if (Lotto[i] == Lotto[j]);
					i--;
				}
			}
		}
		for (int i = 0; i < Lotto.length; i++) {
			System.out.println(Lotto[i]);
		}
		System.out.println("입니다.");

	}

}
