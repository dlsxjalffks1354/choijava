import java.util.Scanner;

public class Quiz0705 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;
		
		System.out.print("첫 번째 정수를 입력하세요 \n");
		int num1 =sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 \n");
		int num2 =sc.nextInt();
		do {
		System.out.print("세 번째 수를 입력하세요.세 번째수는 연산자입니다.  \n");
		int num3 =sc.nextInt();
			if(num3==1) {
				result=plus(num1,num2);
				System.out.printf("두 수의 합은 %d입니다.\n",result);
				break;
					
						}
			else if(num3==2) {
				result=minus(num1,num2);
				System.out.printf("두 수의 차는 %d입니다.\n",result);
				break;
							}
			else if(num3==3) {
				result=mul(num1,num2);
				System.out.printf("두 수의 곱는 %d입니다.\n",result);
				break;
							}
			else if(num3==4) {
				result=div(num1,num2);
				System.out.printf("두 수의 나눗셈의 몫은 %d입니다.\n",result);
				break;
							}
			else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					}
			}while(true);
			}

	public static int plus(int num1,int num2) {
			int result=num1+num2;
			return result;
	}
	public static int minus(int num1,int num2) {
		int result=num1-num2;
		return result;
	}
	public static int mul(int num1,int num2) {
			int result=num1*num2;
			return result;
	}
	public static int div(int num1,int num2) {
		int result=num1/num2;
		return result;
}
}
