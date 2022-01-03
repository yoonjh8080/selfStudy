import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		// 0시 00분~ 44분 일때는 H를 23으로 변경 , 그외에는 H-1해주면됨
		
		if(H == 0)
		{
			if(M < 45) {
				System.out.println(23 + " " + (60 + (M-45)));
			}
			else {
				System.out.println(H + " " + (M-45));
			}
		}
		else {
			if(M < 45)
			{
				System.out.println(H-1 + " " + (60 + (M-45)));
			}
			else {
				System.out.println(H + " " + (M-45));
			}
		}
		
		sc.close();
	}

}
