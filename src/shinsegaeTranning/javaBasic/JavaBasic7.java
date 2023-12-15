package shinsegaeTranning.javaBasic;

public class JavaBasic7 {
    public static void main(String[] args) {

        int n = 2; // 행의 중간 위치
        for (int i = 0; i < 2*n+1; i++) {
            for (int j = 0; j < Math.abs(n - i); j++) {
                System.out.print("_");
            }
            for (int k = 0; k < (n - Math.abs(n - i))*2 + 1; k++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}


