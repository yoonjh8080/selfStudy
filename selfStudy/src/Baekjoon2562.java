import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2562 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int max = 0;
		int maxNum = 0;
		
		for(int i=0; i<9; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<9; i++) //max°ª 
		{
			if(arr[i] > max)
			{
				max = arr[i];
				maxNum = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(maxNum);
	}
}
