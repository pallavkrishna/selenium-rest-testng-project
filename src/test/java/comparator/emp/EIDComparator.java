package comparator.emp;

import realObjects.Employee;

import java.util.Comparator;

public class EIDComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {

       if (e1.eID== e2.eID)
           return 0;
       else if (e1.eID>e2.eID)return 1;
       else return -1;
    }
}
