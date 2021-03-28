import java.util.ArrayList;

public class Director extends Manager {
    private int stockShares;

    public Director(int salary, int stockShares, int bonus, String name, String department, String title, ArrayList<Employee> supervisedStaff, int tier) {
        super(salary, bonus, name, department, title, supervisedStaff, tier);
        this.stockShares = stockShares;
    }

    public void hire(Employee employee) {
        this.supervisedStaff.add(employee);
        System.out.println("LOG: new Employee hired (" + employee.name + ", " + employee.department + ", " + employee.title + ")");
    }

    public void fire(Manager manager) {
        for(int i = 0; i < this.supervisedStaff.size(); ++i) {
            if ((this.supervisedStaff.get(i)).name.equals(manager.name)) {
                this.supervisedStaff.remove(i);
            }
        }

        System.out.println("LOG: existing Employee fired (" + manager.name + ", " + manager.department + ", " + manager.title + ")");
    }

    public void adjustSalary(int amount, Employee employee) {
        employee.salary += amount;
    }

}



