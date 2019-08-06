import java.util.Scanner;

/*
 * 문제1
세 개의 정수를 인자로 전달 받아서 
평균을 반환하는 함수를 정의하라

 */
public class Quiz0701 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 \n");
		int num1 =sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 \n");
		int num2 =sc.nextInt();
		
		System.out.print("세 번째 정수를 입력하세요 \n");
		int num3 =sc.nextInt();
		
		double avg;
		avg=result(num1,num2,num3);
		
		System.out.printf("평균값은 %f입니다",avg);
		

	}
	public static double result(int num1, int num2, int num3) 
	{
		double result=(num1+num2+num3)/3;
		return result;
	}

}
