package Array1;

import java.util.Scanner;

public class Array9070_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int max = 0;
        int []a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();


            for (int j = 0; j < 10; j++) {
                //max = a[0];
                if(max<a[i]){
                    max = a[i];
                }
            }
        }
        System.out.print(max);



    }
}
