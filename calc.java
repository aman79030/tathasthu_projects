import java.util.Scanner;
public class Calcoperations {

    public static void main (String args []){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        float a=s.nextInt();
        System.out.println("Enter number 2: ");
        float b=s.nextInt();
        System.out.println("Addition: "+ (a+b));
        System.out.println("Subtraction: "+ (a-b));
        System.out.println("Multiplication: "+ (a*b));
        System.out.println("Division: "+ (a/b));
        System.out.println("Remainder: "+ (a%b));
    }
}