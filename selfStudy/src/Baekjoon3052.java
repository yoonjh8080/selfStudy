import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Baekjoon3052 {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		
		int[] Num = new int[10];
		int result = 0;
		for(int i=0; i<10; i++)
		{
			Num[i] = (sc.nextInt())%42;
		}
		sc.close();
		
		for(int i=0; i<42; i++)
		{
			int count = 0;
			for(int j=0; j<10; j++)
			{
				if((Num[j]) == i)
				{
					count++;
				}
			}
			if(count>0)
			{
				result++;
			}
		}
		System.out.println(result);
	}
}

