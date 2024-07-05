import java.util.Scanner;

public class FractionClass {
    int num;
    int den;

    public static FractionClass add(FractionClass f1, FractionClass f2){
        int numerator = f2.den*f1.num + f1.den*f2.num;
        int denominator = f1.den*f2.den;
        FractionClass f3 = new FractionClass(numerator, denominator);
        return f3;
    }

    public static FractionClass sub(FractionClass f1, FractionClass f2){
        int numerator = f1.num * f2.den - f2.num * f1.den;
        int denominator = f1.den*f2.den;
        FractionClass f3 = new FractionClass(numerator, denominator);
        return f3;
    }

    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void simplify(){
        int hcf = gcd(num, den);
        num /= hcf;
        den /= hcf;
    }

    public FractionClass(int num, int den){
        this.num = num;
        this.den = den;
        simplify();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator of the first fraction: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the denominator of the first fraction: ");
        int den1 = sc.nextInt();
        FractionClass f1 = new FractionClass(num1, den1);
        System.out.println("The simplified first fraction is: " + f1.num +"/" + f1.den);
        System.out.print("Enter the numerator of the second fraction: ");
        int num2= sc.nextInt();
        System.out.print("Enter the denominator of the second fraction: ");
        int den2 = sc.nextInt();
        FractionClass f2 = new FractionClass(num2, den2);
        System.out.println("The simplified second fraction is: " + f2.num +"/" + f2.den);
        FractionClass f3 = add(f1, f2);
        System.out.println("The addition of the two fractions is: " + f3.num +"/" + f3.den);
        FractionClass f4 = sub(f1, f2);
        System.out.println("The substraction of the two fractions is: " + f4.num +"/" + f4.den);
        sc.close();
    }
}