package Array2;

import java.util.Scanner;

public class Array9074_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int []a = new int[10];

        while(true){
            n = input.nextInt();
            if ((n<1)||(n>10)){
                break;
            } a[n-1]++;
        }
        for (int i = 0; i < 10 ; i++) {
            if(a[i]>=1) {
                System.out.printf("%d : %d개\n", i + 1, a[i]);
            }
        }
    }
}

//        int n;
//        int[] a = new int[10];
//
//        while (true) {
//            n = input.nextInt();
//            if ((n<1)||(n>10)) {
//                break;
//            }
//            a[n-1]++;
//        }
//        for (int i = 0; i < 10; i++) {
//            if(a[i]>=1){
//                System.out.printf("%d : %d개\n", i+1, a[i]);
//            }
//        }




