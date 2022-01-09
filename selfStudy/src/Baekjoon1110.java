import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon1110 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int A = N;
		int count = 0;
		
		while(true)
		{
			int s = N/10+N%10;
			if(s>=10) {
				s = s%10;
			}
			String nextNum = String.valueOf(N%10) + String.valueOf(s);
			count++;
			if(Integer.parseInt(nextNum) == A) {
				bw.append(Integer.toString(count));
				bw.close();
				break;
			}
			else {
				N = Integer.parseInt(nextNum);
			}
		}
	}
}
