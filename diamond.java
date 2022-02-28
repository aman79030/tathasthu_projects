public class diamond {
    public static void printDiamond(int n){
        int empty=n-1;
        for (int i = 0; i < n; i++)         // run loop (parent loop) till number of rows
        {
            for (int j = 0; j < empty; j++)     // loop for initially space, before star printing
                System.out.print(" ");

            for (int j = 0; j <= i; j++)    // Print i+1 stars
                System.out.print("* ");

            System.out.print("\n");
            empty--;
        }

        // Repeat again in reverse order
        empty = 0;


        for (int i = n; i > 0; i--)                 // run loop (parent loop) till number of rows
        {
            for (int j = 0; j < empty; j++)          // loop for initially space, before star printing
                System.out.print(" ");

            for (int j = 0; j < i; j++)               // Print i stars
                System.out.print("* ");

            System.out.print("\n");
            empty++;
        }
    }
    public static void main(String[] args)
    {
        printDiamond(5);

    }
}