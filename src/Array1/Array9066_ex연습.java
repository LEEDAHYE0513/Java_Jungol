package Array1;

public class Array9066_ex연습 {
    public static void main(String[] args) {

        char a = 90;
        char []b = new char[26];

        for (int i = 0; i <26 ; i++) {
            b[i] = a--;
            System.out.print(b[i]+ " ");
        }

    }
}
