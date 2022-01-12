import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1546 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt(); // ���躻 �����
		double[] score = new double[N];
		double sum = 0;
		
		for(int i=0; i<N; i++) // �� �迭�� score�� �ʱ�ȭ
		{
			score[i] = scanner.nextInt();
			
		}
		
		Arrays.sort(score); // ������������
		
		for(int i=0; i<N; i++) // �� �迭�� score�� �ʱ�ȭ
		{
		    score[i] = (score[i]/score[N-1]*100);
		    sum += score[i];
		}
		System.out.println(sum/N);
	}
}
