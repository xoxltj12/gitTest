/*
 * ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��ε�, ���� ch�� ����� ���ڰ� �빮���� ��쿡�� �ҹ��ڷ� �����Ѵ�.
 * �����ڵ�� �ҹ��ڰ� �빮�ں��� 32��ŭ �� ũ��.
 * ���� ��� 'A'�� �ڵ�� 65�̰� 'a'�� �ڵ�� 97�̴�.
 * �˸��� �ڵ带 �����ÿ�.
 */
package exam03;

public class Exam03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		char lowerCase = ('A' <= ch && ch <= 'Z')?(char)(ch+32) : ch;
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}

}
