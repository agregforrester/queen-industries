import java.util.ArrayList;

public class Manager extends Employee {
    protected int bonus;
    protected ArrayList<Employee> supervisedStaff = new ArrayList();
    protected int tier;

    public Manager(int salary, int bonus, String name, String department, String title, ArrayList<Employee> supervisedStaff, int tier) {
        super(salary, name, department, title);
        this.bonus = bonus;
        this.supervisedStaff = supervisedStaff;
        this.tier = tier;
    }

    public void hire(Employee employee) {
        this.supervisedStaff.add(employee);
        System.out.println("LOG: new Employee hired (" + employee.name + ", " + employee.department + ", " + employee.title + ")");
    }

    public void fire(Employee employee) {
        for(int i = 0; i < this.supervisedStaff.size(); ++i) {
            if ((this.supervisedStaff.get(i)).name.equals(employee.name)) {
                this.supervisedStaff.remove(i);
            }
        }
        System.out.println("LOG: existing Employee fired (" + employee.name + ", " + employee.department + ", " + employee.title + ")");
    }
}
