import java.util.Scanner;

public class StringCompression {

public static String compressedString(String str){
    int count = 1;
    String ans = "" + str.charAt(0);
    for (int i = 1; i < str.length(); i++) {
        char curr = str.charAt(i);
        char prev = str.charAt(i - 1);
        if(curr == prev){
            count++;
        }else{
            if(count >1) ans += count; 
            count = 1;
            ans += curr;
        }
    }
    if(count > 1) ans += count;
    return ans;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = compressedString(str);
        System.out.println("The compressed string is: " + result);
        sc.close();
    }
}
