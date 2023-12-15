import java.util.Scanner;

public class Loop135_ex형성 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, a, b, c, sum, count;

        c= 0;
        sum = 0;
        count =0;
        double avg;

        a = input.nextInt();
        b = input.nextInt();
        if (a>b){
            for (i=b; i<=a; i++){
                if((i%3==0)||(i%5==0)){
                    sum += i;
                    count += 1;
                }
            }
        } else {
            for (i=a; i<=b; i++){
                if((i%3==0)||(i%5==0)){
                    sum += i;
                    count += 1;
                }
            }
        }avg = sum / (double)count;
        System.out.printf("sum : %d\n",sum);
        System.out.printf("avg : %.1f", avg);
    }
}