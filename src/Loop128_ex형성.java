import java.util.Scanner;

public class Loop128_ex형성 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int a, count;
        count = 0;

        while (true){
            a = input.nextInt();

            count += 1;

            if((a%3==0)||(a%5==0)){
                count -= 1;
            }
            if(a==0) {
                break;
            }

            /*if (a==0){
                count -= 1;
                break;
            } else if ((a%3==0)||(a%5==0)){
                count -= 1;
            }*/
        }System.out.print(count);
    }
}
