import java.util.Scanner;

public class Loop537_self1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int i =0;
        int result=0;

        while (i <= a ){
            result += i;
            i++;


        }System.out.println(result);
    }
}
