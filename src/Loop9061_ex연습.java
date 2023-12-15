import java.util.Scanner;

public class Loop9061_ex연습 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int n = input.nextInt();
        int a=0;
        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <i+1; k++) {
                System.out.print(++a +" ");
            }
            System.out.println();
        }
    }
}
