package LambdaExpressions;
@FunctionalInterface
interface X{
    int add(int i, int j);
}

public class LambdaExpWithReturn {
    public static void main(String[] args) {
        X obj = (i,j) -> i + j;
        int result = obj.add(5, 4);
        System.out.println(result);
    }
}
