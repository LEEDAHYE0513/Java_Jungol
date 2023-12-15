import java.util.Scanner;

public class Loop9055_ex연습 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int i, a, sum;
        sum = 0;

        a = input.nextInt();
        for (i=1; i<=a; i++){
            sum += i;
            if(sum>a){
                break;
            }
        }System.out.printf("%d %d",i,sum);
    }
}
