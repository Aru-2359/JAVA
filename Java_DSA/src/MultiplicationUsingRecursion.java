import java.util.Scanner;

public class MultiplicationUsingRecursion {
    static int product(int x, int y){
        if(y > x){
            product(y, x);
        }
        if(y != 0){
            return product(x, y - 1) + x;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        int ans = product(x, y);
        System.out.println("The product of " + x + " and " + y + " is: " + ans);
        sc.close();
    }
}
