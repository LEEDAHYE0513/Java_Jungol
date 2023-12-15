import java.util.Scanner;

public class Loop143_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int n;
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k=(n-i)*2 ; k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n-i-1; j++) {
                System.out.print(" ");
            }
            for (int k=1 ; k <= 2*(i+1)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }


