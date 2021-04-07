package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetex1 {

    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("pallav");
        hashSet.add("krisha");
        hashSet.add("eworewi");
        hashSet.add("ewrew");
        Iterator<String> iterator= hashSet.iterator();
        while (iterator.hasNext())
        {
            String hashValue=iterator.next();
            System.out.println();
        }
    }
}
