package Array1;

import java.util.Scanner;

public class Array9068_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int []a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = input.nextInt();
            if (a[i]==0){
                break;
            }
            if(i % 2 == 1){
                System.out.print(a[i]+ " ");
            }
        }
    }
}
