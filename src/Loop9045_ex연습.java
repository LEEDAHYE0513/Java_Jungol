import java.util.Scanner;

public class Loop9045_ex연습 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true){
            System.out.println("1. 입력하기\n2. 출력하기\n3. 삭제하기\n4. 끝내기\n작업할 번호를 선택하세요. ");
            int a = input.nextInt();
            if(a==1){
                System.out.println("출력하기를 선택하였습니다.");
            } else if (a==2) {
                System.out.println("출력하기를 선택하였습니다.");
            }else if (a==3) {
                System.out.println("출력하기를 선택하였습니다.");
            }else if (a==4) {
                System.out.println("끝내기를 선택하였습니다.");
                break;
            } else
                System.out.println("잘못 입력하였습니다.");
        }

    }
}
