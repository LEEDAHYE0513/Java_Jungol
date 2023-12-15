import java.util.Scanner;

public class Loop544_self1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, sum;
        sum=0;
        a = input.nextInt();

        for (int i = a; i <= 100; i++) {
            sum = sum + i;

        } System.out.println(sum);
    }
}
