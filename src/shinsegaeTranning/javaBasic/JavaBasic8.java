package shinsegaeTranning.javaBasic;

import java.util.Scanner;

public class JavaBasic8 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number;
        int balance =0;

        while(true){
            System.out.println("-----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
            System.out.println("-----------------------------------");
            System.out.print("선택> ");
            number = input.nextInt();
            if(number==1){
                System.out.println("예금액>");
                balance += input.nextInt();
            }
            if(number==2){
                System.out.println("출금액>");
                balance -= input.nextInt();
            }
            if(number==3){
                System.out.println("잔고>");
                System.out.println(balance);
            }
            if(number==4){
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
