import java.util.Scanner;
public class ClosestNoDivisible {
    public static int closestDivisibleNo(int n, int m){
        int q = n / m;
        int n1 = m * q;
        int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));
        if(Math.abs(n - n1) < Math.abs(n - n2)){
            return n1;
        }
        else{
            return n2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.println("The closest value to " + n + " divisible by " + m + " is: " + closestDivisibleNo(n, m));
        sc.close();
    }
}
