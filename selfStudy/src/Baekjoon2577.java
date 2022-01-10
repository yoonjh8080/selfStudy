import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon2577 {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		String mul = Integer.toString(A*B*C); //100만~10억사이값
		
		for(int i=0; i<=9; i++)
		{
			int count = 0;
			for(int j=0; j<mul.length(); j++)
			{
				if((mul.charAt(j) - '0') == i)
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}
}

