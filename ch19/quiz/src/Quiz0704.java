/*
 *섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와
화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8

 */


import java.util.Scanner;
public class Quiz0704 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double result;
		
		System.out.println("섭씨의 값을 입력해주세요 화씨로 변환합니다. ");
		int num1 = sc.nextInt();
		System.out.println("화씨의 값을 입력해주세요 섭씨로 변환합니다. ");
		int num2 = sc.nextInt();
		
		result=Fahrenheit(num1);
		System.out.printf("섭씨를 화씨로 변환한 값은 %f입니다. \n",result);
		
		result=Celsius(num2);
		System.out.printf("화씨를 섭씨로 변환한 값은 %f입니다. \n",result);

	}
	
	public static double Fahrenheit(int num1) {
		double celsius = 1.8 * num1 + 32;
		return celsius;
	}
	public static double Celsius(int num2) {
		double fahrenheit = (num2-32)/1.8;
		return fahrenheit;
	}
}
