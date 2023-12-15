import java.util.Scanner;

public class Loop633_self6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("1. Korea\n2. USA\n3. Japan\n4. China\nnumber?");
            int a = input.nextInt();

            if(a==1){
                System.out.println("Seoul");
            }else if(a==2){
                System.out.println("Washington");
            }else if(a==3){
                System.out.println("Tokyo");
            }else if(a==4){
                System.out.println("Beijing");
            }else {
                System.out.println("none");break;
            }
        }
    }
}
