import java.util.Scanner;

public class palindrome {
    public static boolean ispalindrome(String a){
        int i=0, j=a.length()-1;
        while (i<j){
            if(a.charAt(i)!=a.charAt(j))
                return false;
                i++;
                j--;
            }
                return true;
        }
    public static void main(String []args){
        System.out.println("Enter a String: ");
        Scanner s=new Scanner(System.in);
        String t=s.nextLine();
        if (ispalindrome(t))
            System.out.println("Your String "+t+" is palindrome.");
        else
            System.out.println("Your String "+t+" is not palindrome.");
    }
}