/*
 *����(Celsius)�� �Է¹޾Ƽ� ȭ��(Fahrenheit)�� ��ȯ�Ͽ� �����ϴ� �Լ���
ȭ���� �Է¹޾Ƽ� ������ ��ȯ�Ͽ� �����ϴ� �Լ��� ������.
ȭ�� = 1.8 * ���� + 32
���� = (ȭ�� - 32) / 1.8

 */


import java.util.Scanner;
public class Quiz0704 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double result;
		
		System.out.println("������ ���� �Է����ּ��� ȭ���� ��ȯ�մϴ�. ");
		int num1 = sc.nextInt();
		System.out.println("ȭ���� ���� �Է����ּ��� ������ ��ȯ�մϴ�. ");
		int num2 = sc.nextInt();
		
		result=Fahrenheit(num1);
		System.out.printf("������ ȭ���� ��ȯ�� ���� %f�Դϴ�. \n",result);
		
		result=Celsius(num2);
		System.out.printf("ȭ���� ������ ��ȯ�� ���� %f�Դϴ�. \n",result);

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
