import java.util.Scanner;

public class Loop9052_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, i;
        int sum = 0;
        int count = 0;
        double avg = 0;

        for (i=0; i<5; i++){
            a = input.nextInt();

            sum += a;
            count += 1;
            avg = sum/(double)count;
        }
        System.out.printf("총점 : %d\n", sum);
        System.out.printf("평균 : %.1f", avg);

    }
}
