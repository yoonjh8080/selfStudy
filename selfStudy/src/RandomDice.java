
public class RandomDice {

	public static void main(String[] args) {
		/*
		 * while문과 Math.Random()메소드를 이용해서 2개의 주사위를 던졌을때 나오는 값을 출력 후
		 * 눈의 합이 5가 아니면 주사위를 다시던지고, 5일때 실행을 멈추는 코드를 작성해보자
		 */
		
		// 1. 주사위를 던져 나오는 값을 출력하기
		// 2. 두수의 합이 5인지 아닌지 판별
		// 3. 5이면 반복문 멈추기, 아니면 다시 반복
		
		int a , b = 0;
		boolean temp = true;
		
		
		while (temp)
		{
			a = (int) ((Math.random())*6 + 1);
			b = (int) ((Math.random())*6 + 1);
			System.out.println("두수의 합" + (a + b));
			if(a+b == 5)
			{
				temp=false;
			}
		}
		
	}

}
