import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon10818 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int Max = -10000001;
		int Min = 10000001;
		
		for(int i=0; i<N; i++)
		{
			int num = Integer.parseInt(st.nextToken());
			
				if(num > Max) {
					Max = num;
				}
				if(num < Min){
					Min = num;
				}
		}
		bw.append(Integer.toString(Min) + " " + Integer.toString(Max));
		bw.close();
	}
}
