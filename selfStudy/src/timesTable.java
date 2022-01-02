import javax.xml.transform.Templates;

public class timesTable {

	public static void main(String[] args) {

		/*
		 * while문을 사용하여 구구단을 만들기
		 */
		
		int dan = 1;
		int i = 1;
		boolean temp = true;
		
		while (temp)
		{
			System.out.println(" *** " + dan +"단 ***");
			while(i <10)
			{
			System.out.println(dan +  " * " + i + " = " + dan * i);
			i++;
			}
			dan += 1;
			i = 1;
			
			if (dan == 10)
			{
			temp = false;
			}
		}
	}
}
