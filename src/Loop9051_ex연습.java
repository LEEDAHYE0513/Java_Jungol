import java.util.Scanner;

public class Loop9051_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,i, count;
        count = 0;

        for (i=1; i<=10; i++){
            a = input.nextInt();
            if(a%2==0){
                count += 1;
            }
        }
        System.out.printf("입력받은 짝수는 %d개입니다.", count);

    }
}
