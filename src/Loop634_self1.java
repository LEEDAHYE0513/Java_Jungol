import java.util.Scanner;

public class Loop634_self1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, a, n;
        n = input.nextInt();

        for (i = 1; i<=n ; i++) {
            for(a=1; a<=i; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
