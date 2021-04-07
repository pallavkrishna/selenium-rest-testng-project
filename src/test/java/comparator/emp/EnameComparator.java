package comparator.emp;

import realObjects.Employee;

import java.util.Comparator;

public class EnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.eName.compareTo(o2.eName);
    }
}
