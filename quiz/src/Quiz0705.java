import java.util.Scanner;

public class Quiz0705 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;
		
		System.out.print("ù ��° ������ �Է��ϼ��� \n");
		int num1 =sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ��� \n");
		int num2 =sc.nextInt();
		do {
		System.out.print("�� ��° ���� �Է��ϼ���.�� ��°���� �������Դϴ�.  \n");
		int num3 =sc.nextInt();
			if(num3==1) {
				result=plus(num1,num2);
				System.out.printf("�� ���� ���� %d�Դϴ�.\n",result);
				break;
					
						}
			else if(num3==2) {
				result=minus(num1,num2);
				System.out.printf("�� ���� ���� %d�Դϴ�.\n",result);
				break;
							}
			else if(num3==3) {
				result=mul(num1,num2);
				System.out.printf("�� ���� ���� %d�Դϴ�.\n",result);
				break;
							}
			else if(num3==4) {
				result=div(num1,num2);
				System.out.printf("�� ���� �������� ���� %d�Դϴ�.\n",result);
				break;
							}
			else {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
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
