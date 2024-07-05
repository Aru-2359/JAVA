package InnerClass;

class A{
    public void show(){
        System.out.println("in show");
    }
    class B{
        public void config(){
            System.out.println("in config");
        }
    }
    static class C{
        public void hey(){
            System.out.println("in hey");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B(); //as B is not a static inner class, we need an object to refer it
        obj1.config();
        A.C obj2 = new A.C(); //as C is static inner class, we do not need an object to refer it
        obj2.hey();
    }
}
