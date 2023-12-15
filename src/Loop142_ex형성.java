import java.util.Scanner;

public class Loop142_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        n= input.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<n; i++){
            for (int j=n-1; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
