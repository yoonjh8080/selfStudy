import java.util.Scanner;

public class TestResult {

	public static void main(String[] args) {
		/*
		 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 
		 * 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
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
