public class mirrorInverse {
        static boolean isMirrorInverse(int arr[])    // Function that returns true if the array is mirror-inverse
        {
            for (int i = 0; i < arr.length; i++) {
                if (arr[arr[i]] != i)                // If condition fails for any element
                    return false;
            }
                    return true;                      // Given array is mirror-inverse
        }

        public static void main(String[] args)
        {
            int arr[] = { 3, 4, 2, 0, 1 };
            if (isMirrorInverse(arr))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }