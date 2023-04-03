package test01;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double CHANGE_RATE = 1309.5;
		
		System.out.println("당신의 이름을 입력하세요:");
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		
//		System.out.println("당신의 이름은 " + name +" 입니다.");
		
		System.out.println("당신의 나이를 입력하세요:");
		
		int age = scanner.nextInt();
		
//		System.out.println("당신의 나이는 " + age +" 입니다.");
		
		System.out.println(name +"님의 나이는 " + age + "살 입니다");
		
		System.out.println("당신의 키와 몸무게를 입력하세요:");
			
		double height = scanner.nextDouble();
		
		double weight = scanner.nextDouble();
		
		System.out.println("키 : "+ height +"cm");
		
		System.out.println("몸무게 : "+ weight +"kg");
		
		String str  = "hello!!!";
//		int age  = 15;
//		double weight = 57;
		boolean a = true;
		
		age = (int)weight;
		
		
		
	}

}
