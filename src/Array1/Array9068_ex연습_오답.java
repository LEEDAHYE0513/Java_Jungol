package Array1;

import java.util.Scanner;

public class Array9068_ex연습_오답 {
    public static void main(String[] args) {

        /// 0만 엄청 나옴 왜?  --> 밑에도 break 걸어줌!!
        Scanner input = new Scanner(System.in);


        int []a = new int[100];
        for (int i = 0; i <a.length ; i++) {
            a[i] = input.nextInt();
            if (a[i] == 0) {
                break;
            }
        }
        for (int i = 1; i < a.length ; i+=2) {
            if (a[i] == 0) {
                break;
            }System.out.println(a[i]);
        }


    }
}
