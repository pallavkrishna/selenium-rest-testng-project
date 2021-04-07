package collections.list.ArrayList;

import comparator.emp.EIDComparator;
import comparator.emp.EnameComparator;
import realObjects.Employee;


import java.util.ArrayList;
import java.util.Collections;

public class ComparatorEx {


    public static void main(String[] args) {
        ArrayList<Employee> al=new ArrayList<>();
        al.add(new Employee(111,"ratan"));
        al.add(new Employee(222,"anu"));
        Collections.sort(al,new EIDComparator());
        for(Employee e:al)
            System.out.println(e.eID+" "+e.eName);
        al.sort(new EnameComparator());
        for(Employee e:al)
            System.out.println(e.eID+" "+e.eName);
    }

}
