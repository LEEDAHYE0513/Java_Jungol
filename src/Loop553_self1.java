import java.util.Scanner;

public class Loop553_self1 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int n;
        char a = 'A';
        n= input.nextInt();


            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n ; j++) {
                    System.out.print(a);
                    a++;
                }
                System.out.println();

        }

        
    }
}
