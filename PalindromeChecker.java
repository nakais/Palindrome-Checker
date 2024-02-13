import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String Str = scanner.nextLine();

        
        scanner.close();

        if (isPalindrome(Str)) {
            System.out.println("The input string \"" + Str + "\" is a palindrome.");
        } else {
            System.out.println("The input string \"" + Str + "\" is not a palindrome.");
        }
    }


    private static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        
        StringBuilder reversedStr = new StringBuilder(str).reverse();


        return str.equals(reversedStr.toString());
    }
}

