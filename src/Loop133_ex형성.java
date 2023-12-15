import java.util.Scanner;

public class Loop133_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i, n, a, sum;
        sum =0;
        double avg ;

        n =input.nextInt();
        for (i=1; i<=n; i++){
            a = input.nextInt();
            sum += a;

        } avg = sum /(double)n;
        System.out.printf("%5.2f",avg);
    }
}
