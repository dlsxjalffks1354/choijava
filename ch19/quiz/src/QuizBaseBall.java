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
			int st=0;//스트라이크 개수
			int ball=0;//볼개수
			int out=0;//아웃개수
			int pc1;
			int pc2;
			int pc3;
			
			
			System.out.println("숫자 야구게임을 시작하겠습니다.");
			
			System.out.println("첫 번째 정수를 입력해 주세요 범위는 0~9까지입니다");
			pc1 = sc.nextInt(); 
			if(pc1>9 || pc1<0 )
			{
				System.out.print("지정된 범위가 아닙니다 다시입력해주세요.\n");
			}
			System.out.println("두 번째 정수를 입력해 주세요 범위는 0~9까지입니다");
			pc2 = sc.nextInt(); 
			if(pc2>9 || pc2<0 )
			{
				System.out.print("지정된 범위가 아닙니다 다시입력해주세요.\n");
			}
			System.out.println("세 번째 정수를 입력해 주세요 범위는 0~9까지입니다");
			pc3 = sc.nextInt();
			if(pc1>9 || pc1<0 || pc2>9 || pc2<0 || pc3>9 || pc3<0 )
			{
				System.out.print("지정된 범위가 아닙니다 다시입력해주세요.\n");
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
			System.out.printf("현재 카운트입니다 %d스트라이크 %d볼  %d아웃",st,ball,out);
			
			if(st==3)
			{
				System.out.printf("전부 맞추셧습니다 숫자야구를 종료합니다.");
				break;
			}
		}
		
		sc.close();
		
		
	}

}







