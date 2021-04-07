package realObjects;


public class _Employee implements Comparable <_Employee>{
    public String empName;
    public int empID;

    public _Employee(int empID, String empName) {
        this.empName = empName;
        this.empID = empID;
    }

    @Override
    public int compareTo(_Employee e) {
        return empName.compareTo(e.empName);
    }
}
