import javax.xml.transform.Templates;

public class timesTable {

	public static void main(String[] args) {

		/*
		 * while���� ����Ͽ� �������� �����
		 */
		
		int dan = 1;
		int i = 1;
		boolean temp = true; //�⺻ �����Լ� ����
		
		while (temp)
		{
			System.out.println(" *** " + dan +"�� ***"); // �����
			while(i <10)
			{
			System.out.println(dan +  " * " + i + " = " + dan * i); // �����ܰ� ���
			i++;
			}
			dan += 1;
			i = 1;
			
			if (dan > 9) // ���ᰪ (9�ܱ����̹Ƿ� 10����)
			{
			temp = false;
			}
		}
	}
}
