import java.util.Scanner;

public class Loop141_ex형성 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, i;
//        a= input.nextInt();
//        for (i=1; i<=100; i++){
//            if(i%a==0){
//                System.out.print(i+" ");
//            }
//            if(i%10==0){
//                break;
//            }
//        }

        a= input.nextInt();
        if ((a>0)&&(a<=100)){
            for (i=1; i<100; i++){
                if(i%a==0){
                   System.out.print(i+" ");
                   if(i%10==0){
                       break;
                   }
                }
            }
        }
    }
}
