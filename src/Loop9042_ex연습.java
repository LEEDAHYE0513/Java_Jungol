import java.util.Scanner;

public class Loop9042_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, count, sum;
        double avg;

        sum = 0;
        count = 0;
        avg = 0;

        while (true) {
            a = input.nextInt();

            if (a == 0) {
               break;
            } else {
                sum += a;
                count += 1;
                avg = (double) sum /  count;
            }
        }System.out.printf("입력된 자료의 개수 = %d\n", count);
        System.out.printf("입력된 자료의 합계 = %d\n", sum);
        System.out.printf("입력된 자료의 평균 = %.2f\n", avg);
    }
}


