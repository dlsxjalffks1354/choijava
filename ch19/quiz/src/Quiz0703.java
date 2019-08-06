import java.util.Scanner;

/*
 * 문제3
세 개의 정수를 인자로 전달 받아서 그중 가장 작은 수를 반환하는 함수를 정의하라.

 */
public class Quiz0703 {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 \n");
		int num1 =sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 \n");
		int num2 =sc.nextInt();
		
		System.out.print("세 번째 정수를 입력하세요 \n");
		int num3 =sc.nextInt();
		
		int result;
		
		result=min(num1,num2,num3);
		
		System.out.printf("세개의 정수중 가장 작은 값은 %d입니다.",result);

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

