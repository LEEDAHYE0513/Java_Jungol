import java.util.Scanner;

public class Loop9041_ex연습 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;


        while (true) {
            System.out.print("점수를 입력하세요. ");
            a = input.nextInt();
            if ((a >= 80) && (a <= 100)) {
                System.out.println("축하합니다. 합격입니다.");
            } else if ((a < 80) && (a > 0)) {
                System.out.println("죄송합니다. 불합격입니다.");
            } else
                break;

        }

    }

}
