import java.util.Scanner;

public class Loop9050_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, i,sum;
        i = 0;
        sum = 0;

        i = input.nextInt();

        for (a=1; a<=i; a++) {
            sum += a;

        }System.out.println(sum);
    }
}
