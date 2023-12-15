public class Loop9040_ex연습 {
    public static void main(String[] args) {
        int num, result;
        num =1;
        result =0;

        while(num <= 10){

            result += num;
            num ++;
        }
        System.out.printf("1부터 10까지의 합 = %d\n", result);
        System.out.printf("while문이 끝난 후의 num의 값 = %d", num);
    }
}
