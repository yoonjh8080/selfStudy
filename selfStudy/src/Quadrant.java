import java.util.Scanner;


public class Quadrant{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int Quadrant = 0;
		
		if(x > 0)
		{
			if(y > 0 )
				Quadrant = 1;
			else if(y < 0)
				Quadrant = 4;
		}
		else if (x < 0)
		{
			if(y > 0)
				Quadrant = 2;
			else if(y < 0)
				Quadrant = 3;
		}
		
		System.out.println(Quadrant);
		sc.close();
	}

}
