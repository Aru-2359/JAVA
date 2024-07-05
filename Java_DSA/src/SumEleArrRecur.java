public class SumEleArrRecur {
    static int sumOfEle(int[] arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        /*if(idx == arr.length - 1){
            return arr[idx];
        }*/
        return arr[idx] + sumOfEle(arr, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 7, 9};
        int sum = sumOfEle(arr, 0);
        System.out.println("The sum of all the elements of the array is: " + sum);
    }
}
