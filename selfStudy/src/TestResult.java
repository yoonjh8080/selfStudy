import java.util.Scanner;

public class TestResult {

	public static void main(String[] args) {
		/*
		 * ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, 
		 * ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int score = (sc.nextInt()/10);
		char grade = 'A';
		
		switch(score)
		{
			 case 10:
			 case 9:
				 grade = 'A';
				 break;
			 case 8:
				 grade = 'B';
				 break;
			 case 7:
				 grade = 'C';
				 break;
			 case 6:
				 grade = 'D';
				 break;
			 default:
				 grade = 'F';
		}
		 System.out.println(grade);
		sc.close();
	}

}
