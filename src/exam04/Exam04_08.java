/*
 * 방정식 2x+4y=10의 모든 해를 구하시오.
 * 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
 */
package exam04;

public class Exam04_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(2*x+4*y==10) {
					System.out.println("x="+x+",y="+y);
				}
				
			}
					}

	}

}
