public class Loop9057_ex연습 {
    public static void main(String[] args) {

        int a, i, j;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= 3; i++) {
            for (a = 3; a >= i; a--) {
                System.out.print("*");
            }
            System.out.println();
        }

//            for (j=i; j<=3; j++){
//                System.out.print("*");
//                }
//            }for (j=i; j>=1; j--){
//                    System.out.println("*");
//                }
//            }


    }
}
