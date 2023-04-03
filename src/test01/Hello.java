/*
 * 소스 파일 : Hello.java
 */

package test01;

public class Hello {

	public static int sum(int n, int m) {
		return n + m;
	}
	
//	 main() 메소드에서 시작
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 1.77;
		
		int b;
		
		b = (int) a;
		
		String str = "123";
		
//		int s = str;
		
		final double PI = 3.141592;
//		PI = 3.14;
		
		int i = 20;
		int s;
//		char a;
		
		s = sum(i,10); //sum 함수를 호출
		a = '?';
		
		long c;
		c = 20000000000L;
		
		String d = "korea";
		
		double k  =10/4.0;
		System.out.println(k);
		System.out.println("문자열 출려: " + d + " 우리나라 " + "등");
		System.out.println(a);
		System.out.println("hello");
		System.out.println(s);
		System.out.println(d);
		System.out.println(b);
	}
}
