package Array1;

//연도와 월을 입력받아 해당 월의 날 수를 출력하다가
// 월이 0이면 종료하는 프로그램을 작성하시오.
// (월이 잘못 입력되면 "잘못 입력하였습니다."를 출력한다.)

import java.util.Scanner;

public class Array9069_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int leepYear = 29;
        int year = 0;
        int month = 0;
        while(true) {
            System.out.print("YEAR = ");
            year = input.nextInt();
            System.out.print("MONTH = ");
            month = input.nextInt();

            if (month == 0) {
                break;
            }

            if (month > 12) {
                System.out.println("잘못 입력하였습니다.");
            } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.printf("입력하신 달의 날 수는 %d일입니다.\n", leepYear);
            } else {
                System.out.printf("입력하신 달의 날 수는 %d일입니다.\n", day[month]);
            }
            System.out.println();
        }


    }

}
