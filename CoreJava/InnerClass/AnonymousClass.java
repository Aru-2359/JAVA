package InnerClass;

import org.w3c.dom.ls.LSOutput;

class X{
    public void show(){
        System.out.println("in old show");
    }
}
abstract class Y{
    abstract void show();
}

interface Z{
    void show();
    void config();
}

public class AnonymousClass {
    public static void main(String[] args) {
        X obj = new X(){
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
        Y obj1 = new Y() {
            public void show(){
                System.out.println("in new show abstract");
            }
        };
        obj1.show();
        Z obj2 = new Z(){
            public void show() {
                System.out.println("in show interface");
            }
            public void config() {
                System.out.println("in config");
            }
        };
        obj2.show();
        obj2.config();
    }
}
