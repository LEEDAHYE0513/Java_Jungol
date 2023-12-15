import java.util.Scanner;

public class Loop148_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        n = input.nextInt();
        int a =0;
        int b= 0;
        int c = 0;

        for (int i=0; i<n; i++){
            for (int j=0; j<=0+a;j++){
                System.out.print("# ");
            }a++;
            System.out.println();
        }
        for (int i=0; i<n-1; i++){
            for (int j = 0; j <= b; j++) {
                System.out.print("  ");
            }c+=2;

            for (int j = 0; j <(n-1-b); j++) {
                System.out.print("# ");
            }
            System.out.println();
            b++;
        }


    }
    }

