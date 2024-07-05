import java.util.Scanner;

public class PrintSubsequences {
    static void printAllSSQs(String s, String currAns){
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printAllSSQs(remString, currAns + curr); //add curr
        printAllSSQs(remString, currAns); //do not add curr
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("The subsequences of " + s + " are:");
        printAllSSQs(s, ""); //in the beginning the currAns = ""
        sc.close();
    }
}

