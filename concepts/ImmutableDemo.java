package concepts;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ImmutableDemo {

    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");
        ImmutableClass s = new ImmutableClass("ABC", 101, map);
        System.out.println(s.getName());
        System.out.println(s.getId());
        System.out.println(s.getMetaData());

        // Uncommenting below line causes error
        // s.id = 102;

        map.put("3", "third");
        System.out.println(s.getMetaData()); // Remains unchanged due to deep copy in constructor

        s.getMetaData().put("4", "fourth");
        System.out.println(s.getMetaData()); // Remains unchanged due to deep copy in getter

        TreeSet<StringBuilder> treeSet = new TreeSet<>();
        treeSet.add(new StringBuilder(10));
        treeSet.add(new StringBuilder(20));
        treeSet.add(new StringBuilder(10));
        treeSet.add(new StringBuilder(30));

        System.out.println(treeSet);
    }
}
