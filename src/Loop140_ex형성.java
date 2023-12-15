import java.util.Scanner;

public class Loop140_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, sum, count;
        double avg;
        sum = 0;
        count = 0;

        for (int i=1; i<=20; i++){
            n = input.nextInt();
            if (n==0){
                break;
            }
            else{
            sum += n;
            count += 1;
            }
        } avg =((int)(sum/ count));
        System.out.printf("%d %.0f", sum, avg);
    }
}
