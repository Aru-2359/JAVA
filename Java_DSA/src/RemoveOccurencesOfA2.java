import java.util.Scanner;

public class RemoveOccurencesOfA2 {
    static String removeA(String str){
        if(str.length() == 0) return "";
        String smallAns = removeA(str.substring(1));
        char current = str.charAt(0);
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
        System.out.println(removeA(str));
        sc.close();
    }
}

