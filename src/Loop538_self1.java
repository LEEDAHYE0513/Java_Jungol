import java.util.Scanner;

public class Loop538_self1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        while (true){
            System.out.print("number? ");
            a = input.nextInt();
            if (a>0){
                System.out.println("positive integer");
            } else if (a<0) {
                System.out.println("negative number");
            }else
                break;;
        }
    }
}
