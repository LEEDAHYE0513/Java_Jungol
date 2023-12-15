package Array2;

public class Array9076_ex연습{
    public static void main(String[] args) {

        int a[] = new int[100];
        a[0]=1;
        a[1]=1;
        for (int i = 2; i<=40; i++) {
            a[i]=a[i-2] + a[i-1];
        }
        System.out.println("피보나치 수열 10항 : " + a[9]);
        System.out.println("피보나치 수열 20항 : " + a[19]);
        System.out.println("피보나치 수열 30항 : " + a[29]);
        System.out.println("피보나치 수열 40항 : " + a[39]);
    }
}
