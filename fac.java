import java.util.Scanner;
public class fac {
    static int factorial(int n) {
        int i, fac=1;
        for (i=1; i<=n;i++) {
            System.out.println(i+"");
             fac = fac * i;
        }
        return fac;
    }
    public static void main (String []args){
        System.out.println("Enter desired number for factorial: ");
        Scanner t=new Scanner(System.in);
        int j=t.nextInt();
        System.out.println(factorial(j));
    }
}