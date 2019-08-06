import java.util.Random;
import java.util.Scanner;

public class QuizHighLow {


	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc1 = new Scanner(System.in);//사용자가 입력할 값.
		Scanner sc2 = new Scanner(System.in);//게임 종료를 할때 사용하는것.
		while(true)
		{
			int ran=random.nextInt(100);
			int dap=ran;
			for(int pc1=6; pc1>=0; pc1--) 
			{
			if(pc1==0) {
			System.out.print("6회이내에 맞추는데에 실패하셧습니다.\n");	
			break;
			}
			System.out.println
			("임의의 숫자를 입력해주세요. (범위는 0-100부터까지입니다.)");
			int pc=sc1.nextInt();
			if(pc>100 || pc<0)
			{
				System.out.print
("지정된 범위가 아닙니다 다시입력해주세요.\n");
				pc1++;
			}
			if(pc==dap) 
			{
			System.out.printf("정답입니다 답은 %d입니다.\n",dap);
			break;
			}
			if(pc>=dap) 
			{
			System.out.printf
("입력하신 값은 지정값보다 큽니다.\n%d회남았습니다.\n",pc1-1);	
			}
			if(pc<=dap) 
			{
			System.out.printf
("입력하신 값은 지정값보다 작습니다.\n%d회남았습니다.\n",pc1-1);	
			}
		
		
			}
			System.out.print("게임을 더 하시겠습니까? <y/n>\n");
			String str = sc2.next();
			if (!str.equalsIgnoreCase("y")) {
				System.out.println("Good bye~");
				break;

											}
					}
			}
	}









