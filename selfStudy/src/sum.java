
public class sum {

	public static void main(String[] args) {
		/*
		 * 1~100까지 숫자의 합을 구하여 출력해보기
		 */
		
		int sum = 0; //
		
		for (int i=1; i<=100; i++)
		{
			sum += i;
		}
		
		System.out.println("1~100의 합 : " + sum);
		
	}

}
