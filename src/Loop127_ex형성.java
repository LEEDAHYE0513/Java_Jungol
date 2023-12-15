import java.util.Scanner;

public class Loop127_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, sum;
        sum = 0;
        double avg = 0;
        int count = 0;

        while (true) {
            a = input.nextInt();
            if ((a < 0) || (a > 100)) {
                break;
            }
            count += 1;
            sum += a;

        }
        avg = (double) sum / count;
        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.1f", avg);

    }
}
