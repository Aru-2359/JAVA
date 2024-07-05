import java.util.Scanner;

public class RemoveOccurencesOfA {
    static String removeA(String str, int idx){
        if(idx == str.length()) return "";
        String smallAns = removeA(str, idx + 1);
        char current = str.charAt(idx);
        if(current != 'a'){
            return current + smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeA(str, 0));
        sc.close();
    }
}
