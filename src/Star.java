public class Star {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >i-1  ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 5; j > i-1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i+1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i-1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");

        int num = 1;

        for (int i = 1; i <=5; i++) {
            for (int j = 5; j > i-1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < num+1 ; k++) {
                System.out.print("*");
            }
            num = num +2;
            System.out.println();
        }
        System.out.println("--------");

        int num2= 9;

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <i+1 ; j++) {
                System.out.print(" ");
            }
            for (int k = num2; k > 0 ; k--) {
                System.out.print("*");
            }
            num2 =num2 -2;
            System.out.println();
        }

    }
}
