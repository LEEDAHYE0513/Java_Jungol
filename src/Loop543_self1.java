import java.util.Scanner;

public class Loop543_self1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;

        a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i%2==0){
                System.out.print(i+ " ");
            }
        }
        
    }
}
