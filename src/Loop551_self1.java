import java.util.Scanner;

public class Loop551_self1 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
       int n;
        n = input.nextInt();
/*
       for (int i = 1; i <= n  ; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = n ; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
*/

int i,k;

        for(i=1; i<=n; i++){
            for(k=3; k>=n; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i=1; i<=3; i++){
            for (k=1;k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(i=1; i<=3; i++){
            for (k=3; i<=k; k--){
                System.out.print("*");
            }
            System.out.println();
        }



        for (i = 1; i <= 3; i++) {
            for (int j = 3 ; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

        for ( i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
