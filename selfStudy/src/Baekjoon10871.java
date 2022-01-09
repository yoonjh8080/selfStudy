import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon10871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    StringTokenizer Num = new StringTokenizer(br.readLine());   
	    int N = Integer.parseInt(Num.nextToken());
	    int X = Integer.parseInt(Num.nextToken());
	    
		int[] arr = new int[N];
		int[] arr2 = new int[X-1];
	    
	    for(int i=0; i<N; i++)
	    {
	    	arr[i] = i+1; 
	    }
	    
	    shuffle(arr);
	    boolean temp = false;
	    
		    for(int j=0; j<N; j++)
		    {
		    	if(arr[j] < X)
		    	{
    				temp = true;
    				for(int i=0; i<X-1; i++)
    				{
    					if(arr2[i] == 0 && temp == true)
    					{
    						arr2[i] = arr[j] ;
    						temp = false;
    						if(i == X-2){
    							bw.write(arr2[i] + "");
    						}
    						else {
    							bw.write(arr2[i] + " ");
							}
    					}
    				}
		    	}
		    }
	    bw.flush();
	}
	
	static int[] shuffle(int[] arr) // 배열값 랜덤변경 함수
	{
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			int ran = (int)((Math.random()*arr.length));
			temp = arr[i];
			arr[i] = arr[ran];
			arr[ran] = temp;
		}	
		return arr;
	}
}
