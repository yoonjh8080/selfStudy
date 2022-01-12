import java.util.Scanner;

public class Baekjoon8958 {

	public static void main(String[] args) {

		// �׽�Ʈ���̽� = �Է� ������
		// ����� ���ڿ� O�� ���������� +1��, X�� ������ ���� O���� �ٽ�1
		// ���ڿ������� ���������� �����
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String[] OX = new String[N];
				
		for(int i=0; i<N; i++)
		{
			OX[i] = scanner.next(); // �� �ε����� OX�� �Է�
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
