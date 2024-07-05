import java.util.Scanner;

public class PrintMultiples {
    static void printMultiples(int n, int k){
        /*if(k == 1){
            System.out.println(n);
            return;
        }*/
        if(k == 0){
            return;
        }
        printMultiples(n, k - 1);
        System.out.println(n * k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        printMultiples(n, k);
        sc.close();
    }
}
