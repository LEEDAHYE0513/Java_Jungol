import java.util.Scanner;

public class Loop146_ex형성 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int n;
        char a = 'A';
        int b=0;
        n= input.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n ; j++) {
                System.out.print(a+" ");
                a++;
            }
            for (int j = 1; j < i; j++) {
                System.out.printf(b++ + " ");
            }
            System.out.println();
        }
    }
}
