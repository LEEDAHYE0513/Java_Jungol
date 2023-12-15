package Array1;
import java.util.Scanner;

public class Array9063_ex연습 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            n = input.nextInt();
            a[i]=n;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+" ");
        }
    }
}