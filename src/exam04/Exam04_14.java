/*
 * ������ ���ڸ��߱� ������ �ۼ��� ���̴�.
 * 1�� 100������ ���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ���� ���߸� ������ ������.
 * ����ڰ� ���� �Է��ϸ�, ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷��ش�.
 * ����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ���߸� ������ ������ �� �� ���� ���ڸ� ������� �˷��ش�.
 * �˸��� �ڵ带 �־� ���α׷��� �ϼ��Ͻÿ�. 
 */
package exam04;

import java.util.Scanner;

public class Exam04_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100 ������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // ����� �Է��� ������ ����
		int count = 0; // �õ� Ƚ���� �������� ����

		// ȭ������ ���� ������Է��� �ޱ� ���ؼ� Scanner Ŭ���� ���
		Scanner s = new Scanner(System.in);

		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ��� : ");
			input = s.nextInt(); // �Է� ���� ���� ���� input�� �����Ѵ�.

			if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ����  " + count + "���Դϴ�.");
				break;
			}

		} while (true);

	}
}
