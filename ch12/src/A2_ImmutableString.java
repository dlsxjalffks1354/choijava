// 문자열 생성 방법 두 가지으 ㅣ차이점
// 인스턴스의 참조 값 비교

public class A2_ImmutableString {

	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";
		//String str2 = str1;
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		// 인스턴스의 참조 값 비교
		if(str1 == str2)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		
		if(str3 == str4)
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		else
			System.out.println("str3과 str4는 다른 인스턴스 참조");
		
	}

}

// == : 참조변수의 참조 값 비교
// String 인스턴스는 Immutable 인스턴스
// 따라서 생성되는 인스턴스의 수를 최소화 한다.
