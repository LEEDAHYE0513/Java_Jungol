import java.util.Scanner;

public class Loop552_self1 {
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

//        for (int i = 1; i <= 3; i++) {
//            for (int j = 2; j <i+1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = num; j > 0; j--) {
//                System.out.print("*");
//            }num-=2;
//            System.out.println();
//        }
    }
}
