import java.util.Scanner;

public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        String output = ""; 
        for(int i = words.length - 1; i>=0; i--){
           output+= words[i] + " ";
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String s = sc.nextLine();
        String result = reverseWords(s);
        System.out.println(result);
        sc.close();
    }
}
