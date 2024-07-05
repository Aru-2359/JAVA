package LambdaExpressions;

@FunctionalInterface
interface A{
    void show();
}
@FunctionalInterface
interface B{
    void show(int i);
}
public class LambdaExp {
    public static void main(String[] args) {
//        A obj = () ->{
//            System.out.println("in show");
//        };
        A obj = () -> System.out.println("in show");
        obj.show();
//        B obj1 = (i) -> System.out.println("in show " + i);
        B obj1 = i -> System.out.println("in show " + i);
        obj1.show(5);
    }
}
