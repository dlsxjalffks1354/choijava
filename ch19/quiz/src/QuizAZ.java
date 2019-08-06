
public class QuizAZ {

	public static void main(String[] args) {
		int a,b;
		int result;
		
		for(a=1;a<10;a++) {
		for(b=1;b<10;b++) {
		result=a+b;
		if((result == 9)&&(a!=b)){
		System.out.printf("%d%d : %d%d\n",a,b,b,a);
				}
			}
			}
		}
}
	
