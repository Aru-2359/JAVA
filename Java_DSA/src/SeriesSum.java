import java.util.Scanner;

public class SeriesSum {
    static int findSeriesSum(int n){
        if(n == 0){
            return 0;
        }
        return findSeriesSum(n - 1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int ans = findSeriesSum(n);
        System.out.println("The sum of natural numbers upto " + n + " is: " + ans);
        sc.close();
    }
}
