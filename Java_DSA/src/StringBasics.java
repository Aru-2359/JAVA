class StringBasics{
    public static void main(String[] args) {
        String str = "College Wallah";
        System.out.println(str.indexOf("e")); //indexOf()
        System.out.println(str.contains("la")); //contains()
        System.out.println(str.startsWith("col")); //startsWith()
        System.out.println(str.endsWith("h")); //endsWith()
        String str1 = "Hello";
        String str2 = "Dello";
        String str3 = "Zello";
        //compareTo()
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str2.compareTo(str3));
        System.out.println(str.toLowerCase()); //toLowerCase()
        System.out.println(str.toUpperCase()); //toUpperCase()
        //concat()
        System.out.println(str1.concat(str2));
        System.out.println(str1.concat("blahblahblah"));
        // using +
        String s = "abc";
        s += "xyz";
        System.out.println(s);
        s += 'r';
        System.out.println(s);
        s += 10;
        System.out.println(s);
        System.out.println("abc" + 10 + 20);
        System.out.println("abc" + (10 + 20));
        System.out.println(10 + 20 + "abc");
        //substring()
        String str4 = "abcdefghi";
        System.out.println(str4.substring(4));
        System.out.println(str4.substring(3, 7));
        String p = "Physics";
        for (int i = 2; i < 4; i++) {
            System.out.println(p.substring(i));
        }
        //equals()
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2); //returns true as both s1 and s2 point to the same address
        System.out.println(s1 == s3); //returns false as addresses of s1 and s3 areb different
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}