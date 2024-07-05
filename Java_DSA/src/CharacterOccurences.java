import java.util.Scanner;;
public class CharacterOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        sc.close();
        int charCount[] = new int[256];
        char charArr[] = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            charCount[c]++;
        }
        for (int i = 0; i < charCount.length; i++) {
            if(charCount[i] > 0){
                System.out.println((char)i + " : " + charCount[i]);
            }
        }
    }
}
