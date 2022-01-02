import javax.xml.transform.Templates;

public class timesTable {

	public static void main(String[] args) {

		/*
		 * while문을 사용하여 구구단을 만들기
		 */
		
		int dan = 1;
		int i = 1;
		boolean temp = true; //기본 전역함수 설정
		
		while (temp)
		{
			System.out.println(" *** " + dan +"단 ***"); // 단출력
			while(i <10)
			{
			System.out.println(dan +  " * " + i + " = " + dan * i); // 구구단값 출력
			i++;
			}
			dan += 1;
			i = 1;
			
			if (dan > 9) // 종료값 (9단까지이므로 10설정)
			{
			temp = false;
			}
		}
	}
}
