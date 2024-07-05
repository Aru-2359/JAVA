import java.util.Scanner;

public class PalindromicSubstrings {

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
            }
        return true;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                if(isPalindrome(s.substring(i, j)) == true){
                    System.out.print(s.substring(i, j) + " ");
                    count++;
                }
            }
        }
        System.out.println("\nThe number of palindromic substrings are: " + count);
        sc.close();
    }
}
