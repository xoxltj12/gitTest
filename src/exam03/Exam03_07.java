/*
 * �Ʒ��� ȭ���� ������ ��ȯ�ϴ� �ڵ��̴�.
 * ��ȯ������ 'c = 5/9 x (F-32)'��� �Ҷ�, �˸��� �ڵ带 �����ÿ�.
 * ��, ��ȯ������� �Ҽ��� ��°�ڸ����� �ݿø��ؾ��Ѵ�.
 * Math.round()�� ������� �ʰ� ó���Ұ�
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
