import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		/*
		 * ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
		 * ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 1
		 * 900���� 100�� ����̰� 400�� ����� �ƴϱ� ������
		 * ������ �ƴϴ�. ������, 2000���� 400�� ����̱� ������ �����̴�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int result = 0;
		
		if(year % 4 ==0)
		{
			if(year % 100 != 0 || year % 400 ==0)
			{
				result = 1;
			}
			else {
				result = 0;
			}
		}
		else {
			result = 0;
		}
		
		System.out.println(result);
		
		sc.close();
		
	}
}
