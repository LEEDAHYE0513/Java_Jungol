import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Loop549_self1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, i, n, count, sum;
        count = 0;
        sum = 0;
        a= 0;

        n = input.nextInt();
        while(true){
            a++;
            if (a%2==1){
                count += 1;
                sum += a;
            }
            if (sum>=n){
                break;
            }
        }System.out.print(count + " " + sum);

    }
}
