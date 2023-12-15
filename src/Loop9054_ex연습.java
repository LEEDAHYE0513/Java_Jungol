public class Loop9054_ex연습 {
    public static void main(String[] args) {

        int a, b;

//
        for (b = 1; b <= 9; b++) {
            for (a = 2; a <= 4; a++) {
                System.out.printf("%d * %d =%3d   ", a, b, a * b);
            }
            System.out.println();
        }
    }
}
