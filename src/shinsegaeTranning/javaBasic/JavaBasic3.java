package shinsegaeTranning.javaBasic;

public class JavaBasic3 {
    public static void main(String[] args) {
        int randomNum1,randomNum2,randomSum;

        while(true){
            randomNum1 = (int)(Math.random()*6+1);
            randomNum2 = (int)(Math.random()*6+1);
            randomSum = randomNum1 + randomNum2;
            System.out.printf("숫자1 : %d, 숫자2 : %d\n",randomNum1,randomNum2);
            if(randomSum==5){
                break;
            }
        }
    }
}
