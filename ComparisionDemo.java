public class ComparisionDemo {

    public static void main(String[] args) {

        // s1 == s2 -> Reference comparision
        // s1.equals(s2) -> String :: content comparision
        // o1.equals(o2) -> Object :: reference comparision

        String s1 = new String("akhil");
        String s2 = new String("akhil");

        System.out.println("s1 == s2 ? " + (s1 == s2)); // false
        System.out.println("s1.equals(s2) ? " + s1.equals(s2)); // true

        String s3 = "abc";
        String s4 = "abc";

        System.out.println("s3 == s4 ? " + (s3 == s4)); // true
        System.out.println("s3.equals(s4) ? " + s3.equals(s4)); // true

        Integer i1 = 126;
        Integer i2 = 126;
        System.out.println("i1 == i2 ? " + (i1 == i2));
        System.out.println("i1.equals(i2) ? " + (i1.equals(i2)));
        Integer i3 = new Integer(126);
        Integer i4 = new Integer(126);
        System.out.println("i3 == i4 ? " + (i3 == i4));
        System.out.println("i3.equals(i4) ? " + (i3.equals(i4)));

        Integer i5 = 226;
        Integer i6 = 226;
        System.out.println("i5 == i6 ? " + (i5 == i6));
        System.out.println("i5.equals(i6) ? " + (i5.equals(i6)));
        Integer i7 = new Integer(226);
        Integer i8= new Integer(226);
        System.out.println("i7 == i8 ? " + (i7 == i8));
        System.out.println("i7.equals(i8) ? " + (i7.equals(i8)));

        StringBuffer sb1 = new StringBuffer("akhilkumar");
        StringBuffer sb2 = new StringBuffer("akhilkumar");
        System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
        System.out.println("sb1.equals(sb1) ? " + (sb1.equals(sb2)));

        // comparing object with null
        System.out.println("sb1 == null ? " + (sb1  == null));
        System.out.println("sb1.equals(null) ? " + sb1.equals(null));
    }
}
