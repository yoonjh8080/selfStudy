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
			double overAvgPer = 0; //����� �� ��� 0���� �ʱ�ȭ 
			
			
			StringTokenizer st = new StringTokenizer(br.readLine() + " "); // �л��� + �����Է�
			
			score = new int[Integer.parseInt(st.nextToken())];
			
			for(int j=0; j<score.length; j++) // ���� sum
			{
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
 			}
			
			avg = sum / score.length;
			
			for(int k=0; k<score.length; k++) // ��� �Ѵ� �л�ã�� 
			{
				if(score[k] > avg)
				{
					overAvg++;
				}
			}
			overAvgPer = overAvg/score.length*100;
			
			System.out.println(String.format("%.3f", overAvgPer) + "%"); //3°�ڸ����� �ݿø� math.round �Լ��� �Ҽ���0�ڸ��� �����ϹǷ� string.format�Լ� ���
		}
	}
}
