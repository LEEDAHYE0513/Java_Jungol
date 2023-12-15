import java.util.Scanner;

public class Loop147_ex형성 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int n;
        n= input.nextInt();

        int b = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j<2*i-1; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i-1; j--) {
                System.out.print(b++ +" ");
            }
            System.out.println();
        }
    }
}
