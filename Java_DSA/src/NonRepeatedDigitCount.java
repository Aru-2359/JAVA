/* Write a function to find the count of non-repeated digits in a given number N. The number will be
passed to the function as an input parameter of type int.
Assumption: The input number will be a positive integer number >= 1 and <= 25000.
Some examples are as below -
If the given number is 292, the function should return 1 because there is only 1 non-repeated digit '9' in
this number
If the given number is 1015, the function should return 2 because there are 2 non-repeated digits in this
number, '0', and '5'.
If the given number is 108, the function should return 3 because there are 3 non-repeated digits in this
number, '1', '0', and '8'.
If the given number is 22, the function should return 0 because there are NO non-repeated digits in this
number. */

import java.util.Scanner;

public class NonRepeatedDigitCount {

    public static int sumOfNonRepeatedDigits(int x){
        int sum = 0;
        int count[] = new int[10]; //array to keep the count of each digit
        while(x > 0){
            int digit = x % 10;
            count[digit]++;
            x = x / 10;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i] == 1){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("The sum of non-repeated numbers in " + number + " is: " + sumOfNonRepeatedDigits(number));
        sc.close();
    }
}
