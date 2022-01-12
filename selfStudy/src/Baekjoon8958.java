import java.util.Scanner;

public class Baekjoon8958 {

	public static void main(String[] args) {

		// 테스트케이스 = 입력 문제수
		// 출력은 문자열 O가 더해질수록 +1씩, X가 나오면 다음 O부터 다시1
		// 문자열끝까지 점수나오면 합출력
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String[] OX = new String[N];
				
		for(int i=0; i<N; i++)
		{
			OX[i] = scanner.next(); // 각 인덱스에 OX값 입력
		}
		
		scanner.close();
		for(int i=0; i<N; i++) 
		{
			int count = 0;
			int score = 0;
			
			for(int j=0; j<OX[i].length(); j++) 
			{
				if((OX[i].charAt(j)) == 'O')
				{
					count++;
				}
				else
				{
					count = 0;
				}
				score += count;
			}
			System.out.println(score);
		}
	}
}
