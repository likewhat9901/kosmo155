package ex05method;

public class QuSimpleOperation {
//		문제1) 파일명 : QuSimpleOperation.java
//		두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
//		인수(파라메타)로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
//		메소드명 : arithmetic()
//	
//	
//		실행결과]
//		덧셈결과 -> 177
//		뺄셈결과 -> 23
//		곱셈결과 -> 7700
//		나눗셈 몫 -> 1
//		나눗셈 나머지 -> 23
	
	
	static void arithmetic(int a, int b) {
		
		System.out.println("[실행결과]");
		System.out.println("덧셈결과 -> "+ (a+b));
		System.out.println("뺄셈결과 -> "+ (a-b));
		System.out.println("곱셈결과 -> "+ a*b);
		System.out.println("나눗셈 몫 -> "+ a/b);
		System.out.println("나눗셈 나머지 -> "+ a%b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arithmetic(3, 5);

	}
}
