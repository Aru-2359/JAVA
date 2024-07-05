import java.util.Scanner;

class ReverseIndividualWordsInASentence{
    public static String reverseInd(String s){
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb.delete(0, sb.length());
            }
        }
        sb.reverse();
        ans += sb;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String s = sc.nextLine();
        System.out.println(reverseInd(s));
        sc.close();
    }
}