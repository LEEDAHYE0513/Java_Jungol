package Array2;

import java.util.Scanner;

public class Array9079_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        int[][] a = new int[4][4];

        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번째 학생의 점수 ", i + 1);
            for (int j = 0; j < 3; j++) {
                n = input.nextInt();
                a[i][j] = n;
                a[i][3] += n; //sum
                a[3][j] += n;
                a[3][3] += n;
            }

        }
        System.out.println("     국어 영어 수학 총점");
        for (int i = 0; i < 4; i++) {
            if(i==3){
                System.out.print("합계");
            } else {
                System.out.printf(" %d번",i+1);
            }
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println();
        }
    }
}
