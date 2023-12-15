import java.util.Scanner;

public class Loop550_self1 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int n,i,k;
        n=input.nextInt();

        for (i=1;i<=n; i++){
            for (k=n; k>=i; k--){
                System.out.print("*");
            }System.out.println();
        }
        for (i=1;i<=n; i++){
            for (k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();

        } System.out.println();
    }
}
