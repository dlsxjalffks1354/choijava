import java.util.Scanner;

/*
 * ����2
�� ���� ������ ���ڷ� ���� �޾Ƽ� ���� ���� ū ���� ��ȯ�ϴ� �Լ��� �����϶�.

 */
public class Quiz0702 {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ��� \n");
		int num1 =sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� \n");
		int num2 =sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� \n");
		int num3 =sc.nextInt();
		
		int result;
		
		result=big(num1,num2,num3);
		
		System.out.printf("������ ������ ���� ū ���� %d�Դϴ�.",result);

	}

public static int big(int num1,int num2,int num3) {
	int big=0;
	
	if(num1>num2)
	{
	if(num1>num3) {
	big=num1;
	}
	else big=num3;
	}
	else {
	if(num2>num3) 
	{
	big=num2;	
	}
	else 
	big=num3;
	}
	return big;
	}	

}
