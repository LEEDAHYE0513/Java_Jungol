import java.util.Scanner;

public class Loop131_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b,i;
        a = input.nextInt();
        b = input.nextInt();


        if (a>b){
            for (i=b; i<=a; i++){
                System.out.print(i + " ");
            }

        } else {
            for (i=a; i<=b; i++){
                System.out.print(i + " ");
            }

        }
    }
}
