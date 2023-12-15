package Array2;

import java.util.Scanner;

public class Array9075_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int []a = new int[10];
        while(true){
            n =input.nextInt();

            if(n==0){
                break;
            }

            n%=10;
            a[n]++;
        }
        for (int i =0; i < 10; i++) {
            if(a[i]!=0){
                System.out.printf("%d : %d개\n",i,a[i]);
            }

        }
    }
}
