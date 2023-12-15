import java.util.Scanner;

public class Loop9043_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, sum, count;
        sum = 0;
        count = 0;
        double avg = 0;

        while (true) {
            a = input.nextInt();

            if (a%2==1){
                sum += a;
                count += 1;
                avg = sum / (double) count;

            }
            else if(a==0) {
                break;
            }
        }
        System.out.printf("홀수의 합 = %d\n", sum);
        System.out.printf("홀수의 평균 = %d", (int)avg);
    }
}
