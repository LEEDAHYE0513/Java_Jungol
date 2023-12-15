package Array1;

import java.util.Scanner;

public class Array9067_ex연습 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int n;

        int[] a = new int[10];
        for (int i = 0; i < 10 ; i++) {
            n = input.nextInt();
            a[i] = n;
        }System.out.print(a[2] + " ");
        System.out.print(a[4] + " ");
        System.out.print(a[9] + " ");

    }
}
