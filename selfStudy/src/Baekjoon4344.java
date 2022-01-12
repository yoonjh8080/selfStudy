import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;
import java.util.StringTokenizer;

public class Baekjoon4344 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine());
		int[] score;
		
		for(int i=0; i<c; i++)
		{
			double sum = 0;
			double avg = 0;
			double overAvg = 0; 
			double overAvgPer = 0; //사용한 값 모두 0으로 초기화 
			
			
			StringTokenizer st = new StringTokenizer(br.readLine() + " "); // 학생수 + 성적입력
			
			score = new int[Integer.parseInt(st.nextToken())];
			
			for(int j=0; j<score.length; j++) // 성적 sum
			{
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
 			}
			
			avg = sum / score.length;
			
			for(int k=0; k<score.length; k++) // 평균 넘는 학생찾기 
			{
				if(score[k] > avg)
				{
					overAvg++;
				}
			}
			overAvgPer = overAvg/score.length*100;
			
			System.out.println(String.format("%.3f", overAvgPer) + "%"); //3째자리까지 반올림 math.round 함수는 소수점0자리는 절삭하므로 string.format함수 사용
		}
	}
}
