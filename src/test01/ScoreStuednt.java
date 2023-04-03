package test01;

import java.util.Scanner;

public class ScoreStuednt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("당신의 성적을 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		if(score >=90) {
			System.out.println("당신은 " + score + "점 수 입니다!");
		} else if(score >= 80) { 
			System.out.println("당신은 " + score + "점 우 입니다!");
		} else if(score >= 70) { 
			System.out.println("당신은 " + score + "점 미 입니다!");
		} else if(score >= 60) { 
			System.out.println("당신은 " + score + "점 양 입니다!");		
		} else {
			System.out.println("당신은 " + score + "점 가 입니다!");
		}
	}		
}		

