import java.util.Scanner;

public class Loop554_self1 {
    public static void main(String[] args) {

        char a= 'A';
        int b = 1;

        Scanner input =new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >=i; j--) {
                System.out.printf(b++ + " ");
            }
           for (int j = 1; j <= i; j++) {
                System.out.printf(a++ + " ");
           }
           System.out.println();
        }
    }
}
