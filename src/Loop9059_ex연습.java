public class Loop9059_ex연습 {
    public static void main(String[] args) {

        int num = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 4 ; j > i-1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < num+1; j++) {
                System.out.print("*");
            } num +=2;
            System.out.println();

        }
    }
}
