import java.util.Scanner;

class SumOfDigits{

    static int sumOfDigits(int n){
        if(n >= 0 && n <= 9){
            return n;
        }
        int smallAns = sumOfDigits(n/10);
        int ans = smallAns + (n % 10);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The sum of digits of " + n + " is " + sumOfDigits(n));
        sc.close();
    }
}