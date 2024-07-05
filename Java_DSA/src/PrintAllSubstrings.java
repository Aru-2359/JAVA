import java.util.Scanner;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("The substrings of " + s + " are: ");
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                System.out.print(s.substring(i, j) + " ");
            }
        }
        sc.close();
    }
}
