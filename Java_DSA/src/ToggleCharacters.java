import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        for (int i = 0; i < n; i++) {
            boolean flag = true; //true -> capital
            char ch = sb.charAt(i);
            if(ch == ' ') continue;
            int ascii = (int)ch;
            if(ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122){
                if(ascii >= 97){
                    flag = false;
                }
                if(flag){ //flag = true -> capital, so we have to add 32 to make it small
                    ascii += 32;
                    char dh = (char)ascii;
                    sb.setCharAt(i, dh);
                }else{
                    ascii -= 32;
                    char dh = (char)ascii;
                    sb.setCharAt(i, dh);
                }
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
