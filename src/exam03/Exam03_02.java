/*
 * �Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ����� ���� ���ϴ� �ڵ��̴�.
 * ���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�,
 * 13���� �ٱ��ϰ� �ʿ��� ���̴�. (1)�� �˸��� �ڵ带 �����ÿ�
 */
package exam03;

public class Exam03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples = 123;	//����� ����
		int sizeOfBucket = 10;	//�ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = (numOfApples%sizeOfBucket>0 ? 1:0);	//��� ����� ��µ� �ʿ��� �ٱ����� ��
		
		System.out.println("�ʿ��� �ٱ����� �� : "+numOfBucket);
		
		
	}

}
