import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        sc.close();
        char tempArr[] = str.toCharArray();
        int left = 0;
        int right = tempArr.length - 1;
        for (left = 0; left < right; left++, right--) {
            char temp = tempArr[left];
            tempArr[left] = tempArr[right];
            tempArr[right] = temp;
        }
        System.out.print("The reverse of the string \"" + str + "\" is: ");
        for (char c : tempArr)
            System.out.print(c);
    }
}

