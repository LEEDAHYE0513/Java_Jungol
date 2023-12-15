package shinsegaeTranning.javaBasic;

import java.util.Scanner;

public class JavaBasic9 {
    public static void main(String[] args) {

        int n,max;
        int n1 = 0;
        int sum =0;

        max=0;
        Scanner input =new Scanner(System.in);
        int[] a = new int[0];

        while(true) {
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");
            n = Integer.parseInt(input.nextLine());
            if (n == 1) {
                System.out.print("학생수> ");
                n1 = Integer.parseInt(input.nextLine());
                a = new int[n1];
            }
            if (n == 2) {
                for (int i = 0; i < n1; i++) {
                    System.out.printf("score[%d]>",i);
                    a[i] = Integer.parseInt(input.nextLine());
                    sum += a[i];
                    max = max < a[i] ? a[i]:max;


                }
            }
            if (n == 3) {
                for (int i = 0; i < n1; i++) {
                    System.out.printf("score[%d]: %d\n",i, a[i]);
                }
            }
            if (n == 4) {
                System.out.println("최고 점수: "+max);

                System.out.println("평균 점수: "+sum/n1);
            }
            if (n == 5) {
                System.out.print("프로그램 종료");
                break;
            }
        }

    }
}
