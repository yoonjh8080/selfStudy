import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Baekjoon2438 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String a = "*";
		
		for(int i=0;i<num;i++)
		{
			for(int j=0; j<=i; j++)
			bw.write(a);
			bw.write("\n");
			bw.flush();
		}
	}
}
