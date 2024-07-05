import java.util.ArrayList;
import java.util.Scanner;

public class ReturnSubsequences {
    static ArrayList<String> returnAllSSQs(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallAns = returnAllSSQs(s.substring(1));
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        ArrayList<String> ans = new ArrayList<>();
        ans = returnAllSSQs(s);
        System.out.println("The subsequences of " + s + " are:");
        for (String ss : ans) {
            System.out.println(ss);            
        }
        sc.close();
    }
}
