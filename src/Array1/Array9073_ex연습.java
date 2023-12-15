package Array1;


public class Array9073_ex연습 {
    public static void main(String[] args) {

//        int[] a;
//        a= new int[] {95, 75, 85, 100, 50};

        int b;
        int[] a= new int[5];
        a[0]= 95;
        a[1]= 75;
        a[2]= 85;
        a[3]= 100;
        a[4]= 50;

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]){
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }

            }

        }
        System.out.println(a[0]+ " "+ a[1]+ " "+a[2]+ " "+a[3]+ " "+a[4]);
    }
}
