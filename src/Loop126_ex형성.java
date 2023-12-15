import java.util.Scanner;

public class Loop126_ex형성 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int a;
        int odd = 0;
        int even = 0;
        while (true){
            a = input.nextInt();
            System.out.print("");
            if(a==0){
                break;
            }
            else {
                if ((a%2)!=0) {
                    odd += 1;
                }else{
                    even += 1;
                }

            }

        }System.out.printf("odd : %d\neven : %d", odd, even);
    }
}
