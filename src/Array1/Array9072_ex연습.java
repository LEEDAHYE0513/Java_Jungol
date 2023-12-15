package Array1;

import java.util.Scanner;

public class Array9072_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        double avg;
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = input.nextInt();

            sum += a[i];


        }avg = (double) sum / a.length;
        System.out.printf("총점 = %d\n", sum);
        System.out.printf("평균 = %.1f", avg);
    }
}
