import java.util.Scanner;

public class Loop132_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, i, sum;
        sum = 0;

        a = input.nextInt();;
        for (i=1; i<=a; i++){
            if(i%5==0){
                sum += i;
            }
        }System.out.println(sum);
    }
}
