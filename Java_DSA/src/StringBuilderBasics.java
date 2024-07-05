public class StringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb1);
        sb1.append("World");
        System.out.println(sb1);
        /*StringBuilder sb2 = new StringBuilder(5); //we can also mention the capacity
        sb2.append("kkkkk");
        System.out.println(sb2);*/
        sb1.setCharAt(0, 'M'); //setCharAt()
        System.out.println(sb1);
        sb1.append(10);
        System.out.println(sb1);
        sb1.append(true);
        System.out.println(sb1);
        sb1.insert(2, 'y'); //insert()
        System.out.println(sb1);
        sb1.deleteCharAt(4); //deleteCharAt()
        System.out.println(sb1);
        sb1.reverse(); //reverse()
        System.out.println(sb1);
        sb1.delete(3, 7); //delete()
        System.out.println(sb1);
    }
}
