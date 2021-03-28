public class Employee implements Comparable {
    protected int salary;
    protected String name;
    protected String department;
    protected String title;

    public Employee(int salary, String name, String department, String title) {
        this.salary = salary;
        this.name = name;
        this.department = department;
        this.title = title;
    }

    public int compareTo(Object o) {
        return 0;
    }

}
