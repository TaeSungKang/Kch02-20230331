package test01;

		
import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("초를 입력하세요: ");
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d시간 %d분 %d초입니다.", hours, minutes, seconds);
		    }
		


	}


