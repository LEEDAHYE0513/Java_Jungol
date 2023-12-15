import java.util.Scanner;

public class Loop134_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, i, even, odd;
        even = 0;
        odd = 0;


        for(i=1; i<=10; i++){
            a = input.nextInt();

            if(a%2==0){
                even += 1;
            }
            if(a%2==1){
                odd += 1;
            }
        }
        System.out.printf("even : %d\n",even);
        System.out.printf("odd : %d", odd);

    }
}
