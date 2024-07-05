import java.util.Scanner;
public class Power2 {
    static int pow(int p, int q){
        if(q == 0){
            return 1;
        }
        int smallpow = pow(p, q/2);
        if(q % 2 == 0){
            return smallpow * smallpow;
        }
        else{
            return p * smallpow * smallpow;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value: ");
        int p = sc.nextInt();
        System.out.println("Enter the power: ");
        int q = sc.nextInt();
        int ans = pow(p, q);
        System.out.println("The value of " + p + "^" + q + " is: " + ans);
        sc.close();
    }
}

