package test01;

import java.util.Scanner;

public class MonthDays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("달을 입력하세요(1~12): ");

        int month = scanner.nextInt();
        int days = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }

        if (days != 0) {
            System.out.println(month + "월은 " + days + "일까지 있습니다.");
        }

        scanner.close();
    }
}
