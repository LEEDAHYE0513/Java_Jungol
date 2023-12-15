package Array2;

import java.util.Scanner;

public class Array9078_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,d;
        int [][]a = new int[3][3];
        for (int i = 0; i < 3 ; i++) {
            System.out.printf("첫 번째 배열 %d행 ",i+1);
            for (int j = 0; j < 3 ; j++) {
                n = input.nextInt();
                a[i][j]+=n;
            }

        }
        for (int i = 0; i < 3 ; i++) {
            System.out.printf("두 번째 배열 %d행 ",i+1);
            for (int j = 0; j < 3 ; j++) {
                n = input.nextInt();
                a[i][j]+=n;
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
