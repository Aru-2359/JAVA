import java.util.Scanner;

public class SeriesSumWithAltSigns {
    static int findSeriesSum(int n){
        if(n == 0){
            return 0;
        }
        if(n % 2 == 0){
            return findSeriesSum(n - 1) - n;
        }
        else{
            return findSeriesSum(n - 1) + n;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int ans = findSeriesSum(n);
        System.out.println("The sum of natural numbers upto " + n + " with alternate signs is: " + ans);
        sc.close();
    }
}

