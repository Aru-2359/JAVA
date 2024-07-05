import java.util.Scanner;

public class ReverseStringRecur {
    static String reverse(String str, int idx){
        if(idx == str.length()){
            return "";
        }
        String smallAns = reverse(str, idx + 1);
        return smallAns + str.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String rev = reverse(str, 0);
        System.out.println("The reverse of " + str + " is: " + rev);
        sc.close();
    }
}
