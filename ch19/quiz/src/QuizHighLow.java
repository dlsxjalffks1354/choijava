import java.util.Random;
import java.util.Scanner;

public class QuizHighLow {


	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc1 = new Scanner(System.in);//����ڰ� �Է��� ��.
		Scanner sc2 = new Scanner(System.in);//���� ���Ḧ �Ҷ� ����ϴ°�.
		while(true)
		{
			int ran=random.nextInt(100);
			int dap=ran;
			for(int pc1=6; pc1>=0; pc1--) 
			{
			if(pc1==0) {
			System.out.print("6ȸ�̳��� ���ߴµ��� �����ϼ˽��ϴ�.\n");	
			break;
			}
			System.out.println
			("������ ���ڸ� �Է����ּ���. (������ 0-100���ͱ����Դϴ�.)");
			int pc=sc1.nextInt();
			if(pc>100 || pc<0)
			{
				System.out.print
("������ ������ �ƴմϴ� �ٽ��Է����ּ���.\n");
				pc1++;
			}
			if(pc==dap) 
			{
			System.out.printf("�����Դϴ� ���� %d�Դϴ�.\n",dap);
			break;
			}
			if(pc>=dap) 
			{
			System.out.printf
("�Է��Ͻ� ���� ���������� Ů�ϴ�.\n%dȸ���ҽ��ϴ�.\n",pc1-1);	
			}
			if(pc<=dap) 
			{
			System.out.printf
("�Է��Ͻ� ���� ���������� �۽��ϴ�.\n%dȸ���ҽ��ϴ�.\n",pc1-1);	
			}
		
		
			}
			System.out.print("������ �� �Ͻðڽ��ϱ�? <y/n>\n");
			String str = sc2.next();
			if (!str.equalsIgnoreCase("y")) {
				System.out.println("Good bye~");
				break;

											}
					}
			}
	}









