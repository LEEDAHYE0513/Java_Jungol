import java.util.Scanner;

public class Loop540_self5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true){
            int a = input.nextInt();
        if (a%3==0){
            System.out.println(a/3);
        }
        if (a==-1) {
            break;
        }
        }
    }
}
