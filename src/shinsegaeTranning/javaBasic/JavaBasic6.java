package shinsegaeTranning.javaBasic;

public class JavaBasic6 {
    public static void main(String[] args) {
        int i, j ;

        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int l = 1; l < i+1 ; l++) {
                System.out.print("*");
            }
            System.out.println();
        }


//        System.out.println();
//        for (i = 1; i <= 5; i++) {
//            for (j = 5; j >i-1; j--) {
//                System.out.print(" ");
//            }
//            for (j = 1; j < i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
    }
}
