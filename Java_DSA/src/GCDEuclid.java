import java.util.Scanner;

public class GCDEuclid {
    static int euclidGCD(int x, int y){
        if(y == 0){
            return x;
        }
        return euclidGCD(y, x % y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        int ans = euclidGCD(x, y);
        System.out.println("The GCD of " + x + " and " + y + " is: " + ans);
        sc.close();
    }
}
