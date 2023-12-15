package Array1;

import java.util.Scanner;

public class Array9071_ex연습 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int n;
        int max=0;
        int min=0;


        int []a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = input.nextInt();

            if (a[i]%2==0) {
                if (max < a[i]) {
                    max = a[i];
                }
            }
            if (a[i]%2!=0){
                if(min>a[i]){
                    min=a[i];
                }
            }


        }
        System.out.print(min+ " ");
        System.out.print(max);

    }
}
//
//if (a[i]%2==1){
//                if(min>a[i]){
//                    min=a[i];
//                }
//            }

//a[i]%2==1 홀수라 생각을 했는데 a[i] 안에 음수의 수가 있다면 나머지가 -1이기 때문에 음수를 계산할 수 없다.
// 고로 맞다 아니다인 != 을 사용해야 한다.