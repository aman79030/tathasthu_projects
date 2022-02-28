import java.util.Scanner;
public class perandcomb {
    static int fac(int n) {
        int i, fac=1;
        for (i=1; i<=n;i++) {
            fac = fac * i;
        }
        return fac;
    }
    public static void main(String[] args){
        System.out.println("Enter number 1: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter number 2: ");
        int b=sc.nextInt();
        int p=(fac(a))/(fac(a-b));
        System.out.println("Permutation of "+a+" and "+b+" is "+p);
        int c=(fac(a))/((fac(b))*(fac(a-b)));
        System.out.println("Combination of "+a+ " and "+b+" is "+c);
    }
}
//savita di,radha di,punita di, rachna, narayan bhai, me