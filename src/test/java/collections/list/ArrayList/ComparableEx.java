package collections.list.ArrayList;

import realObjects._Employee;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx {
    public static void main(String[] args) {
        ArrayList<_Employee> al=new ArrayList<>();
        al.add(new _Employee(111,"ratan"));
        al.add(new _Employee(222,"anu"));
        Collections.sort(al);
        for(_Employee e:al)
            System.out.println(e.empID+" "+e.empName);

    }


}
