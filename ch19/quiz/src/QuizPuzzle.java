import java.util.Random;
import java.util.Scanner;

class Menu{
	StringBuilder build = new StringBuilder("123456789");
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	String input;
	String temp;
	int num=0;
	int xPos=0;
	int yPos=0;
	int dap=0;
	String[][] ar1=new String[3][3];
	String[][] ar2= {  
			{"1","2","3"},
			{"4","5","6"},
			{"7","8","9"}};
	boolean game =true;
	boolean puzzle=true;
	
	Menu(){
		while(game)
		{
			num=ran.nextInt(9)+1;		
			if(build.indexOf(String.valueOf(num))>=0)
			{
				ar1[xPos][yPos]=String.valueOf(num);
				build.deleteCharAt(build.lastIndexOf(String.valueOf(num)));
				yPos++;
			}
			if(yPos==3)
			{
				xPos++;
				yPos=0;
			}
			else if(xPos==3)
			{
				game=false;
			}
				
		}
		xPos=ran.nextInt(3);
		yPos=ran.nextInt(3);
		ar1[xPos][yPos]="X";
		
		Move();	
	}
	void Move() {
		while(puzzle) 
		{
			result();
			System.out.println("[x의 이동키] a:왼쪽 d:오른쪽 w:위 z:아래");
			System.out.println("[게임종료] e:Exit");
			System.out.print("이동키를 입력하세요:");
			input = sc.next();
			switch(input)
			{
			case "a":
				if(yPos >= 1)
				{
					temp = ar1[xPos][--yPos];
					ar1[xPos][yPos] = "x";
					ar1[xPos][yPos+1] = temp;
				}
				break;
			case "d":
				if(yPos <= 1)
				{
					temp = ar1[xPos][++yPos];
					ar1[xPos][yPos] = "x";
					ar1[xPos][yPos-1] = temp;
				}
				break;
			case "w":
				if(xPos >= 1)
				{
					temp = ar1[--xPos][yPos];
					ar1[xPos][yPos] = "x";
					ar1[xPos+1][yPos] = temp;
				}
				break;
			case "s":
				if(xPos <= 1)
				{
					temp = ar1[++xPos][yPos];
					ar1[xPos][yPos] = "x";
					ar1[xPos-1][yPos] = temp;
				}
				break;
			case "e":
				{
				System.out.println("게임을 종료하겠습니다\n Good bye~");
				puzzle = false;
				}
				Quit();
				}
			}
		}
		
		void Quit() 
		{
			result();
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					if(ar1[i][j].equals(ar2[i][j]))
						dap++;
				}
			}
			if(dap==8)
			{
				System.out.println("정답입니다. Goodbye~");
				puzzle=false;
			}
			else
				dap=0;
		}
		void result() 
		{
			for(int i=0; i<ar1.length; i++)
			{
				for(int j=0; j<ar1.length ; j++)
				{
					System.out.print(ar1[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}
public class QuizPuzzle {
	public static void main(String[] args) {
		Menu m=new Menu();
	}	
}
