import java.util.Scanner;

public class Loop149_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, a, cnt;
        a = 0;
        cnt = 0;
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1 + a; j <= ((2 * n) - 1 + a); j += 2) {
                cnt += 2;

                if (j > 10) {
                    System.out.print((j % 10) + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            a = cnt;
            System.out.println();

        }


    }
}

