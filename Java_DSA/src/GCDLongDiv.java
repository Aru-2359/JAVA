import java.util.Scanner;

public class GCDLongDiv {
    static int longDivGCD(int x, int y){
        while( x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        int ans = longDivGCD(x, y);
        System.out.println("The GCD of " + x + " and " + y + " is: " + ans);
        sc.close();
    }
}
