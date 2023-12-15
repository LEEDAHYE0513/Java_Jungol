import java.util.Scanner;

public class Loop545_self1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, count3, count5;
        count3 = 0;
        count5 = 0;

        for (int i = 1; i <= 10 ; i++) {
            a=input.nextInt();
            if(a%3==0){
                count3 += 1;
            }
            if(a%5==0){
                count5 += 1;
            }
        }
        System.out.printf("Multiples of 3 : %d\n",count3);
        System.out.printf("Multiples of 5 : %d",count5);
    }
}
