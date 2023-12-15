import java.util.Scanner;

public class Loop129_ex형성 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Base, Height;
        double Triangle_width;
        char a;

        Base = 0;
        Height = 0;


        while (true) {
            System.out.print("Base = ");
            Base = input.nextInt();
            System.out.print("Height = ");
            Height = input.nextInt();

            Triangle_width = Base * Height * ((double) 1 /2);
            System.out.printf("Triangle width = %.1f\n", Triangle_width);
            System.out.print("Continue? ");
            a = input.next().charAt(0);

            if((a=='Y')||(a=='y')){
                continue;
            } else break;
        }
    }
}
