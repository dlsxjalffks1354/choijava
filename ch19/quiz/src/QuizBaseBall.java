import java.util.Random;
import java.util.Scanner;

public class QuizBaseBall {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int comnum1=random.nextInt(9);
		int comnum2=random.nextInt(9);
		int comnum3=random.nextInt(9);
		
		while(true)
		{
			int st=0;//��Ʈ����ũ ����
			int ball=0;//������
			int out=0;//�ƿ�����
			int pc1;
			int pc2;
			int pc3;
			
			
			System.out.println("���� �߱������� �����ϰڽ��ϴ�.");
			
			System.out.println("ù ��° ������ �Է��� �ּ��� ������ 0~9�����Դϴ�");
			pc1 = sc.nextInt(); 
			if(pc1>9 || pc1<0 )
			{
				System.out.print("������ ������ �ƴմϴ� �ٽ��Է����ּ���.\n");
			}
			System.out.println("�� ��° ������ �Է��� �ּ��� ������ 0~9�����Դϴ�");
			pc2 = sc.nextInt(); 
			if(pc2>9 || pc2<0 )
			{
				System.out.print("������ ������ �ƴմϴ� �ٽ��Է����ּ���.\n");
			}
			System.out.println("�� ��° ������ �Է��� �ּ��� ������ 0~9�����Դϴ�");
			pc3 = sc.nextInt();
			if(pc1>9 || pc1<0 || pc2>9 || pc2<0 || pc3>9 || pc3<0 )
			{
				System.out.print("������ ������ �ƴմϴ� �ٽ��Է����ּ���.\n");
			}
			
			if(pc1==comnum1 || pc2==comnum2 || pc3==comnum3)
			{
				st++;
			}
			if(pc1==comnum2 || pc1==comnum3 )
			{
				ball++;
			}
			if(pc2==comnum1 || pc2==comnum3)
			{
				ball++;
			}
			if(pc3==comnum1 || pc3==comnum2)
			{
				ball++;
			}
			if(pc1 !=comnum1 && pc1!=comnum2 && pc1!=comnum3 )
			{
				out++;
			}
			if(pc2 !=comnum1 && pc2!=comnum2 && pc2!=comnum3 )
			{
				out++;
			}
			if(pc3 !=comnum1 && pc3!=comnum2 && pc3!=comnum3 )
			{
				out++;
			}
			System.out.printf("���� ī��Ʈ�Դϴ� %d��Ʈ����ũ %d��  %d�ƿ�",st,ball,out);
			
			if(st==3)
			{
				System.out.printf("���� ���߼˽��ϴ� ���ھ߱��� �����մϴ�.");
				break;
			}
		}
		
		sc.close();
		
		
	}

}







