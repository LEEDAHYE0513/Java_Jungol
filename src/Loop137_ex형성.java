import java.util.Scanner;

public class Loop137_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,b,i,j;

        a = input.nextInt();
        b = input.nextInt();

        for(i=1; i<=a; i++){
            for(j=1; j<=b; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
