package test01;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 점수를 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		if(score >=80) {
			System.out.println("당신은 " + score + "점 우수 입니다!");
		} else if(score >= 60) { 
			System.out.println("당신은 " + score + "점 보통 입니다!");
		} else if(score >= 40) { 
				System.out.println("당신은 " + score + "점 미달 입니다!");
		} else {
			System.out.println("당신은 " + score + "점 낙제 입니다!");
		}
		
	}

}
