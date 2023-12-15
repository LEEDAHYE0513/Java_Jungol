import java.util.Scanner;

public class Loop144_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int n;
        n = input.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int k=(n-i)*2 ; k > 0; k--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (i)-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
