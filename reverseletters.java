import java.util.*;
public class reverseLetters {
    public static void main(String[]args) {
        System.out.println("Enter a word: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        //String str=args[0];
        String rev="";
        for (int i=0; i<str.length(); i++) {
            char ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
    }
}