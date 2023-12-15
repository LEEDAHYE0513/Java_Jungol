package pr;

import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        int n =2;
        for (int i = 0; i < 2*n+1 ; i++) {
            for (int j = 0; j < Math.abs(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n-Math.abs(n-i))*2+1; j++) {
                System.out.println("@");
            }
        }
        System.out.println();
    }
}