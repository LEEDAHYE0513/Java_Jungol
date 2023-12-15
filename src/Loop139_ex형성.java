import java.util.Scanner;

public class Loop139_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b,i,j;
        a = input.nextInt();
        b = input.nextInt();

        //3 5

        if(a<=b){
            for (i=1; i<=9; i++){
                for(j=a; j<=b; j++){
                    System.out.printf("%d * %d =%3d   ",j,i,j*i);
                }
                System.out.println();
            }
        }
        if(a>b){ //5 3
            for (i=1; i<=9; i++){
                for(j=a; j>=b; j--){
                    System.out.printf("%d * %d =%3d   ",j,i,j*i);
                }
                System.out.println();
            }
        }

    }

}
