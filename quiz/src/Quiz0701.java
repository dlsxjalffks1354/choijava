import java.util.Scanner;

/*
 * ����1
�� ���� ������ ���ڷ� ���� �޾Ƽ� 
����� ��ȯ�ϴ� �Լ��� �����϶�

 */
public class Quiz0701 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ��� \n");
		int num1 =sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� \n");
		int num2 =sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� \n");
		int num3 =sc.nextInt();
		
		double avg;
		avg=result(num1,num2,num3);
		
		System.out.printf("��հ��� %f�Դϴ�",avg);
		

	}
	public static double result(int num1, int num2, int num3) 
	{
		double result=(num1+num2+num3)/3;
		return result;
	}

}
