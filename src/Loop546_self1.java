import java.util.Scanner;

public class Loop546_self1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, sum, score;

        double avg;
        score =0;
        sum = 0;
        n = input.nextInt();

        for (int i = 0; i < n ; i++) {
            score = input.nextInt();
            sum += score;

        }
         avg = sum /(double)n;
        if (avg>=80){
            System.out.printf("avg : %.1f\npass",avg);
        } else if (avg<80) {
            System.out.printf("avg : %.1f\nfail",avg);
        }
    }
}
