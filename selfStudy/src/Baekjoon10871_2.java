import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon10871_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    StringTokenizer Num = new StringTokenizer(br.readLine());
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int N = Integer.parseInt(Num.nextToken());
	    int X = Integer.parseInt(Num.nextToken());
	    
	    for(int i=0; i<N; i++)
	    {
	    	int value = Integer.parseInt(st.nextToken());
	    	if(value < X) {
	    		bw.append(value + " ");
	    	}
	    }
		     bw.flush();
	}
}
