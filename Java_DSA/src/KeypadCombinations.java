import java.util.Scanner;

public class KeypadCombinations {
    static void combination(String digits, String[] kp, String res){
        if(digits.length() == 0){
            System.out.print(res + " ");
            return;
        }
        int currNum = digits.charAt(0) - '0';
        String currChoices = kp[currNum];
        for(int i = 0; i < currChoices.length(); i++){
            combination(digits.substring(1), kp, res + currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits: ");
        String d = sc.nextLine();
        System.out.println("All the posible letter combinations are: ");
        combination(d, kp, "");
        sc.close();
    }
}
