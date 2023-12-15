import java.util.Scanner;

public class Loop145_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        n=input.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 2*i; j<=2*n-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }

    }
}
