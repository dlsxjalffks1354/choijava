import java.util.Random;
import java.util.Scanner;


public class QuizHighLow2 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("���� ���� 0 ���� 100 ������ �� �߿� �ϳ��� �����ϰڽ��ϴ�.");
			System.out.println("����� �� ���ڸ� 6ȸ �ȿ� ���߽ø� �˴ϴ�.");
			int i = ran.nextInt(101);
			for (int j = 6; j >= 0; j--) {
				if (j == 0) {
					System.out.println("��ȸ�� ��� ����ϼ̽��ϴ�.\n ������ȸ��...");
					break;
				}
				System.out.println("���̶�� �����մϱ�? < 0 to 100 >");
				int n = sc.nextInt();
				if (n > 100 || n < 0) {
					System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
					j++;
					continue;
				}
				if (n == i) {
					System.out.println(n + "�� �����Դϴ�. �����մϴ�!");
					System.out.println("High Low ������ �÷����� �ּż� �����մϴ�.");
					break;
				} else if (n > i) {
					System.out.println(n + "�� ���� ���� ���ں��� Ů�ϴ�.");
					System.out.println("[ " + (j-1) + "] �� ��ȸ�� ���ҽ��ϴ�.");
				} else {
					System.out.println(n + "�� ���� ���� ���ں��� �۽��ϴ�.");
					System.out.println("[ " + (j-1) + "] �� ��ȸ�� ���ҽ��ϴ�.");
				}
			}
			System.out.print("������ �� �Ͻðڽ��ϱ�? <y/n>...");
			String str = s.next();
			if (!str.equalsIgnoreCase("y")) {
				System.out.println("Good bye~");
				break;
			}
		}
	}
}


