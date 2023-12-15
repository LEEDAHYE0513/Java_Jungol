import java.util.Scanner;

public class Loop138_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,i,j;
        a =input.nextInt();

        for(i=1; i<=a; i++){
            for(j=1; j<=a; j++){
                System.out.printf("(%d, %d) ",i,j);
            }
            System.out.println();
        }
    }
}
