import java.util.Scanner;
class CountDigits{
    static int countDigits(int n){
        if(n >= 0 && n<= 9){
            return 1;
        }
        int count = countDigits(n/10) + 1;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int c = countDigits(n);
        System.out.println("The number of digits in " + n + " is: " + c);
        sc.close();
    }
}