import java.util.Scanner;

/*
 * ����3
�� ���� ������ ���ڷ� ���� �޾Ƽ� ���� ���� ���� ���� ��ȯ�ϴ� �Լ��� �����϶�.

 */
public class Quiz0703 {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ù ��° ������ �Է��ϼ��� \n");
		int num1 =sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� \n");
		int num2 =sc.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ��� \n");
		int num3 =sc.nextInt();
		
		int result;
		
		result=min(num1,num2,num3);
		
		System.out.printf("������ ������ ���� ���� ���� %d�Դϴ�.",result);

	}

public static int min(int num1,int num2,int num3) {
	int min=0;
	
	if(num1<num2)
	{
	if(num1<num3) {
	min=num1;
	}
	else min=num3;
	}
	else {
	if(num2<num3) 
	{
	min=num2;	
	}
	else 
	min=num3;
	}
	return min;
	}	

}

