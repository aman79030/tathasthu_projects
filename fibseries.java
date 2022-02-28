import java.util.Scanner;
public class fibseries {
    public static int fib(int n) {
        int a = 0, b = 1, c = 0;
        int f = 0;
        while (c < n) {
            System.out.println(a + "");
            f = a + b;
            a = b;
            b = f;
            c++;
        }
        return a;
    }
    public static void main (String [] args){
        System.out.println("Enter your desired number for Fibonacci series: ");
        Scanner s=new Scanner(System.in);
        int z=s.nextInt();
        System.out.println(fib(z));
    }
}