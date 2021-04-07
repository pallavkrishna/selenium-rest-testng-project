package collections.set;

import java.util.TreeSet;

public class TreeSetEx1 {


    public static void main(String[] args) {
        TreeSet<Number> numberTreeSet=new TreeSet<Number>();
        numberTreeSet.add(45);
        numberTreeSet.add(50.4);
        numberTreeSet.add(9f);
        for (Number n:numberTreeSet)
            System.out.println(n);
    }

















}

