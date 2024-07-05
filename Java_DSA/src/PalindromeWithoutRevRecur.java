import java.util.Scanner;

public class PalindromeWithoutRevRecur {
    static boolean isPalindrome(String s, int l, int r){
        if(l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l + 1, r - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        if(isPalindrome(s, 0, s.length() - 1)){
            System.out.println(s + " is a palindrome!");
        }
        else{
            System.out.println(s + " is not a palindrome!");
        }
        sc.close();
    }
}
