import java.util.Scanner;

/*
 * 문제2
세 개의 정수를 인자로 전달 받아서 그중 가장 큰 수를 반환하는 함수를 정의하라.

 */
public class Quiz0702 {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 \n");
		int num1 =sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 \n");
		int num2 =sc.nextInt();
		
		System.out.print("세 번째 정수를 입력하세요 \n");
		int num3 =sc.nextInt();
		
		int result;
		
		result=big(num1,num2,num3);
		
		System.out.printf("세개의 정수중 가장 큰 값은 %d입니다.",result);

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
